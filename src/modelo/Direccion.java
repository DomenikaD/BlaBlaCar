
package modelo;

/**
 *
 * @author Domenika Delgado
 */
public class Direccion {
    //Atriubtos
    private int id;
    private String callePrincipal;
    private String calleSecundaria;
    private String descripcion;
    private int idCanton;
    
    
    //Constructor

    public Direccion() {
    }
    
    
    //Getters & Setetrs
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCallePrincipal() {
        return callePrincipal;
    }

    public void setCallePrincipal(String callePrincipal) {
        this.callePrincipal = callePrincipal;
    }

    public String getCalleSecundaria() {
        return calleSecundaria;
    }

    public void setCalleSecundaria(String calleSecundaria) {
        this.calleSecundaria = calleSecundaria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdCanton() {
        return idCanton;
    }

    public void setIdCanton(int idCanton) {
        this.idCanton = idCanton;
    }
    
}
