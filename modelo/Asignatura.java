package modelo;
public class Asignatura {
    //Atributos
    private String nombre;
    private int nivel_id, profesor_id;
    
    public Asignatura(String nombre, int nivel_id, int profesor_id) {
        this.nombre = nombre;
        this.nivel_id = nivel_id;
        this.profesor_id = profesor_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel_id() {
        return nivel_id;
    }

    public void setNivel_id(int nivel_id) {
        this.nivel_id = nivel_id;
    }

    public int getProfesor_id() {
        return profesor_id;
    }

    public void setProfesor_id(int profesor_id) {
        this.profesor_id = profesor_id;
    }
    
    
}
