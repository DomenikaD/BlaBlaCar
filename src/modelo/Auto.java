
package modelo;

/**
 *
 * @author Domenika Delgado
 */
public class Auto {
    
    //Atributos
    private int id;
    private String placa;
    private String color;
    private int espacio;
    private char estado;
    private int tip_aut_id_fk;
    private int mod_id_fk;
    private int usu_id_fk;

    
    //Constructor
    public Auto() {
    }

    
    //Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEspacio() {
        return espacio;
    }

    public void setEspacio(int espacio) {
        this.espacio = espacio;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public int getTip_aut_id_fk() {
        return tip_aut_id_fk;
    }

    public void setTip_aut_id_fk(int tip_aut_id_fk) {
        this.tip_aut_id_fk = tip_aut_id_fk;
    }

    public int getMod_id_fk() {
        return mod_id_fk;
    }

    public void setMod_id_fk(int mod_id_fk) {
        this.mod_id_fk = mod_id_fk;
    }

    public int getUsu_id_fk() {
        return usu_id_fk;
    }

    public void setUsu_id_fk(int usu_id_fk) {
        this.usu_id_fk = usu_id_fk;
    }
    
           
    
}
