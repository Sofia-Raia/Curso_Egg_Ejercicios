/*Consignas


En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
// Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
 final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
 del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
 promedio final, devuelto por el método y mostrado en el main.
    

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio_Alumnos;

import Alumno.Alumno;
import java.util.*;

/**
 *
 * @author sofia
 */
public class ServicioAlumnos {
    Scanner read= new Scanner(System.in);
    ArrayList<Alumno> lista= new ArrayList();
    //////Metodo para crear Alumnos///////
    public ArrayList<Alumno> crearAlumnos(){
            String respuesta="si";
            while (respuesta.equalsIgnoreCase("si")){
               System.out.println("Ingrese el nombre del alumno que desea cargar");  
               String nombre = read.nextLine();
               Alumno alumno = new Alumno(nombre);
               alumno.agregar_notas();
               System.out.println("¿Desea agregar otro nombre a la lista de alumnos?");
               respuesta= read.nextLine();

               lista.add(alumno); 
            }
        return lista;
    }
    
    
    ///////////Busca el alumno y llama a al otro metodo para calcularle la nota final//////////////
    public void calcularNotaF(){
        Alumno alEncontrado;
     
        System.out.println("Ingrese el nombre del alumno para calcular la nota final.");
        String nombreAl=read.nextLine();
        double notaFinal=0;
        for (Alumno alumno : lista) {
            if(alumno.getNombre().equalsIgnoreCase(nombreAl)){
                
                notaFinal = alumno.calcularNotaFinal();
                System.out.println("El promedio final para el/la alumno/a es "+ alumno.getNombre() + " es "+ notaFinal );
            }
        }
        
        
    }
    
}  
    
    
