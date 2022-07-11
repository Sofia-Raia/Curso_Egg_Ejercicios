/*Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo
('H' hombre, 'M' mujer, 'O' otro), peso y altura.
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej7_persona;

import java.util.Scanner;

/**
 *
 * @author sofia
 */
public class Persona {
    Scanner read=new Scanner(System.in);
    String nombre;
    int edad;
    String sexo;
    double peso;
    double altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
   
    //    Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
    //kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
    //que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
    //fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
    //está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
    //fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
    //función devuelve un 1.
    public double calcularIMC(){
        //Fórmula: peso (kg) / [estatura (m)]2
       double imc= peso/ Math.pow(altura,2);
       if(imc< 20 ){
           imc=(-1);
           System.out.println("usted esta por debajo de su peso ideal :"+ imc);
        }else if(imc>=20 && imc <=25){
            imc= 0;
            System.out.println("usted se encuentra en su peso ideal :"+ imc);  
        }else{
            imc=1;
            System.out.println("usted tiene sobrepeso :"+imc);
        } 
       return imc;
    }
    //    Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
    //un boolean.
    public boolean esMayorDeEdad(){
        boolean mayor_edad=true;
        if (edad <18){
            mayor_edad=false;
        }else if(edad >=18){
            mayor_edad=true; 
        }
        System.out.println("LA PERSONA ES MAYOR DE EDAD?"+mayor_edad);
        return mayor_edad;
    }
    
}
