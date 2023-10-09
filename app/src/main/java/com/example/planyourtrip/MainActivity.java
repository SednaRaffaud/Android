package com.example.planyourtrip;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView appliName;
    private TextView planTripText;
    private TextView startQuiz;
    private Button quiz;
    private ImageButton buttonExit;
    private ImageView logo;
    private ImageView imageVoyage;
    private TextView startTheQuiz;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        appliName = findViewById(R.id.appliName);
        appliName.setTypeface(null, Typeface.BOLD);
        logo = findViewById(R.id.logo);
        imageVoyage = findViewById(R.id.imageVoyage);
        quiz = findViewById(R.id.buttonQuiz);
        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startQuiz();
            }
        });

        startTheQuiz = findViewById(R.id.textView2);

        planTripText = findViewById(R.id.textView1);
        planTripText.setTypeface(null, Typeface.BOLD);

        buttonExit = findViewById(R.id.buttonExit);
        buttonExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    public void startQuiz() {
        Intent intent = new Intent(this, Profil_Voyageur.class);
        startActivity(intent);
    }

}