package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest {


    Materia analisis1 = new Materia("analisis 1");
    Materia analisis2 = new Materia("analisis 2");
    Materia fisica1 = new Materia("Fisica 1");
    Materia fisica2 = new Materia("Fisica 2");
    Materia fisica3 = new Materia("Fisica 3");
    Materia matematicaSuperior = new Materia("Matematica Superior");

    public void inicializarMateriasConCorrelativas(){
        analisis2.agregarCorrelativa(analisis1);
        fisica2.agregarCorrelativa(fisica1);
        matematicaSuperior.agregarCorrelativa(analisis2,fisica2);
        fisica3.agregarCorrelativa(fisica2);
    }

    Alumno juan = new Alumno("Juan");

    public void materiasAprobadasJuan(){
        juan.agregarMateriaAAprobadas(analisis1,fisica1);
    }

    Inscripcion alternativa1 = new Inscripcion(juan);

    @Test
    public void hacerInscripcionDesprobadaJuan(){
        this.materiasAprobadasJuan();
        this.inicializarMateriasConCorrelativas();
        alternativa1.agregarMateriaAInscripcion(fisica3);
        Assertions.assertFalse(alternativa1.aprobada());
    }

    @Test
    public void hacerInscripcionAesprobadaJuan(){
        this.materiasAprobadasJuan();
        this.inicializarMateriasConCorrelativas();
        alternativa1.agregarMateriaAInscripcion(fisica2);
        Assertions.assertTrue(alternativa1.aprobada());
    }

}