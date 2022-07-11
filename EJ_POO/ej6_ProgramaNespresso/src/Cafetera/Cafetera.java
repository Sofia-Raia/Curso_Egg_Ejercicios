package Cafetera;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sofia
 */
public class Cafetera {
    int capacidadMaxima;
    int cantidadActual;

    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima =  capacidadMaxima;
        this.cantidadActual =  cantidadActual;
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = (int) capacidadMaxima;
    }

    public void setCantidadActual(double cantidadActual) {
        this.cantidadActual = (int) cantidadActual;
    }
    //Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
    public void llenarCafetera(){
        cantidadActual=capacidadMaxima;
    }
     //Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
    //tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
    //Ccantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
    //método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
    //cuanto quedó la taza.       
    public void servirTasa( int tam_taza){
       
       if(cantidadActual < tam_taza ){
           System.out.println("El cafe disponible no alcanza, le serviremos lo que queda. "+cantidadActual+ "no se lleno la taza");
           cantidadActual=0;
       }else if(cantidadActual >= tam_taza){
           System.out.println("se lleno la taza");
           cantidadActual = cantidadActual - tam_taza;
       }
      
    }       
    //Método vaciarCafetera(): pone la cantidad de café actual en cero.
    public void vaciarCafetera(){
        cantidadActual=0;
    }
    //    Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
    //recibe y se añade a la cafetera la cantidad de café indicada.
    public void agregarCafe(int cant_cafe){
        if (capacidadMaxima >cantidadActual + cant_cafe){
            cantidadActual=cantidadActual+ cant_cafe;
        }else{
            System.out.println("La cantidad que se quiere agregar supera la capacidad");
        }
        
    }
}
