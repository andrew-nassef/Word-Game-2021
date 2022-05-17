package com.example.word_puzzle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class levels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levels);
        Button button1= (Button) findViewById(R.id.button10);
        Button button2= (Button) findViewById(R.id.button11);
        Button button3= (Button) findViewById(R.id.button12);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                end1(view);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                end2(view);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                back(view);
            }
        });
    }
    void end1 (View view){
        Intent goToSecond = new Intent();
        goToSecond.setClass(this, beginner.class);
        startActivity(goToSecond);
        finish();
    }
    void end2 (View view){
        Intent goToSecond = new Intent();
        goToSecond.setClass(this, expert.class);
        startActivity(goToSecond);
        finish();
    }
    void back (View view){
        Intent goToSecond = new Intent();
        goToSecond.setClass(this, MainMenu.class);
        startActivity(goToSecond);
        finish();
    }
}