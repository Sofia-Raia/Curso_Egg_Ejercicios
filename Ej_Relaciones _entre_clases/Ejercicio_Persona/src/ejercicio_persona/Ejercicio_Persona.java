/*

Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número.

Prueba acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.


 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_persona;

import Persona.Persona;
import dni.Dni;

/**
 *
 * @author sofia
 */
public class Ejercicio_Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Dni doc1 = new Dni('a',123456789);
        Persona p1= new Persona("S0fia","Raia",doc1);
        //Persona p1= new Persona("S0fia","Raia",new Dni('a',123456789));
        Persona p2 = new Persona("Nico","Marq",'a',123456789);
        
        System.out.println("Ingrese el numero de dni de la persona");
        
       
        p1.getDoc().getN_doc();
        p1.getNombre();
        




     
    }
    
}
