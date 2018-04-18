package Math;

import Clases.Instituto;
import Clases.Operaciones;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.awt.*;
import java.util.List;

@Path("/operaciones")
public class MathManagerService {
    MathManagerImpl pm = MathManagerImpl.getInstance();
    //Realizar Operacion
    @Path("/realizaroperacion/{operacion}")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean operacionMatematica(@PathParam("operacion") Operaciones operaciones){
        return pm.operacionMatematica(operaciones);
    }
    //Procesar Operacion
    @Path("/procesaroperacion/{operacion")
    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    public int procesarOperacion (){
        return pm.procesarOperacion();
    }
    //Lista de operaciones Instituto
    @Path("/listaoperacionesintituto/{ID}")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public List<Operaciones>  operacionesIntituto(@PathParam("ID") int institutoId){
        return pm.operacionesInstituto(institutoId);
    }
    //Lista operaciones Alumno
    @Path("/listaoperacionesalumno/{ID}")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public List<Operaciones>  operacionesAlumno (@PathParam("ID") int alumnoId){
        return pm.operacionesAlumno(alumnoId);
    }
    //Lista Intitutos por numero de Operacion
    @Path("/listaintituto")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Instituto>  listaIntitutos(){
        return pm.listaIntitutos();
    }
}
