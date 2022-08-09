/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manos_a_la_obra4;

import Clase_libros.Libro;
import java.util.ArrayList;

/**
 *
 * @author sofia
 */
public class Manos_a_la_obra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       // ¡Es tu turno! Crea una lista de Libros y muestra el título de cada uno con un bucle.
        
        ArrayList <Libro> libros=new ArrayList();
        
        Libro libro =new Libro();
        libro.setTitulos("La sirenita");
        libros.add(libro);
        
        
        Libro libro2 =new Libro();
        libro2.setTitulos("La bella durmiente");
        libros.add(libro2);
        
        Libro libro3 =new Libro();
        libro3.setTitulos("La bella y la bestia");
        libros.add(libro3);
        
        Libro libro4 =new Libro();
        libro4.setTitulos("La cenicienta");
        libros.add(libro4);
        
        Libro libro5 =new Libro();
        libro5.setTitulos("Barbie y el cascanueces");
        libros.add(libro5);
    
        int  contador=0;
        for (Libro ejemplar : libros) {
            contador++;
            System.out.println("Para el libro "+ contador+ ejemplar);
            
        }
        
        
    }
    
}
