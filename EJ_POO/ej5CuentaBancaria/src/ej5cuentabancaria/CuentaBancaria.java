/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej5cuentabancaria;

import java.util.Scanner;

/**
 *
 * @author sofia
 */
public class CuentaBancaria {
    Scanner read=new Scanner(System.in);
    int numeroCuenta;
    long dni_cliente;
    int saldo_actual;
    double interes;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numeroCuenta, long dni_cliente, int saldo_actual, double interes) {
        this.numeroCuenta = numeroCuenta;
        this.dni_cliente = dni_cliente;
        this.saldo_actual = saldo_actual;
        this.interes = interes;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getDni_cliente() {
        return dni_cliente;
    }

    public int getSaldo_actual() {
        return saldo_actual;
    }

    public double getInteres() {
        return interes;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDni_cliente(long dni_cliente) {
        this.dni_cliente = dni_cliente;
    }

    public void setSaldo_actual(int saldo_actual) {
        this.saldo_actual = saldo_actual;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }
    //metodo para crear un objeto de cuenta
    public void objetoCuenta(){
        System.out.println("A continuacion ingrese su numero de cuenta ");
        numeroCuenta= read.nextInt();
        System.out.println("Ingrese su DNI");
        dni_cliente=read.nextLong();
        System.out.println("Ingrese su saldo actual");
        saldo_actual=read.nextInt();
        
    }
    //Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
    //y se la sumara a saldo actual.
    public void ingresar(double ingreso){ 
       
        saldo_actual = saldo_actual + (int) ingreso;
        System.out.println("Su saldo quedo en :"+saldo_actual);
    }
    //Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
   //restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
   //saldo actual en 0.
    public void retirar(double retiro){
   
        if (saldo_actual< retiro){
            saldo_actual=0;
          
        }else{
            saldo_actual =  saldo_actual - (int) retiro;
        }
        
    }
   //Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
    //usuario no saque más del 20%.
    public void extraccionRapida(){
        System.out.println("Ingrese el monto que desea retirar de manera express");
        int ext_rap= read.nextInt();
        double max= saldo_actual /5 ;
        if( ext_rap <= max){
            saldo_actual = saldo_actual - ext_rap;
        }else{
            System.out.println("No es posible retirar mas del 20% de su saldo");
        }
        
    }
    //Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
    public void consultarSaldo(){
        System.out.println("su saldo actual es de :"+ saldo_actual);
        
    }
    //Método consultar:Datos(): permitirá mostrar todos los datos de la cuenta
    public void consultarDatos(){
        System.out.println("Sus datos son los siguientes..");
        System.out.println("Su numero de cuenta es: "+numeroCuenta);
        System.out.println("su DNI es :"+dni_cliente);
        System.out.println("su saldo actual es de :"+saldo_actual);
    }
}
  