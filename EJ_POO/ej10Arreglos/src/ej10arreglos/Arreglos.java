/*Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.



 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej10arreglos;

import java.util.Arrays;

/**
 *
 * @author sofia
 */
public class Arreglos {
    double [] vectorA= new double [50];
    double [] vectorB= new double [20];

    public Arreglos() {
    }
    

    public double[] getVectorA() {
        return vectorA;
    }

    public double[] getVectorB() {
        return vectorB;
    }

    public void setVectorA(double[] vectorA) {
        this.vectorA = vectorA;
    }

    public void setVectorB(double[] vectorB) {
        this.vectorB = vectorB;
    }
    
    public void llenarMostrarVector(){
        
        //lleno vector a y lo muestro.
        for(int i=0; i<50; i++){
            vectorA[i]=(Math.random()*10)+1;
        }
        System.out.println("Vector A, (con numeros aleatorios)");
        for(int i=0; i<50; i++){
            System.out.println("["+ vectorA[i]+"]"); 
        }
        
        
     
        
    }
//    Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
//ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
//0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
//20.

    public void ordenarYllenarB (){
        //ordeno de menor a mayor arreglo a.
        Arrays.sort(vectorA);
        
     
        for (int i=0; i<vectorB.length-1;i++){
          
           if(i<=9 ){
               vectorB[i]=vectorA[i]; 
           }else{
                vectorB[i]= 0.5;
           }
        }
       
        System.out.println("Vector B (compuesto de los 10 primeros n° < de vector A y n° 0,5) ");
        for(int i=0; i<20; i++){
            System.out.println("["+ vectorB[i]+"]");
        }
        
        
        
    }
    
    
  
    
    
    
}
