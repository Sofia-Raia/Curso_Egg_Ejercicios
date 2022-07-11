/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3_operacion;

/**
 *
 * @author sofia
 */
public class Ej3_operacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operacion op = new Operacion();
        op.crearOperacion();
        System.out.println("suma de los numeros : "+op.sumar());
        System.out.println("resta de los numeros :" +op.restar());
        System.out.println("multiplicacion de los numeros : "+op.mult());
        System.out.println("division de los numeros :"+ op.div());
        
    }
    
    
}
