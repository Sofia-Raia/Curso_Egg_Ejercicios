/*Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServicioProducto;

import java.util.*;

/**
 *
 * @author sofia
 */
public class ServicioProducto {
    Scanner read= new Scanner(System.in).useDelimiter("\n");
    //integer es la llave y String es el valor
    HashMap<String,Double> tienda= new HashMap();
    
     public void agregarProducto(){
        String respuesta="si";
        while(respuesta.equalsIgnoreCase("si")){
            System.out.println("¿Desea agregar un producto a la tienda?");
            respuesta=read.nextLine();
            if(respuesta.equalsIgnoreCase("si")){
             System.out.println("¿que producto desea agregar?");
                String nombreProd=read.nextLine();
                System.out.println("indique el precio");
                double precio=read.nextDouble();
                read.nextLine();
                tienda.put(nombreProd,precio);
                
            }
         }
     }
     
     public void modificarPrecio(){
         System.out.println("Ingrese el nombre del producto al cual le quiere cambiar el precio");
         String resp=read.nextLine();
         System.out.println("Ingrese el nuevo precio");
         Double nuevoP= read.nextDouble();
         /// el put aparte de agregar modifica, en este caso porque la llave ya existe.
         //(no pueden haber dos iguales)
         tienda.put(resp,nuevoP);
     }
    public void eliminarProducto(){
        System.out.println("Ingrese el producto que quiere eliminar");
        String resp=read.nextLine();
        Double precio=tienda.get(resp); //en tienda.get(llave) en este caso le paso resp
        if(precio==null){               //va a comparar la resp con alguna llave si no exite me da null
                                        // si existe la elimina.
            System.out.println("El producto no se encontro");  
        }else{
            tienda.remove(resp);
        }
    }
     public void mostrarPrecioYproducto(){
         for (Map.Entry<String, Double> entry : tienda.entrySet()) {
             Object key = entry.getKey();
             Object val = entry.getValue();
            
         }
         System.out.println(tienda);
     }
    
     public void menuObciones(){
         int menu=0;
         String respuesta="yes";
             
         while(!respuesta.equalsIgnoreCase("yes")||menu!=5){
             System.out.println("********* MENU DE OPCIONES **********");
                System.out.println("1) Agregar un producto a la tienda");
                System.out.println("2) Modificarle el precio a un producto");
                System.out.println("3) Eliminnar un producto de la tienda");
                System.out.println("4) Mostrar los productos y sus precios");
                System.out.println("5) Salir de la tienda");
                System.out.println("Ingrese una opcion del menu.");
         
             menu=read.nextInt();
             read.nextLine();
            
            switch (menu){
                case 1:
                    agregarProducto();
                  
                    break;
                case 2:
                     modificarPrecio();
                    break;
                case 3:
                    eliminarProducto();
                    break;
                case 4:
                    mostrarPrecioYproducto();
                    break;
                case 5:
                    System.out.println("¿Desea salir yes/no? ");
                    respuesta=read.nextLine();


            }
            
         }
     }         
          
  }       
    

