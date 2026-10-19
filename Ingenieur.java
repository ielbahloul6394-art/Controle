package com.exemple.tp




;

public class Ingenieur extends Employe {

    private int niveauExpertise;

    public Ingenieur(String matricule, String nom,
                     double tarifJournalier,
                     int niveauExpertise) {
        super(matricule, nom, tarifJournalier);
        this.niveauExpertise = niveauExpertise;
    }

    @Override
    public double calculerCout(int nbJours) {
        if (niveauExpertise < 3) {
            return tarifJournalier * nbJours;
        } else {
            return (tarifJournalier + 100) * nbJours;
        }
    }

    @Override
    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("Niveau expertise : "
                           + niveauExpertise);
    }
}