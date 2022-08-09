/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manos_a_la_obra3;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author sofia
 */
public class Manos_a_la_obra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> bebidas = new ArrayList();
        bebidas.add("cafe");
        bebidas.add("te");
        Iterator<String> it = bebidas.iterator();
        while(it.hasNext()){
       
          if (it.next().equals("cafe")) {
            it.remove(); 
          }
        }
    }
}
