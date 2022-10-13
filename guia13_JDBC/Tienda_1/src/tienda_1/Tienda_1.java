/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tienda_1;

import java.util.Scanner;
import tienda_1.persistencia.EntidadDaoExt_Fabricante;
import tienda_1.persistencia.EntidadDaoExt_Producto;

/**
 *
 * @author sofia
 */
public class Tienda_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Scanner leer= new Scanner(System.in);
        EntidadDaoExt_Producto ede_p= new EntidadDaoExt_Producto();
        EntidadDaoExt_Fabricante  ent_f= new EntidadDaoExt_Fabricante();
       
        System.out.println("//////////////MENU DE OPCIONES///////////////");
        String respuesta="";
        String resp="";
        
        do {     
            System.out.println("INGRESE UNA OPCIÓN:");
              System.out.println("a) Lista el nombre de todos los productos que hay en la tabla producto.\n" +
                            "b) Lista los nombres y los precios de todos los productos de la tabla producto.\n" +
                            "c) Listar aquellos productos que su precio esté entre 120 y 202.\n" +
                            "d) Buscar y listar todos los Portátiles de la tabla producto.\n" +
                            "e) Listar el nombre y el precio del producto más barato.\n" +
                            "f) Ingresar un producto a la base de datos.\n" +
                            "g) Ingresar un fabricante a la base de datos\n" +
                            "h) Editar un producto con datos a elección.\n"+
                            "i) Salir");
            
            respuesta = leer.nextLine().toLowerCase(); //aca siempre me toma la letra como minuscula.
            switch (respuesta) {
            case "a":
                ede_p.nombreProductos();
                break;
            case "b":
                ede_p.nombrePrecioProductos();
                break;
            case "c":
                ede_p.productoPrecio120_202();
                break;
            case "d":
                ede_p.productosPortatiles();
                break;
            case "e":
                ede_p.nomPrecioPbarato();
                break;
            case "f":
                ede_p.ingresarProducto();
                break;
            case "g":
                ent_f.ingresarFabricante();
                break;
            case "h":
                ede_p.editarProducto();
                break;
                case "i":
                    System.out.println("¿Desea hacer otra onsulta? Si/No");
                     resp=leer.nextLine();
                    if(resp.equalsIgnoreCase("no")){
                        continue;
                    }else{
                        break;
                    }
             
            default:
                System.out.println("¡Por favor,ingrese una obcion del menú!");
        }
       
    }while( !respuesta.equals("i")&& !resp.equalsIgnoreCase("si"));
        
        
    }
    
    
}
