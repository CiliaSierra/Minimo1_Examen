package Clases;

public class Operaciones {
    private String ecuacion;
    private int resultado;
    private int operacionAlumno;
    private int operacionInstituto;

    public Operaciones(String ecuacion, int resultado, int operacionAlumno, int operacionInstituto) {
        this.ecuacion = ecuacion;
        this.resultado = resultado;
        this.operacionAlumno = operacionAlumno;
        this.operacionInstituto = operacionInstituto;
    }
    public Operaciones() {    }

    public String getEcuacion() {
        return ecuacion;
    }

    public void setEcuacion(String ecuacion) {
        this.ecuacion = ecuacion;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public int getOperacionAlumno() {
        return operacionAlumno;
    }

    public void setOperacionAlumno(int operacionAlumno) {
        this.operacionAlumno = operacionAlumno;
    }

    public int getOperacionInstituto() {
        return operacionInstituto;
    }

    public void setOperacionInstituto(int operacionInstituto) {
        this.operacionInstituto = operacionInstituto;
    }
}
