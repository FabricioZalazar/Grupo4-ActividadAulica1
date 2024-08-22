/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grupo4.trabajoaulico;


import java.util.Scanner;

/**
 *
 * @author zalaz
 */
public class Grupo4TrabajoAulico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        Baraja baraja=new Baraja();
        boolean bandera = true;
        do{
        
        System.out.println("Menu:");
        System.out.println("1- barajar");
        System.out.println("2- siguiente carta");
        System.out.println("3- cartas disponibles en baraja");
        System.out.println("4- dar cartas");
        System.out.println("5- mostrar cartas del monton");
        System.out.println("6- mostrar cartas de la baraja");
        System.out.println("7-salir");
        int op = leer.nextInt();
        
        switch(op){
            case 1 :
                baraja.barajar();
                break;
            case 2 : 
                baraja.siguienteCarta();
                break;
            case 3 :
                baraja.mostrarBaraja();
                break;
            case 4 : 
                System.out.println("cuantas cartas desea??");
                int num = leer.nextInt();
                baraja.darCartas(num);
                break;
            case 5 :
                baraja.mostrarCartasMonton();
                break;
            case 6 : 
                baraja.mostrarBaraja();
                break;
            case 7 :
                bandera = false;
                break;
            default: 
                System.out.println("opcion ingresada incorrecta");
                break;
                        
                
        }
        }while(bandera);
                        
            
      
        
        }} 
    

