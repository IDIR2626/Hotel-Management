package model;

public class ChambreSimple extends Chambre {

    private boolean litSupplementaire;

    public ChambreSimple(int numero, int tarif, boolean litSupplementaire) {
        super(numero, tarif);
        this.litSupplementaire = litSupplementaire;
    }

    public boolean isLitSupplementaire() {
        return litSupplementaire;
    }

    public void setLitSupplementaire(boolean litSupplementaire) {
        this.litSupplementaire = litSupplementaire;
    }
}
