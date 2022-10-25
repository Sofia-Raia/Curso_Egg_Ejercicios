/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libreria.servicio;

import Libreria.entidad.Autor;
import Libreria.entidad.Editorial;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author sofia
 */
public class EditorialServicio {
    // Esta clase tiene la responsabilidad de llevar adelante las funcionalidades necesarias para
    //administrar autores (consulta, creación, modificación y eliminación).
    EntityManager em = Persistence.createEntityManagerFactory("libreria_jpaPU").createEntityManager();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public void crearEditorial() {

        //persist() "CREAR" y guardar.
        while (true) {
            Editorial editorial = new Editorial();

            System.out.println("-Ingrese el nombre de la editorial que desea cargar:");
            String nombre = leer.nextLine();
            editorial.setNombre(nombre);
          
            em.getTransaction().begin();
            em.persist(editorial);
            em.getTransaction().commit();
            System.out.println("¿Desea ingresar otra editorial a la Base de Datos? Si/No");
            String resp = leer.nextLine();

            if (resp.equalsIgnoreCase("no")) {
                break;
            }

        }
    }
        //find() "CONSULTA" busca y devuelve una entidad.

    public void consultarEditorial(){

        while (true) {
            System.out.println("Ingrese el Id de la editorial que desea consultar.");
            Long id = leer.nextLong();
            Editorial editorial = em.find(Editorial.class, id);
            
            if ( editorial== null || !editorial.getAlta()) {
                System.out.println("El ID ingresado no corresponde a ninguna editorial.");
            } else {
                System.out.println("Información de la editorial: " + editorial);
            }
          
            leer.nextLine();
            System.out.println("¿Desea consultar otra editorial? si/no");
            String resp = leer.nextLine();
            if (resp.equalsIgnoreCase("no")) {
                break;
            }
        }
    }
        
              //merge()sirve para actualizar
    public void actualizarEditorial() {
   
        while (true) {
            System.out.println("Ingrese la ID de la editorial que quiere actualizar");
            Long id = leer.nextLong();
            Editorial editorial = em.find(Editorial.class, id);
            if (editorial == null) {
                System.out.println("El ID no es valido, intentelo nuevamente.");
                break;
            }
            leer.nextLine();
            System.out.println("Ingrese el nombre de la editorial que desea cargar:");
            String nuevoNombre = leer.nextLine();
            editorial.setNombre(nuevoNombre);

            em.getTransaction().begin();
            em.merge(editorial);    
            em.getTransaction().commit();
            System.out.println("¿Desea actualizar otra editorial? si/no ");
            String resppp=leer.nextLine();
            if(resppp.equalsIgnoreCase("no")){
                break;
            }
        }

    }
    
        //remove()
    public void eliminarEditorial(){
        while(true){
            System.out.println("Ingrese el ID de la editorial a eliminar");
            String llave=leer.nextLine();
            Long id=Long.parseLong(llave);
            Editorial editorial = em.find(Editorial.class,id);
            if(id==null){
                System.out.println("El ID no corresponde a una editorial");
                break;
            }
            editorial.setAlta(false);
            em.getTransaction().begin();
            em.merge(editorial); //actualiza los datos.
            //em.remove(autor); no se usa porque no es una baja logica , estoy haciendo invisible los datos
            System.out.println("Informacion del autor eliminado:");
            System.out.println(editorial);
            em.getTransaction().commit();
            
            System.out.println("¿Desea eliminar otra editorial ? si/no");
            String resp=leer.nextLine();
            if(resp.equalsIgnoreCase("no")){
                break;
            }
        }
    }
       
      
}
