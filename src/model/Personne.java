package model;

public class Personne {
    private int idPersonne;
    private String nom;
    private String prenom;
    private int numTel;
    private String email;

    public Personne(int idPersonne, String nom, String prenom, int numTel, String email) {
        this.idPersonne = idPersonne;
        this.nom = nom;
        this.prenom = prenom;
        this.numTel = numTel;
        this.email = email;
    }

    public int getIdPersonne() {
        return idPersonne;
    }

    public void setIdPersonne(int idPersonne) {
        this.idPersonne = idPersonne;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getNumTel() {
        return numTel;
    }

    public void setNumTel(int numTel) {
        this.numTel = numTel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
