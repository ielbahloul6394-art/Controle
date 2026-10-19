package com.exemple.tp;

public class Commercial extends Employe {

    private double tauxPrime;

    public Commercial(String matricule, String nom,
                      double tarifJournalier,
                      double tauxPrime) {
        super(matricule, nom, tarifJournalier);
        this.tauxPrime = tauxPrime;
    }

    
    public double calculerCout(int nbJours) {
        double montantBase = tarifJournalier * nbJours;
        return montantBase + montantBase * tauxPrime;
    }

    
    public void afficherDetails() {
