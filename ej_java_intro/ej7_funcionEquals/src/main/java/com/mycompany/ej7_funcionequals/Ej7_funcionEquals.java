/*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ej7_funcionequals;

/**
 *
 * @author sofia
 */
import java.util.Scanner;
public class Ej7_funcionEquals {

    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        System.out.println("Ingrese la contraseña");
        String frase= leer.nextLine();
        
        //aca es conde comparo dos cadenas con equals.
        String cadena1=  new String ("eureka");
        String cadena2= new String (frase);
        if (cadena2.equals(cadena1)){
            System.out.println("Ingreso correctamente");
        }else{
            System.out.println("Intentelo nuevamente");
        }
          
            
        
    } 
    
}
