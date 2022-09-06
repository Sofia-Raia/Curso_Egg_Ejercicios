/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej4_formasgeometricas;

/**
 *
 * @author sofia
 */
public class Rectangulo implements CalculosFormas{
    double largo;
    double ancho;

    public Rectangulo() {
    }

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    @Override
    public void calcularArea() {
        double area=largo+ancho;
        System.out.println("El area del rectangulo es de: "+ area+ "cm.");
    }

    @Override
    public void calcularPerimetro() {
        double perimetro= (largo*2)+ (ancho*2);
        System.out.println("El perimetro del rectangulo es de: "+perimetro+"cm.");
    }

    
}
