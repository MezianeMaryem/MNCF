package com.example.mncf;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.icu.util.Calendar;
import android.os.Build;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

public class bus extends AppCompatActivity {
 EditText etdate;
 DatePickerDialog.OnDateSetListener setListener;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus);

        etdate=findViewById(R.id.date);

        Calendar calendar=Calendar.getInstance();
        final int year= calendar.get(Calendar.YEAR);
        final int month= calendar.get(Calendar.MONTH);
        final int day= calendar.get(Calendar.DAY_OF_MONTH);
    etdate.setOnClickListener(new View.OnClickListener(){

        @Override
        public void onClick(View v) {
            DatePickerDialog datePickerDialog= new DatePickerDialog(
                    bus.this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int month, int day) {
                month= month+1;
                String date=day+"/"+month+"/"+year;
                etdate.setText(date);
                }
            },year,month,day);
            datePickerDialog.show();
        }
    });


        TextView rechercherbus = findViewById(R.id.btnRechercher);
        rechercherbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }



}