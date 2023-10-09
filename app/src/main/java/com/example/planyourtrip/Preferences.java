package com.example.planyourtrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.chip.Chip;

public class Preferences extends AppCompatActivity {

    private SeekBar seekbarSport;
    private TextView valeurSport;
    private Chip chipDetente;
    private Chip chipAventure;
    private Chip chipCulinaire;
    private Chip chipCulturel;
    private Chip chipPlage;
    private Chip chipMusee;
    private Chip chipRando;
    private RadioButton pasPref;
    private RadioButton hotel;
    private RadioButton camping;
    private RadioButton auberge;
    private RadioButton vegan;
    private RadioButton vege;
    private RadioButton pasRestriction;
    private ImageButton previous;
    private ImageButton next;
    private Formulaire formulaire = new Formulaire();






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferences);

        seekbarSport = findViewById(R.id.seekBarSport);
        valeurSport = findViewById(R.id.valeurSport);
        seekbarSport.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                // Mettez à jour le TextView avec la valeur actuelle de la SeekBar
                valeurSport.setText(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // Lorsque l'utilisateur commence à déplacer la SeekBar
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // Lorsque l'utilisateur arrête de déplacer la SeekBar

            }
        });



        chipDetente = findViewById(R.id.chipDetente);
        chipCulinaire = findViewById(R.id.chipCulinaire);
        chipCulturel= findViewById(R.id.chipCulturel);
        chipAventure = findViewById(R.id.chipAventure);
        chipRando = findViewById(R.id.chipRando);
        chipPlage = findViewById(R.id.chipPlage);
        chipMusee = findViewById(R.id.chipMusee);
        pasPref = findViewById(R.id.pasPref);
        auberge = findViewById(R.id.auberge);
        hotel = findViewById(R.id.hotel);
        camping = findViewById(R.id.camping);
        vege = findViewById(R.id.vege);
        vegan = findViewById(R.id.vegan);
        pasRestriction = findViewById(R.id.aucuneRestriction);

        next = findViewById(R.id.nextButton2);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                next();
            }
        });

        previous = findViewById(R.id.previousButton2);
        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                previous();
            }
        });

        if (chipAventure.isChecked()) {
            formulaire.setEnum_voyage_activite(Type_voyage_activite.Aventure, true);
        }
        if (chipCulturel.isChecked()) {
            formulaire.setEnum_voyage_activite(Type_voyage_activite.Culturel, true);}
        if (chipCulinaire.isChecked()) {
                formulaire.setEnum_voyage_activite(Type_voyage_activite.Culinaire, true);}
        if (chipDetente.isChecked()) {
            formulaire.setEnum_voyage_activite(Type_voyage_activite.Detente, true);}
        if (chipAventure.isChecked()==false && chipCulinaire.isChecked()==false && chipCulturel.isChecked()==false &&chipDetente.isChecked()==false) {
            toast("Please answer every question marked with a *");
        }

        if (chipPlage.isChecked()) {
            formulaire.setEnum_activite(Type_activite.Plage, true);}

        if (chipMusee.isChecked()) {
            formulaire.setEnum_activite(Type_activite.Musée, true);}
        if (chipRando.isChecked()) {
            formulaire.setEnum_activite(Type_activite.Randonnée, true);}
        if (chipPlage.isChecked()==false && chipRando.isChecked()==false && chipMusee.isChecked()==false) {
            toast("Please answer every question marked with a *");
        }

        if (hotel.isChecked()) {
            formulaire.setHebergement(Type_hebergement.hotel);
        }
        else if (auberge.isChecked()) {
            formulaire.setHebergement(Type_hebergement.auberge);}
        else if (pasPref.isChecked()) {
            formulaire.setHebergement(Type_hebergement.sans_pref);}
        else if (camping.isChecked()) {
            formulaire.setHebergement(Type_hebergement.camping);}
        else {
            toast("Please answer every question marked with a *");
        }

        if (vegan.isChecked()) {
            formulaire.setRestriction_alimentaire(Type_restriction_alimentaire.vegan);
        }
        else if (vege.isChecked()) {
            formulaire.setRestriction_alimentaire(Type_restriction_alimentaire.vegetarien);}
        else if (pasRestriction.isChecked()) {
            formulaire.setRestriction_alimentaire(Type_restriction_alimentaire.sans_restriction);}
        else {
            toast("Please answer every question marked with a *");
        }

    }

    public void previous() {
        Intent intent = new Intent(this, Caracteristique_Voyage.class);
        startActivity(intent);
    }

    public void next() {
        Intent intent = new Intent(this, Resultat.class);
        startActivity(intent);
    }

    public void toast(String msg) {
        Toast.makeText(this, "Message: " + msg, Toast.LENGTH_SHORT).show();
    }
}