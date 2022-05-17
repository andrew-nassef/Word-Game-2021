package com.example.word_puzzle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;
import android.content.Intent;

public class level3 extends AppCompatActivity {
    int right = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level3);
        final Button button1= (Button) findViewById(R.id.button1);
        Button button2= (Button) findViewById(R.id.button2);
        Button button3= (Button) findViewById(R.id.button3);
        Button button4= (Button) findViewById(R.id.button4);
        Button button5= (Button) findViewById(R.id.button5);
        Button button6= (Button) findViewById(R.id.button6);
        Button button7= (Button) findViewById(R.id.button7);
        Button button= (Button) findViewById(R.id.button);
        Button button8= (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                back(view);
            }
        });
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
                    text.setText("i");
                }
                else if (text2.getText().toString().isEmpty()){
                    text2.setText("i");
                }
                else if (text3.getText().toString().isEmpty()){
                    text3.setText("i");
                    right++;
                }
                else if (text4.getText().toString().isEmpty()){
                    text4.setText("i");
                }
                else if (text5.getText().toString().isEmpty()){
                    text5.setText("i");
                }
                else if (text6.getText().toString().isEmpty()){
                    text6.setText("i");
                }
                else if(text7.getText().toString().isEmpty()) {
                    text7.setText("p");
                    lose_Mess(view);
                    Finish(view);
                }

            }
        });
        button.setOnClickListener(new View.OnClickListener() {
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
                    text.setText("a");
                }
                else if (text2.getText().toString().isEmpty()){
                    text2.setText("a");
                    right++;
                }
                else if (text3.getText().toString().isEmpty()){
                    text3.setText("a");

                }
                else if (text4.getText().toString().isEmpty()){
                    text4.setText("a");
                }else if (text5.getText().toString().isEmpty()){
                    text5.setText("a");
                }else if (text6.getText().toString().isEmpty()){
                    text6.setText("a");
                }
                else if(text7.getText().toString().isEmpty()) {
                    text7.setText("a");
                    lose_Mess(view);
                    Finish(view);
                }


            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
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
                    text.setText("r");
                    right++;
                }
                else if (text2.getText().toString().isEmpty()){
                    text2.setText("r");
                }
                else if (text3.getText().toString().isEmpty()){
                    text3.setText("r");
                }
                else if (text4.getText().toString().isEmpty()){
                    text4.setText("r");
                }
                else if (text5.getText().toString().isEmpty()){
                    text5.setText("r");
                }
                else if (text6.getText().toString().isEmpty()){
                    text6.setText("r");
                }
                else if(text7.getText().toString().isEmpty()) {
                    text7.setText("r");
                    lose_Mess(view);
                    Finish(view);
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
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
                    text.setText("n");
                }
                else if (text2.getText().toString().isEmpty()){
                    text2.setText("n");
                }
                else if (text3.getText().toString().isEmpty()){
                    text3.setText("n");
                }
                else if (text4.getText().toString().isEmpty()){
                    text4.setText("n");
                    right++;
                }
                else if (text5.getText().toString().isEmpty()){
                    text5.setText("n");
                }
                else if (text6.getText().toString().isEmpty()){
                    text6.setText("n");
                }
                else if(text7.getText().toString().isEmpty()) {
                    text7.setText("n");
                    lose_Mess(view);
                    Finish(view);
                }
            }
        });
         button5.setOnClickListener(new View.OnClickListener() {
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
                else if(text7.getText().toString().isEmpty() ) {
                    text7.setText("o");
                        lose_Mess(view);
                        Finish(view);
                }
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
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
                    text.setText("w");
                }
                else if (text2.getText().toString().isEmpty()){
                    text2.setText("w");
                }
                else if (text3.getText().toString().isEmpty()){
                    text3.setText("w");
                }
                else if (text4.getText().toString().isEmpty()){
                    text4.setText("w");
                }
                else if (text5.getText().toString().isEmpty()){
                    text5.setText("w");
                }
                else if (text6.getText().toString().isEmpty()){
                    text6.setText("w");
                }
                else if(text7.getText().toString().isEmpty()) {
                    text7.setText("w");
                    if (right == 6){
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
        button7.setOnClickListener(new View.OnClickListener() {
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
                    text.setText("b");
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
                    right++;
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
    }
    public void Win_Mess(View view){
        Intent goToSecond = new Intent();
        goToSecond.setClass(this, message.class);
        goToSecond.putExtra("last","3");
        startActivity(goToSecond);
        finish();
    }
    public void lose_Mess(View view){
        Intent goToSecond = new Intent();
        goToSecond.setClass(this, lose.class);
        goToSecond.putExtra("last","3");
        startActivity(goToSecond);
        finish();
    }
    public void back(View view){
        Intent goToSecond = new Intent();
        goToSecond.setClass(this, beginner.class);
        startActivity(goToSecond);
        finish();
    }
    public void Finish(View view){
        right=0;
    }

}