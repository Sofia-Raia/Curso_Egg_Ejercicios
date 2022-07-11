/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2_circunferencia;

import Circunferencia.Circunferencia;

/**
 *
 * @author sofia
 */
public class Ej2_circunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double radio=0;
        
        Circunferencia circ= new Circunferencia(radio);
        circ.crearCircunferencia();
        System.out.println("El area es :"+ circ.area());
        System.out.println("El perimetro es :"+circ.perimetro());
       
        
    }
    
}
