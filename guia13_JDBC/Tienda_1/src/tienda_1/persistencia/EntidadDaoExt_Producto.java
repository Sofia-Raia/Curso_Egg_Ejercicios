/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda_1.persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sofia
 */


public class EntidadDaoExt_Producto extends DAO {
   Scanner leer= new Scanner(System.in);
//////////////////////// METODO "A"//////////////////////////////////////////////////////////

     public void nombreProductos() throws SQLException{
         ResultSet resultado = null; 
         try {
            resultado = consultarBase("SELECT nombre FROM producto;");
          } catch (Exception e) {
             System.out.println("Ocurrio un error al realizar la consulta");
             e.printStackTrace();
          }
         System.out.println("Los productos son:");
         while(resultado.next()){
             System.out.println(resultado.getString("nombre"));
         }
      }
/////////////////////////METODO B /////////////////////////////////////////////////////////////
      public void nombrePrecioProductos() throws SQLException{
          ResultSet resultado = null; 
         try {
             resultado = consultarBase("SELECT nombre, precio FROM producto;");
          } catch (Exception e) {
             System.out.println("Ocurrio un error al realizar la consulta");
             e.printStackTrace();
          }
         System.out.println("Los productos y sus precios son:");
         
         while(resultado.next()){
             System.out.println(resultado.getString("nombre") + ": $" + resultado.getDouble("precio"));
         }
      }
////////////////////////// METODO C/////////////////////////////////////////////////////////////
      public void productoPrecio120_202()throws SQLException{
         
                  ResultSet resultado = null; 
         try {
             resultado =  consultarBase("SELECT nombre, precio FROM producto WHERE precio BETWEEN 120 AND 202;");
          } catch (Exception e) {
             System.out.println("Ocurrio un error al realizar la consulta");
             e.printStackTrace();
          }
         System.out.println("Los productos y sus precios son:");
         
         while(resultado.next()){
             System.out.println(resultado.getString("nombre") + ": $" + resultado.getDouble("precio"));
         }
      }
////////////////////////////////METODO D/////////////////////////////////////////////////////////////
      public void productosPortatiles()throws SQLException{
           ResultSet resultado = null; 
         try {
            resultado = consultarBase("SELECT nombre FROM producto WHERE  nombre LIKE '%Portátil%';");
          } catch (Exception e) {
             System.out.println("Ocurrio un error al realizar la consulta");
             e.printStackTrace();
          }
         System.out.println("Los productos son:");
         while(resultado.next()){
             System.out.println(resultado.getString("nombre"));
         }
          
      }
//////////////////////////////METODO E//////////////////////////////////////////////////////////////
      public void nomPrecioPbarato()throws SQLException{
           ResultSet resultado = null; 
         try {
             resultado = consultarBase("select nombre, precio from producto order by precio asc limit 1;");
          } catch (Exception e) {
             System.out.println("Ocurrio un error al realizar la consulta");
             e.printStackTrace();
          }
         System.out.println("Los productos y sus precios son:");
         
         while(resultado.next()){
             System.out.println(resultado.getString("nombre") + ": $" + resultado.getDouble("precio"));
         }
      }
          
 ///////////////////////////METODO F///////////////////////////////////////////////////////////////////
      public void ingresarProducto() throws Exception {
        String nom="";
        double precio=0;
        int codF=0;
       
            System.out.println("------------INGRESE LOS DATOS DEL NUEVO PRODUCTO------------");
            System.out.println();
            try {
              System.out.println("Ingrese nombre del Producto");
              nom = leer.nextLine();
            } catch (Exception e) {
                System.out.println("El valor ingresado no es valido.");
            }
            try {
               System.out.println("Ingrese precio");
                precio = leer.nextDouble();
                leer.nextLine();
            } catch (Exception e) {
                System.out.println("El valor ingresado no es valido.");
            }
            try {
                System.out.println("Ingrese codigo de fabricante");
                codF = leer.nextInt();
                leer.nextLine();
            } catch (Exception e) {
                System.out.println("Valor para el codigo no valido. Por favor intente nuevamente, atraves del menu.");
            }
          
        
         try {
            String sql = "INSERT INTO producto(nombre, precio, codigo_fabricante)"
                    + "VALUES ( '" + nom + "' , " + precio + " , " + codF + " )";
             System.out.println(sql);
            insertarModificarEliminar(sql);

        } catch (SQLException e) {
             System.out.println("Hubo un error al insertar el producto en la base datos. El error es:"+e.getMessage());
        }
      }
      //////////////////////////////////METODO h ///////////////////////////////////////////
      // UPDATE producto SET nombre = 1938 WHERE id_personaje = 12;
      // nombre, precio ,codigo de fabricante
      public void editarProducto() throws Exception {
          System.out.println("Ingrese la ID del producto que desea modificar");
          int id= leer.nextInt();
          leer.nextLine();
          System.out.println("¿Desea cambiar el nombre del producto? si/no");
          String resp=leer.nextLine();
          
         if(resp.equalsIgnoreCase("si")){
             System.out.println("Ingrese el nombre del producto:");
             String nom=leer.nextLine();
             String sql = "UPDATE producto SET nombre='"+nom+"' WHERE codigo =" +id+";";
             insertarModificarEliminar(sql);
         }
         System.out.println("¿Desea cambiar el precio del producto? si/no");
          String resp1=leer.nextLine();
         if(resp1.equalsIgnoreCase("si")){
             System.out.println("Ingrese el nuevo precio:");
             String precio=leer.nextLine();
             String sql = "UPDATE producto SET precio='"+precio+"' WHERE codigo =" +id+";";
             insertarModificarEliminar(sql);
         }
         System.out.println("¿Desea cambiar el codigo del fabricante? si/no");
          String resp2=leer.nextLine();
         if(resp2.equalsIgnoreCase("si")){
             System.out.println("Ingrese el nuevo codigo de fabricante :");
             String codf=leer.nextLine();
             String sql = "UPDATE producto SET codigo_fabricante='"+codf+"' WHERE codigo =" +id+";";
             insertarModificarEliminar(sql);
         }
          
      }
      
      
      
}

