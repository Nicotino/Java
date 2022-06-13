package Paquete1;

public class Futbolista extends Persona {
    private int dorsal;
    private String posición;

    public Futbolista(int dorsal, String posición, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.dorsal = dorsal;
        this.posición = posición;
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getPosición() {
        return posición;
    }
    
    public void entrevista(){
        System.out.println("Dio una entrevista");
    }
    
    @Override
    public void partidoFutbol(){
        System.out.println("Esta jugando un Partido");
    }
    
    @Override
    public void entrenamiento(){
        System.out.println("Esta entrenando");
    }
}
