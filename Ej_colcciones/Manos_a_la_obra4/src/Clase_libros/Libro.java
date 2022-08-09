/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase_libros;

/**
 *
 * @author sofia
 */
public class Libro {

   String titulo;

    public String getTitulos() {
        return titulo;
    }

    public void setTitulos(String titulos) {
        this.titulo = titulos;
    }
   
   @Override
        public String toString(){
        return "{" + "su titulo es "+ titulo + "}";
        }
 
    
}
