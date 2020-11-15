package ejecuta;
import Controlador.*;
import modelo.ConexionBDEscuela;
import modelo.*;
import vista.*;

public class Main {
    public static void main(String[] args) {
        
        Welcome vistaWel = new Welcome();
        Select_user selectUser = new Select_user();
        Modelo model = new Modelo();
        Login_admin logadmin = new Login_admin();
        Login_alum logalum = new Login_alum();
        Login_profe logprofe = new Login_profe();
        ConexionBDEscuela startconexion = new ConexionBDEscuela();
        Controlador ctrl = new Controlador(vistaWel);

        
        startconexion.getConexion();
        ctrl.iniciar();
        ctrl.comprueba(logalum, logadmin, logprofe);
        
        
    }
}
