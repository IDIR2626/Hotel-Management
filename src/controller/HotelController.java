package controller;

import model.Hotel;
import model.Chambre;
import model.Client;
import model.Reservation;

import java.util.List;

public class HotelController {
    private Hotel hotel;

    public HotelController(Hotel hotel) {
        this.hotel = hotel;
    }

    public void addChambre(Chambre chambre) {
        hotel.ajouteChambre(chambre);
    }

    public void addClient(Client client) {
        hotel.ajouteClient(client);
    }

    public void addReservation(Reservation reservation) {
        hotel.ajouteProduit(reservation);
    }

    public List<Chambre> getChambres() {
        return hotel.getChambres();
    }

    public List<Client> getClients() {
        return hotel.getClients();
    }

    public List<Reservation> getReservations() {
        return hotel.getReservations();
    }
}
