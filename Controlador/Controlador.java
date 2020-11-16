package Controlador;
import vista.*;

public class Controlador {
   
    private Welcome viewWel;
  
    public Controlador(Welcome viewWel){  
        this.viewWel = viewWel;  
    }
    
    public void iniciar() {
        viewWel.setVisible(true);

    }
   
}
