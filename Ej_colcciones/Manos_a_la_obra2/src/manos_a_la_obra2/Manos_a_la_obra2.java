/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manos_a_la_obra2;

import java.util.HashMap;

/**
 *
 * @author sofia
 */
public class Manos_a_la_obra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        HashMap<Integer,String> personas = new HashMap();
        String n1= "Albus";
        int dni=123;
        String n2= "Severus";
        int dni1= 124;
        
        personas.put(dni,n1);
        personas.put(dni1,n2);

    }

}
