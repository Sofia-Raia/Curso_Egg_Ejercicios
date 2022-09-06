/*Vamos a crear una clase Animal que tenga un método hacerRuido() que devuelva un saludo
“Hola”. Luego haremos clase Perro y clase Gato que extiendan de Animal y sobreescriban el
método hacerRuido() con el ruido que corresponda a cada uno. Luego, en el main vamos a crear
un ArrayList de animales y los siguientes animales
Animal a = new Animal();
Animal b = new Perro();
Animal c = new Gato();
Agregaremos a la lista a cada uno y luego, con un for each, recorreremos la lista llamando al
método hacerRuido() de cada ítem.
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_animal;

import animal.Animal;
import gato.Gato;
import java.util.ArrayList;
import perro.Perro;

/**
 *
 * @author sofia
 */
public class Ejercicio_animal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     ArrayList<Animal>animales= new ArrayList();
        Animal a = new Animal();
        Animal b = new Perro();
        Animal c = new Gato();

         animales.add(a);
         animales.add(b);
         animales.add(c);
         int recorrer=0;
         for (Animal animalitos : animales) {
             animalitos.hacerRuido();
        }
     
     
    }

    
}
