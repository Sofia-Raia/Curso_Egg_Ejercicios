/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej_2_ruletarusa;

import java.util.ArrayList;
import java.util.Scanner;
import juego.Juego;
import jugador.Jugador;
import revolverDeAgua.Revolver_de_Agua;

/**
 *
 * @author sofia
 */
public class Ej_2_RuletaRusa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        System.out.println("///////BIENVENIDOS A LA RULETA RUSA ////////");
        
        Revolver_de_Agua revolver= new Revolver_de_Agua();
        revolver.llenarRevolver();
        System.out.println(revolver);
        
        ArrayList<Jugador> jugadores = new ArrayList();
        System.out.println("Ingrese la cantidad de jugadores");
        int cantJugadores = read.nextInt();
        if(cantJugadores>6) {
            cantJugadores=6;
        }

        for (int i = 1; i <= cantJugadores; i++) {
            Jugador jugador = new Jugador(i);
            jugadores.add(jugador);
            System.out.println("Se creo el jugador :"+jugador.getNombre() );
        }
        Juego juego = new Juego();
        juego.llenarJuego(jugadores,revolver);
        
        boolean terminarJuego = false;
        while (!terminarJuego) {            
           terminarJuego = juego.ronda();    
        }
          
    }
    
}
