/*Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ej15_funcion;

/**
 *
 * @author sofia
 */

public class Ej15_funcion {

    public static void main(String[] args) {
       
        int [] vector= new int [100];
        for(int i=0; i<100;i++){
            vector [i]= i; 
        }
        for (int i=99; i>=0;i--){
           System.out.println("el numero es [" + vector[i] + "]");    
        }
                
    }
}
