/*Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
pedirá de nuevo hasta que la nota sea correcta.
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.manos_a_la_obra_ej8;

/**
 *
 * @author sofia
 */
import java.util.Scanner;
public class Manos_a_la_obra_ej8 {

    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        System.out.println("Ingrese su nota");
        int nota;
       
        nota= leer.nextInt();
        
        while(nota<0 || nota>10){
            System.out.println("Ingrese nuevamente la nota");
            nota= leer.nextInt();
        }
        System.out.println("La nota fue guardada");
    }
}
