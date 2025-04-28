package modelo;

public interface Observer {
    //public void suscribir();
    public void newSubject(Subjecto subject);
    public void notifyAllSubjects(String curso);
    public void nuevoCurso(String cursoNuevo);
}
