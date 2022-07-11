/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej12persona;

import Service.ServicePersona;
import ej12persona.newpackage.Persona;

/**
 *
 * @author sofia
 */
public class Ej12Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       ServicePersona sp= new ServicePersona();
       Persona p1= sp.crearPersona();
        int edad= p1.calcularEdad();
        p1.menorQue(edad);
        p1.mostrarPersona();
       
        
    
       
       
    }
    
}
