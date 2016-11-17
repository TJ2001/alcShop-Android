package com.epicodus.alcshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @Bind(R.id.beerButton) ImageButton mBeerButton;
    @Bind(R.id.whiskeyButton) ImageButton mWhiskeyButton;
    public static final String TAG = "log";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mWhiskeyButton.setOnClickListener(this);

        mBeerButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if(v == mWhiskeyButton){
            Intent intent = new Intent(MainActivity.this, WhiskeyActivity.class);
            startActivity(intent);
        } else if (v == mBeerButton){
            Intent intent = new Intent(MainActivity.this, BeerActivity.class);
            startActivity(intent);
        }
    }


}
