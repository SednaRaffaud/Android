package com.example.planyourtrip;

public class Voyage {
    private String nom_ville;
    private String pays;
    private String langue;
    private String continent;
    private boolean covid_vaccin;
    private int score_seul;
    private int score_amis;
    private int score_famille;
    private int score_couple;
    private int score_hiver;
    private int score_primtemps;
    private int score_ete;
    private int score_automne;
    private int score_jour_1_3;
    private int score_jour_4_7;
    private int score_jour_8etplus;
    private int score_budget_eco;
    private int score_budget_modere;
    private int score_luxe;
    private int score_plage;
    private int score_rando;
    private int score_musée;



    public Voyage(int scoreMusée, int scoreRando, int scorePlage, String nomVille, String pays, String langue ,String continent, boolean covidVaccin, int scoreSeul, int scoreAmis, int scoreFamille, int scoreCouple, int scoreHiver, int scorePrimtemps, int scoreEte, int scoreAutomne, int scoreJour13, int scoreJour47, int scoreJour8etplus, int scoreBudgetEco, int scoreBudgetModere, int scoreLuxe) {
        this.continent=continent;
        nom_ville = nomVille;
        this.pays = pays;
        this.langue = langue;
        covid_vaccin = covidVaccin;
        score_seul = scoreSeul;
        score_amis = scoreAmis;
        score_famille = scoreFamille;
        score_couple = scoreCouple;
        score_hiver = scoreHiver;
        score_primtemps = scorePrimtemps;
        score_ete = scoreEte;
        score_automne = scoreAutomne;
        score_jour_1_3 = scoreJour13;
        score_jour_4_7 = scoreJour47;
        score_jour_8etplus = scoreJour8etplus;
        score_budget_eco = scoreBudgetEco;
        score_budget_modere = scoreBudgetModere;
        score_luxe = scoreLuxe;
        score_rando = scoreRando;
        score_musée = scoreMusée;
        score_plage = scorePlage;

    }

    public int getScore_rando() {
        return score_rando;
    }
    public void setScore_rando(int score_rando) {
        this.score_rando = score_rando;
    }

    public int getScore_plage() {
        return score_plage;
    }
    public void setScore_plage (int score_plage) {
        this.score_plage = score_plage;
    }

    public int getScore_musée() {
        return score_musée;
    }
    public void setScore_musée(int score_musée) {
        this.score_musée = score_musée;
    }
    public String getNom_ville() {
        return nom_ville;
    }
    public void setNom_ville(String nom_ville) {
        this.nom_ville = nom_ville;
    }
    public String getPays() {
        return pays;
    }
    public void setPays(String pays) {
        this.pays = pays;
    }
    public String getLangue() {
        return langue;
    }
    public void setLangue(String langue) {
        this.langue = langue;
    }
    public boolean isCovid_vaccin() {
        return covid_vaccin;
    }
    public void setCovid_vaccin(boolean covid_vaccin) {
        this.covid_vaccin = covid_vaccin;
    }
    public int getScore_seul() {
        return score_seul;
    }
    public void setScore_seul(int score_seul) {
        this.score_seul = score_seul;
    }
    public int getScore_amis() {
        return score_amis;
    }
    public void setScore_amis(int score_amis) {
        this.score_amis = score_amis;
    }
    public int getScore_famille() {
        return score_famille;
    }
    public void setScore_famille(int score_famille) {
        this.score_famille = score_famille;
    }
    public int getScore_couple() {
        return score_couple;
    }
    public void setScore_couple(int score_couple) {
        this.score_couple = score_couple;
    }
    public int getScore_hiver() {
        return score_hiver;
    }
    public void setScore_hiver(int score_hiver) {
        this.score_hiver = score_hiver;
    }
    public int getScore_primtemps() {
        return score_primtemps;
    }
    public void setScore_primtemps(int score_primtemps) {
        this.score_primtemps = score_primtemps;
    }
    public int getScore_ete() {
        return score_ete;
    }
    public void setScore_ete(int score_ete) {
        this.score_ete = score_ete;
    }
    public int getScore_automne() {
        return score_automne;
    }
    public void setScore_automne(int score_automne) {
        this.score_automne = score_automne;
    }
    public int getScore_jour_1_3() {
        return score_jour_1_3;
    }
    public void setScore_jour_1_3(int score_jour_1_3) {
        this.score_jour_1_3 = score_jour_1_3;
    }
    public int getScore_jour_4_7() {
        return score_jour_4_7;
    }
    public void setScore_jour_4_7(int score_jour_4_7) {
        this.score_jour_4_7 = score_jour_4_7;
    }
    public int getScore_jour_8etplus() {
        return score_jour_8etplus;
    }
    public void setScore_jour_8etplus(int score_jour_8etplus) {
        this.score_jour_8etplus = score_jour_8etplus;
    }
    public int getScore_budget_eco() {
        return score_budget_eco;
    }
    public void setScore_budget_eco(int score_budget_eco) {
        this.score_budget_eco = score_budget_eco;
    }
    public int getScore_budget_modere() {
        return score_budget_modere;
    }
    public void setScore_budget_modere(int score_budget_modere) {
        this.score_budget_modere = score_budget_modere;
    }
    public int getScore_luxe() {
        return score_luxe;
    }
    public void setScore_luxe(int score_luxe) {
        this.score_luxe = score_luxe;
    }
    public String getContinent() {
        return continent;
    }
    public void setContinent(String continent) {
        this.continent = continent;
    }
}

