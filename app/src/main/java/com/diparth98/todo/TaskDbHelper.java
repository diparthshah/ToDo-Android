package com.diparth98.todo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class TaskDbHelper extends SQLiteOpenHelper {

    public TaskDbHelper(Context context) {
        super(context, TaskDB.DB_NAME, null, TaskDB.DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE " + TaskDB.TaskEntry.TABLE + " ( " +
                TaskDB.TaskEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                TaskDB.TaskEntry.COL_TASK_TITLE + " TEXT NOT NULL);";

        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TaskDB.TaskEntry.TABLE);
        onCreate(db);
    }
}
