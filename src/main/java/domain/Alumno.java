package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Alumno{
    private String nombre;
    private List<Materia> aprobadas;

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.aprobadas = new ArrayList<>();
    }

    public void agregarMateriaAAprobadas(Materia ... materias){Collections.addAll(this.aprobadas, materias);}

    public boolean aprobada(Materia materia) {return this.aprobadas.contains(materia);}
}

