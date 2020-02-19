
package modelo;

/**
 *
 * @author Domenika Delgado
 */
public class FacturaCabecera {
    
    private int id;
    private String fecha;
    private double subTotal;
    private double iva;
    private double total;
    private char estado;
    private int usu_id_fk;
    
    //Constructor
    public FacturaCabecera() {
    }
    
    
    //Getter & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public int getUsu_id_fk() {
        return usu_id_fk;
    }

    public void setUsu_id_fk(int usu_id_fk) {
        this.usu_id_fk = usu_id_fk;
    }
    
}
