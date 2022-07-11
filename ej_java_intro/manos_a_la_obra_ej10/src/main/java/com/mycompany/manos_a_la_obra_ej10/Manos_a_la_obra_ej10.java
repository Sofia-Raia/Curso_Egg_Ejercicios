/*Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.manos_a_la_obra_ej10;

/**
 *
 * @author sofia
 */
import java.util.Scanner;
public class Manos_a_la_obra_ej10 {

    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        System.out.println("Ingrese 4 numeros");
        int num;
       //bucle para pedir los 4 num
        for (int i=0; i<4; i++){
            num= leer.nextInt();
            
            if (num >1 && num <20){
                System.out.print(num+" ");
                //bucle para agregar tantos * como el num.
                for( int j= 0; j < num; j++){
                  System.out.print("*");
                    
                }
            }
            
        } 
    }
    
}
