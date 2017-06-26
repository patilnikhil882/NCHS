package com.example.sayli.nchs.data;

import android.provider.BaseColumns;

/**
 * Created by sayli on 25/6/17.
 */

public class CustomerContract {
    private CustomerContract() {
    }

    public static final class CustomerEntry {
        /**
         * Name of database table for logs
         */
        public final static String TABLE_NAME = "customers";

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
        public final static String COLUMN_CUST_MOB_NO = "NO";
        /**
         * name of caller.
         * <p>
         * Type: TEXT
         */
        public final static String COLUMN_CUST_NAME = "name";

        /**
         * address of caller.
         * <p>
         * Type: TEXT
         */
        public final static String COLUMN_CUST_ADD = "add";
    }
}
