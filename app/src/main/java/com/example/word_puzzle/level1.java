package com.example.word_puzzle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;
import android.content.Intent;

public class level1 extends AppCompatActivity {
    int right = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1);
        final Button button1= (Button) findViewById(R.id.button1);
        Button button2= (Button) findViewById(R.id.button2);
        Button button3= (Button) findViewById(R.id.button3);
        Button button4= (Button) findViewById(R.id.button4);
        Button button5= (Button) findViewById(R.id.button5);
        Button button6= (Button) findViewById(R.id.button6);
        Button button7= (Button) findViewById(R.id.button7);
        Button button= (Button) findViewById(R.id.button);
        Button button8= (Button) findViewById(R.id.button8);
        button1.setOnClickListener(new View.OnClickListener() {
            EditText text = (EditText) findViewById(R.id.text1);
            EditText text2 = (EditText) findViewById(R.id.text2);
            EditText text3 = (EditText) findViewById(R.id.text3);
            EditText text4 = (EditText) findViewById(R.id.text4);
            @Override
            public void onClick(View view) {

                if (text.getText().toString().isEmpty()){
                    text.setText(" "+"p");
                }
                else if (text2.getText().toString().isEmpty()){
                    text2.setText(" "+"p");
                }
                else if (text3.getText().toString().isEmpty()){
                    text3.setText(" "+"p");
                }
                else if(text4.getText().toString().isEmpty()) {
                    text4.setText(" "+"p");
                    lose_Mess(view);
                    Finish(view);
                }

            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText text = (EditText) findViewById(R.id.text1);
                EditText text2 = (EditText) findViewById(R.id.text2);
                EditText text3 = (EditText) findViewById(R.id.text3);
                EditText text4 = (EditText) findViewById(R.id.text4);
                if (text.getText().toString().isEmpty()){
                    text.setText(" i");
                }
                else if (text2.getText().toString().isEmpty()){
                    text2.setText(" i");
                    right++;
                }
                else if (text3.getText().toString().isEmpty()){
                    text3.setText(" i");
                }
                else if(text4.getText().toString().isEmpty()) {
                    text4.setText(" i");
                    lose_Mess(view);
                    Finish(view);
                }


            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText text = (EditText) findViewById(R.id.text1);
                EditText text2 = (EditText) findViewById(R.id.text2);
                EditText text3 = (EditText) findViewById(R.id.text3);
                EditText text4 = (EditText) findViewById(R.id.text4);
                if (text.getText().toString().isEmpty()){
                    text.setText(" n");
                }
                else if (text2.getText().toString().isEmpty()){
                    text2.setText(" n");
                }
                else if (text3.getText().toString().isEmpty()){
                    text3.setText(" n");
                    right++;
                }
                else if(text4.getText().toString().isEmpty()) {
                    text4.setText(" n");
                    lose_Mess(view);
                    Finish(view);
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText text = (EditText) findViewById(R.id.text1);
                EditText text2 = (EditText) findViewById(R.id.text2);
                EditText text3 = (EditText) findViewById(R.id.text3);
                EditText text4 = (EditText) findViewById(R.id.text4);
                if (text.getText().toString().isEmpty()){
                    text.setText(" "+"e");
                }
                else if (text2.getText().toString().isEmpty()){
                    text2.setText(" "+"e");
                }
                else if (text3.getText().toString().isEmpty()){
                    text3.setText(" "+"e");
                }
                else if(text4.getText().toString().isEmpty()) {
                    text4.setText(" "+"e");
                    lose_Mess(view);
                    Finish(view);
                }

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText text = (EditText) findViewById(R.id.text1);
                EditText text2 = (EditText) findViewById(R.id.text2);
                EditText text3 = (EditText) findViewById(R.id.text3);
                EditText text4 = (EditText) findViewById(R.id.text4);
                if (text.getText().toString().isEmpty()){
                    text.setText(" "+"d");
                }
                else if (text2.getText().toString().isEmpty()){
                    text2.setText(" "+"d");
                }
                else if (text3.getText().toString().isEmpty()){
                    text3.setText(" "+"d");
                }
                else if(text4.getText().toString().isEmpty()) {
                    text4.setText(" "+"d");
                    if (right==3){
                        Win_Mess(view);
                        right =0;
                    }
                    else{
                        lose_Mess(view);
                        Finish(view);
                    }
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText text = (EditText) findViewById(R.id.text1);
                EditText text2 = (EditText) findViewById(R.id.text2);
                EditText text3 = (EditText) findViewById(R.id.text3);
                EditText text4 = (EditText) findViewById(R.id.text4);
                if (text.getText().toString().isEmpty()){
                    text.setText(" w");
                    right++;
                }
                else if (text2.getText().toString().isEmpty()){
                    text2.setText(" w");
                }
                else if (text3.getText().toString().isEmpty()){
                    text3.setText(" w");
                }
                else if(text4.getText().toString().isEmpty() ) {
                    text4.setText(" w");
                    lose_Mess(view);
                    Finish(view);
                }
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText text = (EditText) findViewById(R.id.text1);
                EditText text2 = (EditText) findViewById(R.id.text2);
                EditText text3 = (EditText) findViewById(R.id.text3);
                EditText text4 = (EditText) findViewById(R.id.text4);
                if (text.getText().toString().isEmpty()){
                    text.setText(" "+"a");
                }
                else if (text2.getText().toString().isEmpty()){
                    text2.setText(" "+"a");
                }
                else if (text3.getText().toString().isEmpty()){
                    text3.setText(" "+"a");
                }
                else if(text4.getText().toString().isEmpty()) {
                    text4.setText(" "+"a");
                    lose_Mess(view);
                    Finish(view);
                }
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText text = (EditText) findViewById(R.id.text1);
                EditText text2 = (EditText) findViewById(R.id.text2);
                EditText text3 = (EditText) findViewById(R.id.text3);
                EditText text4 = (EditText) findViewById(R.id.text4);
                if (text.getText().toString().isEmpty()){
                    text.setText(" "+"s");
                }
                else if (text2.getText().toString().isEmpty()){
                    text2.setText(" "+"s");
                }
                else if (text3.getText().toString().isEmpty()){
                    text3.setText(" "+"s");
                }
                else if(text4.getText().toString().isEmpty()) {
                    text4.setText(" "+"s");
                    lose_Mess(view);
                    Finish(view);
                }

            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                back(view);
            }
        });
    }
    public void Win_Mess(View view){
        Intent goToSecond = new Intent();
        goToSecond.setClass(this, message.class);
        goToSecond.putExtra("last","1");
        startActivity(goToSecond);
        finish();
    }
    public void back(View view){
        Intent goToSecond = new Intent();
        goToSecond.setClass(this, beginner.class);
        startActivity(goToSecond);
        finish();
    }
    public void lose_Mess(View view){
        Intent goToSecond = new Intent();
        goToSecond.setClass(this, lose.class);
        goToSecond.putExtra("last","1");
        startActivity(goToSecond);
        finish();
    }
    public void Finish(View view){
        right=0;
    }

}
