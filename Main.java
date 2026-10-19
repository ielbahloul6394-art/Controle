package com.exemple.tp;

public class Main {

    public static void main(String[] args) {

      
        Ingenieur i1 = new Ingenieur("I01", "Amine",
                                     500, 4);
        Ingenieur i2 = new Ingenieur("I02", "Youssef",
                                     350, 2);

        Commercial c1 = new Commercial("C01", "Sara",
                                       300, 0.10);
        Commercial c2 = new Commercial("C02", "Salma",
                                       400, 0.15);

       
        Employe[] employes = {i1, i2, c1, c2};

        
        Projet p1 = new Projet("P01", "Developpement");
        Projet p2 = new Projet("P02", "Maintenance");

      
        i2.setSuperieur(i1);
        c1.setSuperieur(i1);
        c2.setSuperieur(c1);

        
        System.out.println("===== LISTE DES EMPLOYES =====");

        for (int i = 0; i < employes.length; i++) {
            employes[i].afficherDetails();

            if (employes[i].getSuperieur() != null) {
                System.out.println("Superieur : "
                    + employes[i].getSuperieur().nom);
            } else {
                System.out.println("Superieur : Aucun");
            }

            System.out.println("--------------------");
        }

       
        Mission[] missions = {
            new Mission(i1, p1, 3),
            new Mission(i2, p2, 2),
            new Mission(c1, p1, 4),
            new Mission(c2, p2, 2)
        };

     
        double total = 0;

        System.out.println("\n===== LISTE DES MISSIONS =====");

        for (int i = 0; i < missions.length; i++) {
            missions[i].afficherRecapitulatif();
            total += missions[i].calculerMontant();
        }

        System.out.println("\nMontant total : "
    + total + " DH");

     
        int compteur = 0;

      

 
}  