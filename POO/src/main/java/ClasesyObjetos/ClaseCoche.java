
package ClasesyObjetos;

public class ClaseCoche {
    //Atributos
String color;
String marca;
int km;
    public static void main (String [] arg){
        ClaseCoche coche1 = new ClaseCoche();
        coche1.color = "Blanco";
        coche1.marca = "Honda";
        coche1.km = 10;
        
        System.out.println("El color del coche es: "+coche1.color);
        System.out.println("La marca del coche es: "+coche1.marca); 
        System.out.println("Los Kilometros recorridos del coche es: "+coche1.km);
        
        ClaseCoche coche2 = new ClaseCoche();
        coche2.color = "Azul";
        coche2.marca = "Ferrari";
        coche2.km = 0;
        
        System.out.println("El color del coche 2 es: "+coche2.color);
        System.out.println("La marca del coche 2 es: "+coche2.marca); 
        System.out.println("Los Kilometros recorridos del coche 2 es: "+coche2.km);
        
    }
}
