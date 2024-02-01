package com.example.rethinkyourdrink;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Insert;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button RecordBtn = findViewById(R.id.RecordBtn);
        Button SummaryBtn = findViewById(R.id.SummaryBtn);

        RecordBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),RecordActivity.class);
                startActivity(intent);
            }
        });

        SummaryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),SummaryActivity.class);
                startActivity(intent);
            }
        });
    }
}