package com.example.rethinkyourdrink;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

public class SummaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);
        Room room = Room.getDataBase(this);
        Dao dao = room.getMyDao();
        TextView TVTotal = findViewById(R.id.TVTotalAmount);
        TextView TVTotalP = findViewById(R.id.TV_Plain_water);
        TextView TVTotalS = findViewById(R.id.TV_Sweetener);
        TextView TVTotalNS = findViewById(R.id.TV_NonSweetener);

        List<Details>detailsList = dao.getPeople();

    }
}