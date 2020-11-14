package ejecuta;
import Controlador.Controlador;
import modelo.ConexionBDEscuela;
import vista.*;

public class Main {
    public static void main(String[] args) {
        
        Welcome vistaWel = new Welcome();
        ConexionBDEscuela startconexion = new ConexionBDEscuela();
        Controlador ctrl = new Controlador(vistaWel);
        
        startconexion.getConexion();
        ctrl.iniciar();
        
    }
}
