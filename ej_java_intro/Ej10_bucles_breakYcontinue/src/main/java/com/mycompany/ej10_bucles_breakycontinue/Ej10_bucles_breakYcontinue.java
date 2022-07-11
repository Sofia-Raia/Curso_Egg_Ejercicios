/*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ej10_bucles_breakycontinue;

/**
 *
 * @author sofia
 */
import java.util.Scanner;
public class Ej10_bucles_breakYcontinue {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);

        
        int suma=0;
        System.out.println("Ingrese un numero limite ");
        int num_limite;
        do {            
            num_limite = leer.nextInt();
        } while (num_limite<0);
        int num;
        do{
            System.out.println("ingrese un numero positivo");
            num = leer.nextInt();
            suma+= num;
        }while (suma < num_limite);
        
            
    }
}
