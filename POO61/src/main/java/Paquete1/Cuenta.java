package Paquete1;

public class Cuenta {
    private int nomCuenta;
    private float retirarDinero;
    private float ingresarDinero;
    private float saldo;

    public Cuenta(int nomCuenta, float saldo) {
        this.nomCuenta = nomCuenta;
        this.saldo = saldo;
    }

    public int getNomCuenta() {
        return nomCuenta;
    }

    public float getSaldo() {
        return saldo;
    }
    
    
}
