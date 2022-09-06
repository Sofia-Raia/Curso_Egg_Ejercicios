/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1_animal;

import Animal.Caballo;
import Animal.Gato;
import Animal.Perro;

/**
 *
 * @author sofia
 */
public class Ej1_Animal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //nombre, alimento, edad y raza del Animal.
        Perro  p1=  new Perro("Aika", "kenL",5,"Pitbull");
        p1.alimenteacion();
        System.out.println(p1);
        Perro p2= new Perro("Josefina","Raza", 10,"Callejera");
        p2.alimenteacion();
        Gato g=new Gato("Gino","Purina Cat chow", 2, "Persa");
        g.alimenteacion();
        Caballo c =new Caballo("Spirit", "Fardos de pasto", 5, "Salvaje");
        c.alimenteacion();
       
    }
    
}
