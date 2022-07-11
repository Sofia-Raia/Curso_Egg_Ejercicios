/*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ej13_dibujar_asteriscos;

/**
 *
 * @author sofia
 */
import java.util.Scanner;
public class Ej13_dibujar_asteriscos {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("A continuacion ingrese un numero");
        int num= leer.nextInt();
        for (int i=0; i< num; i++){
           for (int j=0; j<num; j++){
               if (i==0 || i==num-1){
                System.out.print("*");
               }else if(j==0 || j==num-1 ){ 
                   System.out.print("*");
               } else {
                   System.out.print(" ");
               }
           }
           System.out.println("");     
        }
          
    }
}
