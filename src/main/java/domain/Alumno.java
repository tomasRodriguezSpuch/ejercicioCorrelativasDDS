package domain;

import java.util.List;

public class Alumno{
    private String nombre;
    private List<Materia> aprobadas;
    private List<Materia> materiasAIncribirse;

    public Alumno(String nombre, List<Materia> aprobadas) {
        this.nombre = nombre;
        this.aprobadas = aprobadas;
    }

    public void agregarMateriaAInscripcion(Materia materia){this.materiasAIncribirse.add(materia);}

    public void hacerInscripcion(Materia ... materias){Inscripcion inscripcion = new Inscripcion(this, this.materiasAIncribirse);}

    public boolean aprobada(String materia) {return this.aprobadas.contains(materia);}
}

