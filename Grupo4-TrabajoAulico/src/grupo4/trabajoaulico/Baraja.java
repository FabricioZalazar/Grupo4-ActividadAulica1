/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo4.trabajoaulico;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author zalaz
 */
public class Baraja {

    ArrayList<Carta> cartas = new ArrayList();
    ArrayList<Carta> monton = new ArrayList();

    public Baraja() {
        for (int i = 1; i < 13; i++) {
            if (i != 8 && i != 9) {
                Carta carta = new Carta(i, "Espada");
                Carta carta2 = new Carta(i, "Basto");
                Carta carta3 = new Carta(i, "Oro");
                Carta carta4 = new Carta(i, "Copa");
                cartas.add(carta);
                cartas.add(carta2);
                cartas.add(carta3);
                cartas.add(carta4);
            }
        }
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    public ArrayList<Carta> getMonton() {
        return monton;
    }

    public void setMonton(ArrayList<Carta> monton) {
        this.monton = monton;
    }

    public void barajar() {
        Collections.shuffle(cartas);
        System.out.println("-------------baraja barajeada------------");
    }

    public void siguienteCarta() {
        if (cartas.size() <= 0) {
            System.out.println("No hay cartas en la baraja");
        } else {
            Carta ultimoElemento = cartas.get(cartas.size() - 1);
            System.out.println("Siguiente carta: " + ultimoElemento.getNum()+ " " + ultimoElemento.getPalo());
            monton.add(ultimoElemento);
            cartas.remove(ultimoElemento);
        }
    }

    public void cartasDisponibles() {
        System.out.println("Cartas disponibles en la baraja " + cartas.size());
    }

    public void darCartas(int num) {
        if (cartas.size() < num) {
            System.out.println("No hay cartas suficientes para darte");
        } else {
            for (int i = 0; i < num; i++) {
                Carta ultimoElemento = cartas.get(cartas.size() - 1);
                monton.add(ultimoElemento);
                cartas.remove(ultimoElemento);
            }
        }
    }

    public void mostrarCartasMonton() {
        System.out.println("-------Monton de cartas------");
        int cont = 0;
        if (monton.isEmpty()) {
            System.out.println("No hay cartas en monton");
        } else {
            for (Carta ele : monton) {
                cont++;
                System.out.print(ele.getNum() + " ");
                System.out.println(ele.getPalo());
            }
            System.out.println("Cartas Total " + cont);
        }
    }

    public void mostrarBaraja() {
        System.out.println("-------baraja------");
        int cont = 0;
        for (Carta ele : cartas) {
            cont++;
            System.out.print(ele.getNum() + " ");
            System.out.println(ele.getPalo());
        }

        System.out.println("Cartas Total " + cont);
    }

}
