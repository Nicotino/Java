package Paquete1;

public class Paquete {
    private int numReferencia;
    private String DPI;
    private double peso;
    private int prioridad;
    private double costo;

    public Paquete(int numReferencia, String DPI, double peso, int prioridad,double costo) {
        this.numReferencia = numReferencia;
        this.DPI = DPI;
        this.peso = peso;
        this.prioridad = prioridad;
        this.costo = costo;
    }

    public int getNumReferencia() {
        return numReferencia;
    }

    public String getDPI() {
        return DPI;
    }

    public double getPeso() {
        return peso;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public double getCosto() {
        return costo;
    }
 
}
