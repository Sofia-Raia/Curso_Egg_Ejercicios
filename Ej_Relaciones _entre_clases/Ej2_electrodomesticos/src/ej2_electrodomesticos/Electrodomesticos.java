/*Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2_electrodomesticos;

import java.util.Scanner;

/**
 *
 * @author sofia
 */
public class Electrodomesticos {
    Scanner leer= new Scanner(System.in);
    protected double precio;
    protected String color;
    protected String consumo_electrico;
    protected double peso;

    public Electrodomesticos() {
    }

    public Electrodomesticos(double precio, String color, String consumo_electrico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumo_electrico = consumo_electrico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public String getColor() {
        return color;
    }

    public String getConsumo_electrico() {
        return consumo_electrico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConsumo_electrico(String consumo_electrico) {
        this.consumo_electrico = consumo_electrico;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
// Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
//sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
//objeto y no será visible.
    
    protected void comprobarConsumoEnergetico(String letra){
        if(letra.equalsIgnoreCase("a")||letra.equalsIgnoreCase("b")||letra.equalsIgnoreCase("c")||letra.equalsIgnoreCase("d")||letra.equalsIgnoreCase("e")||letra.equalsIgnoreCase("f")){
            consumo_electrico=letra; 
        }else{
            consumo_electrico="F";
        }
    }
    
//Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
//usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
//blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
//minúsculas. Este método se invocará al crear el objeto y no será visible.
    protected void comprobarColor(String color){
        if(color.equalsIgnoreCase("blanco")||color.equalsIgnoreCase("negro")||color.equalsIgnoreCase("rojo")||color.equalsIgnoreCase("azul")||color.equalsIgnoreCase("gris")||color.equalsIgnoreCase("f")){
            this.color= color; 
        }else{
            this.color="Blanco";
        } 
    }
// Metodo crearElectrodomestico(): le pide la información al usuario y llena el
//electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
//precio se le da un valor base de $1000.
    public void crearElectrodomestico(){
        //precio, color,consumo energético (letras entre A y F) y peso.
        
        System.out.println("*Indique el precio:");
        double precio=leer.nextDouble();
        leer.nextLine();
        
        if(precio< 1000){
            precio= 1000;  
        }
        this.precio=precio;
        
        System.out.println("*Indique el color:");
        String col= leer.nextLine();
        comprobarColor(col);
        
        
        System.out.println("*Indique el tipo de consumo:");
        String consumo=leer.nextLine();
        comprobarConsumoEnergetico(consumo);
        
        System.out.println("*Indique el peso neto:");
        double peso=leer.nextDouble();
        this.peso=peso;
        
      
    }
// Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
//precio. Esta es la lista de precios:
    protected double  precioFinal(){
        double precioF;
        String consumo=consumo_electrico.toLowerCase();
        switch (consumo.charAt(0)) {
            
            case 'a':
                precio+=1000;
                break;
            case 'b':
                precio+=800;
                break;
            case 'c':
                precio+=600;
                break;
            case 'd':
                precio+=500;
                break;
            case'e':
                precio+=300;
                break;
            case'f':
                precio+=100;
                break;
  
        }
         int tamagnio=(int)peso;
        if(tamagnio>=1 && tamagnio<=19){
            precio+=100;
        }else if(tamagnio>=20 && tamagnio<=49){
            precio+=500;
            
        }else if(tamagnio>=50 && tamagnio<=79){
            precio+=800;
        }else if(tamagnio>80){
            precio+=1000;
        }
        precioF=precio;
       return precioF;
    }
}
