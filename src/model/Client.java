package model;

import java.util.List;

public class Client {
    private int idClient;
    private String nom;
    private String prenom;
    private int numTel;
    private String email;
    private List<Reservation> reservations;

    public Client(int idClient, String nom, String prenom, int numTel, String email, List<Reservation> reservations) {
        this.idClient = idClient;
        this.nom = nom;
        this.prenom = prenom;
        this.numTel = numTel;
        this.email = email;
        this.reservations = reservations;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
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

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public void reserver(Reservation reservation) {
        this.reservations.add(reservation);
    }
}
