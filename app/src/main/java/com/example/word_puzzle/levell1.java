package com.example.word_puzzle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class levell1 extends AppCompatActivity {
    int right =0 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levell1);
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
            EditText text5 = (EditText) findViewById(R.id.text5);
            EditText text6 = (EditText) findViewById(R.id.text6);
            EditText text7 = (EditText) findViewById(R.id.text7);
            @Override
            public void onClick(View view) {


                if (text.getText().toString().isEmpty()){
                    text.setText("g");
                }
                else if (text2.getText().toString().isEmpty()){
                    text2.setText("g");
                }
                else if (text3.getText().toString().isEmpty()){
                    text3.setText("g");
                }
                else if (text4.getText().toString().isEmpty()){
                    text4.setText("g");
                } else if (text5.getText().toString().isEmpty()){
                    text5.setText("g");
                } else if (text6.getText().toString().isEmpty()){
                    text6.setText("g");
                }
                else if(text7.getText().toString().isEmpty()) {
                    text7.setText("g");
                    if (right==6){
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
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText text = (EditText) findViewById(R.id.text);
                EditText text2 = (EditText) findViewById(R.id.text2);
                EditText text3 = (EditText) findViewById(R.id.text3);
                EditText text4 = (EditText) findViewById(R.id.text4);
                EditText text5 = (EditText) findViewById(R.id.text5);
                EditText text6 = (EditText) findViewById(R.id.text6);
                EditText text7 = (EditText) findViewById(R.id.text7);
                if (text.getText().toString().isEmpty()){
                    text.setText("f");

                }
                else if (text2.getText().toString().isEmpty()){
                    text2.setText("f");

                }
                else if (text3.getText().toString().isEmpty()){
                    text3.setText("f");
                }
                else if (text4.getText().toString().isEmpty()){
                    text4.setText("f");
                }
                else if (text5.getText().toString().isEmpty()){
                    text5.setText("f");
                }
                else if (text6.getText().toString().isEmpty()){
                    text6.setText("f");
                }
                else if(text7.getText().toString().isEmpty()) {
                    text7.setText("f");
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
                EditText text5 = (EditText) findViewById(R.id.text5);
                EditText text6 = (EditText) findViewById(R.id.text6);
                EditText text7 = (EditText) findViewById(R.id.text7);
                if (text.getText().toString().isEmpty()){
                    text.setText("u");

                }
                else if (text2.getText().toString().isEmpty()){
                    text2.setText("u");
                    right++;
                }
                else if (text3.getText().toString().isEmpty()){
                    text3.setText("u");

                }
                else if (text4.getText().toString().isEmpty()){
                    text4.setText("u");
                }
                else if (text5.getText().toString().isEmpty()){
                    text5.setText("u");
                }
                else if (text6.getText().toString().isEmpty()){
                    text6.setText("u");
                }
                else if(text7.getText().toString().isEmpty()) {
                    text7.setText("u");
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
                EditText text5 = (EditText) findViewById(R.id.text5);
                EditText text6 = (EditText) findViewById(R.id.text6);
                EditText text7 = (EditText) findViewById(R.id.text7);
                if (text.getText().toString().isEmpty()){
                    text.setText("d");

                }
                else if (text2.getText().toString().isEmpty()){
                    text2.setText("d");

                }
                else if (text3.getText().toString().isEmpty()){
                    text3.setText("d");
                }
                else if (text4.getText().toString().isEmpty()){
                    text4.setText("d");
                }
                else if (text5.getText().toString().isEmpty()){
                    text5.setText("d");
                    right++;
                }
                else if (text6.getText().toString().isEmpty()){
                    text6.setText("d");
                }
                else if(text7.getText().toString().isEmpty()) {
                    text7.setText("d");
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
                EditText text5 = (EditText) findViewById(R.id.text5);
                EditText text6 = (EditText) findViewById(R.id.text6);
                EditText text7 = (EditText) findViewById(R.id.text7);
                if (text.getText().toString().isEmpty()){
                    text.setText("l");
                }
                else if (text2.getText().toString().isEmpty()){
                    text2.setText("l");
                }
                else if (text3.getText().toString().isEmpty()){
                    text3.setText("l");
                    right++;
                }
                else if(text4.getText().toString().isEmpty()) {
                    text4.setText("l");
                    right++;
                }
                else if(text5.getText().toString().isEmpty()) {
                    text5.setText("l");

                }
                else if(text6.getText().toString().isEmpty()) {
                    text6.setText("l");
                } else if(text7.getText().toString().isEmpty()) {
                    text7.setText("l");
                    lose_Mess(view);
                    Finish(view);
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
                EditText text5 = (EditText) findViewById(R.id.text5);
                EditText text6 = (EditText) findViewById(R.id.text6);
                EditText text7 = (EditText) findViewById(R.id.text7);
                if (text.getText().toString().isEmpty()){
                    text.setText("p");

                }
                else if (text2.getText().toString().isEmpty()){
                    text2.setText("p");
                }
                else if (text3.getText().toString().isEmpty()){
                    text3.setText("p");

                }
                else if(text4.getText().toString().isEmpty() ) {
                    text4.setText("p");

                }
                else if (text5.getText().toString().isEmpty()){
                    text5.setText("p");
                }
                else if (text6.getText().toString().isEmpty()){
                    text6.setText("p");

                }
                else if (text7.getText().toString().isEmpty()){
                    text7.setText("p");
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
                EditText text5 = (EditText) findViewById(R.id.text5);
                EditText text6= (EditText) findViewById(R.id.text6);
                EditText text7 = (EditText) findViewById(R.id.text7);
                if (text.getText().toString().isEmpty()){
                    text.setText("b");
                    right++;
                }
                else if (text2.getText().toString().isEmpty()){
                    text2.setText("b");

                }
                else if (text3.getText().toString().isEmpty()){
                    text3.setText("b");
                }
                else if (text4.getText().toString().isEmpty()){
                    text4.setText("b");
                }
                else if (text5.getText().toString().isEmpty()){
                    text5.setText("b");
                }
                else if (text6.getText().toString().isEmpty()){
                    text6.setText("b");
                }
                else if(text7.getText().toString().isEmpty()) {
                    text7.setText("b");
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
                EditText text5 = (EditText) findViewById(R.id.text5);
                EditText text6 = (EditText) findViewById(R.id.text6);
                EditText text7 = (EditText) findViewById(R.id.text7);
                if (text.getText().toString().isEmpty()){
                    text.setText("o");

                }
                else if (text2.getText().toString().isEmpty()){
                    text2.setText("o");
                }
                else if (text3.getText().toString().isEmpty()){
                    text3.setText("o");
                }
                else if (text4.getText().toString().isEmpty()){
                    text4.setText("o");
                }
                else if (text5.getText().toString().isEmpty()){
                    text5.setText("o");
                }
                else if (text6.getText().toString().isEmpty()){
                    text6.setText("o");
                    right++;
                }
                else if(text7.getText().toString().isEmpty()) {
                    text7.setText("o");
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
        goToSecond.putExtra("last","7");
        startActivity(goToSecond);
        finish();
    }
    public void back(View view){
        Intent goToSecond = new Intent();
        goToSecond.setClass(this, expert.class);
        startActivity(goToSecond);
        finish();
    }
    public void lose_Mess(View view){
        Intent goToSecond = new Intent();
        goToSecond.setClass(this, lose.class);
        goToSecond.putExtra("last","7");
        startActivity(goToSecond);
        finish();
    }
    public void Finish(View view){
        right=0;
    }
}