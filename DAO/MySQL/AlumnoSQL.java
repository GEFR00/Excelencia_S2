package DAO.MySQL;
import DAO.AlumnoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Alumno;
import vista.Login;
import vista.Login_alum;

public class AlumnoSQL implements AlumnoDAO {
    private String login = "luxo666@hotmail.com";
    private Connection con;
    final String VERIFICA = "SELECT * FROM alumno WHERE login=" + login; //cambiar y usar id
    
    
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

    public void verifica(Login_alum obj) { //usar id
        PreparedStatement stat = null;
        
        try {
            
            stat = con.prepareStatement(VERIFICA);
            stat.executeQuery();
            if (stat.equals(obj.texto_alum()) == true) {
                System.out.println("Se encuentra en la BD. ");
                
            } else {
                System.out.println("No se encuentra en la BD");
            }
        } catch (SQLException e) {
            
        } finally {
            try {
                stat.close();
            } catch (SQLException ex) {
                Logger.getLogger(AlumnoSQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
    }


}
