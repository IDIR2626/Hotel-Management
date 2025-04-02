package model;

import java.util.List;

public class Client extends Personne {

    private List<Reservation> reservations;

    public Client(int idPersonne, String nom, String prenom, int numTel, String email, List<Reservation> reservations) {
        super(idPersonne, nom, prenom, numTel, email);
        this.reservations = reservations;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public void ajouterReservation(Reservation reservation) {
        this.reservations.add(reservation);
    }

}
