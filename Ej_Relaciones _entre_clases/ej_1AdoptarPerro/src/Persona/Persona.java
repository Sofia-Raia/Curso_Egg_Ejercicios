/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persona;

import Perro.Perro;
import java.util.Scanner;

/**
 *
 * @author sofia
 */
public class Persona {
  
    String nombre;
    String apellido;
    int edad;
    int dni;
    Perro mascota;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, int dni, Perro mascota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.mascota = mascota;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public int getDni() {
        return dni;
    }

    public Perro getMascota() {
        return mascota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setMascota(Perro mascota) {
        this.mascota = mascota;
    }

    @Override
    public String toString() {
        return "Datos de la persona; nombre: "+ nombre+ " apellido: "+ apellido + " edad: "+ edad +
                " DNI: "+ dni+" mascota: "+ mascota;
    }
    
    
    
    
    
    
    
    
}
