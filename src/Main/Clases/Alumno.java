package Clases;

import java.util.List;

public class Alumno {
    //Atributos
    private int alumnoId;
    private String alumno;
    private List<Operaciones> operacion;
    //Constructores
    public Alumno (){}
    public Alumno(int alumnoId,String alumno, List<Operaciones> operacion) {
        this.alumnoId = alumnoId;
        this.alumno = alumno;
        this.operacion = operacion;
    }

    public int getAlumnoId() {
        return alumnoId;
    }

    public void setAlumnoId(int alumnoId) {
        this.alumnoId = alumnoId;
    }

    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public List<Operaciones> getOperacion() {
        return operacion;
    }

    public void setOperacion(List<Operaciones> operacion) {
        this.operacion = operacion;
    }
}
