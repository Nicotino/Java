package Paquete1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class NewMain {
    
    static ArrayList <Poligono> poligono = new ArrayList<Poligono>();
    
    public static void main(String[] args) {
        int opción;
        double lado1;
        double lado2;
        double lado3;
        char siNo = 0;
        char salir=0;
        do {
            do{
                do{
                    opción = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opción que desee aplicar"
                    + "\n1: Triangulo"
                    + "\n2: Rectangulo"));
                
            }while (opción<1 || opción>2);
            
            switch (opción){
                case 1:
                    ladosTriangulo();
                    siNo= JOptionPane.showInputDialog("¿Desea ingresar otro Poligono? "
                            + "\nOprima s para ingresar un nuevo Poligono"
                            + "\nOprima cualquier otra tecla para continuar").charAt(0);
                    break;
                case 2:
                    ladosRectangulo();
                    siNo= JOptionPane.showInputDialog("¿Desea ingresar otro Poligono? "
                            + "\nOprima s para ingresar un nuevo Poligono"
                            + "\nOprima cualquier otra tecla para continuar").charAt(0);
            }
            
        }while(siNo=='s'|| siNo=='S');
            for (Poligono poli: poligono){
                JOptionPane.showMessageDialog(null,poli.toString());
                JOptionPane.showMessageDialog(null,"El area es de: "+poli.area()); 
            }
            salir= JOptionPane.showInputDialog("¿Desea comenzar de nuevo?"
                        + "\n1: Oprima s para reinicar el programa"
                        + "\n2: Oprima cualquier tecla para terminar").charAt(0);
            
        }while(salir=='s' || salir=='S');
    }
    public static void ladosTriangulo(){
        double lado1,lado2,lado3;
        lado1= Double.parseDouble(JOptionPane.showInputDialog("Ingrese cuanto vale el primer lado de su triangulo"));
        lado2= Double.parseDouble(JOptionPane.showInputDialog("Ingrese cuanto vale el segundo lado de su triangulo"));
        lado3= Double.parseDouble(JOptionPane.showInputDialog("Ingrese cuanto vale el tercer lado de su triangulo"));
        Triangulo lados = new Triangulo(lado1,lado2,lado3);
        poligono.add(lados);
    }
    public static void ladosRectangulo(){
        double lado1,lado2;
        lado1= Double.parseDouble(JOptionPane.showInputDialog("Ingrese cuanto vale el primer lado de su rectangulo"));
        lado2= Double.parseDouble(JOptionPane.showInputDialog("Ingrese cuanto vale el segundo lado de su rectangulo"));
        Rectangulo lados = new Rectangulo(lado1,lado2);
        poligono.add(lados);
    }
}
