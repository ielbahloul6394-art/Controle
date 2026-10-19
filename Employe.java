package com.exemple.tp;

public abstract class Employe {

    protected String matricule;
    protected String nom;
    protected double tarifJournalier;
    private Employe superieur;

    public Employe(String matricule, String nom,
                   double tarifJournalier) {
        this.matricule = matricule;
        this.nom = nom;
        this.tarifJournalier = tarifJournalier;
    }

    public String getMatricule() {
        return matricule;
    }

    public abstract double calculerCout(int nbJours);

    public void afficherDetails() {
        System.out.println("Matricule : " + matricule);
        System.out.println("Nom : " + nom);
        System.out.println("Tarif journalier : "
                           + tarifJournalier + " DH");
    }

    public void setSuperieur(Employe superieur) {
        if (superieur == this) {
            throw new IllegalArgumentException(
                "Un employe ne peut pas etre son propre superieur."
            );
        }
        this.superieur = superieur;
    }

    public Employe getSuperieur() {
        return superieur;
    }
}
