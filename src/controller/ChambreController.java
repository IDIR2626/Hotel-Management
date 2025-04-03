package controller;

import model.Chambre;

public class ChambreController {
    private Chambre chambre;

    public ChambreController(Chambre chambre) {
        this.chambre = chambre;
    }

    public void reserveChambre() {
        chambre.reserver();
    }

    public void freeChambre() {
        chambre.liberer();
    }

    public boolean isAvailable() {
        return chambre.isDisponible();
    }
}
