package com.example.word_puzzle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class levell3 extends AppCompatActivity {
     int right =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levell3);
        final Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        Button button7 = (Button) findViewById(R.id.button7);
        Button button = (Button) findViewById(R.id.button);
        Button button8 = (Button) findViewById(R.id.button8);
        button.setOnClickListener(new View.OnClickListener() {
            EditText text = (EditText) findViewById(R.id.text1);
            EditText text2 = (EditText) findViewById(R.id.text2);
            EditText text3 = (EditText) findViewById(R.id.text3);
            EditText text4 = (EditText) findViewById(R.id.text4);
            EditText text5 = (EditText) findViewById(R.id.text5);
            EditText text6 = (EditText) findViewById(R.id.text6);
            EditText text7 = (EditText) findViewById(R.id.text7);
            EditText text8 = (EditText) findViewById(R.id.text8);
            @Override
            public void onClick(View view) {
                if (text.getText().toString().isEmpty()) {
                    text.setText("r");
                }
                else if (text2.getText().toString().isEmpty()) {
                    text2.setText("r");

                }
                else if (text3.getText().toString().isEmpty()) {
                    text3.setText("r");
                }
                else if (text4.getText().toString().isEmpty()) {
                    text4.setText("r");
                    right++;
                }
                else if (text5.getText().toString().isEmpty()) {
                    text5.setText("r");
                }
                else if (text6.getText().toString().isEmpty()) {
                    text6.setText("r");

                }
                else if (text7.getText().toString().isEmpty()) {
                    text7.setText("r");
                }
                else if (text8.getText().toString().isEmpty()) {
                    text8.setText("r");
                    lose_Mess(view);
                    Finish(view);
                }

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
            EditText text8 = (EditText) findViewById(R.id.text8);
            @Override
            public void onClick(View view) {

                if (text.getText().toString().isEmpty()) {
                    text.setText("b");
                }
                else if (text2.getText().toString().isEmpty()) {
                    text2.setText("b");
                }
                else if (text3.getText().toString().isEmpty()) {
                    text3.setText("b");
                }
                else if (text4.getText().toString().isEmpty()) {
                    text4.setText("b");
                }
                else if (text5.getText().toString().isEmpty()) {
                    text5.setText("b");
                    right++;
                }
                else if (text6.getText().toString().isEmpty()) {
                    text6.setText("b");
                }
                else if (text7.getText().toString().isEmpty()) {
                    text7.setText("b");
                }
                else if (text8.getText().toString().isEmpty()) {
                    text8.setText("b");
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
            EditText text8 = (EditText) findViewById(R.id.text8);
            @Override
            public void onClick(View view) {

                if (text.getText().toString().isEmpty()) {
                    text.setText("c");

                } else if (text2.getText().toString().isEmpty()) {
                    text2.setText("c");
                }
                else if (text3.getText().toString().isEmpty()) {
                    text3.setText("c");
                } else if (text4.getText().toString().isEmpty()) {
                    text4.setText("c");
                } else if (text5.getText().toString().isEmpty()) {
                    text5.setText("c");
                }
                else if (text6.getText().toString().isEmpty()) {
                    text6.setText("c");
                }
                else if (text7.getText().toString().isEmpty()) {
                    text7.setText("c");

                }
                else if (text8.getText().toString().isEmpty()) {
                    text8.setText("c");
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
            EditText text8 = (EditText) findViewById(R.id.text8);
            @Override
            public void onClick(View view) {

                if (text.getText().toString().isEmpty()) {
                    text.setText("e");
                } else if (text2.getText().toString().isEmpty()) {
                    text2.setText("e");

                } else if (text3.getText().toString().isEmpty()) {
                    text3.setText("e");
                } else if (text4.getText().toString().isEmpty()) {
                    text4.setText("e");

                }
                else if (text5.getText().toString().isEmpty()) {
                    text5.setText("e");

                }
                else if (text6.getText().toString().isEmpty()) {
                    text6.setText("e");
                    right++;
                }
                else if (text7.getText().toString().isEmpty()) {
                    text7.setText("e");
                }
                else if (text8.getText().toString().isEmpty()) {
                    text8.setText("e");
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
            EditText text8 = (EditText) findViewById(R.id.text8);
            @Override
            public void onClick(View view) {

                if (text.getText().toString().isEmpty()) {
                    text.setText("p");
                } else if (text2.getText().toString().isEmpty()) {
                    text2.setText("p");
                } else if (text3.getText().toString().isEmpty()) {
                    text3.setText("p");

                } else if (text4.getText().toString().isEmpty()) {
                    text4.setText("p");
                } else if (text5.getText().toString().isEmpty()) {
                    text5.setText("p");
                } else if (text6.getText().toString().isEmpty()) {
                    text6.setText("p");
                }
                else if (text7.getText().toString().isEmpty()) {
                    text7.setText("p");
                }
                else if (text8.getText().toString().isEmpty()) {
                    text8.setText("p");
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
            EditText text8 = (EditText) findViewById(R.id.text8);
            @Override
            public void onClick(View view) {

                if (text.getText().toString().isEmpty()) {
                    text.setText("d");
                    right++;
                }
                else if (text2.getText().toString().isEmpty()) {
                    text2.setText("d");
                }
                else if (text3.getText().toString().isEmpty()) {
                    text3.setText("d");

                }
                else if (text4.getText().toString().isEmpty()) {
                    text4.setText("d");
                }
                else if (text5.getText().toString().isEmpty()) {
                    text5.setText("d");
                }
                else if (text6.getText().toString().isEmpty()) {
                    text6.setText("d");
                }
                else if (text7.getText().toString().isEmpty()) {
                    text7.setText("d");
                }
                else if (text8.getText().toString().isEmpty()) {
                    text8.setText("d");
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
            EditText text8 = (EditText) findViewById(R.id.text8);
            @Override
            public void onClick(View view) {
                if (text.getText().toString().isEmpty()) {
                    text.setText("l");
                } else if (text2.getText().toString().isEmpty()) {
                    text2.setText("l");
                } else if (text3.getText().toString().isEmpty()) {
                    text3.setText("l");
                }
                else if (text4.getText().toString().isEmpty()) {
                    text4.setText("l");
                } else if (text5.getText().toString().isEmpty()) {
                    text5.setText("l");
                }
                else if (text6.getText().toString().isEmpty()) {
                    text6.setText("l");
                }
                else if (text7.getText().toString().isEmpty()) {
                    text7.setText("l");
                    right++;
                }
                else if (text8.getText().toString().isEmpty()) {
                    text8.setText("l");
                    if (right == 7) {
                        Win_Mess(view);
                        right = 0;
                    }
                    else {
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
            EditText text8 = (EditText) findViewById(R.id.text8);
            @Override
            public void onClick(View view) {

                if (text.getText().toString().isEmpty()) {
                    text.setText("o");
                }
                else if (text2.getText().toString().isEmpty()) {
                    text2.setText("o");
                    right++;
                }
                else if (text3.getText().toString().isEmpty()){
                    text3.setText("o");
                    right++;
                }
                else if (text4.getText().toString().isEmpty()){
                    text4.setText("o");

                }
                else if (text5.getText().toString().isEmpty()){
                    text5.setText("o");
                }
                else if (text6.getText().toString().isEmpty()){
                    text6.setText("o");

                }
                else if (text7.getText().toString().isEmpty()){
                    text7.setText("o");
                }
                else if (text8.getText().toString().isEmpty()){
                    text8.setText("o");
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
        goToSecond.putExtra("last","9");
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
        goToSecond.putExtra("last","9");
        startActivity(goToSecond);
        finish();
    }
    public void Finish(View view){
        right=0;
    }
}