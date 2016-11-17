package com.epicodus.alcshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class WhiskeyActivity extends AppCompatActivity {
    private ListView mListView;

    private String[] whiskeys = new String[] {"Jack Daniels", "Jim Bean", "Johnny Walker", "Gleffendich", "Grand Papi", "Ballantines"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whiskey);

        mListView = (ListView) findViewById(R.id.listView);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, whiskeys);
        mListView.setAdapter(adapter);
    }
}
