/*Consignas;


Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Alumno;

import java.util.*;

/**
 *
 * @author sofia
 */
public class Alumno {
    Scanner read= new Scanner(System.in);
    String nombre;
    ArrayList <Integer> notas= new ArrayList();

    public Alumno() {
    }
    

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    public Scanner getRead() {
        return read;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setRead(Scanner read) {
        this.read = read;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }
 
    
    
   /////Metodo para asignar las notas por alumno///////
    public void agregar_notas(){
    int nota1=0;
    int nota2=0;
    int nota3=0;
    
    System.out.println("Ingrese la primer nota");
    nota1=read.nextInt();
    notas.add(nota1);
    System.out.println("Ingrese la segunda nota");
    nota2=read.nextInt();
    notas.add(nota2);
    System.out.println("Ingrese la tercer nota");
    nota3=read.nextInt();
    notas.add(nota3);
    }
    
    /////Metodo para calculular nota final por alumno/////
    public double calcularNotaFinal(){
        double promedio=0;
         int sumatoria=0;
        for (Integer n : notas) {
           sumatoria+=n;
            
        }
        promedio = sumatoria/3;
        return promedio;
       
    }
}
