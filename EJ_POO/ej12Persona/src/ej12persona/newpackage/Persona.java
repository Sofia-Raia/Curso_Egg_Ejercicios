/*Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
métodos:


 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej12persona.newpackage;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author sofia
 */
public class Persona {
    Scanner read= new Scanner(System.in);
    
    Date nacimiento;
    
    String nombre;

    public Persona() {
    }

    public Persona(Date nacimiento,String nombre) {
        this.nombre = nombre;
        this.nacimiento=nacimiento;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

 //Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
//en cuenta que para conocer la edad de la persona también se debe conocer la fecha
//actual.
    public int calcularEdad(){
        int edad=0;
        Date fecha=new Date();
        edad= fecha.getYear()- nacimiento.getYear();
        System.out.println("Su edad es de .. "+edad+ "..años.");
        return edad;  
    }
// Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
//edad y retorna true en caso de que el receptor tenga menor edad que la persona que
//se recibe como parámetro, o false en caso contrario.
    public boolean menorQue(int edad){
        System.out.println("Ingrese su edad ..");
        int nuevaEdad=read.nextInt();
        boolean comparacion=false;
        if(nuevaEdad> edad ){
            comparacion=true;
        }else {
            comparacion =false;
        }
        System.out.println("La edad anterior es menor que la actual?.."+ comparacion);
        
        return comparacion;
    }
// Metodo mostrarPersona(): este método muestra la persona creada en el método
        //anterior.
    public void mostrarPersona(){
        System.out.println("El nombre de la persona es : .."+ nombre);
        System.out.println("la fecha de nacimiento es : .."+ nacimiento);
    }
   
    
}
