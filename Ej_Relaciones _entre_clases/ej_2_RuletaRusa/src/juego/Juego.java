/* Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego;

import java.util.ArrayList;
import jugador.Jugador;

import revolverDeAgua.Revolver_de_Agua;

/**
 *
 * @author sofia
 */
public class Juego {
    ArrayList<Jugador>jugadores=new ArrayList();
    Revolver_de_Agua revolver;

    public Juego() {
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public Revolver_de_Agua getRevolver() {
        return revolver;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public void setRevolver(Revolver_de_Agua revolver) {
        this.revolver = revolver;
    }
    
    public void llenarJuego(ArrayList<Jugador>jugadores, Revolver_de_Agua r){
        this.jugadores=jugadores;
        revolver=r;
    }
//ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
//aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
//moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
//mojar. Al final del juego, se debe mostrar que jugador se mojó.
//Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
   
    public boolean ronda(){
        for (Jugador jugador : jugadores) {
           jugador.disparo(revolver);
            System.out.println("");
        
           if(jugador.isMojado()){
               System.out.println("Game Over. El jugador mojado es: "+jugador.getNombre());
               return true;
           }
        }
        return false;
    }

    
}
