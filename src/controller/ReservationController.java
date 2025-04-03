package controller;

import model.Reservation;

import java.sql.Date;

public class ReservationController {
    private Reservation reservation;

    public ReservationController(Reservation reservation) {
        this.reservation = reservation;
    }

    public void confirmReservation() {
        reservation.confirmer();
    }

    public void cancelReservation() {
        reservation.annuler();
    }

    public void updateDates(Date dateDebut, Date dateFin) {
        reservation.setDateDebut(dateDebut);
        reservation.setDateFin(dateFin);
    }
}
