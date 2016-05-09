package pythonclasscreator;

public class Clases {
    String nombre;
    String atributos[]= new String[100];
    String metodos[]= new String[100];
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getAtributos() {
        return atributos;
    }

    public void setAtributos(String frase,String[] atributos) {
        
        this.atributos = atributos;
    }

    public String[] getMetodos() {
        return metodos;
    }

    public void setMetodos(String[] metodos) {
        this.metodos = metodos;
    }

    
    
}
