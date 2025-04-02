package model;

public class Produit {
    private int idProduit;
    private double prixProduit;
    private String nomProduit;

    // Constructor
    public Produit(int idProduit, double prixProduit, String nomProduit) {
        this.idProduit = idProduit;
        this.prixProduit = prixProduit;
        this.nomProduit = nomProduit;
    }

    // Getters
    public int getIdProduit() {
        return idProduit;
    }

    public double getPrixProduit() {
        return prixProduit;
    }

    public String getNomProduit() {
        return nomProduit;
    }

    // Setters
    public void setIdProduit(int idProduit) {
        this.idProduit = idProduit;
    }

    public void setPrixProduit(double prixProduit) {
        this.prixProduit = prixProduit;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

}
