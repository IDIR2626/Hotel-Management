package model;

import java.util.List;

public class Hotel {
    private List<Chambre> chambres;
    private List<Client> clients;

    public Hotel(List<Chambre> chambres, List<Client> clients) {
        this.chambres = chambres;
        this.clients = clients;
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


    public void addClient(Client client) {
        this.clients.add(client);
    }

    public void addChambre(Chambre chambre) {
        this.chambres.add(chambre);
    }
}
