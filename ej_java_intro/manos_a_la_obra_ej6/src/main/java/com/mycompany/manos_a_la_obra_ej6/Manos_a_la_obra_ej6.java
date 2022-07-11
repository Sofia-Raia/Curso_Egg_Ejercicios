/*Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
alguno de ellos es mayor a 25.
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.manos_a_la_obra_ej6;

/**
 *
 * @author sofia
 */
import java.util.Scanner;
public class Manos_a_la_obra_ej6 {

    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        System.out.println("A continuacion ingrese dos numero enteros");
        int num1= leer.nextInt();
        int num2= leer.nextInt ();

        if (num1>25 && num2>25){
            System.out.println("ambos numeros son mayor a 25"); 
        } else if (num1>25 || num2>25){ 
            System.out.println("uno de los numeros es mayor a 25");
        }
        
        
           
    }
}
