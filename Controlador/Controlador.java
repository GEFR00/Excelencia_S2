package Controlador;
import DAO.MySQL.AlumnoSQL;
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
    private AlumnoSQL alusql;
    
    public Controlador(Welcome viewWel){    //Controlador de prueba 
        this.viewWel = viewWel;
       
    }
    public void iniciar() {
        viewWel.setVisible(true); 
    }
    
    public void comprueba(Login_alum alum, Login_admin admin, Login_profe profe) {
        if(alum.texto_alum().equals("luxo666@hotmail.com")) {
            alusql.verifica(alum);
        } else {
            System.out.println("Inválido");
        }
        
    }

}
