/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libreria.servicio;

import Libreria.entidad.Autor;
import Libreria.entidad.Editorial;
import Libreria.entidad.Libro;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author sofia
 */
public class LibroServicio {

    // Esta clase tiene la responsabilidad de llevar adelante las funcionalidades necesarias para
    //administrar autores (consulta, creación, modificación y eliminación).
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /////Unidad de persistencia////////////
    EntityManager em = Persistence.createEntityManagerFactory("libreria_jpaPU").createEntityManager();

    public void crearLibros() {

        //persist() "CREAR" y guardar.
        while (true) {
            Libro libro = new Libro();
            System.out.println("A continuciaon cargue los datos del libro:");
            System.out.println("-Ingrese el título:");
            String titulo = leer.nextLine();
            libro.setTitulo(titulo);
            System.out.println("Ingrese el año:");
            Integer agnio = leer.nextInt();
            leer.nextLine();
            libro.setAgnio(agnio);
            System.out.println("Ingrese ejemplares:");
            Integer ejemplares = leer.nextInt();
            leer.nextLine();
            libro.setEjemplares(ejemplares);
            System.out.println("Ingrese ejemplares prestados:");
            Integer ejemplaresPrestados = leer.nextInt();
            leer.nextLine();
            libro.setEjemplaresPrestados(ejemplaresPrestados);
            System.out.println("Ingrese ejemplares restantes:");
            Integer ejemplaresRestantes = leer.nextInt();
            leer.nextLine();
            libro.setEjemplaresRestantes(ejemplaresRestantes);
            while (true){
                System.out.println("Ingrese el  Id del autor");
                Long id_autor= leer.nextLong();
                Autor autor =em.find(Autor.class,id_autor);
                if(autor==null){
                    System.out.println("El ID del autor no existe.");
                }else{
                    libro.setAutor(autor);
                    break;
                }
            }
            while (true){
                System.out.println("Ingrese el la editorial");
                Long id_editorial= leer.nextLong();
                Editorial editorial =em.find(Editorial.class,id_editorial);
                if(editorial==null){
                    System.out.println("El id de la editorial no existe."); 
                }else{
                    libro.setEditorial(editorial);
                    break;
                }
            }
            em.getTransaction().begin();
            em.persist(libro);
            em.getTransaction().commit();
            System.out.println("¿Desea ingresar otro libro a la Base de Datos? Si/No");
            String resp = leer.next();

            if (resp.equalsIgnoreCase("no")) {
                break;
            }

        }

    }
    //find() "CONSULTA" busca y devuelve una entidad.

    public void consultarLibro() {

        while (true) {
            System.out.println("Ingrese el ISBN que desea consultar.");
            Long isbn = leer.nextLong();
            Libro libro = em.find(Libro.class, isbn);
            
            if (libro == null || !libro.isAlta()) {
                System.out.println("El ISBN ingresado no corresponde a ningun libro.");
            } else {
                System.out.println("Información del libro: " + libro);
            }
          
            leer.nextLine();
            System.out.println("¿Desea consultar otro libro? si/no");
            String resp = leer.nextLine();
            if (resp.equalsIgnoreCase("no")) {
                break;
            }
        }
    }

//                //merge()sirve para actualizar
    public void actualizarLibro() {
        System.out.println("//////////////ATRIBUTOS PARA ACTUALIZAR ://////////////////////\n"
                + "*AÑO\n"
                + "*TITULO\n"
                + "*EJEMPLARES\n"
                + "*EJEMPLARES PRESTADOS\n"
                + "*EJEMPLARES RESTANTES\n");
        while (true) {
            System.out.println("Ingrese la ISBN del libro que quiere actualizar");
            Long isbn = leer.nextLong();
            Libro libro = em.find(Libro.class, isbn);
            if (libro == null) {
                System.out.println("El ISBN no es valido, intentelo nuevamente.");
                break;
            }
            leer.nextLine();
            while (true) {
                System.out.println("Ingrese el atributo que desea actualizar:");
                String resp = leer.nextLine();
                if (resp.equalsIgnoreCase("titulo")) {
                    System.out.println("Ingrese el titulo:");
                    String titulo = leer.nextLine();
                    libro.setTitulo(titulo);
                }
                if (resp.equalsIgnoreCase("agnio")) {
                    System.out.println("Ingrese el agnio:");
                    Integer agnio = leer.nextInt();
                    libro.setAgnio(agnio);
                }
                if (resp.equalsIgnoreCase("ejemplares")) {
                    System.out.println("Ingrese la cantidad de ejemplares:");
                    Integer ejemplares = leer.nextInt();
                    libro.setEjemplares(ejemplares);
                }
                if (resp.equalsIgnoreCase("ejemplares prestados")) {
                    System.out.println("Ingrese la cantidad de ejemplares prestados:");
                    Integer ejemplaresPrestados = leer.nextInt();
                    libro.setEjemplaresPrestados(ejemplaresPrestados);
                }
                if (resp.equalsIgnoreCase("ejemplares restantes")) {
                    System.out.println("Ingrese la cantidad de ejemplares restantes:");
                    Integer ejemplaresRestantes = leer.nextInt();
                    libro.setEjemplaresRestantes(ejemplaresRestantes);
                }
                leer.nextLine();
                System.out.println("¿Desea cambiar otro atributo del libro? si /no");
                String res = leer.nextLine();
                if (res.equalsIgnoreCase("no")) {
                    break;
                }
            }
            em.getTransaction().begin();
            em.merge(libro);
            em.getTransaction().commit();
            System.out.println("¿Desea actualizar otro libro? si/no ");
            String resppp=leer.nextLine();
            if(resppp.equalsIgnoreCase("no")){
                break;
            }
        }

    }
       //remove()
    public void eliminarLibro(){
        while(true){
            System.out.println("Ingrese el ISBN del libro a eliminar");
            String llave=leer.nextLine();
            Long isbn=Long.parseLong(llave);
            Libro libro = em.find(Libro.class,isbn);
            if(isbn==null){
                System.out.println("El ISBN no corresponde a un libro");
                break;
            }
            libro.setAlta(false);
            em.getTransaction().begin();
            em.merge(libro); //actualiza los datos.
            //em.remove(libro); no se usa porque no es una baja logica , estoy haciendo invisible los datos
            System.out.println("Informacion del libro eliminado:");
            System.out.println(libro);
            em.getTransaction().commit();
            
            System.out.println("¿Desea eliminar otro libro? si/no");
            String resp=leer.nextLine();
            if(resp.equalsIgnoreCase("no")){
                break;
            }
        }
    }
      public void buscarLibroPorTitulo(){
        while(true){
             System.out.println("Coloque el título del libro que desea buscar:");
             String titulo_libro=leer.nextLine();
             Libro libro = (Libro) em.createQuery("SELECT a FROM libro a WHERE a.titulo LIKE :param1")
                .setParameter("param1", titulo_libro)
                .getSingleResult();
            if(libro==null){
            System.out.println("El titulo no existe, intente nuevamente. ");
            }else{
                System.out.println( "Información del Libro: "+ libro);
                break;
            }
            
        }
                
      }
      
      //punto 11
      public void BuscarLibroPorAutor(){
        while(true){//a.isbn = b.id 
             System.out.println("Nombre del autor del libro que desea buscar:");
             String autor_libro=leer.nextLine();
              List<Libro> libro  = em.createQuery("SELECT a FROM Libro a WHERE a.autor.nombre LIKE :param1")
                .setParameter("param1", autor_libro)
                .getResultList();
            if(libro==null){
            System.out.println("El autor no existe, intente nuevamente. ");
            }else{

                    System.out.println( "Información del Libro: ");
                    System.out.println(libro);    
                break;
            }
        }
      }
      public void BuscarLibroPorEditorial(){
         while(true){
             System.out.println("Nombre de la editorial del libro que desea buscar:");
             String editorial_libro=leer.nextLine();
              List<Libro> libro  = em.createQuery("SELECT a FROM Libro a INNER JOIN Editorial b ON a.autor.id= b.id  WHERE b.nombre = :param1")
                .setParameter("param1", editorial_libro)
                .getResultList();
            if(libro==null){
            System.out.println("El autor no existe, intente nuevamente. ");
            }else{
                for (Libro libro1 : libro) {
                   System.out.println( "Información del Libro: "+ libro);
                }
                break;
            }
        }
      }
      
      
      
      
      
}
