/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej7_persona;

import java.util.Scanner;


/**
 *
 * @author sofia
 */
public class ServicioPersona {
    
    Scanner read=new Scanner(System.in);

    public Persona crearPersona(){
        Persona persona= new Persona();
        System.out.println("Ingrese su nombre");
        persona.setNombre(read.nextLine());
        System.out.println("Ingrese su edad");
        persona.setEdad(read.nextInt());
        System.out.println("Ingrese su peso");
        persona.setPeso(read.nextDouble());
        System.out.println("Ingrese su altura");
        persona.setAltura(read.nextDouble());
        read.nextLine();
        System.out.println("Ingrese su sexo");
        String sexo=read.nextLine(); 
          
        while (!sexo.equalsIgnoreCase("h") && !sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("o")){
          
            sexo=read.nextLine();
        }
        persona.setSexo(sexo);
        return persona;
   
    }
    
    
    
    
}
