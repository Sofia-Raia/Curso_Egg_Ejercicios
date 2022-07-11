/*Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ej14_vectores;

/**
 *
 * @author sofia
 */
import java.util.Scanner;
public class EJ14_vectores {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Introdusca la cantidad de euros que decea cambiar");
        double euros_cant= leer.nextInt();
        leer.nextLine();
        System.out.println("¿A que mondeda desea convertirlos?");
        String moneda= leer.nextLine();
        convertidor_moneda(euros_cant, moneda);
    }
    public static void convertidor_moneda(double euros_cant, String moneda ){
        String dolar="dolar";
        String yenes="yenes";
        String libras="libras";
        if (moneda.equalsIgnoreCase(dolar)){
            double mon_dolar= 1.28611* euros_cant;
            System.out.println("la cantidad de dolares es "+ mon_dolar);
        }else if (moneda.equalsIgnoreCase(yenes)){
            double mon_yenes= 129.852* euros_cant;
            System.out.println("la cantidad de yenes es "+mon_yenes);
        }else if(moneda.equalsIgnoreCase(libras)){
            double mon_libras= 0.86* euros_cant;
            System.out.println("la cantidad de libras es "+mon_libras);
        }else{
            System.out.println("no cambiamos ese tipo de moneda");
           
            
        }
        
    }
    
    
}
