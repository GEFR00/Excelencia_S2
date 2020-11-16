package modelo;
public class Alumno {
    //Atributos
    private String nombre, apellido, login, clave;
    private int id;
    
    public Alumno(String nombre, String Apellido, String login, String clave, int id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.login = login;
        this.clave = clave;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
 
}
