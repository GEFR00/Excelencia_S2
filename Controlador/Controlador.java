package Controlador;
import java.awt.event.*;
import java.util.*;
import vista.*;
import modelo.*;

public class Controlador {
   
    private Welcome viewWel;
    private Vista_profe viewProfe;
    private Vista_alum viewAlumno;
    private Vista_admin viewAdmin;
    private Select_user viewSelectUser;
    private Login viewLogin;
    private Modelo model; 
    
    public Controlador(Welcome viewWel){    //Controlador de prueba 
        this.viewWel = viewWel;
       
    }
    public void iniciar() {
        viewWel.setVisible(true); 
    }

}
