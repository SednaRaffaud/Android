package com.example.planyourtrip;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class Resultat extends AppCompatActivity {

    private TextView resultats;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultat);

        resultats = findViewById(R.id.resultats);
        resultats.setTypeface(null, Typeface.BOLD);
    }
}