package com.example.agenda;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetallContacte extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contacte_detail);

        String nom = getIntent().getStringExtra("nom");
        int telefon = getIntent().getIntExtra("telefon", 0);

        ((TextView) findViewById(R.id.nom)).setText("Nom: " + nom);
        ((TextView) findViewById(R.id.telefon)).setText("Telefon: " + String.valueOf(telefon));
        TextView volver = findViewById(R.id.volver);

        volver.setOnClickListener((v) -> {
            finish();
        });
    }
}