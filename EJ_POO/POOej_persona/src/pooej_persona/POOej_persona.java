/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooej_persona;
import Entidad.Persona;
//siempre que voy a utilisar otra clase la importo
import Service.PersonaService;
/**
 *
 * @author sofia
 */
public class POOej_persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instaciacion utilizamos el constructor vacio
        Persona primeraPersona= new Persona();
        // Con  SET asigno un nombre al atributo nombre
        primeraPersona.setNombre("sofia");
        // con GET consulto la informacion, en este caso la muestro.
        System.out.println(primeraPersona.getGenero());
        //Instanciacion utilizamos el constructor por parametro
        Persona segundaPersona= new Persona("Nicolas");
        
        System.out.println(segundaPersona.getNombre());
        //llamo a la funcion mostrar persona de la clase servicio.
        PersonaService persServicio= new PersonaService();
        persServicio.mostrarPersona(segundaPersona);
         
         
         
    }
    
}
