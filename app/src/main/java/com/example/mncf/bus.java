package com.example.mncf;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.icu.util.Calendar;
import android.os.Build;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class bus extends AppCompatActivity {
 EditText etdate;
 DatePickerDialog.OnDateSetListener setListener;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus);

        Spinner mySpinner1=(Spinner) findViewById(R.id.depart);
        Spinner mySpinner2=(Spinner) findViewById(R.id.arrivée);

        ArrayAdapter<String> myAdapter1 = new ArrayAdapter<String>(bus.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.depart));
        myAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner1.setAdapter(myAdapter1);

        ArrayAdapter<String> myAdapter2 = new ArrayAdapter<String>(bus.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.arrive));
        myAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner2.setAdapter(myAdapter2);


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

                if ((mySpinner1.getSelectedItem().toString().equals("Ahfir")) && (mySpinner2.getSelectedItem().toString().equals("Douar Dar Kaid")))
                { Intent l1 = new Intent(bus.this,line1.class);
                startActivity(l1);}

                if ((mySpinner1.getSelectedItem().toString().equals("Av Bir Anzarane (Sidi Yahya)")) && (mySpinner2.getSelectedItem().toString().equals("Place Zerktouni (Terminus)")))
                { Intent l4 = new Intent(bus.this,line4.class);
                    startActivity(l4);}

                if ((mySpinner1.getSelectedItem().toString().equals("Ahfir")) && (mySpinner2.getSelectedItem().toString().equals("Faculte Polydisciplinaire")))
                { Intent l5 = new Intent(bus.this,line5.class);
                    startActivity(l5);}

                if ((mySpinner1.getSelectedItem().toString().equals("Ahfir")) && (mySpinner2.getSelectedItem().toString().equals("Douar Dar Kaid")))
                { Intent l6 = new Intent(bus.this,line6.class);
                    startActivity(l6);}

                if ((mySpinner1.getSelectedItem().toString().equals("Ahfir")) && (mySpinner2.getSelectedItem().toString().equals("Douar Lchehab")))
                { Intent l10 = new Intent(bus.this,line10.class);
                    startActivity(l10);}

                if ((mySpinner1.getSelectedItem().toString().equals("Ahfir")) && (mySpinner2.getSelectedItem().toString().equals("Mosquee Sidi Bouzid")))
                { Intent l13 = new Intent(bus.this,line13.class);
                    startActivity(l13);}

                if ((mySpinner1.getSelectedItem().toString().equals("El Ghorba")) && (mySpinner2.getSelectedItem().toString().equals("Mosquee Sidi Bouzid")))
                { Intent l14 = new Intent(bus.this,line14.class);
                    startActivity(l14);}

                if ((mySpinner1.getSelectedItem().toString().equals("El Ghorba")) && (mySpinner2.getSelectedItem().toString().equals("Mosquee Sidi Bouzid")))
                { Intent l14 = new Intent(bus.this,line14.class);
                    startActivity(l14);}

                if ((mySpinner1.getSelectedItem().toString().equals("El Wifak (Azemmour)")) && (mySpinner2.getSelectedItem().toString().equals("Sidi Ali Ben Hamdouche")))
                { Intent l15 = new Intent(bus.this,line15.class);
                    startActivity(l15);}

                if ((mySpinner1.getSelectedItem().toString().equals("Ahfir")) && (mySpinner2.getSelectedItem().toString().equals("Mosquee Sidi Bouzid")))
                { Intent l16 = new Intent(bus.this,line16.class);
                    startActivity(l16);}

                if ((mySpinner1.getSelectedItem().toString().equals("Ahfir")) && (mySpinner2.getSelectedItem().toString().equals("Molay Abdellah")))
                { Intent l17 = new Intent(bus.this,line17.class);
                    startActivity(l17);}

                if ((mySpinner1.getSelectedItem().toString().equals("Ahfir")) && (mySpinner2.getSelectedItem().toString().equals("Groupement El Haouziya")))
                { Intent l18 = new Intent(bus.this,line18.class);
                    startActivity(l18);}

                if ((mySpinner1.getSelectedItem().toString().equals("Ahfir")) && (mySpinner2.getSelectedItem().toString().equals("Sebt Douib")))
                { Intent l19 = new Intent(bus.this,line19.class);
                    startActivity(l19);}

                if ((mySpinner1.getSelectedItem().toString().equals("Mohamed V  1")) && (mySpinner2.getSelectedItem().toString().equals("Douar El Ghadbane")))
                { Intent l20 = new Intent(bus.this,line20.class);
                    startActivity(l20);}

            }
        });
    }



}