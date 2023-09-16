package com.example.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
//import android.widget.Toolbar;

public class MainActivity2 extends AppCompatActivity {

    private TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar3);
        setSupportActionBar(toolbar);
//        ActionBar actionBar = getSupportActionBar();
       // toolbar.getSu.setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();

        answer = (TextView) findViewById(R.id.textView);

        Integer i = intent.getIntExtra("Sum", 0);

        answer.setText("The Answer is "+ String.valueOf(i));

        if(i.equals(1)) {

            Intent launchActivity2 = new Intent(getApplicationContext(), ScrollingActivity.class);
            MainActivity2.this.startActivity(launchActivity2);
        }



    }
}