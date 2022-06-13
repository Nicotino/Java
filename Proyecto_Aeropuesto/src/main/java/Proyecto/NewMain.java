package Proyecto;

import java.util.Scanner;

public class NewMain {
    static Scanner  entrada = new Scanner(System.in);
    final static int num = 4; //Numero de Aeropuertos
    static Aeropuerto aeropuertos [] = new Aeropuerto [num];
    
    public static void main(String[] args) {
        
        //Insertar datos de los Aeropuertos
        insertarDatosAeropuerto(aeropuertos);
        
        menu();
    }
    
    public static void insertarDatosAeropuerto(Aeropuerto aero[]){
        aero[0]= new AeropuertoPublico(80000000,"Aurora","Guatemala","Guatemala");
        aero[0].insertarCompañia(new Compañia("AeroGuate"));
        aero[0].insertarCompañia(new Compañia("Latam"));
        aero[0].getCompañia("AeroGuate").insertarVuelo(new Vuelo ("IB20","Guatemala","México",150.90,150));
        aero[0].getCompañia("AeroGuate").insertarVuelo(new Vuelo("IB21","Guatemala","New York",350.20,200));
        aero[0].getCompañia("Latam").insertarVuelo(new Vuelo("FC12","Guatemala","Londres",520.60,200));
        aero[0].getCompañia("AeroGuate").getVuelo("IB20").insertarPasajero(new Pasajero("Anderson","20BGHP","Guatemalteco"));
        aero[0].getCompañia("AeroGuate").getVuelo("IB20").insertarPasajero(new Pasajero("Maria","40POI","Salvadoreña"));
        aero[0].getCompañia("Latam").getVuelo("FC12").insertarPasajero(new Pasajero("Peter","56OKL","Aleman"));
        
        aero[1]= new AeropuertoPublico(45560000,"Luna de Xelaju","Quetzaltenango","Guatemala");
        aero[1].insertarCompañia(new Compañia("XelaVuelos"));
        aero[1].insertarCompañia(new Compañia("MexiVuelos"));
        aero[1].getCompañia("XelaVuelos").insertarVuelo(new Vuelo("IP20","Quetzaltenango","Guatemala",50.20,100));
        aero[1].getCompañia("XelaVuelos").insertarVuelo(new Vuelo("IP21","Quetzaltenango","San Salvador",80.40,100));
        aero[1].getCompañia("MexiVuelos").insertarVuelo(new Vuelo("CP20","Quetzaltenango","Mexico DF",120.60,200));
        aero[1].getCompañia("XelaVuelos").getVuelo("IP20").insertarPasajero(new Pasajero("Andy","20BGTL","Guatemalteco"));
        aero[1].getCompañia("XelaVuelos").getVuelo("IP21").insertarPasajero(new Pasajero("Mary","17PWI","Hondureña"));
        aero[1].getCompañia("MexiVuelos").getVuelo("CP20").insertarPasajero(new Pasajero("Pedro","30POL","Mexicano"));
        
        aero[2]= new AeropuertoPublico(46564655,"Buena Paz","Veracruz","Mexico");
        aero[2].insertarCompañia(new Compañia("VeraVuelos"));
        aero[2].insertarCompañia(new Compañia("Chapincito"));
        aero[2].getCompañia("VeraVuelos").insertarVuelo(new Vuelo("MX2","Veracruz","Guatemal",150.20,160));
        aero[2].getCompañia("VeraVuelos").insertarVuelo(new Vuelo("MX3","Veracruz","California",280.40,100));
        aero[2].getCompañia("Chapincito").insertarVuelo(new Vuelo("XD01","Veracruz","Mexico DF",40.60,50));
        aero[2].getCompañia("VeraVuelos").getVuelo("MX2").insertarPasajero(new Pasajero("Dani","70BGTL","Guatemalteco"));
        aero[2].getCompañia("VeraVuelos").getVuelo("MX2").insertarPasajero(new Pasajero("Ale","17LKJ","Guatemalteco"));
        aero[2].getCompañia("Chapincito").getVuelo("XD01").insertarPasajero(new Pasajero("Laura","80HYI","Mexicana"));
        
        aero[3]= new AeropuertoPublico(46564655,"Pepsico","DF Mexico","Mexico");
        aero[3].insertarCompañia(new Compañia("MEXVuelos"));
        aero[3].insertarCompañia(new Compañia("EUVuelos"));
        aero[3].getCompañia("MEXVuelos").insertarVuelo(new Vuelo("DFM1","DF Mexico","Morelia",10.20,160));
        aero[3].getCompañia("MEXVuelos").insertarVuelo(new Vuelo("DFM2","DF Mexico","Chiapas",20.40,100));
        aero[3].getCompañia("EUVuelos").insertarVuelo(new Vuelo("EU1","DF Mexico","Mexico DF",340.60,250));
        aero[3].getCompañia("MEXVuelos").getVuelo("DFM2").insertarPasajero(new Pasajero("Nicolas","86KJU","Mexicano"));
        aero[3].getCompañia("MEXVuelos").getVuelo("DFM2").insertarPasajero(new Pasajero("Emily","75LOP","Mexicana"));
        aero[3].getCompañia("EUVuelos").getVuelo("EU1").insertarPasajero(new Pasajero("Sherlyn","12MKL","Mexicana"));
    }
    
    public static void menu(){
        int opción;
        String nombreAeropuerto,nombreCompañia,origen,destino;
        Aeropuerto aeropuerto;
        Compañia compañia;
        
        do{
            System.out.println("\t. :MENÚ:.");
            System.out.println("1. Ver Aeropuertos gestionados(Publicos o Privados)");
            System.out.println("2. Ver empresas(Privado) o subvención (publico)");
            System.out.println("3. Listas compañias de un Aeropuerto");
            System.out.println("4. Lista de vuelos por compañia");
            System.out.println("5. Listar posibles vuelos de Origen a Destino");
            System.out.println("6. Salir");
            
            System.out.println("Opción:");
            opción = entrada.nextInt();
            
            switch (opción){
                case 1:
                    mostrarDatosAeropuertos(aeropuertos);
                    break;
                    
                case 2:
                    mostrarPatrocinio(aeropuertos);
                    break;
                    
                case 3:
                    //Para resetear el Buffer
                    entrada.nextLine();
                    System.out.println("\nDigite el nombre del Aeropuerto: ");
                    nombreAeropuerto = entrada.nextLine();
                    aeropuerto = buscarAeropuerto(nombreAeropuerto, aeropuertos);
                    
                    if(aeropuerto == null){
                        System.out.println("El aeropuerto no existe");
                    }else{
                        mostrarCompañias(aeropuerto);
                    }
                    break;
                    
                case 4:
                    entrada.nextLine();
                    System.out.println("\nDigite el nombre de un Aeropuerto");
                    nombreAeropuerto = entrada.nextLine();
                    aeropuerto = buscarAeropuerto(nombreAeropuerto, aeropuertos);
                    
                    if(aeropuerto== null){
                        System.out.println("El aeropuerto no existe");
                    }else{
                        System.out.println("Digite el nombre de la compañia");
                        nombreCompañia = entrada.nextLine();
                        compañia = aeropuerto.getCompañia(nombreCompañia);
                        mostrarVuelos(compañia);
                    }
                    break;
                    
                case 5:
                    entrada.nextLine();
                    System.out.println("\nDigite la ciudad de Origen: ");
                    origen = entrada.nextLine();
                    
                    System.out.println("\nDigite la ciudad de Destino");
                    destino = entrada.nextLine();
                    
                    mostrarVueloOrigenDestino(origen, destino, aeropuertos);
                    break;
                    
                case 6:
                    break;
                    
                default:
                    System.out.println("Esa opción no esta disponible");
                    break;
            }
            
        }while(opción!=6);
    }
    
    public static void mostrarDatosAeropuertos(Aeropuerto aeropuertos[]){
        for (int i=0; i<aeropuertos.length; i++){
            //instanceof Analisa si aeropuerto es uno Privado o Publico
            if (aeropuertos[i] instanceof AeropuertoPrivado){
                System.out.println("\nAeropuerto Privado");
                System.out.println("Nombre: "+aeropuertos[i].getNombre());
                System.out.println("Ciudad: "+aeropuertos[i].getCiudad());
                System.out.println("Pais: "+aeropuertos[i].getPais());
            } else{
                System.out.println("\nAeropuerto Publico");
                System.out.println("Nombre: "+aeropuertos[i].getNombre());
                System.out.println("Ciudad: "+aeropuertos[i].getCiudad());
                System.out.println("Pais: "+aeropuertos[i].getPais());
            }
        }
    }
    
    public static void mostrarPatrocinio(Aeropuerto aeropuertos[]){
        String empresas[];
        
        for (int i=0; i<aeropuertos.length; i++){
            if (aeropuertos[i] instanceof AeropuertoPrivado){
                System.out.println("Aeropuerto Privado"+aeropuertos[i].getNombre());
                empresas = ((AeropuertoPrivado)aeropuertos[i]).getListaEmpresas();
                System.out.println("Las empresas de este Aeropuerto Privado son las siguientes");
                
                for(int j=0; i<empresas.length; i++){
                    System.out.println(empresas[j]);
                }
            }else{
                System.out.println("Aeropuerto Publicos: "+aeropuertos[i].getNombre());
                System.out.println("Subvención: "+((AeropuertoPublico)aeropuertos[i]).getSubvencion());
                }
            System.out.println("");
        }
    }
    
    public static Aeropuerto buscarAeropuerto(String nombre, Aeropuerto aeropuertos[]){
        boolean encontrado = false;
        int i=0;
        Aeropuerto aero= null;
        while((!encontrado)&&(i<aeropuertos.length)){
            if(nombre.equals(aeropuertos[i].getNombre())){
                encontrado = true;
                aero =aeropuertos[i];
            }
            i++;
        }
        return aero;
    }
    
    public static void mostrarCompañias(Aeropuerto aeropuerto){
        System.out.println("Las compañias del Aeropuerto: "+aeropuerto.getNombre());
        for (int i=0; i<aeropuerto.getNumCompañia(); i++){
            System.out.println(aeropuerto.getCompañia(i).getNombre());
        }
    }
    
    public static void mostrarVuelos(Compañia compañia){
        Vuelo vuelo;
        System.out.println("Los vuelos de la compañia: "+compañia.getNombre());
        for (int i=0; i<compañia.getNumVuelo(); i++){
            vuelo = compañia.getVuelo(i);
            System.out.println("Identificador: "+vuelo.getIdentificador());
            System.out.println("Ciudad de Origen: "+vuelo.getCiudadOrigen());
            System.out.println("Ciudad de Destino: "+vuelo.getCiudadDestino());
            System.out.println("Precio: $"+vuelo.getPrecio());
            System.out.println("");
        }
    }
    
    public static Vuelo[] buscarVuelosOrigenDestino(String origen, String destino, Aeropuerto aeropuertos[]){
        Vuelo vuelo;
        int contador = 0;
        Vuelo listaVuelos[];
        
        for(int i=0; i<aeropuertos.length; i++){ //Recorremos los Aeropuertos
            for (int j=0; j<aeropuertos[i].getNumCompañia(); j++){ //Recorremos las Compañias
                for (int k=0; k<aeropuertos[i].getCompañia(j).getNumVuelo(); k++){//Recorremos los Vuelos
                    
                    vuelo = aeropuertos[i].getCompañia(j).getVuelo(k);
                    if ((origen.equals(vuelo.getCiudadOrigen()))&&(destino.equals(vuelo.getCiudadDestino()))){
                        contador++;
                    }
                }
            }
        }
        listaVuelos = new Vuelo[contador];
        int q=0;
        
        for(int i=0; i<aeropuertos.length; i++){ //Recorremos los Aeropuertos
            for (int j=0; j<aeropuertos[i].getNumCompañia(); j++){ //Recorremos las Compañias
                for (int k=0; k<aeropuertos[i].getCompañia(j).getNumVuelo(); k++){//Recorremos los Vuelos
                    vuelo = aeropuertos[i].getCompañia(j).getVuelo(k);
                    
                    if((origen.equals(vuelo.getCiudadOrigen()))&&(destino.equals(vuelo.getCiudadDestino())));
                    listaVuelos[q] = vuelo;
                    q++;
                }
            }
        }
        return listaVuelos;
    }
    
    public static void mostrarVueloOrigenDestino(String origen, String destino, Aeropuerto aeropuertos[]){
        Vuelo vuelos[];
        vuelos = buscarVuelosOrigenDestino(origen, destino, aeropuertos);
        if(vuelos.length==0){
            System.out.println("No existen vuelos de esa ciudad de origen");
        }else{
            System.out.println("\nVuelos Encontrados");
            for(int i=0; i<vuelos.length;i++){
                System.out.println("Identificador: "+vuelos[i].getIdentificador());
                System.out.println("Ciudad de Origen: "+vuelos[i].getCiudadOrigen());
                System.out.println("Ciudad de Destino: "+vuelos[i].getCiudadDestino());
                System.out.println("Precio: $"+vuelos[i].getPrecio());
                System.out.println("");
            }
        }
    }
}
