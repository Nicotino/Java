package Paquete1;

import javax.swing.JOptionPane;

public class NewMain {

    public static void main(String[] args) {
        int opcion,entero;
        float a,b,c,d;
        NumeroComplejo numero1,numero2,suma,mult;
        
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese que opción que desee hacer:"
                    + "\n1: Sumar 2 numeros complejos"
                    + "\n2: Multiplicar 2 numeros complejos"
                    + "\n3: Comparar 2 numeros complejos"
                    + "\n4: Multiplicar un entero con un numero complejo"
                    + "\n5: Salir"));
            switch (opcion){
                case 1: 
                    a = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la parte real del primer número"));
                    b = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la parte imaginaria del primer número"));
                    System.out.println("El primer número complejo es Z1= "+a+"+"+b+"i");
                    
                    c = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la parte real del segundo número"));
                    d = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la parte imaginaria del segundo número"));
                    System.out.println("El segundo número complejo es Z2= "+c+"+"+d+"i");
                    numero1 = new NumeroComplejo(a,b);
                    numero2 = new NumeroComplejo(c,d);
                    suma = numero1.calcularSuma(numero2);
                    System.out.println("La suma de los numeros es X1: "+ suma.getA()+"+"+suma.getB()+"i");
                    break;
                    
                case 2:
                    a = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la parte real del primer número"));
                    b = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la parte imaginaria del primer número"));
                    System.out.println("El primer número complejo es Z1= "+a+"+"+b+"i");
                    
                    c = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la parte real del segundo número"));
                    d = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la parte imaginaria del segundo número"));
                    System.out.println("El segundo número complejo es Z2= "+c+"+"+d+"i");
                    numero1 = new NumeroComplejo(a,b);
                    numero2 = new NumeroComplejo(c,d);
                    mult = numero1.calcularProducto(numero2);
                    System.out.println("El producto de los numeros complejos es X1: "+ mult.getA()+"+"+mult.getB()+"i");
                    break;
                    
                case 3:
                    a = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la parte real del primer número"));
                    b = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la parte imaginaria del primer número"));
                    System.out.println("El primer número complejo es Z1= "+a+"+"+b+"i");
                    
                    c = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la parte real del segundo número"));
                    d = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la parte imaginaria del segundo número"));
                    System.out.println("El segundo número complejo es Z2= "+c+"+"+d+"i");
                    numero1 = new NumeroComplejo(a,b);
                    numero2 = new NumeroComplejo(c,d);
                    
                    if ((numero1.getA() == numero2.getA()) && (numero1.getB() == numero2.getB())){
                        System.out.println("Los numeros complejos son iguales");
                    } else{
                        System.out.println("Los numeros complejos no son iguales");
                    }
                    break;
                    
                case 4:
                    a = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la parte real del primer número"));
                    b = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la parte imaginaria del primer número"));
                    System.out.println("El primer número complejo es Z1= "+a+"+"+b+"i");
                    
                    entero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el entero que desee multiplicar"));
                    
                    numero1 = new NumeroComplejo(a,b);
                    
                    mult = numero1.enteroComplejo(entero);
                    System.out.println("El producto de los numeros complejos es X1: "+ mult.getA()+"+"+mult.getB()+"i");
                    
                    break;
            }
        }while (opcion != 5);
        
    }
    
}
