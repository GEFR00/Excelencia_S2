package modelo;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConexionBDEscuela {
    private final String base = "escuela";
    private final String user = "root";
    private final String password = "Jugarplay2";
    private final String url = "jdbc:mysql://localhost:3306/" + base;
    private Connection con = null;
    
    public Connection getConexion() {
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(this.url, this.user, this.password);
            JOptionPane.showMessageDialog(null, "Conexión exitosa. ");
        } catch(SQLException e) {
            System.err.println(e);
        } catch(ClassNotFoundException ex) {
            Logger.getLogger(ConexionBDEscuela.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return con;
        
    }
}
