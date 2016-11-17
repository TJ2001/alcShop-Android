package com.epicodus.alcshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

public class BeerActivity extends AppCompatActivity {
    private GridView mGridView;

    private String[] beers = new String[] {"Ruby Ale", "Terminator", "Hammerhead", "Bagdad Ale", "Black Rabbit Porter"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beer);

        mGridView = (GridView) findViewById(R.id.beerGridView);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, beers);
        mGridView.setAdapter(adapter);
    }
}
