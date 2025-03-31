package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inscripcion{
    private List<Materia> materias;
    private Alumno alumno;

    public Inscripcion(Alumno alumno) {
        this.alumno = alumno;
        this.materias = new ArrayList<>();
    }

    public void agregarMateriaAInscripcion(Materia ... materias){Collections.addAll(this.materias,materias);}
    public boolean aprobada(){return this.materias.stream().allMatch(materia -> materia.aprobada(this.alumno));}

}
