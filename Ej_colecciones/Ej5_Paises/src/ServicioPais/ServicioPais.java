/*Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)


//Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
//cómo se ordena un conjunto.

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServicioPais;

import Pais.Pais;
import java.util.*;

/**
 *
 * @author sofia
 */
public class ServicioPais {
    Scanner read = new Scanner(System.in);
    TreeSet<Pais> paises = new TreeSet();


    public void LeerYguardar() {
        String respuesta = "si";
        while (respuesta.equalsIgnoreCase("si")) {
            System.out.println("Ingrese un país a la lista.");
            String nombrePais = read.nextLine();
            Pais pais = new Pais(nombrePais);
            paises.add(pais);
            System.out.println("¿Desea agregar otro país al conjunto?");
            respuesta = read.nextLine();
            
        }
        
        for (Pais elementoPais : paises) {
            System.out.println(elementoPais);
        }
    }

//Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
//buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
//usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
//al usuario.

       public void eliminarPais(){
           boolean encontroPais = false;
           Iterator <Pais> recorrerSet = paises.iterator();
           System.out.println("Ingrese el país que desea eliminar del conjunto");
           String eliminarP=read.nextLine();
           while(recorrerSet.hasNext()){
               Pais paisActual= recorrerSet.next();
               if(paisActual.getNombreP().equals(eliminarP)){
                   recorrerSet.remove();
                   encontroPais=true;
               }
               
           }
           if(encontroPais){ //Es lo mismo que encontroPais == true porque encontroPais ya es un boolean
               System.out.println("El conjunto nos queda así: ");
               System.out.println(paises);
           }else{
               System.out.println("No se encotro el país");
               
           }
           
           
       }
        
        

    
}
