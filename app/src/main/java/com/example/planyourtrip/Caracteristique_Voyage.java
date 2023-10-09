package com.example.planyourtrip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView;

import com.google.android.material.textfield.TextInputEditText;

public class Caracteristique_Voyage extends AppCompatActivity {

    private Spinner listeContinent;
    private RadioButton hiver;
    private RadioButton printemps;
    private RadioButton ete;
    private RadioButton automne;
    private TextInputEditText nbJours;
    private RadioButton eco;
    private RadioButton modere;
    private RadioButton luxe;
    private ImageButton previous;
    private ImageButton next;
    private CheckBox francais;
    private CheckBox anglais;
    private CheckBox russe;
    private CheckBox arabe;
    private CheckBox chinois;
    private CheckBox portugais;
    private CheckBox italien;
    private CheckBox allemand;
    private CheckBox espagnol;

    private Formulaire formulaire = new Formulaire();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caracteristique_voyage);

        //Q3
        // Définir les options
        String[] options = {"Amérique du Nord", "Amérique du Sud", "Europe", "Asie", "Afrique", "Océanie"};

        // Créer un ArrayAdapter en utilisant le tableau d'options
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, options);

        // Spécifier la mise en page à utiliser lorsque la liste des choix apparaît
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Trouver le Spinner dans le layout XML
        listeContinent = findViewById(R.id.listeContinent);

        // Lier l'ArrayAdapter au Spinner
        listeContinent.setAdapter(adapter);

        // Gérer les événements de sélection du Spinner
        listeContinent.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                // Gérer l'élément sélectionné
                String selectedOption = options[position];
                Toast.makeText(Caracteristique_Voyage.this, "Option sélectionnée : " + selectedOption, Toast.LENGTH_SHORT).show();

                if(selectedOption=="Afrique") {
                    formulaire.setContinent(Type_continents.Afrique);
                } else if (selectedOption=="Océanie") {
                    formulaire.setContinent(Type_continents.Oceanie);
                } else if (selectedOption=="Europe") {
                    formulaire.setContinent(Type_continents.Europe);}
                else if (selectedOption=="Amérique du Nord") {
                        formulaire.setContinent(Type_continents.AmeriqueNord);
                } else if (selectedOption=="Amérique du Sud") {
                    formulaire.setContinent(Type_continents.AmeriqueSud);
                }else if (selectedOption=="Asie") {
                    formulaire.setContinent(Type_continents.Asie);
                }
                else {
                    toast("Please answer every question marked with a *");}


            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // Gérer l'absence de sélection
            }
        });

        //Q1
        hiver = findViewById(R.id.hiver);
        ete = findViewById(R.id.ete);
        automne = findViewById(R.id.automne);
        printemps = findViewById(R.id.printemps);
        //Q2
        nbJours = findViewById(R.id.nbDays);
        nbJours.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nbJours.setFocusableInTouchMode(true); // Activer le focus en mode tactile
                nbJours.setFocusable(true); // Activer la possibilité d'édition
                nbJours.requestFocus(); // Demander le focus
            }
        });
        //Q4
        eco = findViewById(R.id.eco);
        modere = findViewById(R.id.modere);
        luxe = findViewById(R.id.luxe);
        //Q5
        francais = findViewById(R.id.français) ;
        anglais = findViewById(R.id.anglais) ;
        italien = findViewById(R.id.italien) ;
        russe = findViewById(R.id.russe) ;
        chinois = findViewById(R.id.chinois) ;
        arabe = findViewById(R.id.arabe) ;
        allemand = findViewById(R.id.allemand) ;
        portugais = findViewById(R.id.portugais) ;
        espagnol = findViewById(R.id.espagnol) ;

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

        if(hiver.isChecked()) {
            formulaire.setSaison(Type_saison.hiver);
        } else if (ete.isChecked()) {
            formulaire.setSaison(Type_saison.ete);
        } else if (printemps.isChecked()) {
            formulaire.setSaison(Type_saison.printemps);}
        else if (automne.isChecked()) {
            formulaire.setSaison(Type_saison.automne);}
        else {
            toast("Please answer every question marked with a *");}

        String nb = nbJours.getText().toString(); //récupérer valeur
        //convertir string en entier
        try {
            int nbValue = Integer.parseInt(nb);
            // Utilisez "nbValue" comme un entier
            formulaire.setNbjour(nbValue);
        } catch (NumberFormatException e) {
            // Gérez l'erreur si la chaîne ne peut pas être convertie en entier
            Toast.makeText(this, "La valeur n'est pas un entier valide.", Toast.LENGTH_SHORT).show();
        }


        if(eco.isChecked()) {
            formulaire.setBudget(Type_budget.economique);
        } else if (luxe.isChecked()) {
            formulaire.setBudget(Type_budget.luxe);
        } else if (modere.isChecked()) {
            formulaire.setBudget(Type_budget.modere);}
        else {
            toast("Please answer every question marked with a *");}


        if(francais.isChecked()) {
            formulaire.setEnum_langue(Type_langue.Francais, true);}
        if(anglais.isChecked()) {
            formulaire.setEnum_langue(Type_langue.Anglais, true);}
        if(russe.isChecked()) {
            formulaire.setEnum_langue(Type_langue.Russe, true);}
        if(arabe.isChecked()) {
            formulaire.setEnum_langue(Type_langue.Arabe, true);}
        if(chinois.isChecked()) {
            formulaire.setEnum_langue(Type_langue.Chinois, true);}
        if(italien.isChecked()) {
            formulaire.setEnum_langue(Type_langue.Italien, true);}
        if(portugais.isChecked()) {
            formulaire.setEnum_langue(Type_langue.Portugais, true);}
        if(allemand.isChecked()) {
            formulaire.setEnum_langue(Type_langue.Allemand, true);}
        if(espagnol.isChecked()) {
            formulaire.setEnum_langue(Type_langue.Espagnol, true);}

        if (espagnol.isChecked()==false && allemand.isChecked()==false && italien.isChecked()==false && portugais.isChecked()==false
                && chinois.isChecked()==false && arabe.isChecked()==false && russe.isChecked()==false
                && anglais.isChecked()==false && francais.isChecked()==false) {
            toast("Please answer every question marked with a *");
        }

    }

    public void next() {
        Intent intent = new Intent(this, Preferences.class);
        startActivity(intent);
    }

    public void previous() {
        Intent intent = new Intent(this, Profil_Voyageur.class);
        startActivity(intent);
    }

    public void toast(String msg) {
        Toast.makeText(this, "Message: " + msg, Toast.LENGTH_SHORT).show();
    }
}
