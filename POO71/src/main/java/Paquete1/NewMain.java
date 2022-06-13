package Paquete1;

import javax.swing.JOptionPane;

public class NewMain {
    
    public static void main(String[] args) {
        
        int numSucursal,opción,prioridad;
        int contadorSucursal =0;
        int numPaquete;
        int contadorPaquete = 0;
        String dirección,ciudad,dpi;
        double peso,costo;
        boolean band = false;
        
        Sucursal sucursal [] = new Sucursal [50];
        Paquete paquete [] = new Paquete [100];
        Paquete precio;
        
        do{
            opción = Integer.parseInt(JOptionPane.showInputDialog("\tMenu:"
                    + "\n1: Crear Sucursal."
                    + "\n2: Enviar Paquete."
                    + "\n3: Ver Sucursales."
                    + "\n4: Ver Paquetes."
                    + "\n5: Ver Sucursal Especifica."
                    + "\n6: Ver Paquete Especifico"
                    + "\n7: Salir"));
            switch (opción){
                case 1: 
                    numSucursal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de sucursal"));
                    ciudad = JOptionPane.showInputDialog("Ingrese el nombre de la ciudad");
                    dirección = JOptionPane.showInputDialog("Ingrese la dirección de la sucursal");
                    
                    sucursal[contadorSucursal] = new Sucursal (numSucursal,dirección,ciudad);
                    contadorSucursal++;
                    break;
                    
                case 2:
                    band = false;
                    dpi = JOptionPane.showInputDialog("Ingrese su número de DPI");
                    peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese cuanto pesa su paquete"));
                    do{
                        prioridad =Integer.parseInt(JOptionPane.showInputDialog("Ingrese que prioridad tiene su paquete "
                                + "\n1:Normal"
                                + "\n2:Alta"
                                + "\n3:Express"));
                        if (prioridad <1 || prioridad >3){
                            JOptionPane.showMessageDialog(null,"Esa opción no esta disponible");
                        }
                    }while (prioridad <1 || prioridad >3);
                    if (prioridad==1){
                        prioridad=0;
                    }
                    if (prioridad ==2){
                        prioridad=10;
                        
                    }if (prioridad == 3){
                        prioridad =20;
                    }
                    numPaquete = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de referencia"));
                    numSucursal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de sucursal que desea enviarlo"));
                   
                    int x=0;
                    while (x<contadorSucursal && band== false){
                        if (numSucursal == sucursal[x].getNumSucursal()){
                            band = true;
                        }
                        x++;
                    } if (band == false){
                        JOptionPane.showMessageDialog(null,"La sucursal no fue encontrada");
                        break;
                        
                    } if (band == true) {
                        costo = peso+prioridad;
                        paquete [contadorPaquete] = new Paquete (numPaquete,dpi,peso,prioridad,costo);
                        contadorPaquete++;
                        System.out.println("El paquete fue enviado a la sucursal: "+sucursal[x-1].getNumSucursal()+"\nCon un costo de: Q"+costo);
                    }
                    break;
                    
                case 3:
                    for (int i=0; i<=contadorSucursal-1; i++){
                        System.out.println("Sucursal "+(i+1)+":" +"\nCiudad de:"+sucursal[i].getCiudad());
                        System.out.println("Dirección de:"+sucursal[i].getDirección());
                        System.out.println("Numero de Sucursal :"+sucursal[i].getNumSucursal());
                    }
                    break;
                    
                case 4:
                    for (int i=0; i<=contadorPaquete-1; i++){
                        System.out.println("Paquete "+(i+1)+":" +"\nDPI:"+paquete[i].getDPI());
                        System.out.println("Peso de:"+paquete[i].getPeso());
                        System.out.println("Prioridad :"+paquete[i].getPrioridad());
                        System.out.println("Costo de: "+paquete[i].getCosto());
                    break;
                }
                case 5:
                    band = false;
                    int y=0;
                    numSucursal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de sucursal"));
                    while (y<contadorSucursal && band== false){
                        if (numSucursal == sucursal[y].getNumSucursal()){
                            band = true;
                        }
                        y++;
                    } if (band == false){
                        JOptionPane.showMessageDialog(null,"La sucursal no fue encontrada");
                        break;
                        
                    } if (band == true) {
                        System.out.println("Ciudad de:"+sucursal[y-1].getCiudad());
                        System.out.println("Dirección de:"+sucursal[y-1].getDirección());
                        System.out.println("Numero de Sucursal :"+sucursal[y-1].getNumSucursal());
                    }break; 
                    
                case 6:
                    band = false;
                    int z=0;
                    numPaquete = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de Referencia"));
                    while (z<contadorPaquete && band== false){
                        if (numPaquete == paquete[z].getNumReferencia()){
                            band = true;
                        }
                        z++;
                    } if (band == false){
                        JOptionPane.showMessageDialog(null,"El paquete no fue encontrada");
                        break;
                        
                    } if (band == true) {
                        System.out.println("DPI:"+paquete[z-1].getDPI());
                        System.out.println("Peso de:"+paquete[z-1].getPeso());
                        System.out.println("Prioridad :"+paquete[z-1].getPrioridad());
                        System.out.println("Costo de: "+paquete[z-1].getCosto());
                    }
                    break;
            }
        }while (opción !=7); 
    } 
}

