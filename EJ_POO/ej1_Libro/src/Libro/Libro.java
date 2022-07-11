/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libro;

import java.util.Scanner;

/**
 *
 * @author sofia
 */
public class Libro {
    int ISBN;
    String titulo;
    String autor;
    int cantPaginas;

    public Libro() {
    }

    public Libro(int ISBN, String titulo, String autor, int cantPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.cantPaginas = cantPaginas;
    }
    //funcion de mostrar
    public void mostrarLibro() {
        System.out.println("Mostrando un libro...");
        System.out.println("El ISBN de este libro es: "+ISBN);
        System.out.println("El titulo de este libro es: "+titulo);
        System.out.println("El autor de este libro es: "+autor);
        System.out.println("Las paginas de este libro son: "+cantPaginas);   
    }
}
