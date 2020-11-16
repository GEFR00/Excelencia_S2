package DAO.MySQL;
import DAO.AdminDAO;
import java.sql.*;
import java.util.List;
import modelo.Administrador;
import vista.*;

public class AdminSQL implements AdminDAO{

    private String login = "GerardoAD";
    private Connection con;
    final String VERIFICA = "SELECT login FROM administrador"; //cambiar y usar id
    private String password = "Jugarplay2";
    
    //Comienzo de sentencias SQL
    //Metodos para realizar CRUD
    
    @Override
    public void insertar(Administrador obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Administrador> obtenerTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Administrador obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar(Administrador obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Administrador obtener(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean verificaAdmin(Login_admin obj) throws SQLException {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/escuela", "root", password);
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(VERIFICA);
        boolean encontrado = false;
        
        while(rs.next()) {
            if(rs.getString("login").equals(obj.TextAdmin())) {
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
