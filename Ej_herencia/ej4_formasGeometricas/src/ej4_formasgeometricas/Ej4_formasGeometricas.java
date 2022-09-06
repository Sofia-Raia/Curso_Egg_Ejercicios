/*Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante. 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej4_formasgeometricas;

import java.util.Scanner;

/**
 *
 * @author sofia
 */
public class Ej4_formasGeometricas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        // TODO code application logic here
        Rectangulo r=new Rectangulo();
        System.out.println("////////////RECTANGULO///////////////");
        System.out.println("Ingrese el ancho;");
        double ancho= leer.nextDouble();
        r.setAncho(ancho);
        System.out.println("Ingrese el largo;");
        double largo=leer.nextDouble();
        r.setLargo(largo);
        r.calcularArea();
        r.calcularPerimetro();
        Circulo c=new Circulo();
        System.out.println("////////////CIRCULO////////////////");
        System.out.println("Ingrese el radio;");
        double radio=leer.nextDouble();
        c.setRadio(radio);
        System.out.println("Ingrese el diametro;");
        double diametro=leer.nextDouble();
        c.setDiametro(diametro);
        c.calcularArea();
        c.calcularPerimetro();
    }
    
}
