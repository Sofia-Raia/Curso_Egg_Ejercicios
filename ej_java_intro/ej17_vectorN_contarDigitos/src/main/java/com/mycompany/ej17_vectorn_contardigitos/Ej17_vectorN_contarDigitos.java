/*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ej17_vectorn_contardigitos;

/**
 *
 * @author sofia
 */
import java.util.Scanner;
public class Ej17_vectorN_contarDigitos {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el tamaño de vector");
        int n = leer.nextInt();
        
        int [] vector = new int [n];
        int num_aleatorio=0;
        int cifras=0;
        int u_cifras=0;
        int d_cifras=0;
        int t_cifras=0;
        int c_cifras=0;
        int cin_cifras=0;
        for (int i=0; i<n; i++){
            cifras=0;
            //Aca genero el numero aleatorio por cada sub indice
            num_aleatorio= (int) (Math.random()*10000+1);
            vector[i]= num_aleatorio;
            //para cada numero le cuento las cifras.
            while(num_aleatorio!=0){            
                num_aleatorio = num_aleatorio/10;        
                cifras++;    
            }
            if (cifras==1){
                u_cifras++;
            }else if(cifras==2){
                d_cifras++;
            }else if (cifras==3){
                t_cifras++;
            }else if(cifras==4){
                c_cifras ++;
            }else if (cifras==5){
                cin_cifras++;
            }
        }
        for (int i=0; i<n; i++){
            System.out.print("["+vector[i]+"]");
        }
        System.out.println("");
        System.out.println("De 1 cifra hay "+ u_cifras+", de 2 cifras hay  "+ d_cifras +",de 3 cifras hay "+t_cifras);
        System.out.println("de 4 cifras hay "+ c_cifras+ ",de 5 cifras hay "+ cin_cifras);
        
    }
}
