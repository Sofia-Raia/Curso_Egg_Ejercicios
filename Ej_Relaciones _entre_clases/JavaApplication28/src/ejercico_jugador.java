
import equipo.Equipo;
import java.util.ArrayList;
import jugador.Jugador;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sofia
 */
public class ejercico_jugador {
    
    public static void main(String[] args){
        Equipo e =new Equipo();
        e.generar_lista();
        ArrayList<Jugador> listaJugadores= e.getLista();
        System.out.println("LISTA DE JUGADORES");
        for (Jugador jugadores : listaJugadores) {
            System.out.println(jugadores);
            System.out.println("");
            
        }
        
    }
    
}
