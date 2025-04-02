package model;

import java.sql.Date;

public class Reservation {
    private int idPersonne;
    private Date dateDebut;
    private Date dateFin;
    private boolean estConfirme;
    private boolean estAnnule;
    private Sejour sejour;
    private Chambre chambre;
    private Client client;

    // Constructor
    public Reservation(int idPersonne, Date dateDebut, Date dateFin, boolean estConfirme, boolean estAnnule,
            Sejour sejour, Chambre chambre, Client client) {
        this.idPersonne = idPersonne;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.estConfirme = estConfirme;
        this.estAnnule = estAnnule;
        this.sejour = sejour;
        this.chambre = chambre;
        this.client = client;
    }

    // Getters and Setters
    public int getIdPersonne() {
        return idPersonne;
    }

    public void setIdPersonne(int idPersonne) {
        this.idPersonne = idPersonne;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public boolean isEstConfirme() {
        return estConfirme;
    }

    public void setEstConfirme(boolean estConfirme) {
        this.estConfirme = estConfirme;
    }

    public boolean isEstAnnule() {
        return estAnnule;
    }

    public void setEstAnnule(boolean estAnnule) {
        this.estAnnule = estAnnule;
    }

    public Sejour getSejour() {
        return sejour;
    }

    public void setSejour(Sejour sejour) {
        this.sejour = sejour;
    }

    public Chambre getChambre() {
        return chambre;
    }

    public void setChambre(Chambre chambre) {
        this.chambre = chambre;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    // Methods
    public void annuler() {
        this.estAnnule = true;
        this.estConfirme = false;
    }

    public void confirmer() {
        this.estConfirme = true;
        this.estAnnule = false;
    }
}
