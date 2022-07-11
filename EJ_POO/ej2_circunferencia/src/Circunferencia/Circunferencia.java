/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Circunferencia;

import java.util.Scanner;

/**
 *
 * @author sofia
 */
public class Circunferencia {
    Scanner leer=new Scanner(System.in);
 private double radio;
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
   
    public void crearCircunferencia(){
        System.out.println("Ingrese el radio de la circunferencia: ");
        radio=leer.nextDouble();
        
    }
    //metodo para calcular area, use pi que es pi, pow que es para elevar un numero.
    public double area(){
        double area;
        area= Math.PI * Math.pow(radio, 2);
        
      return  area;  
    }
    //metodo del perimetro.
    public double perimetro(){
        double perimetro;
        perimetro= 2* Math.PI* radio;
        return perimetro;
    }
}
