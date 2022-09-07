/*Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1_perro;

import java.util.*;

/**
 *
 * @author sofia
 */
public class Ej1_Perro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList();
        String agregar_perro = "si";

        while (agregar_perro.equalsIgnoreCase("si")) {
            System.out.println("Introduzca la raza del perro que desea agregar a la lista");
            String raza = read.nextLine();
            lista.add(raza);
            System.out.println("¿Desea agregar un raza mas a la lista?");
            agregar_perro = read.nextLine();
        }
        System.out.println("Las razas de perro son:");

        for (String razas : lista) {

            System.out.println("*" + razas);
        }

        //////////////parte 2///////////////
//Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
//un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
//está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
//ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
//la lista ordenada.
        System.out.println("Ingrese la raza de perro que desea eliminar de la lista");
        boolean raza_encontrada=false;
        String eliminar_raza = read.nextLine();
        Iterator<String> iterador = lista.iterator();
        while (iterador.hasNext()) {
            String raxaActual = iterador.next();// puedo usar directamente iterador.next(). significa proximo elemento.
            if (raxaActual.equals(eliminar_raza)) {
                iterador.remove();
                raza_encontrada=true;
            } 
        }
        Collections.sort(lista);
        System.out.println(lista);
        if(raza_encontrada== false){
            System.out.println("¡No se encontro la raza ingresada!");
        }
    }
}
