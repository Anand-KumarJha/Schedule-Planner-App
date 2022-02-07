package com.futuredeveloper.scheduleplanner.activity

import android.os.Bundle
import android.text.Html
import android.text.method.LinkMovementMethod
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.futuredeveloper.scheduleplanner.R
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView


class HowToUse : AppCompatActivity() {
    lateinit var youTubePlayerView: YouTubePlayerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_how_to_use)

        youTubePlayerView = findViewById(R.id.youtube_player_view)
        lifecycle.addObserver(youTubePlayerView)

        youTubePlayerView.enterFullScreen();
        youTubePlayerView.toggleFullScreen();


        youTubePlayerView.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
            override fun onReady(youTubePlayer: YouTubePlayer) {
                val videoId = "lCPQ0L5iFCY"
                youTubePlayer.loadVideo(videoId, 0f)
                youTubePlayer.setPlaybackRate(PlayerConstants.PlaybackRate.RATE_1)
                youTubePlayer.mute()
            }
            override fun onStateChange(
                youTubePlayer: YouTubePlayer,
                state: PlayerConstants.PlayerState
            ) {
                // this method is called if video has ended,
                super.onStateChange(youTubePlayer, state)
            }
        })

        val link = findViewById<View>(R.id.textView1) as TextView
        val linkText = "<a href='https://www.youtube.com/watch?v=lCPQ0L5iFCY'>Click Here! To Open On Youtube</a>"
        link.text = Html.fromHtml(linkText)
        link.movementMethod = LinkMovementMethod.getInstance()
    }

    override fun onDestroy() {
        super.onDestroy()
        youTubePlayerView.release()
    }
}