package controller;

import model.Produit;

public class ProduitController {
    private Produit produit;

    public ProduitController(Produit produit) {
        this.produit = produit;
    }

    public double getPrixProduit() {
        return produit.getPrixProduit();
    }

    public void setPrixProduit(double prix) {
        produit.setPrixProduit(prix);
    }

    public String getNomProduit() {
        return produit.getNomProduit();
    }

    public void setNomProduit(String nom) {
        produit.setNomProduit(nom);
    }
}