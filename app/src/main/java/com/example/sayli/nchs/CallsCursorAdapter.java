package com.example.sayli.nchs;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

/**
 * Created by sayli on 25/6/17.
 */

public class CallsCursorAdapter extends CursorAdapter {
    public CallsCursorAdapter(Context context, Cursor c) {
        super(context, c);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return LayoutInflater.from(context).inflate(R.layout.list_items,viewGroup,true);
    }
    // The bindView method is used to bind all data to a given view
    // such as setting the text on a TextView.
    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        // Find fields to populate in inflated template
        TextView listCrn=(TextView) view.findViewById(R.id.list_crn);
        TextView listDate=(TextView) view.findViewById(R.id.list_date);
        TextView listCustName=(TextView) view.findViewById(R.id.list_cust_name);
        TextView listCustAddress=(TextView) view.findViewById(R.id.list_cust_add);
        TextView listStatusNo=(TextView) view.findViewById(R.id.list_status_no);
        // Extract properties from cursor
        String crn=cursor.getString(cursor.getColumnIndexOrThrow(""));
        String date=cursor.getString(cursor.getColumnIndexOrThrow(""));
        String cName=cursor.getString(cursor.getColumnIndexOrThrow(""));
        String cAdd=cursor.getString(cursor.getColumnIndexOrThrow(""));
        String crnStatus=cursor.getString(cursor.getColumnIndexOrThrow(""));
        // Populate fields with extracted properties
        listCrn.setText(crn);
        listDate.setText(date);
        listCustName.setText(cName);
        listCustAddress.setText(cAdd);
        listStatusNo.setText(crnStatus);
    }
}
