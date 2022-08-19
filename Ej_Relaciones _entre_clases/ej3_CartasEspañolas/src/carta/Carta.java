/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carta;

import Palos.Palos;
import java.util.ArrayList;

/**
 *
 * @author sofia
 */

public class Carta {

    private Palos palo;
    int numero;

    public Carta(Palos palo, int numero) {
        this.palo = palo;
        this.numero = numero;
    }

//    Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
//y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
//contener un método toString() que retorne el número de carta y el palo. La baraja estará
//compuesta por un conjunto de cartas, 40 exactamente.

    @Override
    public String toString() {
        return +numero + " de : " + palo + "\n";
    }
    
   
}
