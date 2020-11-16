package Controlador;
import java.awt.event.*;
import javax.swing.JTextField;
import modelo.Modelo;
import vista.Login_alum;
import vista.Select_user;

public class CtrlLogin {
    private Select_user selectUser; 
    private Login_alum log;
    private Modelo model;
    
    public CtrlLogin(Select_user sel, Modelo mod, Login_alum log) {
        selectUser = sel;
        model = mod;
        this.log = log;
    }
    
    public void guardaInput(Login_alum obj) {
        ActionListener escucha = new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setTextUser(obj.Text_login_alum01.getText());
                System.out.println("Input: "+model.getTextUser());
            }
        };
        
        obj.Button_login_alum.addActionListener(escucha);
    }
    
   
    
    
    
}
