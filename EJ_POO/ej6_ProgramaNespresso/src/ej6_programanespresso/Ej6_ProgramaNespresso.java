/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej6_programanespresso;

import Cafetera.Cafetera;
import java.util.Scanner;

/**
 *
 * @author sofia
 */
public class Ej6_ProgramaNespresso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read= new Scanner(System.in);
        Cafetera caf = new Cafetera();
        //establesco para esca cafetera los valores.
        caf.setCapacidadMaxima(20);
        caf.setCantidadActual(5);
        caf.llenarCafetera();
        System.out.println("Indique el tamaño de la taza");
        int tam_taza=read.nextInt();
        caf.servirTasa(tam_taza);
        caf.vaciarCafetera();
        System.out.println("Indique que cantidad de cafe quiere agregar en la cafetera");
        int cant_cafe= read.nextInt();
        caf.agregarCafe(cant_cafe);
        
    }
    
}
