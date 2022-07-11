/*Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ej11_bucle_menu;

/**
 *
 * @author sofia
 */
import java.util.Scanner;
public class Ej11_bucle_menu {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        double num1;
        double num2;
        String respuesta="";
        do{
            System.out.println("A continuacion ingrese dos numeros ");
            num1= leer.nextInt();
            num2= leer.nextInt();
        }while(num1<0 || num2<0);
        int menu;
            do {
                System.out.println("MENU - Elija una opcion");
                System.out.println("1.sumar");
                System.out.println("2.restar");
                System.out.println("3.multiplicar");
                System.out.println("4.dividir");
                System.out.println("5.salir");
                menu = leer.nextInt();
                switch(menu){
                    case 1:
                        double suma=num1+num2;
                        System.out.println(suma);
                        break;
                    case 2:
                        double resta= num1-num2;
                        System.out.println(resta);
                        break;
                    case 3:
                        double mult=num1*num2;
                        System.out.println(mult);
                        break;
                    case 4:
                        if (num2 == 0) {
                            System.out.println("No se puede dividir por 0");
                            //si uso continue me vueleve a pedir los numeros.
                            //si uso break me saca del programa.
                            continue;
                        }
                        double div = num1/num2;
                        System.out.println(div);
                        break;
                    case 5:
                        System.out.println("¿Esta seguro que deseasalir del programa s/n?");
                        leer.nextLine();
                        respuesta=leer.nextLine();
                        break;
                    default:
                        System.out.println("el numero ingresado no corresponde al menu");
                        break;
                }
            } while (!respuesta.equalsIgnoreCase("s"));     
    }
}
