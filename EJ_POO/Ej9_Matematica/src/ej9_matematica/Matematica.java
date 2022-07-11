/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej9_matematica;

/**
 *
 * @author sofia
 */
public class Matematica {
    double num1;
    double num2;

    public Matematica() {
    }

    public Matematica(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    //Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
    public double devolverMayor(){
        double mayor;
        if(num1>num2){
            mayor= num1;
            
        }else{
            mayor=num2;
        }
        System.out.println("el mayor es el numero :"+ mayor);
        return mayor;
        
    }
   //    Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
    //al menor número. Previamente se deben redondear ambos valores.
    public double  calcularPotencia(){
        double c_potencia;
        double n_mayor;
        double menor;
         if(num1<num2){
             n_mayor=num2;
            menor= num1;
            
        }else{
            n_mayor=num1;
            menor=num2;
            
        }
         
        c_potencia= Math.pow((int)n_mayor,(int)menor);
        System.out.println("la potencia del numero mayor elevado al menor es : "+ c_potencia); 
         
        return c_potencia;
    }
    //    Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
    //Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
    public double calculaRaiz(){
        double raiz;
        double menor;
    
        if(num1<num2){
            menor= num1;
            
        }else{
            menor=num2;
        }
        
        double menorA=Math.abs(menor);
        raiz= Math.sqrt(menorA);
        System.out.println("La raiz del cuadrada del menor numero es ; "+raiz);
        return raiz;
    }
    
    
}
