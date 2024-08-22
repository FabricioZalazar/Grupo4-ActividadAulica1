/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grupo4.trabajoaulico;

import java.util.Iterator;

/**
 *
 * @author zalaz
 */
public class Grupo4TrabajoAulico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Baraja baraja=new Baraja();
        baraja.barajar();
       baraja.mostrarBaraja();
       

       
       baraja.darCartas(4);
       
       baraja.mostrarCartasMonton();
       baraja.mostrarBaraja();

        
    }
    
}
