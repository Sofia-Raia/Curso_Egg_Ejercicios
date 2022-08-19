/*
Realizar un programa para que una Persona pueda adoptar un Perro. 
Vamos a contar de dos clases. 
Perro, que tendrá como atributos: nombre, raza, edad y tamaño; 
y la clase Persona con atributos: nombre, apellido, edad, documento y Perro.

Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 
*/
package ej_1adoptarperro;

import Perro.Perro;
import Persona.Persona;
import ServicioPer.ServicioPer;
import java.util.Scanner;

/**
 *
 * @author sofia
 */
public class Ej_1AdoptarPerro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read =new Scanner(System.in);
        ServicioPer sr =new ServicioPer();
        Perro perro1= new Perro("Aika", "Pitbul", 5, "Mediano");
        Perro perro2= new Perro("Josefina", "Calljera", 7, "Grande");
        Persona p1= new Persona("Sofia", "Raia", 25, 4405, new Perro());
        Persona p2= new Persona("Nicolas", "Marquez", 24, 4328, new Perro());
        //p1.setMascota(perro1);
        //p2.setMascota(perro2);
        sr.adoptar_perro(p1, p2, perro1, perro2);
        sr.mostrar_persona(p1, p2);
     

       
        
        
    }
}
   
       
 

