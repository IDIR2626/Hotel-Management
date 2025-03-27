package model;

public class ChambreDouble extends Chambre{

    private boolean litSupplementaire;

    public ChambreDouble(int numero, int etage, boolean litSupplementaire) {
        super(numero, etage);
        this.litSupplementaire = litSupplementaire;
    }


    public boolean isLitSupplementaire() {
        return litSupplementaire;
    }

    public void setLitSupplementaire(boolean litSupplementaire) {
        this.litSupplementaire = litSupplementaire;
    }


}
