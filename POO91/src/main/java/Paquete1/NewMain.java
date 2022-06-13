package Paquete1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class NewMain {
    static ArrayList <Persona> persona = new ArrayList <Persona>();
    
    static Persona futbolista1 = new Futbolista (19,"Delantero", "Dieguito", "Maradona", 29);
    static Persona entrenador = new Entrenador ("Defender porteria", "Hugo", "Sanchez", 56);
    static Persona doctor = new Doctor ("Licenciado en Fisioterapia", 10, "Benito", "Camela", 40);
    
    public static void main(String[] args) {
        persona.add(futbolista1);
        persona.add(doctor);
        persona.add(entrenador);
        
        byte opción;
        do{
            opción = Byte.parseByte(JOptionPane.showInputDialog("Ingrese la opción que desee"
                    + "\n1: Viajar"
                    + "\n2: Entrenamiento"
                    + "\n3: Partido de Futball"
                    + "\n4: Planificar Entrenamiento"
                    + "\n5: Entrevista"
                    + "\n6: Curar lesión"
                    + "\n7: Salir"));
            
            switch (opción){
                case 1: 
                    viajar();
                    break; 
                case 2:
                    entrenar();
                    break;
                case 3:
                    partidoFutball();
                    break;
                    
                case 4:
                    planificarEntrenamiento();
                    break;
                    
                case 5:
                    entrevista();
                    break;
                    
                case 6:
                    curarLesión();
                    break;
                    
                case 7:
                    break;
                    
                default: 
                    System.out.println("Mi loco esa opción no esta disponible");
            }
        }while (opción!=7);
    }
    
    public static void viajar(){
        for (Persona equipo: persona){
            System.out.println(equipo.getNombre()+" "+equipo.getApellido()+" ->");
            equipo.viajar();
        }
    }
    
    public static void entrenar(){
        for (Persona equipo: persona){
            System.out.println(equipo.nombre+" "+equipo.apellido+" ->");
            equipo.entrenamiento();
        }
    }
    
    public static void partidoFutball(){
        for (Persona equipo: persona){
            System.out.println(equipo.nombre+" "+equipo.apellido+" ->");
            equipo.partidoFutbol();
        }
    }
    
    public static void planificarEntrenamiento(){
        System.out.println(entrenador.getNombre()+" "+entrenador.getApellido()+" ->");
        ((Entrenador)entrenador).planificarEtrenamiento();
    }
    
    public static void entrevista(){
        System.out.println(futbolista1.getNombre()+" "+futbolista1.getApellido()+" ->");
        ((Futbolista)futbolista1).entrevista();
    }
    
    public static void curarLesión(){
        System.out.println(doctor.getNombre()+" "+doctor.getApellido()+" ->");
        ((Doctor)doctor).curarLesión();
    }
}
