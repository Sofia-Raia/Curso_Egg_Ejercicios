/* 
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.


Después de ese bucle realizaremos las siguientes acciones:
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Peliculas.Pelicula;
import java.util.*;

/**
 *
 * @author sofia
 */
public class ServicioPelicula {
    Scanner read= new Scanner(System.in);
    ArrayList<Pelicula> peliculas= new ArrayList();
    //En este metodo creo objetos peliculas.
     public  ArrayList <Pelicula> crearPelicula(){
        String respuesta="si";
        while (respuesta.equalsIgnoreCase("si")){
        System.out.println("Ingrese el titulo de la pelicula que va acargar");
        String titulo =read.nextLine();
        System.out.println("Ingrese el nombre de quien dirigio la pelicula");
        String director= read.nextLine();
        System.out.println("Ingrese la duracion en hs");
        double duracion= read.nextDouble();
        read.nextLine();
        Pelicula peli =new Pelicula(titulo,director,duracion);
        peliculas.add(peli);
        System.out.println("¿Desea agregar otra pelicula a la lista?");
        respuesta=read.nextLine();
        }
        
        return  peliculas;
    }
//Mostrar en pantalla todas las películas.
     public void mostraPeli(){
         System.out.println("//////////Las peliculas cargadas son: ////////////");
         for (Pelicula pelicula : peliculas) {
             System.out.println(pelicula);
             
         }
     }
//Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
      
     public  void duracionMasDhora(){
         System.out.println("///// Peliculas que duran mas de una hora//////////");
         for (Pelicula pelicula : peliculas) {
             if( pelicula.getDuracion() > 1 ){
                System.out.println(pelicula); 
             }
         }
     }
//Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
//pantalla.

    public void ordenarPeli(){
        peliculas.sort(comparator.ordenarPorDuracion);
        System.out.println("///////Peliculas ordenadas por duaracion de mayor a menor./////////");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
            
        }
    }
//   Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
//pantalla.     
  public void ordenarMenorAmayor(){
      peliculas.sort(comparator.ordenarMenorMayor);
      System.out.println("//////////Peliculas ordenadas por duaracion de menor a mayor.///////////");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
            
        }
      
      
  }
  //Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
  public void ordenarAaZ(){
      peliculas.sort(comparator.ordenarAlfabeticamente);
      System.out.println("////////Peliculas ordenadas alfabeticamente./////////");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
            
        }
  }
   //Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
    public void ordenarPorDirector(){
      peliculas.sort(comparator.ordenarDirector);
      System.out.println("/////////Peliculas ordenadas alfabeticamente por director./////////");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);    
        }
    }
    
  
}
