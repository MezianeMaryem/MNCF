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

    RadioGroupPlus btnpays;
    TextView btnContinuer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnpays=findViewById(R.id.pays);
        btnContinuer=findViewById(R.id.Continuer);
        btnContinuer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = btnpays.getCheckedRadioButtonId();
                switch (id){
                    case R.id.algerie:
                        Message.message(getApplicationContext(), "Bienvenue à MNCF algérie");
                        break;

                    case R.id.deutschland:
                        Message.message(getApplicationContext(), "Willkommen in  MNCF Deutschland");
                        break;

                    case R.id.espagne:
                        Message.message(getApplicationContext(), "Bienvenido a MNCF España");
                        break;

                    case R.id.italie:
                        Message.message(getApplicationContext(), "Benvenuto in MNCF Italia");
                        break;

                    case R.id.france:
                        Message.message(getApplicationContext(), "Bienvenue à MNCF France");
                        break;

                    case R.id.maroc:
                        Message.message(getApplicationContext(), "Bienvenue à MNCF Maroc");
                        Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
                        startActivity(intent);
                        break;

                    case R.id.nederland:
                        Message.message(getApplicationContext(), "Welkom in MNCF Nederland");
                        break;

                    case R.id.tunisie:
                        Message.message(getApplicationContext(), "Bienvenue à MNCF Tunisie");
                        break;

                    default:
                        Message.message(getApplicationContext(),"veillez saisir un pay svp !!");
                }
            }
        });

    }
}