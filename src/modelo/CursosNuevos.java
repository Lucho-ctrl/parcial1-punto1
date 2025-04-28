package modelo;

import java.util.ArrayList;
import java.util.List;

public class CursosNuevos implements Observer{

    public List<Subjecto> subjects = new ArrayList<>();
    public List<String> cursos = new ArrayList<>();


    public CursosNuevos(){
        
    }

    @Override
    public void newSubject(Subjecto subject) {
        // TODO Auto-generated method stub
        subjects.add(subject);
    }

    @Override
    public void notifyAllSubjects(String curso) {
        // TODO Auto-generated method stub
        for(Subjecto subject : subjects){
            subject.display(curso);
        }
    }

    @Override
    public void nuevoCurso(String cursoNuevo){
        cursos.add(cursoNuevo);
        notifyAllSubjects(cursoNuevo);
    }
    
    
    
    
}
