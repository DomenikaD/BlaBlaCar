
package modelo;

/**
 *
 * @author Domenika Delgado
 */
public class Mensajes {
    
    //Atributos
    private int id;
    private String descripcion;
    private int men_usu_fk;
    
    
    //Constructor
    public Mensajes() {
    }
    
    
    //Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getMen_usu_fk() {
        return men_usu_fk;
    }

    public void setMen_usu_fk(int men_usu_fk) {
        this.men_usu_fk = men_usu_fk;
    }
    
    
}
