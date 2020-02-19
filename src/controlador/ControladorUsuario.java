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
import javax.swing.table.DefaultTableModel;
import modelo.Usuario;

/**
 *
 * @author alexa
 */
public class ControladorUsuario {

    public boolean buscarUsuario(String email){
        //Cliente cli=new Cliente();
        boolean ban=false;
        Connection con = null;
        String sql = " SELECT *"
                    + " FROM BLA_USUARIOS "
                    + " WHERE USU_EMAIL='"+email+"'";
        try {
            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                ban=true;
            

            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.close(con);
        }
        return ban;
    }
    
    public boolean crearUsuario(Usuario usu){
    boolean r = false;
        Connection con = null;
       
        String sql = "Insert Into BLA_USUARIOS Values("+usu.getId()
                +",'"+usu.getEmail()
                +"','"+usu.getNombre()
                +"','"+usu.getApellido()
                +"','"+usu.getFechaNacimiento()
                +"','"+usu.getPassword()
                +"','"+usu.getTelefono()
                +"','"+usu.getGenero()
                +"')";
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
     public int llenarId(){
        int llena=0;
        boolean ban=false;
        Connection con = null;
            String sql = "SELECT count(*) "
                       + "FROM BLA_USUARIOS";
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
    
