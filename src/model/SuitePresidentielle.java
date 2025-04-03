package model;

public class SuitePresidentielle extends Chambre {
    private boolean serviceVip;

    public SuitePresidentielle(int num, int tarif, boolean disponible, boolean serviceVip) {
        super(num, tarif, disponible);
        this.serviceVip = serviceVip;
    }
}
