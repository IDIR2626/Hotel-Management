package model;

public class ChambreDouble extends Chambre {

    private boolean litSupplementaire;

    public ChambreDouble(int num, int tarif, boolean disponible, boolean litSupplementaire) {
        super(num, tarif, disponible);
        this.litSupplementaire = litSupplementaire;
    }

}
