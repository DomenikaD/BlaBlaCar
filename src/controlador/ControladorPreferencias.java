/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Preferencias;

/**
 *
 * @author alexa
 */
public class ControladorPreferencias {
    
    public Preferencias buscarPreferencias(int id){
        Preferencias pre = new Preferencias();
        Connection con = null;
        String sql = " SELECT *"
                    + " FROM bla_preferncias "
                    + " WHERE bla_usuarios_usu_id="+id;
        try {
            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
            pre.setId(rs.getInt("pre_id"));
            pre.setPre_conversacion(rs.getInt("pre_conversacion"));
            pre.setPre_fumar(rs.getInt("pre_fumar"));
            pre.setPre_mascota(rs.getInt("pre_mascota"));
            pre.setPre_musica(rs.getInt("pre_musica"));
            pre.setBla_usuarios_usu_id(rs.getInt("bla_usuarios_usu_id"));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.close(con);
        }
        return pre;
    }
    
    public int buscarid(String email){
        int id=0;
        Connection con = null;
        String sql = " SELECT *"
                    + " FROM BLA_USUARIOS "
                    + " WHERE USU_EMAIL='"+email+"'";
        try {
            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                id=rs.getInt("usu_id");

            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.close(con);
        }
        return id;
    }
    
    public boolean actualizarAuto(int hablar,int fumar,int mascota,int musica,int id){
        boolean r = false;
        Connection con = null;
       
        String sql = "UPDATE bla_preferncias SET pre_conversacion= "+hablar
                                        +", pre_fumar="+fumar
                                        +", pre_mascota="+mascota
                                        +", pre_musica="+ musica
                                        + "WHERE bla_usuarios_usu_id = "+id;
        
        try{
            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            r=true;
	    
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.close(con);
        }

        return r;
    }
   
public void anadirPreferencias(int id){

        Connection con = null;
       
        String sql = "Insert Into bla_preferncias Values("+llenarId()
                                                    +",1,1,1,1"
                                                    +","+id+")";
        try{
            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
	    
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.close(con);
        }
    }
    
    
    
private int llenarId(){
        int llena=0;
        boolean ban=false;
        Connection con = null;
            String sql = "SELECT count(*) "
                       + "FROM BLA_Preferncias";
         try {

            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()) {
                llena = rs.getInt(1)+1;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            Conexion.close(con);
        }
        return llena;
    }
}

