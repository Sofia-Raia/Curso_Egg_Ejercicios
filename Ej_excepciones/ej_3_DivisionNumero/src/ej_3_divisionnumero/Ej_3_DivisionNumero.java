/*Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej_3_divisionnumero;

import java.util.Scanner;

/**
 *
 * @author sofia
 */
public class Ej_3_DivisionNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        
        String num;
        String num2;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        num=leer.nextLine();
        int numEntero=0;
        try {
           numEntero = Integer.parseInt(num); 
        } catch (Exception e) {
            System.out.println("No ingreso un numero valido, se toma 0");
        }
        System.out.println("Ingrese el segundo numero");
        num2=leer.nextLine();
        int numEntero2 =1;
        try {
            numEntero2 = Integer.parseInt(num2);
        } catch (Exception e) {
            System.out.println("No ingreso un numero valido, se toma 1");
        }
       
        double dividir=(double)numEntero/(double)numEntero2;
        System.out.println("La division de los numeros es "+dividir);
        
        
        
        
       
    }
    
}
