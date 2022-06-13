package Paquete1;

public abstract class Poligono {
    protected int numeroLados;

    public Poligono(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    @Override
    public String toString() {
        return "El numero de Lados es de:" + numeroLados;
    }
    
    public abstract double area();
}
