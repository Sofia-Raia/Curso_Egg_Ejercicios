/*Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
puede conseguir instanciando un objeto Date con constructor vacío.

Ejemplo fecha: Date fecha = new Date(anio, mes, dia);

Ejemplo fecha actual: Date fechaActual = new Date();


 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej11clasedate;

import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author sofia
 */
public class Ej11ClaseDate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dia=0;
        int mes=0;
        int anio=0;
        Scanner read=new Scanner(System.in);
       
       
       
        System.out.println("A continuacion ingrese una fecha");
        System.out.println("*Ingrese un día:");
        dia=read.nextInt();
        System.out.println("*Ingrese un mes en numeros:");
        mes=read.nextInt();
        System.out.println("*Ingrese un año sin puntos:");
        anio=read.nextInt();
        
        Date fechaNueva = new Date(anio,mes,dia);
        System.out.println("La fecha nueva es :"+ fechaNueva);
        Date ActualFecha=new Date();
        System.out.println("Fecha actual"+ ActualFecha);
       
        
        //me quedan las fechas en milisegundos.
        long diferencia=  ActualFecha.getTime()-fechaNueva.getTime();
        //clase de java para hacer converciones de tiempo "TimeUnit", time es una variable
        TimeUnit time = TimeUnit.DAYS; 
        long diferenciaDias = time.convert(diferencia, TimeUnit.MILLISECONDS);
        long diferenciaAnio= diferenciaDias/365;
        System.out.println("Diferencia de años entre el actual con el año ingresado es de.."+diferenciaAnio +" años" );
    }

    

    
}
