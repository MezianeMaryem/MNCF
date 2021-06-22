package com.example.mncf;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.HashMap;

public class taxi extends AppCompatActivity {
EditText rname,rnumber,rarrive,rdate,rdepart,rheur;
TextView commande;
DatabaseReference firebaseDatabase;
DatabaseReference databaseReference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taxi);
        rname=findViewById(R.id.name);
        rnumber=findViewById(R.id.num);
        rarrive=findViewById(R.id.arrivée);
        rdepart=findViewById(R.id.depart);
        rheur=findViewById(R.id.heure);
        rdate=findViewById(R.id.date);
        commande=findViewById(R.id.btnCommande);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("user");


        commande.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=rname.getText().toString();
                String num=rnumber.getText().toString();
                String dep=rdepart.getText().toString();
                String arrive=rarrive.getText().toString();
                String date=rdate.getText().toString();
                String heure=rheur.getText().toString();

                HashMap<String,String> userMap=new HashMap<>();
                userMap.put("name",name);
                userMap.put("num",num);
                userMap.put("depart",dep);
                userMap.put("arrivé",arrive);
                userMap.put("dated",date);
                userMap.put("heure",heure);

                myRef.setValue(userMap);
            }
        });


    }
}