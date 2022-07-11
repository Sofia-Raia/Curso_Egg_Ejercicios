/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej5cuentabancaria;

import java.util.Scanner;

/**
 *
 * @author sofia
 */
public class Ej5CuentaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read= new Scanner(System.in);
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.objetoCuenta();
        System.out.println("Indique que monto desea ingresar :");
        double ingreso=read.nextDouble();
        cuenta.ingresar(ingreso);
        System.out.println("Indique que monto desea retirar :");
        double retiro=read.nextDouble();
        cuenta.retirar(retiro);
        cuenta.extraccionRapida();
        cuenta.consultarSaldo();
        cuenta.consultarDatos();
    }
    
}
