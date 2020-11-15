package Controlador;
import java.awt.event.*;
import modelo.Modelo;
import vista.Login;
import vista.Select_user;

public class CtrlLogin implements ActionListener {
    private Select_user selectUser; 
    private Login log;
    private Modelo model;
    
    public CtrlLogin(Select_user sel, Modelo mod, Login log) {
        selectUser = sel;
        model = mod;
        this.log = log;
        selectUser.Button_select_user01.addActionListener((ActionListener) this);
        selectUser.Button_select_user02.addActionListener((ActionListener) this);
        selectUser.Button_select_user03.addActionListener((ActionListener) this);
        this.log.Button_login.addActionListener((ActionListener) this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        model.setTextUser(log.Text_login01.getText());
        log.texto_prueba.setText(model.getTextUser());
        //System.out.println(model.getTextUser());
    }
    
    
    
}
