package com.example.sayli.nchs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RelativeLayout custList = (RelativeLayout) findViewById(R.id.cust_list);
       /* TextView callsCount = (TextView) findViewById(R.id.count_calls);
        TextView amountCollectedCount = (TextView) findViewById(R.id.collectedAmount);
        TextView newCallsCount = (TextView) findViewById(R.id.newCallsCount);
        TextView pendingCallsCount = (TextView) findViewById(R.id.pendingCallsCount);*/
        custList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("sayli", "here");
                Intent i = new Intent(MainActivity.this, ReportCallStatus.class);
                startActivity(i);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);

        // Associate searchable configuration with the SearchView
        /*SearchManager searchManager =
                (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        SearchView searchView =
                (SearchView) menu.findItem(R.id.search).getActionView();
        searchView.setSearchableInfo(
                searchManager.getSearchableInfo(getComponentName()));*/
        return true;
    }

}
