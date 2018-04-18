package Clases;

import java.util.List;

public class Instituto {
    private int institutoId;
    private String instituto;
    private List<Operaciones> operacion;

    public Instituto(int institutoId, String instituto, List<Operaciones> operacion) {
        this.institutoId = institutoId;
        this.instituto = instituto;
        this.operacion = operacion;
    }

    public Instituto() {    }

    public int getNumeroOperaciones(){
        return operacion.size();
    }

    public int getInstitutoId() {
        return institutoId;
    }

    public void setInstitutoId(int institutoId) {
        this.institutoId = institutoId;
    }

    public String getInstituto() {
        return instituto;
    }

    public void setInstituto(String instituto) {
        this.instituto = instituto;
    }

    public List<Operaciones> getOperacion() {
        return operacion;
    }

    public void setOperacion(List<Operaciones> operacion) {
        this.operacion = operacion;
    }
}
