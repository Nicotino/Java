package Paquete1;

import javax.swing.JOptionPane;

public class NewMain {

    public static void main(String[] args) {
        int cantAtletas;
        String nombre;
        int numero;
        float tiempo;
        float aux;
        int aux2;
        String aux3;
        
        
        cantAtletas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos atletas hay"));
        
        Atleta deportista [] = new Atleta [cantAtletas];
        
        for (int i=0; i<cantAtletas; i++){
            JOptionPane.showMessageDialog(null,"Ingrese las carracteristicas del Atleta "+(i+1));
            nombre = JOptionPane.showInputDialog("Ingrese el nombre del Atleta");
            numero =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de atleta"));
            tiempo =Float.parseFloat(JOptionPane.showInputDialog("Ingrese el tiempo que tardo en recorrer"));
            
            deportista [i] = new Atleta (nombre, numero, tiempo);
        }
        for (int i=0; i<(cantAtletas-1); i++){
            for (int j=0; j<(cantAtletas-1); j++){
                if (deportista[j].getTiempo()>deportista[j+1].getTiempo()){
                aux = deportista[j].getTiempo();
                aux2 = deportista[j].getNumero();
                aux3 = deportista[j].getNombre();
                
                deportista[j] = deportista[j+1];
                deportista[j+1] = new Atleta (aux3, aux2, aux);
                }
            }
        }
        System.out.println(deportista[0].mostrarDatos());
    }
}