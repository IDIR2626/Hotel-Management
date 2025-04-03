package model;

public class Service {

    private int idService;
    private String nomService;

    // Constructor
    public Service(int idService, String nomService) {
        this.idService = idService;
        this.nomService = nomService;
    }

    // Getters
    public int getIdService() {
        return idService;
    }

    public String getNomService() {
        return nomService;
    }

    // Setters
    public void setIdService(int idService) {
        this.idService = idService;
    }

    public void setNomService(String nomService) {
        this.nomService = nomService;
    }

}
