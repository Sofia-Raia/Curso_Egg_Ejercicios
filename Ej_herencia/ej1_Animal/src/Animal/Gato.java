/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animal;

/**
 *
 * @author sofia
 */
public class Gato extends Animal{

    public Gato(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void alimenteacion() {
        super.alimenteacion(); 
        System.out.println("Este gato se alimenta con alimento: "+alimento);
    }
    
}
