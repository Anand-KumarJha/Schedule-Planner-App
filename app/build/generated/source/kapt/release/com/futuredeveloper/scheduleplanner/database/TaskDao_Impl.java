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
public final class TaskDao_Impl implements TaskDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<TaskEntity> __insertionAdapterOfTaskEntity;

  private final EntityDeletionOrUpdateAdapter<TaskEntity> __deletionAdapterOfTaskEntity;

  private final EntityDeletionOrUpdateAdapter<TaskEntity> __updateAdapterOfTaskEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteTaskById;

  private final SharedSQLiteStatement __preparedStmtOfClearTask;

  public TaskDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTaskEntity = new EntityInsertionAdapter<TaskEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `task` (`task_id`,`task_time`,`task_title`,`task_description`,`task_done`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TaskEntity value) {
        if (value.getTask_id() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getTask_id());
        }
        if (value.getTaskTime() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTaskTime());
        }
        if (value.getTaskTitle() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTaskTitle());
        }
        if (value.getTaskDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getTaskDescription());
        }
        final int _tmp = value.getTaskDone() ? 1 : 0;
        stmt.bindLong(5, _tmp);
      }
    };
    this.__deletionAdapterOfTaskEntity = new EntityDeletionOrUpdateAdapter<TaskEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `task` WHERE `task_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TaskEntity value) {
        if (value.getTask_id() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getTask_id());
        }
      }
    };
    this.__updateAdapterOfTaskEntity = new EntityDeletionOrUpdateAdapter<TaskEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `task` SET `task_id` = ?,`task_time` = ?,`task_title` = ?,`task_description` = ?,`task_done` = ? WHERE `task_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TaskEntity value) {
        if (value.getTask_id() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getTask_id());
        }
        if (value.getTaskTime() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTaskTime());
        }
        if (value.getTaskTitle() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTaskTitle());
        }
        if (value.getTaskDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getTaskDescription());
        }
        final int _tmp = value.getTaskDone() ? 1 : 0;
        stmt.bindLong(5, _tmp);
        if (value.getTask_id() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getTask_id());
        }
      }
    };
    this.__preparedStmtOfDeleteTaskById = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM task WHERE task_id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfClearTask = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM task WHERE task_id LIKE ? || '%'";
        return _query;
      }
    };
  }

  @Override
  public void insertTask(final TaskEntity taskEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfTaskEntity.insert(taskEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteTask(final TaskEntity taskEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfTaskEntity.handle(taskEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateTask(final TaskEntity taskEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfTaskEntity.handle(taskEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteTaskById(final String taskId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteTaskById.acquire();
    int _argIndex = 1;
    if (taskId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, taskId);
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteTaskById.release(_stmt);
    }
  }

  @Override
  public void clearTask(final String taskDate) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfClearTask.acquire();
    int _argIndex = 1;
    if (taskDate == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, taskDate);
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfClearTask.release(_stmt);
    }
  }

  @Override
  public List<TaskEntity> getAllTaskItems() {
    final String _sql = "SELECT * FROM task ORDER BY task_id ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfTaskId = CursorUtil.getColumnIndexOrThrow(_cursor, "task_id");
      final int _cursorIndexOfTaskTime = CursorUtil.getColumnIndexOrThrow(_cursor, "task_time");
      final int _cursorIndexOfTaskTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "task_title");
      final int _cursorIndexOfTaskDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "task_description");
      final int _cursorIndexOfTaskDone = CursorUtil.getColumnIndexOrThrow(_cursor, "task_done");
      final List<TaskEntity> _result = new ArrayList<TaskEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final TaskEntity _item;
        final String _tmpTask_id;
        if (_cursor.isNull(_cursorIndexOfTaskId)) {
          _tmpTask_id = null;
        } else {
          _tmpTask_id = _cursor.getString(_cursorIndexOfTaskId);
        }
        final String _tmpTaskTime;
        if (_cursor.isNull(_cursorIndexOfTaskTime)) {
          _tmpTaskTime = null;
        } else {
          _tmpTaskTime = _cursor.getString(_cursorIndexOfTaskTime);
        }
        final String _tmpTaskTitle;
        if (_cursor.isNull(_cursorIndexOfTaskTitle)) {
          _tmpTaskTitle = null;
        } else {
          _tmpTaskTitle = _cursor.getString(_cursorIndexOfTaskTitle);
        }
        final String _tmpTaskDescription;
        if (_cursor.isNull(_cursorIndexOfTaskDescription)) {
          _tmpTaskDescription = null;
        } else {
          _tmpTaskDescription = _cursor.getString(_cursorIndexOfTaskDescription);
        }
        final boolean _tmpTaskDone;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfTaskDone);
        _tmpTaskDone = _tmp != 0;
        _item = new TaskEntity(_tmpTask_id,_tmpTaskTime,_tmpTaskTitle,_tmpTaskDescription,_tmpTaskDone);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public TaskEntity getTaskById(final String taskId) {
    final String _sql = "SELECT * FROM task WHERE task_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (taskId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, taskId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfTaskId = CursorUtil.getColumnIndexOrThrow(_cursor, "task_id");
      final int _cursorIndexOfTaskTime = CursorUtil.getColumnIndexOrThrow(_cursor, "task_time");
      final int _cursorIndexOfTaskTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "task_title");
      final int _cursorIndexOfTaskDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "task_description");
      final int _cursorIndexOfTaskDone = CursorUtil.getColumnIndexOrThrow(_cursor, "task_done");
      final TaskEntity _result;
      if(_cursor.moveToFirst()) {
        final String _tmpTask_id;
        if (_cursor.isNull(_cursorIndexOfTaskId)) {
          _tmpTask_id = null;
        } else {
          _tmpTask_id = _cursor.getString(_cursorIndexOfTaskId);
        }
        final String _tmpTaskTime;
        if (_cursor.isNull(_cursorIndexOfTaskTime)) {
          _tmpTaskTime = null;
        } else {
          _tmpTaskTime = _cursor.getString(_cursorIndexOfTaskTime);
        }
        final String _tmpTaskTitle;
        if (_cursor.isNull(_cursorIndexOfTaskTitle)) {
          _tmpTaskTitle = null;
        } else {
          _tmpTaskTitle = _cursor.getString(_cursorIndexOfTaskTitle);
        }
        final String _tmpTaskDescription;
        if (_cursor.isNull(_cursorIndexOfTaskDescription)) {
          _tmpTaskDescription = null;
        } else {
          _tmpTaskDescription = _cursor.getString(_cursorIndexOfTaskDescription);
        }
        final boolean _tmpTaskDone;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfTaskDone);
        _tmpTaskDone = _tmp != 0;
        _result = new TaskEntity(_tmpTask_id,_tmpTaskTime,_tmpTaskTitle,_tmpTaskDescription,_tmpTaskDone);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<TaskEntity> getTaskByDate(final String taskDate) {
    final String _sql = "SELECT * FROM task WHERE task_id LIKE ? || '%' ORDER BY task_id ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (taskDate == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, taskDate);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfTaskId = CursorUtil.getColumnIndexOrThrow(_cursor, "task_id");
      final int _cursorIndexOfTaskTime = CursorUtil.getColumnIndexOrThrow(_cursor, "task_time");
      final int _cursorIndexOfTaskTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "task_title");
      final int _cursorIndexOfTaskDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "task_description");
      final int _cursorIndexOfTaskDone = CursorUtil.getColumnIndexOrThrow(_cursor, "task_done");
      final List<TaskEntity> _result = new ArrayList<TaskEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final TaskEntity _item;
        final String _tmpTask_id;
        if (_cursor.isNull(_cursorIndexOfTaskId)) {
          _tmpTask_id = null;
        } else {
          _tmpTask_id = _cursor.getString(_cursorIndexOfTaskId);
        }
        final String _tmpTaskTime;
        if (_cursor.isNull(_cursorIndexOfTaskTime)) {
          _tmpTaskTime = null;
        } else {
          _tmpTaskTime = _cursor.getString(_cursorIndexOfTaskTime);
        }
        final String _tmpTaskTitle;
        if (_cursor.isNull(_cursorIndexOfTaskTitle)) {
          _tmpTaskTitle = null;
        } else {
          _tmpTaskTitle = _cursor.getString(_cursorIndexOfTaskTitle);
        }
        final String _tmpTaskDescription;
        if (_cursor.isNull(_cursorIndexOfTaskDescription)) {
          _tmpTaskDescription = null;
        } else {
          _tmpTaskDescription = _cursor.getString(_cursorIndexOfTaskDescription);
        }
        final boolean _tmpTaskDone;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfTaskDone);
        _tmpTaskDone = _tmp != 0;
        _item = new TaskEntity(_tmpTask_id,_tmpTaskTime,_tmpTaskTitle,_tmpTaskDescription,_tmpTaskDone);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<TaskEntity> getAllRepeatTasks() {
    final String _sql = "SELECT * FROM task WHERE task_id LIKE 'R' || '%' ORDER BY task_id ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfTaskId = CursorUtil.getColumnIndexOrThrow(_cursor, "task_id");
      final int _cursorIndexOfTaskTime = CursorUtil.getColumnIndexOrThrow(_cursor, "task_time");
      final int _cursorIndexOfTaskTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "task_title");
      final int _cursorIndexOfTaskDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "task_description");
      final int _cursorIndexOfTaskDone = CursorUtil.getColumnIndexOrThrow(_cursor, "task_done");
      final List<TaskEntity> _result = new ArrayList<TaskEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final TaskEntity _item;
        final String _tmpTask_id;
        if (_cursor.isNull(_cursorIndexOfTaskId)) {
          _tmpTask_id = null;
        } else {
          _tmpTask_id = _cursor.getString(_cursorIndexOfTaskId);
        }
        final String _tmpTaskTime;
        if (_cursor.isNull(_cursorIndexOfTaskTime)) {
          _tmpTaskTime = null;
        } else {
          _tmpTaskTime = _cursor.getString(_cursorIndexOfTaskTime);
        }
        final String _tmpTaskTitle;
        if (_cursor.isNull(_cursorIndexOfTaskTitle)) {
          _tmpTaskTitle = null;
        } else {
          _tmpTaskTitle = _cursor.getString(_cursorIndexOfTaskTitle);
        }
        final String _tmpTaskDescription;
        if (_cursor.isNull(_cursorIndexOfTaskDescription)) {
          _tmpTaskDescription = null;
        } else {
          _tmpTaskDescription = _cursor.getString(_cursorIndexOfTaskDescription);
        }
        final boolean _tmpTaskDone;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfTaskDone);
        _tmpTaskDone = _tmp != 0;
        _item = new TaskEntity(_tmpTask_id,_tmpTaskTime,_tmpTaskTitle,_tmpTaskDescription,_tmpTaskDone);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<TaskEntity> getAllQuickTasks() {
    final String _sql = "SELECT * FROM task WHERE task_id LIKE 'Q' || '%' ORDER BY task_id DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfTaskId = CursorUtil.getColumnIndexOrThrow(_cursor, "task_id");
      final int _cursorIndexOfTaskTime = CursorUtil.getColumnIndexOrThrow(_cursor, "task_time");
      final int _cursorIndexOfTaskTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "task_title");
      final int _cursorIndexOfTaskDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "task_description");
      final int _cursorIndexOfTaskDone = CursorUtil.getColumnIndexOrThrow(_cursor, "task_done");
      final List<TaskEntity> _result = new ArrayList<TaskEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final TaskEntity _item;
        final String _tmpTask_id;
        if (_cursor.isNull(_cursorIndexOfTaskId)) {
          _tmpTask_id = null;
        } else {
          _tmpTask_id = _cursor.getString(_cursorIndexOfTaskId);
        }
        final String _tmpTaskTime;
        if (_cursor.isNull(_cursorIndexOfTaskTime)) {
          _tmpTaskTime = null;
        } else {
          _tmpTaskTime = _cursor.getString(_cursorIndexOfTaskTime);
        }
        final String _tmpTaskTitle;
        if (_cursor.isNull(_cursorIndexOfTaskTitle)) {
          _tmpTaskTitle = null;
        } else {
          _tmpTaskTitle = _cursor.getString(_cursorIndexOfTaskTitle);
        }
        final String _tmpTaskDescription;
        if (_cursor.isNull(_cursorIndexOfTaskDescription)) {
          _tmpTaskDescription = null;
        } else {
          _tmpTaskDescription = _cursor.getString(_cursorIndexOfTaskDescription);
        }
        final boolean _tmpTaskDone;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfTaskDone);
        _tmpTaskDone = _tmp != 0;
        _item = new TaskEntity(_tmpTask_id,_tmpTaskTime,_tmpTaskTitle,_tmpTaskDescription,_tmpTaskDone);
        _result.add(_item);
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
