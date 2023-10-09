package com.example.planyourtrip;

import java.util.EnumMap;
public class Formulaire {
    private Type_voyage_famille voyage_famille;
    private int nb_pers;
    private boolean mineur;
    private EnumMap<Type_enfant, Boolean> enum_enfant = new EnumMap<>(Type_enfant.class);
    //Enum_enfant.put(Type_enfant.bas_age, true);
    private boolean vaccine;
    private Type_saison saison;
    private int nbjour;
    private Type_continents continent;
    private Type_budget budget;
    private EnumMap<Type_langue, Boolean> enum_langue = new EnumMap<>(Type_langue.class);
    private EnumMap<Type_voyage_activite, Boolean> enum_voyage_activite = new EnumMap<>(Type_voyage_activite.class);
    private EnumMap<Type_activite, Boolean> enum_activite = new EnumMap<>(Type_activite.class);

    ///ajouter Map des activités quand elles auront été créé

    private float sportivite;
    private Type_hebergement hebergement;
    private Type_restriction_alimentaire restriction_alimentaire;

    public void initilisation(){

        for (Type_enfant valeur : Type_enfant.values()) {
            enum_enfant.put(valeur, false);
        }
        for (Type_langue valeur : Type_langue.values()) {
            enum_langue.put(valeur, false);
        }
        for (Type_voyage_activite valeur : Type_voyage_activite.values()) {
            enum_voyage_activite.put(valeur, false);
        }
        for (Type_activite valeur : Type_activite.values()) {
            enum_activite.put(valeur, false);
        }


    }
    public Formulaire(){
        initilisation();
    }


    public void setEnum_enfant(Type_enfant enfantType, Boolean valueBool){
        enum_enfant.put(enfantType, valueBool);
    }
    public Boolean getEnum_enfant(Type_enfant enfantType){
        return enum_enfant.get(enfantType);
    }

    public void setEnum_activite(Type_activite activiteType, Boolean valueBool){
        enum_activite.put(activiteType, valueBool);
    }
    public Boolean getEnum_activite(Type_activite activiteType){
        return enum_activite.get(activiteType);
    }

    public void setEnum_langue(Type_langue enfantType, Boolean valueBool){
        enum_langue.put(enfantType, valueBool);
    }
    public Boolean getEnum_langue(Type_langue enfantType){
        return enum_langue.get(enfantType);
    }

    public void setEnum_voyage_activite(Type_voyage_activite voyage_activite, Boolean valueBool){
        enum_voyage_activite.put(voyage_activite, valueBool);
    }
    public Boolean getEnum_voyage_activite(Type_voyage_activite voyage_activite){
        return enum_voyage_activite.get(voyage_activite);
    }

    public Type_voyage_famille getVoyage_famille() {
        return voyage_famille;
    }
    public void setVoyage_famille(Type_voyage_famille voyage_famille) {
        this.voyage_famille = voyage_famille;
    }
    public int getNb_pers() {
        return nb_pers;
    }

    public void setNb_pers(int nb_pers) {
        this.nb_pers = nb_pers;
    }

    public boolean isMineur() {
        return mineur;
    }

    public void setMineur(boolean mineur) {
        this.mineur = mineur;
    }

    public boolean isVaccine() {
        return vaccine;
    }

    public void setVaccine(boolean vaccine) {
        this.vaccine = vaccine;
    }

    public Type_saison getSaison() {
        return saison;
    }

    public void setSaison(Type_saison saison) {
        this.saison = saison;
    }

    public int getNbjour() {
        return nbjour;
    }

    public void setNbjour(int nbjour) {
        this.nbjour = nbjour;
    }

    public Type_continents getContinent() {
        return continent;
    }

    public void setContinent(Type_continents continent) {
        this.continent = continent;
    }

    public Type_budget getBudget() {
        return budget;
    }

    public void setBudget(Type_budget budget) {
        this.budget = budget;
    }

    public float getSportivite() {
        return sportivite;
    }

    public void setSportivite(float sportivite) {
        this.sportivite = sportivite;
    }

    public Type_hebergement getHebergement() {
        return hebergement;
    }

    public void setHebergement(Type_hebergement hebergement) {
        this.hebergement = hebergement;
    }

    public Type_restriction_alimentaire getRestriction_alimentaire() {
        return restriction_alimentaire;
    }

    public void setRestriction_alimentaire(Type_restriction_alimentaire restriction_alimentaire) {
        this.restriction_alimentaire = restriction_alimentaire;
    }
}
