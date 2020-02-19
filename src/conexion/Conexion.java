
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Domenika Delgado
 */
public class Conexion {
    
    public static void main(String[] args) {
     
        /* Llamar al método (Close) para cerrar la base de datos */
        close(getConnection());
        
    }
    
    
    /*°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°
            Método para ingresar a la base de datos
                Usuario: BLABLACAR
                Clave: blablacar
    °°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°*/
    public static Connection getConnection() {
        try {
        	Class.forName("oracle.jdbc.driver.OracleDriver");  
        	Connection con = DriverManager.getConnection(  
                    //"jdbc:oracle:thin:@localhost:1521:orcl", "BLABLACAR","blablacar");  
                    "jdbc:oracle:thin:@localhost:1521:orcl", "BLABLACAR","1234");  
        	System.out.println("Conectado");
            return con;
           
        } catch (Exception ex) {
            System.out.println("Database.getConnection() Error -->" + ex.getMessage());
            return null;
        }
    }
 
    /*°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°
        Método que se usa para cerrar la base datos para prevenir 
        el colapso de información. 
    °°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°*/
    public static void close(Connection con) {
        try {
            con.close();
            System.out.println("Cerrado");
        } catch (Exception ex) {
        }
    }
    
    
    
    
}
