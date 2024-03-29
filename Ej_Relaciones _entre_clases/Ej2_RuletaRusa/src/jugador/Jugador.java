/* Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica
si está mojado o no el jugador). El número de jugadores será decidido por el usuario, pero
debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
Métodos:
• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false. 

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jugador;

import java.util.ArrayList;
import java.util.Scanner;
import revolverDeAgua.Revolver_de_Agua;

/**
 *
 * @author sofia
 */
public class Jugador {

    public static boolean getMojado;
    Scanner read=new Scanner(System.in);
    
    int id;
    String nombre;
    boolean mojado;

    public Jugador() {
    }

    public Jugador(int id) {
        this.id = id;
        this.nombre = "Jugador "+id;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
  
    public  void disparo(Revolver_de_Agua r){
        System.out.println("El jugador: "+nombre+" disparó...");
        mojado=r.mojar();
        r.siguienteChorro();
        
    }

   

   
    
    
}
