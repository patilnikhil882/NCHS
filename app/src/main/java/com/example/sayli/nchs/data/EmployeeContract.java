package com.example.sayli.nchs.data;

import android.provider.BaseColumns;

/**
 * Created by sayli on 25/6/17.
 */

public class EmployeeContract {
    private EmployeeContract(){}
    public static final class EmployeeEntry{
        /**
         * Name of database table for logs
         */
        public final static String TABLE_NAME = "employee";

        /**
         * Unique ID number for the call (only for use in the database table).
         * <p>
         * Type: INTEGER
         */
        public final static String _ID = BaseColumns._ID;

        /**
         * Mobile Number of the caller.
         * <p>
         * Type: TEXT
         */
        public final static String COLUMN_EMP_MOB_NO = "NO";
        /**
         * Status of the call.
         * <p>
         * Type: INTEGER
         */
        public final static String COLUMN_EMP_STATUS = "status";

        /**
         * CRN of the call.
         * <p>
         * Type: INTEGER
         */
        public final static String COLUMN_EMP_NAME = "name";
    }
}
