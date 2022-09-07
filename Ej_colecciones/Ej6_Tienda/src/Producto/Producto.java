/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Producto;

/**
 *
 * @author sofia
 */
public class Producto {
    String nombreP;
    double precio;

    public Producto() {
    }

    public Producto(String nombreP, double precio) {
        this.nombreP = nombreP;
        this.precio = precio;
    }

    public String getNombreP() {
        return nombreP;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
