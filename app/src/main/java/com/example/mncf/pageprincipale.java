package com.example.mncf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pageprincipale extends AppCompatActivity {
Button btnmetéo, btnBus, btncarte , btntaxi,btnhotel,btnparametre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pageprincipale);
         btnmetéo=findViewById(R.id.btnrout);
         btnmetéo.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent1 = new Intent(pageprincipale.this,weather.class);
                 startActivity(intent1);
             }
         });

         btnBus=findViewById(R.id.btnprofile);
         btnBus.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent2 = new Intent(pageprincipale.this,bus.class);
                 startActivity(intent2);
             }
         });

         btncarte=findViewById(R.id.btnhistory);
         btncarte.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

             }
         });

         btntaxi=findViewById(R.id.btnfeedbak);
         btntaxi.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

             }
         });

         btnhotel=findViewById(R.id.btnsetting);
         btnhotel.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

             }
         });

         btnparametre=findViewById(R.id.btnsupport);
         btnparametre.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

             }
         });


    }
}