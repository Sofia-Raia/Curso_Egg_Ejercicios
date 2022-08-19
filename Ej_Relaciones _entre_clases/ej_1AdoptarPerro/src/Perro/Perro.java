/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perro;

/**
 *
 * @author sofia
 */
public class Perro {
    String nombre;
    String raza;
    int edad;
    String tamagnio;

    public Perro(String nombre, String raza, int edad, String tamagnio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamagnio = tamagnio;
    }

    public Perro() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    public String getTamagnio() {
        return tamagnio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTamagnio(String tamagnio) {
        this.tamagnio = tamagnio;
    }
    @Override
    public String toString() {
        return "Datos de la perra adoptada; nombre "+ nombre+ "raza: "+ raza +
                " edad: "+ edad+ " y su tamaño es: "  +tamagnio;
    }
    
}
