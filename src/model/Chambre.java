package model;

public class Chambre {
    private int num;
    private int tarif;
    private boolean disponible;

    public Chambre(int num, int tarif) {
        this.num = num;
        this.tarif = tarif;
        this.disponible = disponible;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getTarif() {
        return tarif;
    }

    public void setTarif(int tarif) {
        this.tarif = tarif;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void reserver() {
        this.disponible = false;
    }

    public void liberer() {
        this.disponible = true;
    }

}
