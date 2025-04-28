package control;

import modelo.*;

public class Control {

    public Subjecto Andrea;
    public Subjecto LuzDary;
    public Subjecto LauraMolina;

    public CursosNuevos cursosNuevos;

    public String nuevoCursoDisponible;

    public Control(){
        crearSubjects();
        crearObserver();
        agregarSubjects();
        crearCurso1();
        crearCurso2();
        crearCurso3();
    }

    public void crearSubjects(){
        Andrea = new Andrea();
        LuzDary = new LuzDary();
        LauraMolina = new LauraMolina();
    }

    public void crearObserver(){
        cursosNuevos = new CursosNuevos();
    }

    public void agregarSubjects(){
        cursosNuevos.newSubject(Andrea);
        cursosNuevos.newSubject(LuzDary);
        cursosNuevos.newSubject(LauraMolina);
    }

    public void crearCurso1(){
        nuevoCursoDisponible = "Matematicas";
        cursosNuevos.nuevoCurso(nuevoCursoDisponible);
    }

    public void crearCurso2(){
        nuevoCursoDisponible = "I.A.";
        cursosNuevos.nuevoCurso(nuevoCursoDisponible);
    }

    public void crearCurso3(){
        nuevoCursoDisponible = "Periodista";
        cursosNuevos.nuevoCurso(nuevoCursoDisponible);
    }
}
