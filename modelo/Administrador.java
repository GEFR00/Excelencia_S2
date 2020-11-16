package modelo;
public class Administrador {
    //Atributos
    private String login, email, clave;
    private int id;
    
    public Administrador(String login, String email, String clave, int id) {
        this.clave = clave;
        this.login = login;
        this.email = email;
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    
    
}
