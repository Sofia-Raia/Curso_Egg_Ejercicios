/*Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ej2_pedir_nombre;

/**
 *
 * @author sofia
 */
import java.util.Scanner;
public class Ej2_pedir_nombre {

    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        System.out.println("Ingrese su nombre");
        String nombre= leer.nextLine();
        System.out.println("Su nombre es "+ nombre);
    }
}
