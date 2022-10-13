/*Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2_arrayfueraderango;

import java.util.ArrayList;

/**
 *
 * @author sofia
 */
public class Ej2_ArrayFueraDeRango {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
       
        int[] array1 = new int[5];
      
        try {
           array1[8]= 6;
        }catch(ArrayIndexOutOfBoundsException a){
            System.out.println("Fuera de rango.");
        } 
      
    }
    
}
