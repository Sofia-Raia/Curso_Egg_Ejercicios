/*EJERCICIO 13 Y 14.
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.manos_a_la_obra_ej13;

/**
 *
 * @author sofia
 */
import java.util.Scanner;
public class Manos_a_la_obra_ej13 {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Indique cantidad de jugadores de su equipo ");
        int cant_jug = leer.nextInt();
        //utilizo a continuacion el nextLine porque despues del nextInt cuando doy enter "n/" 
        //el proximo nextLine me toma ese enter produciendome un espacio y para el indice cero
        //no me deja colocar un nombre porque el nextLine me toma el n/ que es enter.
        leer.nextLine();
        String []jugadores =new String[cant_jug];
        
        //no se si va esta parte.. me empieza a cortar a partir del 1
         for (int i=0; i < cant_jug; i++ ){
             System.out.println("Ingrese el nombre del jugador " + i );
             String nombres= leer.nextLine();
             jugadores[i]= nombres ;
         }
    }    
}
