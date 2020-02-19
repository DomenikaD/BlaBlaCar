
package modelo;

/**
 *
 * @author Domenika Delgado
 */
public class Viajes {
    
    private int id;
    private String fechaSalida;
    private String horaSalida;
    private String fechaRegreso;
    private String horaRegreso;
    private double costo;
    private int cantidad;
    private int usu_id_fk;
    
    //Constructor
    public Viajes() {
    }
    
    
    //Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getFechaRegreso() {
        return fechaRegreso;
    }

    public void setFechaRegreso(String fechaRegreso) {
        this.fechaRegreso = fechaRegreso;
    }

    public String getHoraRegreso() {
        return horaRegreso;
    }

    public void setHoraRegreso(String horaRegreso) {
        this.horaRegreso = horaRegreso;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getUsu_id_fk() {
        return usu_id_fk;
    }

    public void setUsu_id_fk(int usu_id_fk) {
        this.usu_id_fk = usu_id_fk;
    }
 
    
    
}
