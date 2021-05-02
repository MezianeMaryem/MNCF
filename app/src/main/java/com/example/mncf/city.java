package com.example.mncf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class city extends AppCompatActivity {
Button eljadida;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);

        eljadida=findViewById(R.id.btnelJadida);
        eljadida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(city.this,pageprincipale.class);
                startActivity(intent1);
            }
        });
    }
}