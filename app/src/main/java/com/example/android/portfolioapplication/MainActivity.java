package com.example.android.portfolioapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creating button listeners
        final Context context = getApplicationContext();
        final int duration = Toast.LENGTH_SHORT;

        Button popularMoviesButton = (Button) findViewById(R.id.button);
        popularMoviesButton.setOnClickListener(new View.OnClickListener(){
            CharSequence text = "This button will launch my Popular Movies App!";
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        Button stockHawkButton = (Button) findViewById(R.id.button2);
        stockHawkButton.setOnClickListener(new View.OnClickListener(){
            CharSequence text = "This button will launch my Stock Hawk App!";
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        Button buildItBiggerButton = (Button) findViewById(R.id.button3);
        buildItBiggerButton.setOnClickListener(new View.OnClickListener(){
            CharSequence text = "This button will launch my Build It Bigger App!";
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        Button makeYourAppMaterialButton = (Button) findViewById(R.id.button4);
        makeYourAppMaterialButton.setOnClickListener(new View.OnClickListener(){
            CharSequence text = "This button will launch my Make Your App Material App!";
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        Button goUbiquitousButton = (Button) findViewById(R.id.button5);
        goUbiquitousButton.setOnClickListener(new View.OnClickListener(){
            CharSequence text = "This button will launch my Go Ubiquitous App!";
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        Button capstoneButton = (Button) findViewById(R.id.button6);
        capstoneButton.setOnClickListener(new View.OnClickListener(){
            CharSequence text = "This button will launch my Capstone App!";
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
    }


}
