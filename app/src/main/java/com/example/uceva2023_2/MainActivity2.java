package com.example.uceva2023_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity  implements  View.OnClickListener{

    Button bnt2,bnt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bnt2 = findViewById(R.id.btnLogIn2);
        bnt3 = findViewById(R.id.btnLogIn3);
        Toast.makeText(this, "onCreate", Toast.LENGTH_LONG).show();
        bnt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "hola 1", Toast.LENGTH_LONG).show();
            }
        });
        bnt3.setOnClickListener(this);
    }


    public void saludar(View d){
        //Toast.makeText(this, "Hola 2", Toast.LENGTH_LONG).show();
        Intent ir = new Intent(this, MainActivity3.class);
        ir.addFlags(ir.FLAG_ACTIVITY_CLEAR_TOP | ir.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(ir);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "Hola 3", Toast.LENGTH_SHORT).show();

    }
}