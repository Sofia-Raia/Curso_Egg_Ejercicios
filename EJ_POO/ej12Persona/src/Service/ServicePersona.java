/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import ej12persona.newpackage.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author sofia
 */
public class ServicePersona {
    Scanner read=new Scanner(System.in);
    //    Agregar un método de creación del objeto que respete la siguiente forma:
//crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
//usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
//fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
    public Persona crearPersona(){
        Persona per=new Persona();
        String nombre;
       
        System.out.println("A continuacion ingrese sus datos personales");
        System.out.println("Ingrese su primer nombre");
        nombre=read.nextLine();
        per.setNombre(nombre);
        int dia;
        int mes;
        int anio;
        System.out.println("A continuacion ingrese los siguientes datos de su fecha de nacimiento");
        System.out.println("Ingrese el dia en que nacio ");
        dia=read.nextInt();
        System.out.println("Ingrese el mes en que nacio");
        mes=read.nextInt();
        System.out.println("Ingrese el año en que nacio");
        anio=read.nextInt();
        Date nacimiento= new Date(anio-1900, mes-1, dia);
        per.setNacimiento(nacimiento);
        System.out.println("Su fecha de nacimiento es.. "+ nacimiento);
       return per;
        
    }
    
    

    
}
