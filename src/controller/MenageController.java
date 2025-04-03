package controller;

import model.Menage;

import java.sql.Date;

public class MenageController {
    private Menage menage;

    public MenageController(Menage menage) {
        this.menage = menage;
    }

    public void setDateMenage(Date date) {
        menage.setDateMenage(date);
    }

    public Date getDateMenage() {
        return menage.getDateMenage();
    }

    public void markAsDone() {
        menage.setEstFait(true);
    }

    public void markAsNotDone() {
        menage.setEstFait(false);
    }

    public boolean isDone() {
        return menage.isEstFait();
    }
}