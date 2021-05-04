package com.example.mncf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

import worker8.com.github.radiogroupplus.RadioGroupPlus;

public class MainActivity2 extends AppCompatActivity {

    Button maroc,algerie,deutschland,italie,nederland,espagne,france,tunisie;;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        maroc=findViewById(R.id.btnmaroc);
        maroc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Message.message(getApplicationContext(), "Bienvenue à MNCF Maroc");
                Intent intent1=new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(intent1);
            }
        });

        algerie=findViewById(R.id.btnalgerie);
        algerie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Message.message(getApplicationContext(), "Bienvenue à MNCF algérie");
                Intent intent2=new Intent(MainActivity2.this,notfound.class);
                startActivity(intent2);
            }
        });

        deutschland=findViewById(R.id.btndeutschland);
        deutschland.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Message.message(getApplicationContext(), "Willkommen in  MNCF Deutschland");
                Intent intent3=new Intent(MainActivity2.this,notfound.class);
                startActivity(intent3);
            }
        });

        espagne=findViewById(R.id.btnespagne);
        espagne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Message.message(getApplicationContext(), "Bienvenido a MNCF España");
                Intent intent4=new Intent(MainActivity2.this,notfound.class);
                startActivity(intent4);
            }
        });

        italie=findViewById(R.id.btnitalie);
        italie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Message.message(getApplicationContext(), "Benvenuto in MNCF Italia");
                Intent intent5=new Intent(MainActivity2.this,notfound.class);
                startActivity(intent5);
            }
        });

        france=findViewById(R.id.btnfrance);
        france.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Message.message(getApplicationContext(), "Bienvenue à MNCF France");
                Intent intent6=new Intent(MainActivity2.this,notfound.class);
                startActivity(intent6);
            }
        });

        nederland=findViewById(R.id.btnnederland);
        nederland.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Message.message(getApplicationContext(), "Welkom in MNCF Nederland");
                Intent intent7=new Intent(MainActivity2.this,notfound.class);
                startActivity(intent7);
            }
        });

        tunisie=findViewById(R.id.btntunisie);
        tunisie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Message.message(getApplicationContext(), "Bienvenue à MNCF Tunisie");
                Intent intent8=new Intent(MainActivity2.this,notfound.class);
                startActivity(intent8);
            }
        });


    }
}