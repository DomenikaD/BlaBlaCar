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
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import modelo.Modelo;

/**
 *
 * @author Domenika Delgado
 */
public class ControladorAuto {
    
    private int llenarId(){
        int llena=0;
        boolean ban=false;
        Connection con = null;
            String sql = "SELECT count(*) "
                       + "FROM BLA_Autos";
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
    
    public int buscar(String email){
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
    
    
    public void llenarTabla(int id,DefaultTableModel dtm,Object [] o){
        Connection con = null;
        String sql = " SELECT *"
                    + " FROM bla_autos"
                    + " WHERE bla_usuarios_usu_id= "+id;
        try {
            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                o[0] = rs.getInt("aut_id");
                o[1] = rs.getString("aut_placa");
                o[2] = rs.getString("aut_color");
                o[3] = rs.getString("aut_espacio");
                o[4] = buscarTipoAuto(rs.getInt("bla_tip_autos_tipo_aut_id"));
                o[5]= buscarModelo(rs.getInt("bla_modelos_mod_id"));

                dtm.addRow(o);

            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.close(con);
        }
    }
    
    public String buscarTipoAuto(int id){
        String nombre="";
       
        Connection con = null;
        String sql = " SELECT *"
                    + " FROM BLA_TIP_AUTOS "
                    + " WHERE tipo_aut_id="+id;
        try {
            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                nombre=rs.getString("tipo_aut_nombre");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.close(con);
        }
        return nombre;
    }
    
    public String buscarModelo (int id){
        String nombre="";
       
        Connection con = null;
        String sql = " SELECT *"
                    + " FROM BLA_modelos "
                    + " WHERE mod_id= "+id;
        try {
            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                nombre=rs.getString("mod_nombre");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.close(con);
        }
        return nombre;
    }
    
    public boolean llenarComboBoxNombreMarca(JComboBox combo){
        boolean ban=false;
        Connection con = null;
        
            String sql = "SELECT * "
                       + "FROM bla_marcas";

            try {
            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            while (rs.next()) {
                combo.addItem(rs.getString("mar_nombre"));
                ban =true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            Conexion.close(con);
        }
        return ban;
    }
    
    public boolean llenarComboBoxNombreTipo(JComboBox combo){
        boolean ban=false;
        Connection con = null;
        
            String sql = "SELECT * "
                       + "FROM bla_tip_autos";
            try {
            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            while (rs.next()) {
                combo.addItem(rs.getString("tipo_aut_nombre"));
                ban =true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            Conexion.close(con);
        }
        return ban;
    }
    
    public boolean llenarComboBoxNombreModelo(JComboBox combo,int id){
         boolean ban=false;
        Connection con = null;
        
            String sql = "SELECT * "
                       + "FROM bla_modelos Where bla_marcas_mar_id="+id;
            try {
            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();

            while (rs.next()) {
                combo.addItem(rs.getString("mod_nombre"));
                ban =true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            Conexion.close(con);
        }
        return ban;
    }
    
    public void vaciarComboBox(JComboBox combo){
        //combo.setSelectedIndex(0);        
        combo.removeAllItems();
        //controladorAuto.llenarComboBoxDisponible(combo);
    }
    
    public int buscarIdMarca(String nombre){
        int id=0;
       
        Connection con = null;
        String sql = " SELECT *"
                    + " FROM BLA_marcas "
                    + " WHERE mar_nombre = '"+nombre+"'";
        try {
            con = Conexion.getConnection();
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                id=rs.getInt("mar_id");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.close(con);
        }
        return id;
    }
}
    

