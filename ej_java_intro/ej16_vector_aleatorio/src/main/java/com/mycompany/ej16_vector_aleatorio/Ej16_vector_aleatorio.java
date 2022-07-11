/*Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ej16_vector_aleatorio;

/**
 *
 * @author sofia
 */
import java.util.Scanner;
public class Ej16_vector_aleatorio {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese el numero que desea buscar");
        int buscar= leer.nextInt();
        int numeroAleatorio;
        int []vector= new int[10];
        int posicionBuscar = -1;
        boolean repetido = false;
        for (int i=0; i<10; i++){
            //el num aleatorio devuelbe un double por eso lo pue asi.
            numeroAleatorio = (int) (Math.random()*5+1);
            vector[i]=numeroAleatorio ;
            System.out.print("["+numeroAleatorio+"]");
        }
        System.out.println("");
        for (int i=0; i<10; i++){
            if (vector[i] == buscar && posicionBuscar == -1){
                posicionBuscar = i;
            } else if (vector[i] == buscar && posicionBuscar != -1) {
                repetido = true;
            }
        }
        if (posicionBuscar != -1) {
            System.out.println("El numero "+buscar+" se encontro en la posicion "+posicionBuscar);
            if (repetido) {
                System.out.println("Y se encontro mas de una vez");
            }
        } else {
            System.out.println("El numero "+buscar+" no se encontro en el arreglo");
        }
    }
}
