/*Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3_cartasespañolas;

import Baraja.Baraja;

/**
 *
 * @author sofia
 */
public class Ej3_CartasEspañolas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("///////JUEGO DE CARTAS ESPAÑOLAS/////////");
        Baraja baraja1 = new Baraja();
        baraja1.barajar();
        baraja1.mostrarBaraja();
        baraja1.cartasMonton();
        System.out.println("Saco una carta: "+baraja1.siguienteCarta());
        baraja1.mostrarBaraja();
        baraja1.cartasMonton();
        System.out.println("Saco 10 cartas: "+baraja1.darCartas(10));
        baraja1.mostrarBaraja();
        baraja1.cartasMonton();
    }
    
}
