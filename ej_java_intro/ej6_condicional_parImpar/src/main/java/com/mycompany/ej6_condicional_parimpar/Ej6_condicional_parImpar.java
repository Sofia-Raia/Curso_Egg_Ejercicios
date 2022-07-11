/*Crear un programa que dado un numero determine si es par o impar.
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ej6_condicional_parimpar;

/**
 *
 * @author sofia
 */
import java.util.Scanner;
public class Ej6_condicional_parImpar {

    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        System.out.println("Ingres un numero entero");
        int num=leer.nextInt();
        if (num%2 ==0 ){
            System.out.println("El numero es par ");
        }else{
            System.out.println("El numero es impar");
            
        } 
    }
}
