/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda_1.persistencia;

import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author sofia
 */
public class EntidadDaoExt_Fabricante extends DAO {
    Scanner leer=new Scanner(System.in);
    String nom="";
    public void ingresarFabricante ()throws SQLException{
        try {
            System.out.println("Ingrese el nombre del fabricante");
            nom= leer.nextLine();
        } catch (Exception e) {
                System.out.println("Los datos ingresados no son validos");
        }
          
        
        try {
            String sql = "INSERT INTO producto(nombre)"
                    + "VALUES ( '" + nom + "'  )";
             System.out.println(sql);
            insertarModificarEliminar(sql);

        } catch (Exception e) {
             
            System.out.println("Hubo un problema al insertar los datos");
        }
    }
    
}
