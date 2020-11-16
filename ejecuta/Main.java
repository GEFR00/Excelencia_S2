package ejecuta;
import Controlador.*;
import DAO.MySQL.AlumnoSQL;
import DAO.MySQL.ProfesorSQL;
import java.sql.SQLException;
import modelo.ConexionBDEscuela;
import vista.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        
        Welcome vistaWel = new Welcome();
        ConexionBDEscuela con = new ConexionBDEscuela();
        Controlador ctrl = new Controlador(vistaWel);
        AlumnoSQL ejeSQL = new AlumnoSQL();
        Login_alum logAlum = new Login_alum();
        Login_profe logProfe = new Login_profe();
        ProfesorSQL ejeProfeSQL = new ProfesorSQL();
        
        con.getConexion();
        ctrl.iniciar();
        System.out.println(ejeSQL.getIdAlum(logAlum));
        ejeSQL.obtenerNotas(logAlum);
        ejeSQL.imprimeLista(logAlum);
        ejeProfeSQL.listaProfesores(logProfe);
        ejeProfeSQL.verListaAlumnos(logProfe);
 
    }
}
