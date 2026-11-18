package com.example.agenda;

public class Contacte{
    private String nom;
    private int telefon;

    public Contacte(String nom, int telefon){
        this.nom = nom;
        this.telefon = telefon;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }
}
