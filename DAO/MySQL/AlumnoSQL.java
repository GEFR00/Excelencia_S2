package DAO.MySQL;
import DAO.AlumnoDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Alumno;
import vista.Login_alum;
import vista.Vista_alum;

public class AlumnoSQL implements AlumnoDAO {
    private String login = "luxo666@hotmail.com";
    private Connection con;
    final String VERIFICA = "SELECT login FROM alumno"; //cambiar y usar id
    
    
    //Sentencias SQL
    @Override
    public void insertar(Alumno alum) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Alumno> obtenerTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Alumno alum) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar(Alumno alum) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Alumno obtener(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void verifica(Login_alum obj) throws SQLException {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/escuela", "root", "Jugarplay2");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(VERIFICA);
        
        while(rs.next()) {
            String login_name = rs.getString("login"); //imprime lo que está en la columna login
            System.out.println("Correo: "+login_name);
            
            if(rs.getString("login").equals(obj.texto_alum())) {
                Vista_alum viewAlum = new Vista_alum();
                System.out.println("Se encuentra en la BD "+obj.texto_alum()+". ");
                viewAlum.setVisible(true);
                obj.dispose();
                
            } else {
                System.out.println("No se encuentra en la BD "+obj.texto_alum()+". ");
            }
        }
        
        con.close();
        stmt.close();
        rs.close();
    }
    
    public boolean estaAlumno(Login_alum obj) throws SQLException {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/escuela", "root", "Jugarplay2");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(VERIFICA);
        boolean encontrado = false;
        
        while(rs.next()) {
            if(rs.getString("login").equals(obj.texto_alum())) {
                encontrado = true;
                return encontrado;
            } else { 
            }
        }
        
        return encontrado;
    }
    
}



