package modelo;
public class Nota {
    //Atributos
    private String trimestre;
    private double nota;
    private int id, asignatura_id, alumno_id;
    
    public Nota(String trimestre, double nota, int id, int asignatura_id, int alumno_id) {
        this.trimestre = trimestre;
        this.nota = nota;
        this.id = id;
        this.asignatura_id = asignatura_id;
        this.alumno_id = alumno_id;
    }

    public String getTrimestre() {
        return trimestre;
    }

    public void setTrimestre(String trimestre) {
        this.trimestre = trimestre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAsignatura_id() {
        return asignatura_id;
    }

    public void setAsignatura_id(int asignatura_id) {
        this.asignatura_id = asignatura_id;
    }

    public int getAlumno_id() {
        return alumno_id;
    }

    public void setAlumno_id(int alumno_id) {
        this.alumno_id = alumno_id;
    }
}
