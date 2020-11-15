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
import vista.*;

public class AlumnoSQL implements AlumnoDAO {
    private String login = "luxo666@hotmail.com";
    private Connection con;
    final String VERIFICA = "SELECT login FROM alumno"; //cambiar y usar id
    final String OBTENID = "SELECT * FROM alumno";
    String notaAlumId = null;
    
    private String password = "Jugarplay2";
    
    
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
    
    public boolean verificaAlum(Login_alum obj) throws SQLException {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/escuela", "root", password);
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(VERIFICA);
        boolean encontrado = false;
        
        while(rs.next()) {
            if(rs.getString("login").equals(obj.TextAlum())) {
                encontrado = true;
                return encontrado;    
            } else {

            }
        }
        con.close();
        stmt.close();
        rs.close();
        return encontrado;
    }
    
    public int getIdAlum(Login_alum obj) throws SQLException {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/escuela", "root", password);
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(OBTENID);
        int id = 0;
        while(rs.next()) {
            if(rs.getString("login").equals(obj.TextAlum())) {
                id = rs.getInt("id");
                return id;
            } else {
                
            }
        }
        con.close();
        stmt.close();
        rs.close();
        return id;
    }
    
    public void obtenerNotas(Login_alum obj) throws SQLException {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/escuela", "root", password);
        Statement stmt = con.createStatement();
        AlumnoSQL aluSQL = new AlumnoSQL();
        notaAlumId = Integer.toString(aluSQL.getIdAlum(obj));
        ResultSet rs = stmt.executeQuery("SELECT nota FROM nota WHERE alumno_id="+notaAlumId);
        
        
        while(rs.next()) {
            float nota = rs.getFloat("nota");
            System.out.println("Nota: "+nota);
        }
        
        rs.close();
        
        ResultSet rss = stmt.executeQuery("SELECT asignatura_id FROM nota WHERE alumno_id="+notaAlumId);
        while(rss.next()) {
            int asignatura = rss.getInt("asignatura_id");
            System.out.println("Asignatura: "+asignatura);
        }
        
        con.close();
        stmt.close();
        rss.close();
   
    }
        
}



