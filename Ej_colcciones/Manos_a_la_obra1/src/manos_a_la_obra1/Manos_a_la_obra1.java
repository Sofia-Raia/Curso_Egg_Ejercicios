/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manos_a_la_obra1;

import java.util.ArrayList;
import java.util.TreeSet;
import java.util.HashMap;

/**
 *
 * @author sofia
 */
public class Manos_a_la_obra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> listado = new ArrayList();
        //agrego elementos a la LISTA con "ADD".
        int s = 21;
        int d = 23;
        int e = 25;
        listado.add(s);
        listado.add(d);
        listado.add(e);
        //remuevo un elemento de la lista 
        listado.remove(e);
        ////////////////////////////////////////////////////////
       
        TreeSet<String> palabras = new TreeSet();
         //Agrego elementos al SET con "ADD".

        String uno = "sofia";
        String dos = "franco";
        String tres = "nicolas";
        palabras.add(uno);
        palabras.add(dos);
        palabras.add(tres);
        //remuevo un elemento del set por "elementos"
        palabras.remove("nicolas");
        /////////////////////////////////////////////////////////////

        HashMap<Integer, String> persona = new HashMap();
         //Agrego elementos al MAPA con "PUT".

        int dni= 234;
        String nombre= "sofia";
        int dni1= 2348;
        String nombre1= "nico";
        int dni2= 2343;
        String nombre2= "axel";
        persona.put(dni, nombre);
        persona.put(dni1, nombre1);
        persona.put(dni2, nombre2);
        //remuevo un elemento del mapa a traves de la llave.
        persona.remove(2343);
        
        
    }

}
