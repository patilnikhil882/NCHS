package com.example.sayli.nchs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import static android.app.SearchManager.QUERY;

/**
 * Created by sayli on 23/6/17.
 */

public class SearchResultsActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        handleIntent(getIntent());
    }

    @Override
    protected void onNewIntent(Intent intent) {

        handleIntent(intent);
    }

    private void handleIntent(Intent intent) {

        if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
            String query = intent.getStringExtra(QUERY);
            //use the query to search your data somehow
        }
    }
}
