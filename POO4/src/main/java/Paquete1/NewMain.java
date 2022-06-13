package Paquete1;

import javax.swing.JOptionPane;

public class NewMain {
    
    public static void main(String[] args) {
        float base;
        float lados;
        float aux, aux2;
        
        int numTriangulos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de triangulos que va a ingrasar"));
        Triangulo triangulos [] = new Triangulo [numTriangulos];
        
        for (int i=0; i<numTriangulos; i++){
            JOptionPane.showMessageDialog(null,"Ingrese las carracteristicas de su triangulo isoseles "+(i+1));
            base =Float.parseFloat(JOptionPane.showInputDialog("Ingrese la base de su triangulo"));
            lados =Float.parseFloat(JOptionPane.showInputDialog("Ingrese los lados de su triangulo"));
            
            triangulos [i] = new Triangulo (lados,base);
            
            System.out.println("El perimetro del triangulo "+(i+1)+" es "+triangulos[i].perimetroTriangulo()+"u");
            System.out.println("El area del triangulo "+(i+1)+" es "+triangulos[i].areaTriangulo()+"u^2");
        }
        
        for (int i=0; i<(numTriangulos-1); i++){
            for (int j=0; j<(numTriangulos-1); j++){
                if (triangulos[j].areaTriangulo()>triangulos[j+1].areaTriangulo()){
                    aux = triangulos[j].getLados();
                    aux2 = triangulos[j].getBase();
                    
                    triangulos[j] = triangulos [j+1];
                    triangulos [j+1] = new Triangulo (aux, aux2);
                }
            }
        }
        System.out.println("El trinagulo con mayor area es de; "+triangulos[numTriangulos-1].areaTriangulo()+"u^2");
    }
    
}
