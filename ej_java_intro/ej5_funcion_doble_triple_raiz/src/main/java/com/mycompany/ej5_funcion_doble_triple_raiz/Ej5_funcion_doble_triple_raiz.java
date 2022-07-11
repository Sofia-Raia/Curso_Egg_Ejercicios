/*Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ej5_funcion_doble_triple_raiz;

/**
 *
 * @author sofia
 */
import java.util.Scanner;
public class Ej5_funcion_doble_triple_raiz {

    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        System.out.println("Ingrese un numero entero");
        int num= leer.nextInt();
        System.out.println("El doble es: "+ num*2 );
        System.out.println("El triple es: "+ num*3);
        // asi se saca la raiz cuadrada de un numero  Math.sqrt(num)
        System.out.println("La raiz cuadrada es: "+ Math.sqrt(num));
    }
}
