package controller;

import model.Employee;

public class EmployeeController {
    private Employee employee;

    public EmployeeController(Employee employee) {
        this.employee = employee;
    }

    public double getSalaire() {
        return employee.getSalaire();
    }

    public void setSalaire(double salaire) {
        employee.setSalaire(salaire);
    }

    public String getPoste() {
        return employee.getPoste();
    }

    public void setPoste(String poste) {
        employee.setPoste(poste);
    }
}