package com.example.uceva2023_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    Button bnt2,bnt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bnt2 = findViewById(R.id.btnLogIn2);
        bnt3 = findViewById(R.id.btnLogIn3);
        Toast.makeText(this, "onCreate", Toast.LENGTH_LONG).show();
    }
}