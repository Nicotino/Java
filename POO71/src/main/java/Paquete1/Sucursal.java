package Paquete1;

public class Sucursal {
    private int numSucursal;
    private String dirección;
    private String ciudad;

    public Sucursal(int numSucursal, String dirección, String ciudad) {
        this.numSucursal = numSucursal;
        this.dirección = dirección;
        this.ciudad = ciudad;
    }

    public int getNumSucursal() {
        return numSucursal;
    }

    public String getDirección() {
        return dirección;
    }

    public String getCiudad() {
        return ciudad;
    }
}
