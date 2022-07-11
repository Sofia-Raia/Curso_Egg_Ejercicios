/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejemplo;

/**
 *
 * @author sofia
 */
import java.util.Scanner;
public class Ejemplo {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese una frase");
        String frase = leer.nextLine();
       
        String resultado = reemplazo(frase);
        System.out.println(resultado);
        
    }
    
    public static String reemplazo(String frase){
          String resultado= "";
        for (int i = 0; i < frase.length(); i++) {
            switch (frase.substring(i,i+1)){
                case "a":
                    resultado = resultado.concat("@");
                    break; 
                case "e":
                  resultado = resultado.concat("#");
                    break;  
                case "i":
                    resultado = resultado.concat("$");
                    break;
                case "o":
                    resultado = resultado.concat("%");
                    break;
                case "u":
                    resultado = resultado.concat("*");
                    break;
            }
        }
    }
}
