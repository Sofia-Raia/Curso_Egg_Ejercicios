/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej9_matematica;

/**
 *
 * @author sofia
 */
public class Ej9_Matematica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Matematica mat= new Matematica();  
       double num1= (int)(Math.random()*10)+1;
       mat.setNum1(num1);
       System.out.println("el numero uno es :"+num1);
       double num2= (int)(Math.random()*10)+1;
       mat.setNum2(num2);
       System.out.println("el numero dos es : "+num2);
       mat.devolverMayor();
       mat.calcularPotencia();
       mat.calculaRaiz();
       
        
        
        
        
    }
   
    
}
