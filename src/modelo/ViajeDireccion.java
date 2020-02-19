
package modelo;

/**
 *
 * @author Domenika Delgado
 */
public class ViajeDireccion {
    
    //Atributos
    private int id;
    private int dir_id_fk;
    private int via_id_fk;
    
    
    //Constructor
     public ViajeDireccion() {
    }
    
    
    //Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDir_id_fk() {
        return dir_id_fk;
    }

    public void setDir_id_fk(int dir_id_fk) {
        this.dir_id_fk = dir_id_fk;
    }

    public int getVia_id_fk() {
        return via_id_fk;
    }

    public void setVia_id_fk(int via_id_fk) {
        this.via_id_fk = via_id_fk;
    }
     
   
    
}
