/*Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej_5_adivinaelnumero;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author sofia
 */
public class Ej_5_AdivinaElNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        
        int nAleatorio=(int)(Math. random()*10+1);
        String posibleNumero = "";
        int num=0;
        int contador=0;
        do {            
            System.out.println("Adivine el número que se genero");
            posibleNumero = leer.nextLine();
            try {
                 num=Integer.parseInt(posibleNumero);
            } catch (NumberFormatException e) {
                System.out.println("VALOR NO VALIDO");
            }
            contador+=1;
            if(num> nAleatorio){
                System.out.println("¡El numero ingresado es mayor, intentelo nuevamente!");
            }else if(num<nAleatorio){
                System.out.println("¡El numero ingresado es menor, intentelo nuevamente!");
            }
        } while (num!=nAleatorio);
        System.out.println("Usted adivino el numero!!!!!!");
        System.out.println("Numero de intentos: "+contador);
    }
    
}
