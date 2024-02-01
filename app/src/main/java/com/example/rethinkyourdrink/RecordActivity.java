package com.example.rethinkyourdrink;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class RecordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record);
        Room room = Room.getDataBase(this);
        Dao dao = room.getMyDao();
        Button BtnSubmit = findViewById(R.id.SubmitBtn);
        EditText ETBeverage = findViewById(R.id.ETBeverageName);
        EditText ETamount = findViewById(R.id.ETAmount);
        RadioButton rgDay1= findViewById(R.id.day1);
        RadioButton rgDay2= findViewById(R.id.day2);
        RadioButton rgDay3= findViewById(R.id.day3);
        RadioButton rgP= findViewById(R.id.Plain_water);
        RadioButton rS= findViewById(R.id.Sweetener);
        RadioButton rgnS= findViewById(R.id.non_Sweetener);

        BtnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ETBeverage.getText().toString().isEmpty()||ETamount.getText().toString().isEmpty()){
                    Toast.makeText(RecordActivity.this,"No Empty",Toast.LENGTH_SHORT);
                }
                else{
                    String day = "";
                    String type;
                    String name,amount;

                    name = ETBeverage.getText().toString();
                    amount = ETamount.getText().toString();
                    if (rgDay1.isChecked()){
                        day = "1";
                    }
                    else if (rgDay2.isChecked()){
                        day = "2";
                    }
                    else{
                        day = "3";
                    }

                    if (rgP.isChecked()){
                        type = "Plain Water";
                    }
                    else if (rS.isChecked()){
                        type = "Sweetener";
                    }
                    else{
                        type = "Non-Sweetener";
                    }

                    Details details = new Details(day,type,name,amount);
                    dao.insert(details);
                }

            }
        });
    }
}