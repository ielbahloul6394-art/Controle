package com.exemple.tp;

public class Projet {

    private String code;
    private String intitule;

    public Projet(String code, String intitule) {
        this.code = code;
        this.intitule = intitule;
    }

    
    public String toString() {
        return "Code : " + code
             + ", Intitule : " + intitule;
    }
}