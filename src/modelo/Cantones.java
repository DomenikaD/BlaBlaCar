package modelo;

/**
 *
 * @author Domenika Delgado
 */
public class Cantones {
    
    //Atributos
    private int id;
    private String nombreCanton;
    private int idProvincia;
    
    
    //Constructor
    public Cantones() {
    }
    
   
    //Getetrs & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCanton() {
        return nombreCanton;
    }

    public void setNombreCanton(String nombreCanton) {
        this.nombreCanton = nombreCanton;
    }

    public int getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(int idProvincia) {
        this.idProvincia = idProvincia;
    }
    
}
