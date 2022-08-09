/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej4_cine;

import Servicio.ServicioPelicula;

/**
 *
 * @author sofia
 */
public class EJ4_Cine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicioPelicula sr= new ServicioPelicula();
        sr.crearPelicula();
        sr.mostraPeli();
        sr.duracionMasDhora();
        sr.ordenarPeli();
        sr.ordenarMenorAmayor();
        sr.ordenarAaZ();
        sr.ordenarPorDirector();
        
        
    }
    
}
