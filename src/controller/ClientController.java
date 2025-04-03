package controller;

import model.Client;
import model.Reservation;

import java.util.List;

public class ClientController {
    private Client client;

    public ClientController(Client client) {
        this.client = client;
    }

    public void addReservation(Reservation reservation) {
        client.ajouterReservation(reservation);
    }

    public List<Reservation> getReservations() {
        return client.getReservations();
    }
}