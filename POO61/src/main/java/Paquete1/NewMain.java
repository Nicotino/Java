package Paquete1;

import javax.swing.JOptionPane;

public class NewMain {

    public static void main(String[] args) {
        String nombre;
        String apellido;
        String dpi;
        
        Cuenta cuentas[];
        
        int opcion,numCuentas,nomCuenta,nuevaCuenta;
        
        float saldo = 0,dinero;
        
        nombre = JOptionPane.showInputDialog("Bienvenido al programa de registro de cuentas."
                + "\nPorfavor ingrese nu nombre");
        apellido = JOptionPane.showInputDialog("Por favor ingrese su apellido");
        dpi = JOptionPane.showInputDialog("Ingrese su numero de DPI");
        Cliente clientes = new Cliente (nombre,apellido,dpi);
        
        numCuentas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de cuentas que tiene"));
        cuentas = new Cuenta [numCuentas];
        
        for (int i=0; i<numCuentas; i++){
            nomCuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero de cuenta"));
            saldo = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la canitdad de saldo que tiene en la cuenta: "+(i+1)));
            cuentas [i] = new Cuenta (nomCuenta,saldo);
        }
        
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese que opción desee hacer"
                    + "\n1: Depositar Dinero"
                    + "\n2: Retirar Dinero"
                    + "\n3: Consultar Dinero"
                    + "\n4: Salir"));
            
            switch (opcion){
                case 1:
                    nomCuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero de cuenta"));
                    int x=0;
                    boolean band = false;
                    while (x<numCuentas && band == false){
                        if (cuentas[x].getNomCuenta()==nomCuenta){
                            band=true;
                            break;
                        }
                            x++;
                    }
                    if (band == false){
                        System.out.println("La cuenta ingresada no existe");
                        break;
                    }else {
                     dinero = Float.parseFloat(JOptionPane.showInputDialog("Ingrese cuanto dinero quiere depositar a su cuenta"));
                     saldo = cuentas[x].getSaldo();
                     saldo += dinero;
                     nuevaCuenta = cuentas[x].getNomCuenta();
                     cuentas [x] = new Cuenta (nuevaCuenta,saldo);
                    }
                    System.out.println("La cuenta:"+cuentas[x].getNomCuenta()+" \nAhora tiene"+cuentas[x].getSaldo());
                    break;
                    
                case 2:
                    nomCuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero de cuenta"));
                    int y=0;
                    boolean band2 = false;
                    while (y<numCuentas && band2 == false){
                        if (cuentas[y].getNomCuenta()==nomCuenta){
                            band2=true;
                            break;
                        }
                            y++;
                    }
                    if (band2 == false){
                        System.out.println("La cuenta ingresada no existe");
                        break;
                    }else {
                     dinero = Float.parseFloat(JOptionPane.showInputDialog("Ingrese cuanto dinero quiere retirar en su cuenta"));
                     if (dinero > cuentas[y].getSaldo()){
                         System.out.println("No hay suficiente dinero en la cuenta");
                     } else{
                     saldo = cuentas[y].getSaldo();
                     saldo -= dinero;
                     nuevaCuenta = cuentas[y].getNomCuenta();
                     cuentas [y] = new Cuenta (nuevaCuenta,saldo);
                         
                     }
                    }
                    System.out.println("La cuenta:"+cuentas[y].getNomCuenta()+" \nAhora tiene"+cuentas[y].getSaldo());
                    break;
                    
                case 3:
                    nomCuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero de cuenta"));
                    int z=0;
                    
                    boolean band3 = false;
                    while (z<numCuentas && band3 == false){
                        if (cuentas[z].getNomCuenta()==nomCuenta){
                            band3=true;
                            break;
                        }
                            z++;
                    }
                    if (band3 == false){
                        System.out.println("La cuenta ingresada no existe");
                        break;
                    }else {
                    System.out.println("La cuenta:"+cuentas[z].getNomCuenta()+" \nAhora tiene"+cuentas[z].getSaldo());
                    }
                    break;
            }
        }while (opcion !=4);
        
    }
    
}
