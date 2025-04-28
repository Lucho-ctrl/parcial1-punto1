package modelo;

public class Andrea implements Subjecto{

    @Override
    public void display(String curso) {
        System.out.println("Nuevo curso creado: " + curso + " para Andrea");
    }
    
}
