package com.epicodus.alcshop;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class SplashScreenActivity extends AppCompatActivity implements View.OnClickListener{
    @Bind(R.id.welcomeButton) Button mWelcomeButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView mAppNameTextView;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        ButterKnife.bind(this);

        mAppNameTextView = (TextView) findViewById(R.id.storeName);
        Typeface CasperFont = Typeface.createFromAsset(getAssets(), "fonts/BlackCasper.ttf");
        mAppNameTextView.setTypeface(CasperFont);

        mWelcomeButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        Intent intent = new Intent(SplashScreenActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
