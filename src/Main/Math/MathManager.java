package Math;

import Clases.Instituto;
import Clases.Operaciones;

import java.util.List;

public interface MathManager {

    //impletatacion de la operaciones descritas

    //Operacion matematica
    boolean operacionMatematica(Operaciones operaciones);
    //Procesar la Operacion Matematica
    int procesarOperacion ();
    //Lista de operaciones hechas por un Intituto
    List<Operaciones> operacionesInstituto(int institutoId);
    //Lista de operaciones realizadas por un alumno
    List<Operaciones> operacionesAlumno(int alumnoId);
    //Lista de intitutos ordenado por nº de operaciones realizadas (menor-mayor)
    List<Instituto> listaIntitutos();
}
