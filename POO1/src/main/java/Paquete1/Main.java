package Paquete1;
import javax.swing.JOptionPane;
public class Main {
    public static void main (String[] arg){
        Tablero op = new Tablero ();
        op.getAbajo();
        op.getAbajo2();
        op.getArriba();
        op.getArriba2();
        op.getDerecha();
        op.getDerecha2();
        op.getIzquierda();
        op.getIzquierda2();
        op.getSalir();
        op.getSalir2();
        
        int x=0;
        int y=0;
        
        boolean salir = false;
        
        do{
            char posición = JOptionPane.showInputDialog("Seleccione la alguna de las siguientes teclas \nW = Subir \nS = Bajar \nA = Izquierda \nD = Derecha \nQ = Salir").charAt(0);
            if (posición == op.getAbajo() || posición == op.getAbajo2()){
                y--;
                System.out.println("La posición (X,Y) cambio a: ["+x+"]"+"["+y+"]");
            }else if (posición == op.getArriba() || posición == op.getArriba2()){
                y++;
                System.out.println("La posición (X,Y) cambio a: ["+x+"]"+"["+y+"]");
            }else if (posición == op.getIzquierda() || posición == op.getIzquierda2()){
                x--;
                System.out.println("La posición (X,Y) cambio a: ["+x+"]"+"["+y+"]");
            }else if (posición == op.getDerecha() || posición == op.getDerecha()){
                x++;
                System.out.println("La posición (X,Y) cambio a: ["+x+"]"+"["+y+"]");
            }else if (posición == op.getSalir() || posición == op.getSalir2()){
                salir = true;
            }else {
                System.out.println("Bro, esa tecla no esta en el menu");
            }
           
        } while (salir == false);
        
    }
}