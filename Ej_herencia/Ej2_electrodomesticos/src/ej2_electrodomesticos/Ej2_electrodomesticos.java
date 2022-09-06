/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2_electrodomesticos;

import java.util.ArrayList;

/**
 *
 * @author sofia
 */
public class Ej2_electrodomesticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("///////////Cargue los datos de los Televisores: //////////////");
        System.out.println("Datos del primer tv.");
        Televisor t= new Televisor();
        Televisor t1= new Televisor();
        t.crearTelevisor();
        t.precioFinal();
        System.out.println("El precio final del televisor queda en $"+ t.getPrecio());
        System.out.println("Datos del segundo tv.");
        t1.crearTelevisor();
        t1.precioFinal();
        System.out.println("El precio final del televisor queda en $"+ t1.getPrecio());
        System.out.println("///////////Cargue los datos de las Lavadora: //////////////");
        System.out.println("Datos de la primera lavadora.");
        Lavadora l=new Lavadora();
        l.crearLavadora();
        l.precioFinal();
        System.out.println("El precio final de la  lavadora queda en $"+l.getPrecio());
        System.out.println("Datos de la segunda lavadora.");
        Lavadora l1=new Lavadora();
        l1.crearLavadora();
        l1.precioFinal();
        System.out.println("El precio final de la  lavadora queda en $"+l1.getPrecio());
// Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
//para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
        ArrayList <Electrodomesticos> elec= new ArrayList();
        elec.add(t);
        elec.add(t1);
        elec.add(l);
        elec.add(l1);
//Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
//deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
//televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
//precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
//2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
//electrodomésticos, 2000 para lavadora y 5000 para televisor.
        double suma=0;
        for (Electrodomesticos electrodomesticos : elec) {
          double precio=electrodomesticos.precioFinal();
          System.out.println("El precio del electrodomestico:  "+ electrodomesticos.getClass().getSimpleName()+ " es $"+precio);
          suma+=precio;
         
        }
         System.out.println("La suma de la compra es: $" + suma );

    }
    
}
