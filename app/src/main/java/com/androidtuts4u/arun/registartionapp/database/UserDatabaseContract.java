package com.androidtuts4u.arun.registartionapp.database;

import android.provider.BaseColumns;

/**
 * Created by arun on 19-08-2017.
 */

public final class UserDatabaseContract {

    private UserDatabaseContract() {
    }

    public static class UserDatabase implements BaseColumns {
        public static final String TABLE_NAME = "user_details";
        public static final String COLUMN_NAME_COL1 = "name";
        public static final String CLOMUMN_NAME_COL2 = "address";
        public static final String COLUMN_NAME_COL3 = "phone_no";
        public static final String COLUMN_NAME_COL_4 = "profession";

    }

}
