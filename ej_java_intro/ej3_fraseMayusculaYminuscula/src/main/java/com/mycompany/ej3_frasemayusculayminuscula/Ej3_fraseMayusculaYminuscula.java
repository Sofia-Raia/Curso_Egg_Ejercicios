/*Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ej3_frasemayusculayminuscula;

/**
 *
 * @author sofia
 */
import java.util.Scanner;
public class Ej3_fraseMayusculaYminuscula {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Infrese una frase");
        String frase= leer.nextLine();
        //de esta forma mostramos la frase en mayusculas
        System.out.println("Frase en mayusulas: " + frase.toUpperCase());
        //asi mostramos la frase en minusculas 
        System.out.println("Frase en minusculas: " +frase.toLowerCase());
    }
}
