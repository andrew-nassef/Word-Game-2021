package com.example.word_puzzle;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class
level5 extends AppCompatActivity {
    int right =0 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level5);
        final Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        Button button7 = (Button) findViewById(R.id.button7);
        Button button = (Button) findViewById(R.id.button);
        Button button8 = (Button) findViewById(R.id.button8);

        button1.setOnClickListener(new View.OnClickListener() {
            EditText text = (EditText) findViewById(R.id.text1);
            EditText text2 = (EditText) findViewById(R.id.text2);
            EditText text3 = (EditText) findViewById(R.id.text3);
            EditText text4 = (EditText) findViewById(R.id.text4);
            EditText text5 = (EditText) findViewById(R.id.text5);
            EditText text6 = (EditText) findViewById(R.id.text6);
            EditText text7 = (EditText) findViewById(R.id.text7);
            EditText text8 = (EditText) findViewById(R.id.text8);
            EditText text9 = (EditText) findViewById(R.id.text9);

            @Override
            public void onClick(View view) {

                if (text.getText().toString().isEmpty()) {
                    text.setText("c");
                } else if (text2.getText().toString().isEmpty()) {
                    text2.setText("c");
                } else if (text3.getText().toString().isEmpty()) {
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
                }
                else if (text9.getText().toString().isEmpty()) {
                    text9.setText("c");
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
            EditText text8 = (EditText) findViewById(R.id.text8);
            EditText text9 = (EditText) findViewById(R.id.text9);
            @Override
            public void onClick(View view) {
                if (text.getText().toString().isEmpty()) {
                    text.setText("t");
                }
                else if (text2.getText().toString().isEmpty()) {
                    text2.setText("t");

                } else if (text3.getText().toString().isEmpty()) {
                    text3.setText("t");
                } else if (text4.getText().toString().isEmpty()) {
                    text4.setText("t");
                }
                else if (text5.getText().toString().isEmpty()) {
                    text5.setText("t");
                    right++;
                }
                else if (text6.getText().toString().isEmpty()) {
                    text6.setText("t");
                }
                else if (text7.getText().toString().isEmpty()) {
                    text7.setText("t");
                }
                else if (text8.getText().toString().isEmpty()) {
                    text8.setText("t");
                }
                else if (text9.getText().toString().isEmpty()) {
                    text9.setText("t");
                    if (right == 8) {
                        Win_Mess(view);
                        right = 0;
                    } else {
                        lose_Mess(view);
                        Finish(view);
                    }
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
            EditText text9 = (EditText) findViewById(R.id.text9);
            @Override
            public void onClick(View view) {

                if (text.getText().toString().isEmpty()) {
                    text.setText("e");

                } else if (text2.getText().toString().isEmpty()) {
                    text2.setText("e");
                    right++;
                }
                else if (text3.getText().toString().isEmpty()) {
                    text3.setText("e");
                } else if (text4.getText().toString().isEmpty()) {
                    text4.setText("e");
                } else if (text5.getText().toString().isEmpty()) {
                    text5.setText("e");
                }
                else if (text6.getText().toString().isEmpty()) {
                    text6.setText("e");

                }
                else if (text7.getText().toString().isEmpty()) {
                    text7.setText("e");
                    right++;
                }
                else if (text8.getText().toString().isEmpty()) {
                    text8.setText("e");
                }
                else if (text9.getText().toString().isEmpty()) {
                    text9.setText("e");
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
            EditText text9 = (EditText) findViewById(R.id.text9);
            @Override
            public void onClick(View view) {

                if (text.getText().toString().isEmpty()) {
                    text.setText("r");
                } else if (text2.getText().toString().isEmpty()) {
                    text2.setText("r");

                } else if (text3.getText().toString().isEmpty()) {
                    text3.setText("r");
                } else if (text4.getText().toString().isEmpty()) {
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
                }
                else if (text9.getText().toString().isEmpty()) {
                    text9.setText("r");
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
            EditText text9 = (EditText) findViewById(R.id.text9);
            @Override
            public void onClick(View view) {

                if (text.getText().toString().isEmpty()) {
                    text.setText("h");
                    right++;
                } else if (text2.getText().toString().isEmpty()) {
                    text2.setText("h");
                } else if (text3.getText().toString().isEmpty()) {
                    text3.setText("h");
                } else if (text4.getText().toString().isEmpty()) {
                    text4.setText("h");
                } else if (text5.getText().toString().isEmpty()) {
                    text5.setText("h");
                } else if (text6.getText().toString().isEmpty()) {
                    text6.setText("h");
                }
                else if (text7.getText().toString().isEmpty()) {
                    text7.setText("h");
                }
                else if (text8.getText().toString().isEmpty()) {
                    text8.setText("h");
                }
                else if (text9.getText().toString().isEmpty()) {
                    text9.setText("h");
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
            EditText text9 = (EditText) findViewById(R.id.text9);
            @Override
            public void onClick(View view) {

                if (text.getText().toString().isEmpty()) {
                    text.setText("a");
                } else if (text2.getText().toString().isEmpty()) {
                    text2.setText("a");
                } else if (text3.getText().toString().isEmpty()) {
                    text3.setText("a");
                    right++;
                } else if (text4.getText().toString().isEmpty()) {
                    text4.setText("a");
                } else if (text5.getText().toString().isEmpty()) {
                    text5.setText("a");
                }
                else if (text6.getText().toString().isEmpty()) {
                    text6.setText("a");
                }
                else if (text7.getText().toString().isEmpty()) {
                    text7.setText("a");
                }
                else if (text8.getText().toString().isEmpty()) {
                    text8.setText("a");
                    right++;
                }
                else if (text9.getText().toString().isEmpty()) {
                    text9.setText("a");
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
            EditText text9 = (EditText) findViewById(R.id.text9);
            @Override
            public void onClick(View view) {
                if (text.getText().toString().isEmpty()) {
                    text.setText("w");
                } else if (text2.getText().toString().isEmpty()) {
                    text2.setText("w");

                } else if (text3.getText().toString().isEmpty()) {
                    text3.setText("w");
                } else if (text4.getText().toString().isEmpty()) {
                    text4.setText("w");
                } else if (text5.getText().toString().isEmpty()) {
                    text5.setText("w");
                }
                else if (text6.getText().toString().isEmpty()) {
                    text6.setText("w");
                }
                else if (text7.getText().toString().isEmpty()) {
                    text7.setText("w");
                }
                else if (text8.getText().toString().isEmpty()) {
                    text8.setText("w");

                }
                else if (text9.getText().toString().isEmpty()) {
                    text9.setText("w");
                    lose_Mess(view);
                    Finish(view);
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
            EditText text9 = (EditText) findViewById(R.id.text9);
            @Override
            public void onClick(View view) {

                if (text.getText().toString().isEmpty()) {
                    text.setText("b");
                }
                else if (text2.getText().toString().isEmpty()) {
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
                        right++;
                }
                else if (text7.getText().toString().isEmpty()){
                    text7.setText("b");

                }
                else if (text8.getText().toString().isEmpty()){
                    text8.setText("b");
                }
                else if(text9.getText().toString().isEmpty()) {
                        text9.setText("b");
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
        goToSecond.putExtra("last","5");
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
        goToSecond.putExtra("last","5");
        startActivity(goToSecond);
        finish();
    }
    public void Finish(View view){
        right=0;
    }

}
