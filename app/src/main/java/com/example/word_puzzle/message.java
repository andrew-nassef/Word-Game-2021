package com.example.word_puzzle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;
import android.content.Intent;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class message extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        Button button= (Button) findViewById(R.id.button9);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               end(view);
            }
        });
        }
        public void end (View view){
            Intent mIntent = getIntent();
            String previousActivity= mIntent.getStringExtra("last");
            if (previousActivity.equals("1")) {
                Intent goToSecond = new Intent();
                goToSecond.setClass(this, level2.class);
                startActivity(goToSecond);
                finish();
            }
            else if (previousActivity.equals("2")) {
                Intent goToSecond = new Intent();
                goToSecond.setClass(this, level3.class);
                startActivity(goToSecond);
                finish();
            }
            else if (previousActivity.equals("3")) {
                Intent goToSecond = new Intent();
                goToSecond.setClass(this, level4.class);
                startActivity(goToSecond);
                finish();
            }
            else if (previousActivity.equals("4")) {
                Intent goToSecond = new Intent();
                goToSecond.setClass(this, level5.class);
                startActivity(goToSecond);
                finish();
            }
            else if (previousActivity.equals("5")) {
                Intent goToSecond = new Intent();
                goToSecond.setClass(this, level6.class);
                startActivity(goToSecond);
                finish();
            }
            else if (previousActivity.equals("6")) {
                Intent goToSecond = new Intent();
                goToSecond.setClass(this, levels.class);
                startActivity(goToSecond);
                finish();
            }
            else if (previousActivity.equals("7")) {
                Intent goToSecond = new Intent();
                goToSecond.setClass(this, levell2.class);
                startActivity(goToSecond);
                finish();
            }
            else if (previousActivity.equals("8")) {
                Intent goToSecond = new Intent();
                goToSecond.setClass(this, levell3.class);
                startActivity(goToSecond);
                finish();
            }
            else if (previousActivity.equals("9")) {
                Intent goToSecond = new Intent();
                goToSecond.setClass(this, levell4.class);
                startActivity(goToSecond);
                finish();
            }
            else if (previousActivity.equals("10")) {
                Intent goToSecond = new Intent();
                goToSecond.setClass(this, levell5.class);
                startActivity(goToSecond);
                finish();
            }
            else if (previousActivity.equals("11")) {
                Intent goToSecond = new Intent();
                goToSecond.setClass(this, levell6.class);
                startActivity(goToSecond);
                finish();
            }
            else if (previousActivity.equals("12")) {
                Intent goToSecond = new Intent();
                goToSecond.setClass(this, MainMenu.class);
                startActivity(goToSecond);
                finish();
            }

        }

    }
