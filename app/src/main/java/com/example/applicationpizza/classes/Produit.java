package com.example.applicationpizza.classes;

public class Produit {
    private int id;
    private String nom;
    private int nbrIngredients;
    private int photo;
    private double duree;
    private String detailsIngredients;
    private String description;
    private String preparation;
    private static int comp = 0;

    // Constructeur avec paramètre et ID auto-incrémenté
    public Produit(String nom, int nbrIngredients, int photo, double duree, String detailsIngredients, String description, String preparation) {
        this.id = comp++;
        this.nom = nom;
        this.nbrIngredients = nbrIngredients;
        this.photo = photo;
        this.duree = duree;
        this.detailsIngredients = detailsIngredients;
        this.description = description;
        this.preparation = preparation;
    }

    // Constructeur sans paramètre
    public Produit() {
        this.id = comp++;
    }



    // Getters et Setters pour chaque attribut

    public int getid() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbrIngredients() {
        return nbrIngredients;
    }

    public void setNbrIngredients(int nbrIngredients) {
        this.nbrIngredients = nbrIngredients;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public double getDuree() {
        return duree;
    }

    public void setDuree(double duree) {
        this.duree = duree;
    }

    public String getDetailsIngredients() {
        return detailsIngredients;
    }

    public void setDetailsIngredients(String detailsIngredients) {
        this.detailsIngredients = detailsIngredients;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPreparation() {
        return preparation;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    @Override
    public String toString() {
        return "Produit [id=" + id + ", nom=" + nom + ", nbrIngredients=" + nbrIngredients + ", photo=" + photo
                + ", duree=" + duree + ", detailsIngredients=" + detailsIngredients + ", description=" + description
                + ", preparation=" + preparation + "]";
    }
}

