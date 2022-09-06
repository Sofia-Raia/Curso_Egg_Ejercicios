/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_interfaz;

/**
 *
 * @author sofia
 */
public class Animales implements interface_animal {
    private String tipo;
    private String raza;

    public Animales(String tipo, String raza) {
        this.tipo = tipo;
        this.raza = raza;
    }

    public Animales() {
    }

    public String getTipo() {
        return tipo;
    }

    public String getRaza() {
        return raza;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void respirar(String tipo) {
        System.out.println("Este animal repira por:  "+ tipo);
    }

    @Override
    public void caminar(String tipo) {
        System.out.println("es :"+ tipo);
    }

    @Override
    public void cuerpo(String tipo) {
        System.out.println("y tiene el cuerpo :" + tipo);
    }
    
    
}
