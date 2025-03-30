package domain;

import java.util.List;

public class Inscripcion{
    private List<Materia> materias;
    private Alumno alumno;

    public Inscripcion(Alumno alumno, List<Materia> materias) {
        this.alumno = alumno;
        this.materias = materias;
    }

    public boolean aprobada(){return this.materias.stream().allMatch(materia -> materia.aprobada(this.alumno));}

}
