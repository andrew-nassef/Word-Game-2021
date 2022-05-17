package com.example.word_puzzle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class expert extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.expert);
        final Button button1= (Button) findViewById(R.id.button12);
        Button button2= (Button) findViewById(R.id.button13);
        Button button3= (Button) findViewById(R.id.button14);
        Button button4= (Button) findViewById(R.id.button10);
        Button button5= (Button) findViewById(R.id.button15);
        Button button6= (Button) findViewById(R.id.button16);
        Button button7= (Button) findViewById(R.id.button11);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                end1(view);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                end2(view);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                end3(view);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                end4(view);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                end5(view);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                end6(view);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                back(view);
            }
        });

    }
    void end1 (View view){
        Intent goToSecond = new Intent();
        goToSecond.setClass(this, levell1.class);
        startActivity(goToSecond);
        finish();
    }
    void end2 (View view){
        Intent goToSecond = new Intent();
        goToSecond.setClass(this, levell2.class);
        startActivity(goToSecond);
        finish();
    }
    void end3 (View view){
        Intent goToSecond = new Intent();
        goToSecond.setClass(this, levell3.class);
        startActivity(goToSecond);
        finish();
    }
    void end4 (View view){
        Intent goToSecond = new Intent();
        goToSecond.setClass(this, levell4.class);
        startActivity(goToSecond);
        finish();
    }
    void end5 (View view){
        Intent goToSecond = new Intent();
        goToSecond.setClass(this, levell5.class);
        startActivity(goToSecond);
        finish();
    }
    void end6 (View view){
        Intent goToSecond = new Intent();
        goToSecond.setClass(this, levell6.class);
        startActivity(goToSecond);
        finish();
    }

    void back (View view){
        Intent goToSecond = new Intent();
        goToSecond.setClass(this, levels.class);
        startActivity(goToSecond);
        finish();
    }
}