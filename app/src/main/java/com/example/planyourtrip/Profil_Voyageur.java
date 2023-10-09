package com.example.planyourtrip;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.textfield.TextInputEditText;

public class Profil_Voyageur extends AppCompatActivity {

    private ImageButton buttonExit;
    private RadioButton seul;
    private RadioButton famille;
    private RadioButton amis;
    private RadioButton couple;
    private TextInputEditText nbVoyageurs;
    private RadioButton yesMineur;
    private RadioButton noMineur;
    private SwitchCompat switchCovid;
    private CheckBox basAge;
    private CheckBox enfant;
    private CheckBox ado;
    private ImageButton previous;
    private ImageButton next;
    private Formulaire formulaire = new Formulaire();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_voyageur);

        buttonExit = findViewById(R.id.buttonExit2);
        buttonExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        //Q1
        seul = findViewById(R.id.seul);
        famille = findViewById(R.id.famille);
        amis = findViewById(R.id.amis);
        couple = findViewById(R.id.couple);
        //Q2
        nbVoyageurs = findViewById(R.id.nbVoyageurs);
        nbVoyageurs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nbVoyageurs.setFocusableInTouchMode(true); // Activer le focus en mode tactile
                nbVoyageurs.setFocusable(true); // Activer la possibilité d'édition
                nbVoyageurs.requestFocus(); // Demander le focus
            }
        });
        //Q3
        yesMineur = findViewById(R.id.yes_mineur);
        noMineur = findViewById(R.id.no_mineur);
        //Q5
        switchCovid = findViewById(R.id.switchCovid);
        //Q4
        basAge = findViewById(R.id.Bas_âge);
        enfant = findViewById(R.id.enfant);
        ado = findViewById(R.id.Adolescent);

        next = findViewById(R.id.nextButton2);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //vérifier que toutes questions sont remplies
                next();
            }
        });

        previous = findViewById(R.id.previousButton2);
        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //sauvegarder les réponses aux questions en local
                previous();
            }
        });

        if (seul.isChecked()) {
            formulaire.setVoyage_famille(Type_voyage_famille.Seul);
        } else if (famille.isChecked()) {
            formulaire.setVoyage_famille(Type_voyage_famille.Famille);
        }  else if (couple.isChecked()) {
        formulaire.setVoyage_famille(Type_voyage_famille.Couple);
        } else if (amis.isChecked()) {
        formulaire.setVoyage_famille(Type_voyage_famille.Amis);}
        else {
        toast("Please answer every question marked with a *");}

        String nb = nbVoyageurs.getText().toString(); //récupérer valeur
        //convertir string en entier
        try {
            int nbValue = Integer.parseInt(nb);
            // Utilisez "nbValue" comme un entier
            formulaire.setNb_pers(nbValue);
        } catch (NumberFormatException e) {
            // Gérez l'erreur si la chaîne ne peut pas être convertie en entier
            Toast.makeText(this, "La valeur n'est pas un entier valide.", Toast.LENGTH_SHORT).show();
        }


        if (yesMineur.isChecked()) {
            formulaire.setMineur(true);
        } else if (noMineur.isChecked()) {
            formulaire.setMineur(false);}
        else {
            toast("Please answer every question marked with a *");}

        if (basAge.isChecked()) {
            formulaire.setEnum_enfant(Type_enfant.bas_age, true);
        } else if (enfant.isChecked()) {
            formulaire.setEnum_enfant(Type_enfant.enfant, true);}
        else if (ado.isChecked()) {
            formulaire.setEnum_enfant(Type_enfant.adolescent, true);}
        else {
            toast("Please answer every question marked with a *");}

        if (switchCovid.isChecked()) {
            formulaire.setVaccine(true);
        }
    }

    public void next() {
        Intent intent = new Intent(this, Caracteristique_Voyage.class);
        startActivity(intent);
    }

    public void previous() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void toast(String msg) {
        Toast.makeText(this, "Message: " + msg, Toast.LENGTH_SHORT).show();
    }
}

