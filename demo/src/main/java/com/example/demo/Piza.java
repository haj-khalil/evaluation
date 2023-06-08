package com.example.demo;

public class Piza {
    private int id ;
    private String nom ;
    private float prix ;
    private int nb_ing ;

    public Piza(String nom, float prix, int nb_ing) {
        this.nom = nom;
        this.prix = prix;
        this.nb_ing = nb_ing;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public int getNb_ing() {
        return nb_ing;
    }

    public void setNb_ing(int nb_ing) {
        this.nb_ing = nb_ing;
    }
}

