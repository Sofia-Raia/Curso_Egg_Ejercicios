/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libreria.servicio;

import Libreria.entidad.Autor;
import Libreria.entidad.Libro;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author sofia
 */
public class AutorServicio {
    // Esta clase tiene la responsabilidad de llevar adelante las funcionalidades necesarias para
    //administrar autores (consulta, creación, modificación y eliminación).
    EntityManager em = Persistence.createEntityManagerFactory("libreria_jpaPU").createEntityManager();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public void crearAutor() {

        //persist() "CREAR" y guardar.
        while (true) {
            Autor autor = new Autor();
      

            System.out.println("-Ingrese el nombre del autor que desea cargar:");
            String nombre = leer.nextLine();
            autor.setNombre(nombre);
          
            em.getTransaction().begin();
            em.persist(autor);
            em.getTransaction().commit();
         
            System.out.println("¿Desea ingresar otro autor a la Base de Datos? Si/No");
            String resp = leer.nextLine();

            if (resp.equalsIgnoreCase("no")) {
                break;
            }

        }
    }
        //find() "CONSULTA" busca y devuelve una entidad.

    public void consultarAutor(){

        while (true) {
            System.out.println("Ingrese el Id del autor que desea consultar.");
            Long id = leer.nextLong();
            Autor autor = em.find(Autor.class, id);
            
            if ( autor== null || !autor.getAlta()) {
                System.out.println("El ID ingresado no corresponde a ningun autor.");
            } else {
                System.out.println("Información del autor: " + autor);
            }
          
            leer.nextLine();
            System.out.println("¿Desea consultar otro autor? si/no");
            String resp = leer.nextLine();
            if (resp.equalsIgnoreCase("no")) {
                break;
            }
        }
    }
        
              //merge()sirve para actualizar
    public void actualizarAutor() {
   
        while (true) {
            System.out.println("Ingrese la ID del autor que quiere actualizar");
            Long id = leer.nextLong();
            Autor autor = em.find(Autor.class, id);
            if (autor == null) {
                System.out.println("El ID no es valido, intentelo nuevamente.");
                break;
            }
            leer.nextLine();
            System.out.println("Ingrese el nombre del autor que desea cargar:");
            String nuevoNombre = leer.nextLine();
            autor.setNombre(nuevoNombre);

            em.getTransaction().begin();
            em.merge(autor);    
            em.getTransaction().commit();
            System.out.println("¿Desea actualizar otro autor? si/no ");
            String resppp=leer.nextLine();
            if(resppp.equalsIgnoreCase("no")){
                break;
            }
        }

    }
    
        //remove()
    public void eliminarAutor(){
        while(true){
            System.out.println("Ingrese el ID del autor a eliminar");
            String llave=leer.nextLine();
            Long id=Long.parseLong(llave);
            Autor autor = em.find(Autor.class,id);
            if(id==null){
                System.out.println("El ID no corresponde a un autor");
                break;
            }
            autor.setAlta(false);
            em.getTransaction().begin();
            em.merge(autor); //actualiza los datos.
            //em.remove(autor); no se usa porque no es una baja logica , estoy haciendo invisible los datos
            System.out.println("Informacion del autor eliminado:");
            System.out.println(autor);
            em.getTransaction().commit();
            
            System.out.println("¿Desea eliminar otro autor ? si/no");
            String resp=leer.nextLine();
            if(resp.equalsIgnoreCase("no")){
                break;
            }
        }
    }
    
    public void buscarAutorPorNom(){
        while(true){
             System.out.println("Coloque el nombre del autor que desea buscar:");
             String nombre_autor=leer.nextLine();
             Autor autor = (Autor) em.createQuery("SELECT a FROM autor a WHERE a.nombre LIKE :param1")
                .setParameter("param1", nombre_autor)
                .getSingleResult();
            if(autor==null){
            System.out.println("El autor no existe, intente nuevamente. ");
            }else{
                System.out.println( "Información del Autor: "+ autor);
                break;
            }
            
        }
       
     
    }
       
        
        
}


