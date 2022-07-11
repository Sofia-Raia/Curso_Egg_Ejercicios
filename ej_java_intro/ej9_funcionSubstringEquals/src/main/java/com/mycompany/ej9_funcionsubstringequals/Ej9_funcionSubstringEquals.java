/*Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
la función Substring y equals() de Java.
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ej9_funcionsubstringequals;

/**
 *
 * @author sofia
 */
import java.util.Scanner;
public class Ej9_funcionSubstringEquals {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase= leer.nextLine();
        //con substring extraigo un una subcadena desde una posision inicial a una final, pero no incluye
        //la ulltima. En este caso la inicial.
        String inicial= frase.substring(0,1);
        
        if (inicial.equals("A")){
            System.out.println("correcto");
        }else{
            System.out.println("incorrecto");
             
        }
        
        
    }
}
