/*Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String)
y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese una frase
que puede ser una palabra o varias palabras separadas por un espacio en blanco y a
través de los métodos set, se guardará la frase y la longitud de manera automática según
la longitud de la frase ingresada. Deberá además implementar los siguientes métodos:

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej8_cadena;

import java.util.Scanner;

/**
 *
 * @author sofia
 */
public class Ej8_Cadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read= new Scanner(System.in);
        Cadena cadena= new Cadena();
        System.out.println("A continuacion ingrese una frase");
        String frase= read.nextLine();
        cadena.setFrase(frase);
        cadena.setLongitud(frase.length());
        
        cadena.mostrarVocales();
        
        cadena.invertirFrase();
        System.out.println("Ingrese la letra que desea contar");
        String letra=read.nextLine();
        cadena.vecesRepetido(letra);
        System.out.println("Ingrese una nueva frase para unirla a la anterior");
        frase= read.nextLine();
        cadena.unirFrases(frase);
        System.out.println("Ingrese una nueva frase para comparar logitudes");
        frase=read.nextLine();
        cadena.compararLongitud(frase);
        cadena.unirFrases(frase);
        System.out.println("Ingrese el caracter que desea reemplazar por la letra A");
        letra=read.nextLine();
        cadena.reemplazar(letra);
        System.out.println("Ingrese la letra que quiere buscar");
        letra=read.nextLine();
        cadena.contiene(letra);

        
        
    }
    
}
