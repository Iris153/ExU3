package clientes;

import java.util.Scanner;


public class Clientes {

    
    public static void main(String[] args) {
        
        boolean continuar = true;
        String [] clientes ={"Vip","comun"};
        int opc, turno=0;
        
        Scanner leer = new Scanner(System.in);
        MetodosNodo envioNodo = new MetodosNodo();
        
        while(continuar){
            System.out.println("");
            System.out.println("1. Nuevo cliente");
            System.out.println("2. Pasar a ventanilla");
            System.out.println("3. Mostrar colas");
            System.out.println("4. Terminar una ventanilla");
            System.out.println("5. Salir");
            
            opc = leer.nextInt();
            
            switch(opc){
                case 1:
                    if(turno==0)
                        turno=(int)(Math.random()*10+1);
                    else
                        turno ++;
                    int numero =(int)(Math.random()*2+0);
                    if(numero==0)
                        envioNodo.Insertar(clientes[0],turno);
                    else
                        envioNodo.Insertar(clientes[1],turno);
                    break;
                case 2:
                     envioNodo.PasarVentanilla();
                    break;
                case 3:
                    envioNodo.MostrarColas();
                    break;
                case 4:
                     envioNodo.TerminarVentanilla();
                    break;
                case 5:
                    continuar=false;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }
        
    }
    
}
