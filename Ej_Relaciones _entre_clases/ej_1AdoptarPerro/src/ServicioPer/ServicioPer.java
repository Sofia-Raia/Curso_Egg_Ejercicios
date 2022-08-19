/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServicioPer;

import Perro.Perro;
import Persona.Persona;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author sofia
 */
public class ServicioPer {
    boolean aika=false;
    boolean josefina=false;
    boolean perroDisponible=false;
    
    Scanner read =new Scanner(System.in);
    String respuesta="a";
    public void adoptar_perro( Persona p1,Persona p2,Perro perro1,Perro perro2){
       System.out.println("Tenenemos dos perras para  adopcion; Aika y Josefina ¿Cual desea adoptar? ");
      // while(respuesta.equalsIgnoreCase("a")||respuesta.equalsIgnoreCase("j")){
            
        System.out.println("Para Aika, presione A y para Josefina J ");
        respuesta=read.nextLine();
        if(respuesta.equalsIgnoreCase("a")){
            p1.setMascota(perro1);  
            aika=true;
            System.out.println("¡¡¡¡Felicitaciones usted adopto a Aika !!!!");
            System.out.println("");
            
        }else{
            p1.setMascota(perro2);
            josefina=true;
            System.out.println("¡¡¡¡Felicitaciones usted adopto a Josefina !!!!");
            System.out.println("");
        }
        System.out.println("Ya puede iniciar su proceso de adopción");
        if(aika){
            System.out.println("Josefina esta buscando hogar desea adoptarla? S/N ");
            String resp=read.nextLine();
            if(resp.equalsIgnoreCase("S")){
                p2.setMascota(perro2);
                
            }
        }else if (josefina){
            System.out.println("Aika esta buscando hogar desea adoptarla? S/N ");
            String resp=read.nextLine();
            if(resp.equalsIgnoreCase("S")){
                p2.setMascota(perro1);
                
            }
            
        }
      // }
        
        
        
    }
    public void mostrar_persona(Persona p1,Persona p2){
        System.out.println(p1);
        System.out.println(p2);
    }
    
    
}
