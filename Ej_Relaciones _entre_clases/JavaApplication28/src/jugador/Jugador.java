/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jugador;

/**
 *
 * @author sofia
 */
public class Jugador {
    String nombre;
    String apellido;
    int num_jugador;
    int posicion;

    public Jugador() {
    }

    public Jugador(String nombre, String apellido, int num_jugador, int posicion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.num_jugador = num_jugador;
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getNum_jugador() {
        return num_jugador;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNum_jugador(int num_jugador) {
        this.num_jugador = num_jugador;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Nombre del jugador: "+ nombre + ", apellido: "+ apellido+", numero de jugador: "+num_jugador + " y  posicion en la cancha: "+ posicion;
    }

    
    
    
    
    
    
    
}
