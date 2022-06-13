package Paquete1;

public class Atleta {
    private String nombre;
    private int numero;
    private float tiempo;  
    
    public Atleta(String nombre, int numero, float tiempo) {
        this.nombre = nombre;
        this.numero = numero;
        this.tiempo = tiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumero() {
        return numero;
    }
    
    public float getTiempo() {
        return tiempo;
    }
    
    public String mostrarDatos(){
        return "Nombre del atleta: "+nombre+"\nCon el numero de atleta: "+numero+"\nY se tardo: "+tiempo"\n";
    }
    
}