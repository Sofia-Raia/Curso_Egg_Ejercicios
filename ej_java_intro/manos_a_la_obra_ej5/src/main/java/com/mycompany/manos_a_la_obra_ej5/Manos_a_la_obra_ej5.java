/*Define una variable de tipo boolean, double y char. Guarda información en ellas a través del
Scanner.
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.manos_a_la_obra_ej5;

/**
 *
 * @author sofia
 */

/*agrego el siguiente comando para usar el leer*/
import java.util.Scanner;
public class Manos_a_la_obra_ej5 {

    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
             
        //para escribir mas rapido, el escribir sout + tab
        System.out.println("Ingrese verdadero o falso:");
        boolean variable_logica = leer.nextBoolean(); 
        System.out.println("Ingrese su talla");
        double talla;
        // cuando ingrese el numero por pantalla debo colocarlo con coma
        talla= leer.nextDouble();
        System.out.println("Ingrese su inicial");
        //para char no hay un next especifico, pongo next().charAt(posicion),para extraer el caracter.
        char inicial= leer.next().charAt(0);
        
    }
}
