package domain;

import java.util.List;

public class Materia {
    private String nombre;
    private List<Materia> correlativas;

    public Materia(String nombre, List<Materia> correlativas) {
        this.nombre = nombre;
        this.correlativas = correlativas;
    }

    public boolean aprobada(Alumno alumno) {
        return this.correlativas.stream().allMatch(materia -> materia.firmada(alumno));
    }

    private boolean firmada(Alumno alumno) {return alumno.aprobada(this.nombre);}
}
