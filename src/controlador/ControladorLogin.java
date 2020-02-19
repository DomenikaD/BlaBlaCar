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
import modelo.Usuario;

/**
 *
 * @author alexa
 */
public class ControladorLogin {
    
    public boolean buscarLogin(String email,String password){
        //Cliente cli=new Cliente();
        boolean ban=false;
        Connection con = null;
        String sql = " SELECT *"
                    + " FROM BLA_USUARIOS "
                    + " WHERE USU_EMAIL='"+email+"' AND USU_PASSWORD='"+password+"'";
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
       public String buscar(String email){
        //Cliente cli=new Cliente();
        String usuario="";
       
        Connection con = null;
        String sql = " SELECT *"
                    + " FROM BLA_USUARIOS "
                    + " WHERE USU_EMAIL='"+email+"'";
        try {
            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                usuario=rs.getString("usu_nombre");
            

            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.close(con);
        }
        return usuario;
    }
    
}
