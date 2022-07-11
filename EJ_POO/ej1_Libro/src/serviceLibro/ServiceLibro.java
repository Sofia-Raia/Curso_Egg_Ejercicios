/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serviceLibro;

import Libro.Libro;
import java.util.Scanner;

/**
 *
 * @author sofia
 */
public class ServiceLibro {

    public ServiceLibro() {
    }
    //aca se carga el libro
    public Libro cargarLibro(){
       Scanner leer= new Scanner(System.in);
               System.out.println("Creando un libro...");
       System.out.println("ingrese el numero de ISBN");
       int ISBN =leer.nextInt();
       leer.nextLine();
       System.out.println("ingrse el titulo del libro");
       String titulo=leer.nextLine();
       System.out.println("ingrese el autor");
       String autor=leer.nextLine();
       System.out.println("ingrese la cantidad de pág");
       int pag=leer.nextInt();
       leer.nextLine();
       Libro libro = new Libro(ISBN, titulo, autor, pag);
       return libro;
   }
}
