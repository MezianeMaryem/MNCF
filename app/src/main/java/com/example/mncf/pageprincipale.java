package com.example.mncf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class pageprincipale extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pageprincipale);

    }

    public void profilebtn(View view) {
        Intent intent1= new Intent(pageprincipale.this,bus.class);
        startActivity(intent1);

    }

    public void routbtn(View view) {
        Intent intent2= new Intent(pageprincipale.this,meteo.class);
        startActivity(intent2);
    }

    public void historybtn(View view) {
    }

    public void supportbtn(View view) {
    }

    public void feedbackbtn(View view) {
    }

    public void settingbtn(View view) {
        Intent intent5 = new Intent(pageprincipale.this,Maps.class);
        startActivity(intent5);
    }
}