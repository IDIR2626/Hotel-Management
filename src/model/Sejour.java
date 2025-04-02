package model;

import java.util.List;

public class Sejour {
    private int idSéjour;
    private List<Produit> produits;
    private Reservation reservation;

    // Constructor
    public Sejour(int idSéjour, List<Produit> produits, Reservation reservation) {
        this.idSéjour = idSéjour;
        this.produits = produits;
        this.reservation = reservation;
    }

    // Getters and Setters
    public int getIdSéjour() {
        return idSéjour;
    }

    public void setIdSéjour(int idSéjour) {
        this.idSéjour = idSéjour;
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    // Method to add products
    public void ajoutProduits(Produit produit) {
        if (produits != null) {
            produits.add(produit);
        }
    }

    // Method to calculate total cost
    public double calculCoutTotal() {
        double total = 0;
        if (produits != null) {
            for (Produit produit : produits) {
                total += produit.getPrixProduit();
            }
        }
        return total;
    }
}
