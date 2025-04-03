package model;

public class Employee extends Personne {
    private double salaire;
    private String poste;

    // Constructor
    public Employee(int idPersonne, String nom, String prenom, int numTel, String email, double salaire, String poste) {
        super(idPersonne, nom, prenom, numTel, email); // Call to the parent class constructor
        this.salaire = salaire;
        this.poste = poste;
    }

    // Getters and Setters
    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }
}
