package com.diparth98.todo;

import android.provider.BaseColumns;

public class TaskDB {
    public static final String DB_NAME = "com.diparth98.todo.db";
    public static final int DB_VERSION = 1;

    public class TaskEntry implements BaseColumns {
        public static final String TABLE = "tasks";

        public static final String COL_TASK_TITLE = "title";
    }
}
