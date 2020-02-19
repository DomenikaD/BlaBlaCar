/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author alexa
 */
public class Preferencias {
    
    private int id;
    private int pre_conversacion;
    private int pre_fumar ;
    private int pre_mascota;
    private int pre_musica;
    private int bla_usuarios_usu_id ;

    public Preferencias() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPre_conversacion() {
        return pre_conversacion;
    }

    public void setPre_conversacion(int pre_conversacion) {
        this.pre_conversacion = pre_conversacion;
    }

    public int getPre_fumar() {
        return pre_fumar;
    }

    public void setPre_fumar(int pre_fumar) {
        this.pre_fumar = pre_fumar;
    }

    public int getPre_mascota() {
        return pre_mascota;
    }

    public void setPre_mascota(int pre_mascota) {
        this.pre_mascota = pre_mascota;
    }

    public int getPre_musica() {
        return pre_musica;
    }

    public void setPre_musica(int pre_musica) {
        this.pre_musica = pre_musica;
    }

    public int getBla_usuarios_usu_id() {
        return bla_usuarios_usu_id;
    }

    public void setBla_usuarios_usu_id(int bla_usuarios_usu_id) {
        this.bla_usuarios_usu_id = bla_usuarios_usu_id;
    }
    
    
    
}
