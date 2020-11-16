package DAO.MySQL;
import DAO.ProfesorDAO;
import java.sql.*;
import java.util.List;
import modelo.Profesor;
import vista.Login_profe;

public class ProfesorSQL implements ProfesorDAO {
    private String login = "MariFer_profe";
    private Connection con;
    final String VERIFICA = "SELECT login FROM profesor";
    final String VERPROFES = "SELECT nombre, apellidos FROM profesor"; //cambiar y usar id
    final String OBTENID = "SELECT * FROM profesor";
    String idProfe = null;
    private String password = "Jugarplay2";

    //Comienzo de sentencias SQL
    //Metodos para realizar CRUD
    @Override
    public void insertar(Profesor alum) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Profesor> obtenerTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Profesor alum) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar(Profesor alum) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Profesor obtener(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //------------------------ METODOS --------------------------------
    public boolean verificaProfe(Login_profe obj) throws SQLException { //Metodo que verifica el Login del profesor 
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/escuela", "root", password);
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(VERIFICA);
        boolean encontrado = false;
        
        while(rs.next()) {
            if(rs.getString("login").equals(obj.TextProfe())) {
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
    
    public int getIdProfesor(Login_profe obj) throws SQLException { //Metodo que entrega el ID del profesor. 
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/escuela", "root", password);
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(OBTENID);
        int id = 0;
        while(rs.next()) {
            if(rs.getString("login").equals(obj.TextProfe())) {
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
    
    public void listaProfesores(Login_profe obj) throws SQLException { //Metodo que muestra a todos los profesores. 
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/escuela", "root", password);
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(VERPROFES);
        String nombre, apellido, profesor;
        
        System.out.println("Profesores de Excelencia: ");
        while(rs.next()) {
            nombre = rs.getString("nombre");
            apellido = rs.getString("apellidos");
            profesor = nombre+" "+apellido;
            System.out.println("Profesor: "+profesor);
        }    
    }
    
    public void verListaAlumnos(Login_profe obj) throws SQLException { //Metodo que muestra a los alumnos según asignatura del profesor. 
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/escuela", "root", password);
        Statement stmt = con.createStatement();
        ProfesorSQL profeSQL = new ProfesorSQL();
        idProfe = Integer.toString(profeSQL.getIdProfesor(obj));
        ResultSet rs = stmt.executeQuery("SELECT nivel_id FROM asignatura WHERE profesor_id="+idProfe);
        String nombre_alumno, apellido_alumno,alumno, nivel_id = null;
        
        while(rs.next()) {
            nivel_id = Integer.toString(rs.getInt("nivel_id"));
        }
        
        ResultSet rss = stmt.executeQuery("SELECT nombre, apellidos FROM  alumno WHERE nivelAlumn_id="+nivel_id);
        System.out.println("Alumnos de su clase: ");
        while(rss.next()) {
            nombre_alumno = rss.getString("nombre");
            apellido_alumno = rss.getString("apellidos");
            alumno = nombre_alumno+" "+apellido_alumno;
            System.out.println(alumno);
        }
    }

}
