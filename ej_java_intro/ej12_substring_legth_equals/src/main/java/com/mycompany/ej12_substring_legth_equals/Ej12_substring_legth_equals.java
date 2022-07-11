/*Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.

Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.

Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ej12_substring_legth_equals;

/**
 *
 * @author sofia
 */
import java.util.Scanner;
public class Ej12_substring_legth_equals {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
       
        String palabra;
        String fde= "&&&&&";
        int correcta=0;
        int incorrecta=0;
        int log_palabra;
        String p_caracter;
        String u_caracter;
        do{
          System.out.println("A continuacion ingrese una palabra");  
          palabra=leer.nextLine();
          log_palabra = palabra.length();
          p_caracter= palabra.substring(0,1);
          u_caracter= palabra.substring(log_palabra-1,log_palabra);
          if(log_palabra <=5 && p_caracter.equalsIgnoreCase("x") && u_caracter.equalsIgnoreCase("o")){
              correcta+= 1;
          }else if (!palabra.equals(fde)){
              incorrecta+=1;   
          }
        }while(!palabra.equals(fde));
        System.out.println("la cantidad de correctas es "+ correcta);
        System.out.println("la cantidad de incorrectas es "+ incorrecta);
        
    }
    
}
