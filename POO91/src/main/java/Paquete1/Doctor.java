package Paquete1;

public class Doctor extends Persona {
    private String titulación;
    private int experiencia;

    public Doctor(String titulación, int experiencia, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.titulación = titulación;
        this.experiencia = experiencia;
    }

    public String getTitulación() {
        return titulación;
    }

    public int getExperiencia() {
        return experiencia;
    }
    
    public void curarLesión(){
        System.out.println("Se encuentra curando una lesión");
    }
    
        @Override
    public void partidoFutbol(){
        System.out.println("Esta ayudando en un Partido");
    }
    
    @Override
    public void entrenamiento(){
        System.out.println("Esta ayudando en el entrenando");
    }
}
