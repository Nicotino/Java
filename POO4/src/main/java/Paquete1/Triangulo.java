package Paquete1;

public class Triangulo {
    private float lados;
    private float base;

    public Triangulo(float lados, float base) {
        this.lados = lados;
        this.base = base;
    }

    public float getLados() {
        return lados;
    }

    public float getBase() {
        return base;
    }
    
    public float areaTriangulo(){
        return (float) ((Math.sqrt(Math.pow(lados,2)-(Math.pow(base,2)/4))*(base))/2 );
    }
    public float perimetroTriangulo(){
        return (2*lados)+base;
    }
}
