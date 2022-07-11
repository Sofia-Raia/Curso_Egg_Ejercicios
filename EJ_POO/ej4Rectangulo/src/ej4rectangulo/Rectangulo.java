/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej4rectangulo;
import java.util.Scanner;
/**
 *
 * @author sofia
 */
public class Rectangulo {
    Scanner read= new Scanner(System.in);
    private double base;
    private double altura;
    public void CrearRectangulo(){
        double rectangulo;
        System.out.println("A continuacion ingrese los atributos del rectagulo");
        System.out.println("ingrese la base del rectangulo");
        base= read.nextDouble();
        System.out.println("ingrese la altura del rectangulo");
        altura= read.nextDouble();
    }
    public double Superficie(){
        double superficie;
        superficie= base*altura;
        return superficie;
    }
    public double Perimetro(){
        double perimetro;
        perimetro=(base + altura)*2;
        return perimetro;
        
    }
    public void Dibujar(){
        for (int i=0; i< altura; i++){
            for (int l=0; l< base; l++){
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Scanner getRead() {
        return read;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setRead(Scanner read) {
        this.read = read;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Rectangulo() {
    }
    
    
}
