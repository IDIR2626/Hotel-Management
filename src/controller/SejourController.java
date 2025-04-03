package controller;

import model.Sejour;
import model.Produit;

import java.util.List;

public class SejourController {
    private Sejour sejour;

    public SejourController(Sejour sejour) {
        this.sejour = sejour;
    }

    public void addProduit(Produit produit) {
        sejour.ajoutProduits(produit);
    }

    public double calculateTotalCost() {
        return sejour.calculCoutTotal();
    }

    public List<Produit> getProduits() {
        return sejour.getProduits();
    }
}