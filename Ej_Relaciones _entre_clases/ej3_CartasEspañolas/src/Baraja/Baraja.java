//Las operaciones que podrá realizar la baraja son:
//
//• barajar(): cambia de posición todas las cartas aleatoriamente.
//
//• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
//se haya llegado al final, se indica al usuario que no hay más cartas.
//
//• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
//
//• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
//cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
//debemos indicárselo al usuario.
//
//• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
//indicárselo al usuario
//
//• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
//luego se llama al método, este no mostrara esa primera carta.

package Baraja;

import Palos.Palos;
import carta.Carta;
import java.util.ArrayList;
import java.util.Collections;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author sofia
 */
public class Baraja {

    ArrayList<Carta> cartas = new ArrayList();
    ArrayList<Carta> monton = new ArrayList();

    public Baraja() {
        for (Palos palo : Palos.values()) {
            for (int i = 1; i <= 12; i++) {
                if (i==8 || i== 9){
                    continue;
                }
                Carta carta = new Carta(palo,i);
                cartas.add(carta);
            }
        }
    }
    
    public void barajar(){
        Collections.shuffle(cartas);
    }
    
    public Carta siguienteCarta(){
        if (cartas.isEmpty()) {
            System.out.println("No quedan mas cartas");
            return null;
        }
        Carta siguienteCarta = cartas.remove(0);
        monton.add(siguienteCarta);
        return siguienteCarta;
    }
    
    public int cartasDisponibles() {
        System.out.println("Quedan "+cartas.size()+" disponibles en la baraja.");
        return cartas.size();
    }
    
    public ArrayList<Carta> darCartas(int cantidadCartas) {
        if (cartas.size()<cantidadCartas) {
            System.out.println("No hay esa cantidad de cartas para dar.");
            return null;
        }
        ArrayList<Carta> cartasADar = new ArrayList();
        for (int i = 0; i < cantidadCartas; i++) {
            Carta cartaSacada = cartas.remove(0);
            cartasADar.add(cartaSacada);
        }
        monton.addAll(cartasADar);
        return cartasADar;
        
    } 
    
    public void cartasMonton() {
        System.out.println("Las cartas en el monton son: "+monton);
    }
    
    public void mostrarBaraja() {
        System.out.println("Las cartas en la baraja son: ");
        System.out.println(cartas);
    }
                

}
