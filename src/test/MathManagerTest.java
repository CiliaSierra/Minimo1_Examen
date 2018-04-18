import Clases.Operaciones;
import Clases.Instituto;
import Clases.Alumno;
import Math.MathManagerImpl;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class MathManagerTest {
    MathManagerImpl pm = MathManagerImpl.getInstance();
    //Test sobre la implementacion
    //inicalizo los valores y llamos a los metodos para realizar el test de las funciones
    private final static Logger logger = Logger.getLogger(String.valueOf(MathManagerTest.class));

    private Instituto i1;
    private Instituto i2;

    private Alumno a1;
    private Alumno a2;

    private Operaciones o1;
    private Operaciones o2;

    private List<Operaciones> oper1;
    private List<Operaciones> oper2;

    @org.junit.Before
    private void setUp(){
      i1 = new Instituto(1,"EETAC",oper1);
      i2 = new Instituto(2,"ESAB",oper2);

      a1 = new Alumno(1,"Pepe",oper1);
      a2 = new Alumno (2,"Maria",oper2);

      o1 = new Operaciones("201",0,1,1);
      o2 = new Operaciones("201",0,2,2);

      oper1 = new ArrayList<>();
      oper2 = new ArrayList<>();
      oper1.add(o1);
      oper2.add(o2);
    }
    @org.junit.After
    public void tearDown(){
        i1= null;
        i2=null;
        a1 = null;
        a2 = null;
        o1 = null;
        o2 = null;
        oper1 = null;
        oper2 = null;
        pm.getColaOperaciones().clear();
        pm.getListaOperaciones().clear();
    }
    @org.junit.Test
    public void realizarOperacion (){
        logger.info("test: RealizarOperacion");
        Assert.assertTrue(pm.operacionMatematica(o1));
    }
    @org.junit.Test
    public void procearOperacion(){
        logger.info("test: ProcesarOperacion");
        Assert.assertEquals(0,pm.procesarOperacion());
    }
}
