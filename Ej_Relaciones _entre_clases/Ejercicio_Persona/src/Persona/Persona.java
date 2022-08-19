/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persona;

import dni.Dni;

/**
 *
 * @author sofia
 */
public class Persona {
    String nombre;
    String apellido;
    Dni doc;

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Dni getDoc() {
        return doc;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDoc(Dni doc) {
        this.doc = doc;
    }

    public Persona(String nombre, String apellido, Dni doc) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.doc = doc;
    }
    //// otra forma p2 
    public Persona(String nombre, String apellido, char serie, int num) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.doc = new Dni(serie,num);
    }
    

    public Persona() {
    }
    
   
}
