package DAO.MySQL;
import DAO.AlumnoDAO;
import java.sql.*;
import java.util.List;
import modelo.Alumno;
import vista.*;

public class AlumnoSQL implements AlumnoDAO {
    private String login = "luxo666@hotmail.com";
    private Connection con;
    final String VERIFICA = "SELECT login FROM alumno"; //cambiar y usar id
    final String OBTENID = "SELECT * FROM alumno";
    String notaAlumId = null, idAlumno = null;
    private String password = "Jugarplay2";
    
    
    //Comienzo de sentencias SQL
    //Metodos para realizar CRUD
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
    
    //------------------------ METODOS --------------------------------
    public boolean verificaAlum(Login_alum obj) throws SQLException { //verifica el logeo del alumno
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
    
    public int getIdAlum(Login_alum obj) throws SQLException {  //Metodo que obtiene el ID del Alumno
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
    
    public void imprimeLista(Login_alum obj) throws SQLException {  //Metodo que imprime la lista de los alumnos
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/escuela", "root", password);
        Statement stmt = con.createStatement();
        AlumnoSQL aluSQL = new AlumnoSQL();
        ResultSet rs = stmt.executeQuery("SELECT nivelAlumn_id FROM alumno WHERE id="+Integer.toString(aluSQL.getIdAlum(obj)));
        String nivel_id = null;
        
        while(rs.next()) {
            nivel_id = Integer.toString(rs.getInt("nivelAlumn_id"));
        }
        
        rs.close();
        
        String compa_alumno;
        ResultSet rss = stmt.executeQuery("SELECT nombre, apellidos FROM alumno WHERE nivelAlumn_id="+nivel_id);
        
        System.out.println("Lista de Alumnos:");
        while(rss.next()) {
            String nombre = rss.getString("nombre");
            String apellido = rss.getString("apellidos");
            compa_alumno = nombre+" "+apellido;
            System.out.println("Alumno: "+compa_alumno);
            
        }
        
        rss.close();
        
    }
    
    public void obtenerNotas(Login_alum obj) throws SQLException {  //Metodo que entrega notas + la asignatura. 
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/escuela", "root", password);
        Statement stmt = con.createStatement();
        AlumnoSQL aluSQL = new AlumnoSQL();
        idAlumno = Integer.toString(aluSQL.getIdAlum(obj));
        ResultSet rs = stmt.executeQuery("SELECT nota FROM nota WHERE alumno_id="+idAlumno);
        float nota = 0;
        int asignatura = 0;
        String nombre_asig = null;
        
        while(rs.next()) {
                nota = rs.getFloat("nota"); 
                System.out.println("Nota: "+nota);
            }
        
        rs.close();
        
        ResultSet rss = stmt.executeQuery("SELECT asignatura_id FROM nota WHERE alumno_id="+idAlumno);
        while(rss.next()) {
            asignatura = rss.getInt("asignatura_id");
            System.out.println("Asignatura: "+asignatura);
        }
        
        con.close();
        stmt.close();
        rss.close();
    }
    
    public void verProfesores(Login_alum obj) throws SQLException { //Codigo con problemas
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/escuela", "root", password);
        Statement stmt = con.createStatement();
        AlumnoSQL aluSQL = new AlumnoSQL();
        idAlumno = Integer.toString(aluSQL.getIdAlum(obj));
        ResultSet rssss = null;
        ResultSet rs = stmt.executeQuery("SELECT nivelAlumn_id FROM alumno WHERE id="+idAlumno);
        String nivel_alumno = null, profesor_id = null, nombre_asig = null, nombre_profe = null, apellido_profe = null, nombreProfe = null;
        
        while(rs.next()) {
            nivel_alumno = Integer.toString(rs.getInt("nivelAlumn_id"));
        }
        
        rs.close();
        
        ResultSet rss = stmt.executeQuery("SELECT nombre FROM asignatura WHERE nivel_id="+nivel_alumno);
        while(rss.next()) {
            nombre_asig = rs.getString("nombre");
            System.out.println("Nombre de Asignatura: "+nombre_asig);
        }
        
        rss.close();
        
        ResultSet rsss = stmt.executeQuery("SELECT profesor_id FROM asignatura WHERE nivel_id="+nivel_alumno);
        while(rsss.next()) {
            profesor_id = Integer.toString(rsss.getInt("profesor_id"));
            rssss = stmt.executeQuery("SELECT nombre, apellidos FROM profesor WHERE id="+profesor_id);
            while(rssss.next()) {
                nombre_profe = rssss.getString("nombre");
                apellido_profe = rssss.getString("apellidos");
                nombreProfe = nombre_profe+" "+apellido_profe;
                System.out.println("Nombre profesor: "+nombreProfe);
            }
            
            
        }
        
        con.close();
        stmt.close();
        
       
        rsss.close();
        rssss.close();
        
        
    }
}
    




