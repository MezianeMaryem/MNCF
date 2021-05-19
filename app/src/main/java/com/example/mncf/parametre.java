package com.example.mncf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class parametre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parametre);
    }

    public void profilbtn(View view) {
        Intent intent1= new Intent(parametre.this,pageprincipale.class);
        startActivity(intent1);
    }

    public void languebtn(View view) {
    }

    public void domicilebtn(View view) {
    }

    public void logoutbtn(View view) {
        Intent intent4= new Intent(parametre.this,login.class);
        startActivity(intent4);
    }
}