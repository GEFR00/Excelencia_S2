package modelo;
public class Nivel {
    //Atributos
    private String nivel, curso, aula;
    private int id;
    
    public Nivel(String nivel, String curso, String aula, int id) {
        this.nivel = nivel;
        this.curso = curso;
        this.aula = aula;
        this.id = id;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
