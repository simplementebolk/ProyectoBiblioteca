package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author bolk
 */
public class Conexion {
    private static Connection conexion;
    
    private String user = "bibliotecaduocuc";
    private String password = "bibliotecaduocuc";
    
    private String url = "jdbc:oracle:thin:"+user+"/"+password+"@localhost:1521:orcl";

    public Conexion() {
        try {
            Class.forName("oracle.jdbc.OracleDriver").newInstance();
            this.conexion = DriverManager.getConnection(url,user,password);
        } catch (Exception e) {
            System.err.println("Error de conexion: "+e.getMessage());
        }
        
    }
    
    public Connection obtenerConexion() {
        return conexion;
    }
    
    
    
}
