/*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ej4_operaciones_matematicas;

/**
 *
 * @author sofia
 */
import java.util.Scanner;
public class Ej4_operaciones_matematicas {

    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        System.out.println("Indique la temperatura en g°");
        int temperatura_c =leer.nextInt();
        double temp_f= 32+ (9*temperatura_c/5);
        System.out.println("la temperatura en Fahrenheit es de:  "+ temp_f);
        
    }
}
