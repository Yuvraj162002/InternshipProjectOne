package com.ecommerce.android.internshipprojectone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class SubjectActivity extends AppCompatActivity {
AppCompatButton button;
    AppCompatButton button1;
    AppCompatButton button2;
    AppCompatButton button3;
    AppCompatButton button4;
    Button button5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_subject);

        button = (AppCompatButton) findViewById(R.id.science);
        button1 = (AppCompatButton) findViewById(R.id.appCompatButton);
        button2 = (AppCompatButton) findViewById(R.id.appCompatButton2);
        button3 = (AppCompatButton) findViewById(R.id.gk);
        button4 = (AppCompatButton) findViewById(R.id.sst);
        button5 = (Button) findViewById(R.id.butn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SubjectActivity.this , WebActivity.class);
                startActivity(intent);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SubjectActivity.this , WebActivity.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SubjectActivity.this , WebActivity.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SubjectActivity.this , WebActivity.class);
                startActivity(intent);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SubjectActivity.this , WebActivity.class);
                startActivity(intent);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SubjectActivity.this , MainActivity.class);
                startActivity(intent);
            }
        });

    }
}