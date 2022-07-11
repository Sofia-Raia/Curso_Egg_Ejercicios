/*Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el
resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
Nota: recordar el uso de la sentencia break.
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.manos_a_la_obra_ej9;

/**
 *
 * @author sofia
 */import java.util.Scanner;
public class Manos_a_la_obra_ej9 {

    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        int suma=0 ;
        int contador=0;
        int numeros;
         System.out.println("A continuacion ingrese 20 numeros");
         
        do{
            numeros= leer.nextInt();
            if (numeros > 0){
              // es lo mismo que poner suma=suma+numeros
            suma+= numeros;
            }
          
           contador++;
            
        }while (numeros!=0 && contador<20); 
       if (numeros ==0){
           System.out.println("se capturo el numero cero");
       } 
       System.out.println("la suma de los numeros es " + suma);  
        
    }
}
