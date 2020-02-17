package com.example.appfirebase;

public class Equipe {
private int id;
private String nom;
private String couleur;

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

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public Equipe(int id, String nom, String couleur) {
        this.id = id;
        this.nom = nom;
        this.couleur = couleur;
    }
}
