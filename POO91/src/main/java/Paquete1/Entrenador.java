package Paquete1;

public class Entrenador extends Persona{
    private String estrategia;

    public Entrenador(String estrategia, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.estrategia = estrategia;
    }

    public String getEstrategia() {
        return estrategia;
    }
    
    public void planificarEtrenamiento(){
        System.out.println("Esta planificando el entrenamiento");
    }
    
        @Override
    public void partidoFutbol(){
        System.out.println("Esta liderando el Partido");
    }
    
    @Override
    public void entrenamiento(){
        System.out.println("Esta organizando un entrenamiento");
    }
}
