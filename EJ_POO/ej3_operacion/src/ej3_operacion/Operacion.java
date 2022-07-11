/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej3_operacion;
import java.util.Scanner;
/**
 *
 * @author sofia
 */

public class Operacion {
    Scanner leer= new Scanner(System.in);
    private  int num1;
    private  int num2;

    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Operacion() {
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public  void  crearOperacion(){
        System.out.println("Ingrese el numero uno:");
        num1=leer.nextInt();
        System.out.println("Ingrese el numero dos:");
        num2= leer.nextInt();
 
    }
    public int sumar (){
        int sumar;
        sumar = num1 +num2;
        return sumar;
        
    }
    
    public int restar(){
        int restar;
        restar= num1 - num2;
        return restar;
    }
    public int mult (){
    int mult;
    mult= num1*num2;
    if (mult ==0) {
        System.out.println("Error la multiplicacion devuelve cero");
    }
    return mult;   
    }
    public double div (){
        double div;
        div= num1/ num2;
        if (div==0){
            System.out.println("Error la division da cero");
        }
        return div;
    }
}
