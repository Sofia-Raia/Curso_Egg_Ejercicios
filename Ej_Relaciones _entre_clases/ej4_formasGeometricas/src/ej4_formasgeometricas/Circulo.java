/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej4_formasgeometricas;

/**
 *
 * @author sofia
 */
public class Circulo implements CalculosFormas {
    double radio;
    double diametro;

    public Circulo() {
    }

    public Circulo(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public double getRadio() {
        return radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    //Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.

    @Override
    public void calcularArea() {
      double area= valorPi*Math. pow(radio,2);
        System.out.println("El area del circulo es de: "+area+ "cm.");
    }

    @Override
    public void calcularPerimetro() {
        double perimetro= valorPi+diametro;
        System.out.println("El perimetro del circulo es de: "+perimetro+"cm.");
    }

    
}
