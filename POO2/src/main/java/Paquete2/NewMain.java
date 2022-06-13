package Paquete2;

import javax.swing.JOptionPane;

public class NewMain {
    
    public static int indiceCarroBarato(Vehiculo carros[]){
        float precio;
        int indice = 0;
        
        precio = carros[0].getPrecio();
        
        for (int i=1; i<carros.length;i++){
            if (carros[i].getPrecio()<precio){
                precio = carros[i].getPrecio();
                indice =1;
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        String marca, modelo;
        float precio;
        int numVehiculos;
        int indiceBarato;
        
        numVehiculos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos vehiculos hay"));
        
        //Creamos los objetos para los carros
        Vehiculo carros [] = new Vehiculo [numVehiculos];
        
        for (int i=0; i<numVehiculos; i++){
            JOptionPane.showMessageDialog(null,"Ingrese las carracteristicas del carro"+(i+1));
            marca = JOptionPane.showInputDialog("Ingrese la marca del carro");
            modelo =JOptionPane.showInputDialog("Ingrese el modelo del carro");
            precio =Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio del vehiculo"));
            
            carros [i] = new Vehiculo (marca, modelo, precio);
        }
        indiceBarato = indiceCarroBarato(carros);
        System.out.println("El carro mas barato es: ");
        System.out.println(carros[indiceBarato].mostrarDatos());
    }
}
