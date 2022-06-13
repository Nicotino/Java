package Paquete1;

public class NumeroComplejo {
    private float a;
    private float b;
    
    public NumeroComplejo(float a, float b) {
        this.a = a;
        this.b = b;
    }
    
    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }
    
    public NumeroComplejo calcularSuma(NumeroComplejo c){
        NumeroComplejo suma = new NumeroComplejo(a+c.getA(), b+c.getB());
        return suma;
    }
    
    public NumeroComplejo calcularProducto (NumeroComplejo c){
        NumeroComplejo mult = new NumeroComplejo ((a*c.getA()-b*c.getB()),(a*c.getB()*+b*c.getA()));
        return mult;
    }
    public NumeroComplejo enteroComplejo (int x){
        NumeroComplejo mult = new NumeroComplejo (a*x,b*x);
        return mult;
        
    }
}
