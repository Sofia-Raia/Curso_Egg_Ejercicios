/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Peliculas.Pelicula;
import java.util.Comparator;

/**
 *
 * @author sofia
 */
class comparator<T> {
    //  En esta parte creo un comparador que ordena de forma descendente y luego se usa
    //en el metodo del servivio "ordenar por duracion" 
    public static Comparator<Pelicula> ordenarPorDuracion= new Comparator<Pelicula> (){
        
    @Override
    public int compare(Pelicula o1, Pelicula o2){
        return o2.getDuracion().compareTo(o1.getDuracion());
    }
    };
    public static Comparator<Pelicula> ordenarMenorMayor= new Comparator<Pelicula> (){
        @Override
        public int compare(Pelicula o1, Pelicula o2){
           return o1.getDuracion().compareTo(o2.getDuracion()); 
        }
    };
    
    public static Comparator<Pelicula> ordenarAlfabeticamente= new Comparator<Pelicula> (){
        @Override
        public int compare(Pelicula o1, Pelicula o2){
           return o1.getTitulo().compareTo(o2.getTitulo()); 
        }
        
    }; 
      
     
    public static Comparator<Pelicula> ordenarDirector= new Comparator<Pelicula> (){
        @Override
        public int compare(Pelicula o1, Pelicula o2){
           return o1.getDirector().compareTo(o2.getDirector()); 
        }
        
    };   
      
}
