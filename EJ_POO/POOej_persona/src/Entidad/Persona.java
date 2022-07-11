/*Es tu turno, crea tu propio proyecto con la clase Persona.
Seguiremos trabajando sobre la clase Persona que creamos y ahora deberás sumarle 3 atributos
que creas pertinentes.
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author sofia
 */
public class Persona {
    public String nombre;
    public String genero;
    public int edad;

    public Persona() {
    }
    
    public Persona(String nombre){
        this.nombre= nombre;
    }
    
        //public Persona(String nombre, String genero, int edad) {
       // this.nombre = nombre;
       // this.genero = genero;
       // this.edad = edad;
    //}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public int getEdad() {
        return edad;
    }
    
}
