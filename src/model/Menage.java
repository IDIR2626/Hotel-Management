package model;

import java.sql.Date;

public class Menage extends Service {
    private Date dateMenage;
    private boolean estFait;

    public Menage(int idMenage, String nomService, Date dateMenage, boolean estFait) {
        super(idMenage, nomService);
        this.dateMenage = dateMenage;
        this.estFait = estFait;
    }

    // Getters
    public Date getDateMenage() {
        return dateMenage;
    }

    public boolean isEstFait() {
        return estFait;
    }

    // Setters
    public void setDateMenage(Date dateMenage) {
        this.dateMenage = dateMenage;
    }

    public void setEstFait(boolean estFait) {
        this.estFait = estFait;
    }

}
