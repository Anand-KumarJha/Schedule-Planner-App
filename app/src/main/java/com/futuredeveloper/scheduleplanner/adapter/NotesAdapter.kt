package com.futuredeveloper.scheduleplanner.adapter

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.futuredeveloper.scheduleplanner.R
import com.futuredeveloper.scheduleplanner.activity.CreatePlanActivity
import com.futuredeveloper.scheduleplanner.activity.NotesActivity
import com.futuredeveloper.scheduleplanner.database.ScheduleEntity

class NotesAdapter(val context: Context,
private val itemList: List<ScheduleEntity>
) : RecyclerView.Adapter<NotesAdapter.NotesViewHolder>() {

    class NotesViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var count: TextView = view.findViewById(R.id.count)
        var scheduleDate: TextView = view.findViewById(R.id.date)
        var editButton: ImageView = view.findViewById(R.id.edit3)
        var deleteButton: ImageView = view.findViewById(R.id.delete3)
        var description: TextView = view.findViewById(R.id.description)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotesViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.notes_single_row, parent, false)
        return NotesViewHolder(view)
    }

    override fun onBindViewHolder(holder: NotesViewHolder, position: Int) {
        holder.scheduleDate.text = itemList[position].scheduleDate
        holder.count.text = (1+position).toString()
        holder.description.text = itemList[position].scheduleDateNotes

        holder.editButton.setOnClickListener {
            val intent = Intent(context, NotesActivity::class.java)
            intent.putExtra("date",itemList[position].scheduleDate)
            intent.putExtra("notesDescription",itemList[position].scheduleDateNotes)
            intent.putExtra("title", itemList[position].scheduleTitle)
            context.startActivity(intent)
            (context as Activity).overridePendingTransition(R.anim.pull_up_from_top,R.anim.push_out_to_bottom)
            context.finish()
        }
        holder.deleteButton.setOnClickListener{
            val delete = androidx.appcompat.app.AlertDialog.Builder(it.context)
            delete.setTitle("Remove Notes")
            delete.setMessage("Do you want to remove selected notes?")

            val schedule = ScheduleEntity(itemList[position].schedule_id,itemList[position].scheduleDate,itemList[position].scheduleTitle,"",itemList[position].tasks)
            delete.setPositiveButton("Yes") { text, listener ->
                val async = CreatePlanActivity.DBAsyncTask1(
                    context,
                    schedule,
                    1
                ).execute()
                val result = async.get()
                if (result) {
                    Toast.makeText(
                        context,
                        "Notes Deleted!",
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
                    Toast.makeText(
                        context,
                        "Some error occurred!",
                        Toast.LENGTH_SHORT
                    ).show()
                }
                (context as Activity).recreate()
            }
            delete.setNegativeButton("No") { text, listener ->

            }
            delete.create()
            delete.show()
        }

    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    private var date2 = StringBuilder()
}