package com.futuredeveloper.scheduleplanner.database;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ScheduleDao_Impl implements ScheduleDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ScheduleEntity> __insertionAdapterOfScheduleEntity;

  private final TaskTypeConverter __taskTypeConverter = new TaskTypeConverter();

  private final EntityDeletionOrUpdateAdapter<ScheduleEntity> __deletionAdapterOfScheduleEntity;

  private final EntityDeletionOrUpdateAdapter<ScheduleEntity> __updateAdapterOfScheduleEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteById;

  public ScheduleDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfScheduleEntity = new EntityInsertionAdapter<ScheduleEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `schedule_table` (`schedule_id`,`schedule_date`,`schedule_title`,`schedule_date_notes`,`tasks`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ScheduleEntity value) {
        if (value.getSchedule_id() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getSchedule_id());
        }
        if (value.getScheduleDate() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getScheduleDate());
        }
        if (value.getScheduleTitle() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getScheduleTitle());
        }
        if (value.getScheduleDateNotes() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getScheduleDateNotes());
        }
        final String _tmp = __taskTypeConverter.listToJson(value.getTasks());
        if (_tmp == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, _tmp);
        }
      }
    };
    this.__deletionAdapterOfScheduleEntity = new EntityDeletionOrUpdateAdapter<ScheduleEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `schedule_table` WHERE `schedule_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ScheduleEntity value) {
        if (value.getSchedule_id() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getSchedule_id());
        }
      }
    };
    this.__updateAdapterOfScheduleEntity = new EntityDeletionOrUpdateAdapter<ScheduleEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `schedule_table` SET `schedule_id` = ?,`schedule_date` = ?,`schedule_title` = ?,`schedule_date_notes` = ?,`tasks` = ? WHERE `schedule_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ScheduleEntity value) {
        if (value.getSchedule_id() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getSchedule_id());
        }
        if (value.getScheduleDate() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getScheduleDate());
        }
        if (value.getScheduleTitle() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getScheduleTitle());
        }
        if (value.getScheduleDateNotes() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getScheduleDateNotes());
        }
        final String _tmp = __taskTypeConverter.listToJson(value.getTasks());
        if (_tmp == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, _tmp);
        }
        if (value.getSchedule_id() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getSchedule_id());
        }
      }
    };
    this.__preparedStmtOfDeleteById = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM schedule_table WHERE schedule_id = ?";
        return _query;
      }
    };
  }

  @Override
  public void insertSchedule(final ScheduleEntity schedule) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfScheduleEntity.insert(schedule);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteSchedule(final ScheduleEntity schedule) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfScheduleEntity.handle(schedule);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateSchedule(final ScheduleEntity schedule) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfScheduleEntity.handle(schedule);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteById(final String id) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteById.acquire();
    int _argIndex = 1;
    if (id == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, id);
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteById.release(_stmt);
    }
  }

  @Override
  public int deleteIfExist(final String schedule_id) {
    final String _sql = "SELECT count(*) FROM schedule_table WHERE schedule_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (schedule_id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, schedule_id);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<ScheduleEntity> getAllSchedule() {
    final String _sql = "SELECT * FROM schedule_table ORDER BY schedule_id ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfScheduleId = CursorUtil.getColumnIndexOrThrow(_cursor, "schedule_id");
      final int _cursorIndexOfScheduleDate = CursorUtil.getColumnIndexOrThrow(_cursor, "schedule_date");
      final int _cursorIndexOfScheduleTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "schedule_title");
      final int _cursorIndexOfScheduleDateNotes = CursorUtil.getColumnIndexOrThrow(_cursor, "schedule_date_notes");
      final int _cursorIndexOfTasks = CursorUtil.getColumnIndexOrThrow(_cursor, "tasks");
      final List<ScheduleEntity> _result = new ArrayList<ScheduleEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final ScheduleEntity _item;
        final String _tmpSchedule_id;
        if (_cursor.isNull(_cursorIndexOfScheduleId)) {
          _tmpSchedule_id = null;
        } else {
          _tmpSchedule_id = _cursor.getString(_cursorIndexOfScheduleId);
        }
        final String _tmpScheduleDate;
        if (_cursor.isNull(_cursorIndexOfScheduleDate)) {
          _tmpScheduleDate = null;
        } else {
          _tmpScheduleDate = _cursor.getString(_cursorIndexOfScheduleDate);
        }
        final String _tmpScheduleTitle;
        if (_cursor.isNull(_cursorIndexOfScheduleTitle)) {
          _tmpScheduleTitle = null;
        } else {
          _tmpScheduleTitle = _cursor.getString(_cursorIndexOfScheduleTitle);
        }
        final String _tmpScheduleDateNotes;
        if (_cursor.isNull(_cursorIndexOfScheduleDateNotes)) {
          _tmpScheduleDateNotes = null;
        } else {
          _tmpScheduleDateNotes = _cursor.getString(_cursorIndexOfScheduleDateNotes);
        }
        final List<TaskEntity> _tmpTasks;
        final String _tmp;
        if (_cursor.isNull(_cursorIndexOfTasks)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getString(_cursorIndexOfTasks);
        }
        _tmpTasks = __taskTypeConverter.jsonToList(_tmp);
        _item = new ScheduleEntity(_tmpSchedule_id,_tmpScheduleDate,_tmpScheduleTitle,_tmpScheduleDateNotes,_tmpTasks);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public ScheduleEntity getScheduleById(final String id) {
    final String _sql = "SELECT * FROM schedule_table WHERE schedule_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfScheduleId = CursorUtil.getColumnIndexOrThrow(_cursor, "schedule_id");
      final int _cursorIndexOfScheduleDate = CursorUtil.getColumnIndexOrThrow(_cursor, "schedule_date");
      final int _cursorIndexOfScheduleTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "schedule_title");
      final int _cursorIndexOfScheduleDateNotes = CursorUtil.getColumnIndexOrThrow(_cursor, "schedule_date_notes");
      final int _cursorIndexOfTasks = CursorUtil.getColumnIndexOrThrow(_cursor, "tasks");
      final ScheduleEntity _result;
      if(_cursor.moveToFirst()) {
        final String _tmpSchedule_id;
        if (_cursor.isNull(_cursorIndexOfScheduleId)) {
          _tmpSchedule_id = null;
        } else {
          _tmpSchedule_id = _cursor.getString(_cursorIndexOfScheduleId);
        }
        final String _tmpScheduleDate;
        if (_cursor.isNull(_cursorIndexOfScheduleDate)) {
          _tmpScheduleDate = null;
        } else {
          _tmpScheduleDate = _cursor.getString(_cursorIndexOfScheduleDate);
        }
        final String _tmpScheduleTitle;
        if (_cursor.isNull(_cursorIndexOfScheduleTitle)) {
          _tmpScheduleTitle = null;
        } else {
          _tmpScheduleTitle = _cursor.getString(_cursorIndexOfScheduleTitle);
        }
        final String _tmpScheduleDateNotes;
        if (_cursor.isNull(_cursorIndexOfScheduleDateNotes)) {
          _tmpScheduleDateNotes = null;
        } else {
          _tmpScheduleDateNotes = _cursor.getString(_cursorIndexOfScheduleDateNotes);
        }
        final List<TaskEntity> _tmpTasks;
        final String _tmp;
        if (_cursor.isNull(_cursorIndexOfTasks)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getString(_cursorIndexOfTasks);
        }
        _tmpTasks = __taskTypeConverter.jsonToList(_tmp);
        _result = new ScheduleEntity(_tmpSchedule_id,_tmpScheduleDate,_tmpScheduleTitle,_tmpScheduleDateNotes,_tmpTasks);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
