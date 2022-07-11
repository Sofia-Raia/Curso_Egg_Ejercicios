/*Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
segundo, sino informe que no lo son.
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.manos_a_la_obra_ej12;

/**
 *
 * @author sofia
 */
import java.util.Scanner;
public class Manos_a_la_obra_ej12 {

    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        System.out.println("A continuacion ingrese dos numeros que sean multiplos");
        int num1 = leer.nextInt();
        int num2=  leer.nextInt();
        EsMultiplo(num1,num2);
    }
    
     public static void EsMultiplo (int num1,int num2){
         //evaluo que el primer numero es multiplo del segundo.
         int resto= num1%num2;
         
         if ( resto==0){
             System.out.println("el primer numero es multiplo del segundo");
         } else {
             System.out.println("El primer numero no el multiplo del segundo");
         }
     }
}

