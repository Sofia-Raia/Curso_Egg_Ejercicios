/*Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ej1_suma_de_numeros;

/**
 *
 * @author sofia
 */
import java.util.Scanner;
public class Ej1_suma_de_numeros {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("A continuacion ingrese dos numeros enteros");
        int num1=leer.nextInt();
        int num2= leer.nextInt();
        int suma = num1 + num2;
        System.out.println("La suma de los numeros nos da " + suma);
        
    }
}
