package model;

import java.util.List;

public class Hotel {
    private List<Chambre> chambres;
    private List<Client> clients;
    private List<Reservation> reservations;

    public Hotel(List<Chambre> chambres, List<Client> clients, List<Reservation> reservations) {
        this.chambres = chambres;
        this.clients = clients;
        this.reservations = reservations;
    }

    public List<Chambre> getChambres() {
        return chambres;
    }

    public void setChambres(List<Chambre> chambres) {
        this.chambres = chambres;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public void ajouteChambre(Chambre chambre) {
        this.chambres.add(chambre);
    }

    public void ajouteClient(Client client) {
        this.clients.add(client);
    }

    public void ajouteProduit(Reservation reservation) {
        this.reservations.add(reservation);
    }

    public void supprimProduit(Reservation reservation) {
        this.reservations.remove(reservation);
    }
}
