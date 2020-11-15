package DAO.MySQL;
import DAO.ProfesorDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import modelo.Profesor;
import vista.Login_profe;

public class ProfesorSQL implements ProfesorDAO {
    private String login = "MariFer_profe";
    private Connection con;
    final String VERIFICA = "SELECT login FROM profesor"; //cambiar y usar id

    //Sentencias SQL
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
    
    public boolean verificaProfe(Login_profe obj) throws SQLException {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/escuela", "root", "1234");
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



    
    
}
