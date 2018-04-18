package Math;

import Clases.Instituto;
import Clases.Operaciones;

import java.util.*;
import java.util.logging.Logger;

public class MathManagerImpl implements MathManager {
    //Funcinoes para realizar las funciones principales
    //Declaraciones
    private static MathManagerImpl instance = null;
    final static Logger logger = Logger.getLogger(String.valueOf(MathManagerImpl.class));

    private Queue<Operaciones> colaOperaciones; //Una cola para guradar las operaciones realizadas pero no procesadas;

    private List<Operaciones> listaOperaciones;//Una lista con las operaciones relizadas y procesadas


    //Singleton Pattern
    public static MathManagerImpl getInstance() {
        if (instance == null) instance = new MathManagerImpl();
        return instance;
    }

    //Constructores
    public MathManagerImpl() {
    }

    public MathManagerImpl(Queue<Operaciones> colaOperaciones, List<Operaciones> listaOperaciones) {
        this.colaOperaciones = colaOperaciones;
        this.listaOperaciones = listaOperaciones;
    }

    //Getters y Setters
    public Queue<Operaciones> getColaOperaciones() {
        return colaOperaciones;
    }

    public void setColaOperaciones(Queue<Operaciones> colaOperaciones) {
        this.colaOperaciones = colaOperaciones;
    }

    public List<Operaciones> getListaOperaciones() {
        return listaOperaciones;
    }

    public void setListaOperaciones(List<Operaciones> listaOperaciones) {
        this.listaOperaciones = listaOperaciones;
    }

    //Funciones Principales (publicas)
    //funcion para realizar una operacion
    public boolean operacionMatematica(Operaciones operaciones) {
        logger.info("Operacion realizada ");
        this.colaOperaciones.add(new Operaciones(operaciones.getEcuacion(), 0, operaciones.getOperacionAlumno(), operaciones.getOperacionInstituto()));
        return true;
    }

    //Proceso (doy el resultado) de la operacion
    public int procesarOperacion() {
        logger.info("Operacion a Pocesar");
        if (!colaOperaciones.isEmpty()) {//miro si hay operaciones para hacer
             int ecuacion = 0;
            //llamare a la funcion (clase) que me da el resultado de la operacion
            //p = resultadoOperacion(colaOperaciones.getEcuacion)
            logger.info("Operacion procesada");
            this.listaOperaciones.add(this.colaOperaciones.element()); //guardar en la lista de Operaciones procesadas
            this.colaOperaciones.remove(); //eliminar de la cola
            return ecuacion;
        } else {
            logger.warning("No hay operaciones para hacer");
            return -1;
        }
    }

    //Lista de operaciones que ha hecho un intituto
    public List<Operaciones> operacionesInstituto(int institutoId) {
        logger.info("Lista de Operaciones del instituto" + institutoId);
        //recorro la lista de operaciones y guardo las relizadas por mi intituto
        List<Operaciones> res = new ArrayList<>();
        for (Operaciones o : listaOperaciones) {//recorro la lista de operaciones
            if (o.getOperacionInstituto() == institutoId)
                res.add(o);
        }
        if (res.size() == 0)
            logger.warning("el intituto aun no ha realizado operaciones");

        else
            logger.info("Las operaciones relizadas por el instituto");
        return res;

    }

    //Lista de operaciones que ha hecho un alumno
    public List<Operaciones> operacionesAlumno(int alumnoId) {
        logger.info("Lista de Operaciones del alumno" + alumnoId);
        //recorro la lista de operaciones y guardo las relizadas
        List<Operaciones> res = new ArrayList<>();
        for (Operaciones o : listaOperaciones) {//recorro la lista de operaciones
            if (o.getOperacionAlumno() == alumnoId)
                res.add(o);
        }
        if (res.size() == 0)
            logger.warning("El alumno aun no ha realizado operaciones");
        else
            logger.info("Las operaciones relizadas por el alumno");
        return res;


    }

    //Lista de intitutos por nuemero de operaciones de menos a mayor
    public List<Instituto> listaIntitutos() {
        if (!listaOperaciones.isEmpty()) {//si hay operaciones hechas
            logger.info("La lista de intitutos:");
            return ordenIntituto(getListaOperaciones());
        } else {
            logger.warning("No se hecho operaciones");
            return null;
        }

    }

    //Me ordena los intitutos dependientdo del nuemro de operaciones hechas
    private List<Instituto> ordenIntituto(List<Operaciones> operacion) {
        int i1 = 0;
        int i2 = 0;
        List<Instituto> res = new ArrayList<>();
        for (Operaciones p : operacion) {//recorro la lista de operaciones para contar el numero de operaciones que ha hecho cada uno
            switch (p.getOperacionInstituto()) {
                case 1:
                    i1++;
                    break;
                case 2:
                    i2++;
                    break;
            }
        }
        int comparacion = Integer.compare(i1,i2);
        //Mismo numero de operaciones
        if (comparacion == 0) {
            res.add(res.get(i1));
            res.add(res.get(i2));
        }
        if (comparacion < 0) { //hay mas del i2
            res.add(res.get(i1));
            res.add(res.get(i2));
        }
        if (comparacion > 0) { //hay mas del i1
            res.add(res.get(i2));
            res.add(res.get(i1));
        }
        return res;
    }
}

