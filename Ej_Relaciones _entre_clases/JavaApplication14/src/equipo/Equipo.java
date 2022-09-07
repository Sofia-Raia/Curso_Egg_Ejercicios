/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipo;

import java.util.*;
import jugador.Jugador;

/**
 *
 * @author sofia
 */
public class Equipo {
    
    ArrayList<Jugador> lista= new ArrayList();
    Scanner read=new Scanner(System.in);

    public ArrayList<Jugador> getLista() {
        return lista;
    }

    public Scanner getRead() {
        return read;
    }

    public void setLista(ArrayList<Jugador> lista) {
        this.lista = lista;
    }

    public void setRead(Scanner read) {
        this.read = read;
    }
    
    public void generar_lista(){
        String resp="si";
        System.out.println("********ARMANDO LISTA DE JUGADORES**********");
        while(resp.equalsIgnoreCase("si")){
            
            System.out.println("Ingrese el nombre del jugador:");
            String nombre= read.nextLine();
            System.out.println("Ingrese el apellido:");
            String apellido= read.nextLine();
            System.out.println("Ingrese el numero de jugador");
            int n_jugador=read.nextInt();
            System.out.println("Ingrese la posicion que ocupa en la cancha:");
            int n_posicion=read.nextInt();
            Jugador j =new Jugador(nombre,apellido,n_jugador,n_posicion);
            lista.add(j);
            System.out.println("¿Desea agregar otro jugador a la lista?");
            read.nextLine();
            resp= read.nextLine();
        }
       
    }
}
