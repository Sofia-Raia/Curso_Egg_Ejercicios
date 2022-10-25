/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Libreria;

import Libreria.entidad.Libro;
import Libreria.servicio.AutorServicio;
import Libreria.servicio.EditorialServicio;
import Libreria.servicio.LibroServicio;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author sofia
 */
public class Libreria_jpa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Esta clase tiene la responsabilidad de llevar adelante las funcionalidades necesarias para
        // interactuar con el usuario. En esta clase se muestra el menú de opciones con las operaciones
        //disponibles que podrá realizar el usuario.
        Scanner leer = new Scanner(System.in);
        LibroServicio ls = new LibroServicio();
        AutorServicio as = new AutorServicio();
        EditorialServicio es = new EditorialServicio();
        System.out.println("************BIENVENIDOS*******************");
        System.out.println("¿SOBRE QUE ENTIDAD DESEA CONSULTAR?\n"
                            +"a)LIBRO\n"
                            +"b)AUTOR\n"
                            +"c)EDITORIAL");
        
         char res = leer.nextLine().toLowerCase().charAt(0);//convierte a minuscula
         
         switch (res) {
            case 'a':
                while (true){
                    System.out.println("__________LIBRO__________");
                    System.out.println("Indique que operacion desea realizar:\n"
                    +"A)Crear un libro a la Base de Datos\n"
                    +"B)Consultar un libro:\n"
                    +"C)Modifica o actualizar un libro:\n"
                    +"D)Eliminar un libro:\n"
                    +"E)Buscar un libro por titulo:\n"
                    +"F)Buscar un libro por Autor:\n"
                    +"G)Buscar un libro por Editorial:\n"
                    +"H)Salir");
                    char opcion = leer.next().toUpperCase().charAt(0); //convierte a mayuscula
                    switch (opcion) {
                        case 'A':
                            ls.crearLibros();
                            break;
                        case 'B':
                            ls.consultarLibro();
                            break;
                        case 'C':
                            ls.actualizarLibro();
                            break;
                        case 'D':
                            ls.eliminarLibro();
                            break;
                        case 'E':
                            ls.buscarLibroPorTitulo();
                            break;
                        case 'F':
                            ls.BuscarLibroPorAutor();
                            break;
                        case 'G':
                            ls.BuscarLibroPorEditorial();
                            break;
                        case 'H':
                           break;
                        default:
                            System.out.println("Opcion incorrecta, intente nuevamente.");
                            break;
                    }
                    if(opcion=='H'){
                        break;
               
                    }
                }
                break;
            
            case 'b':
                System.out.println("__________AUTOR__________");
                System.out.println("Indique que operacion desea realizar:\n"
                +"A)Crear un Autor a la Base de Datos\n"
                +"B)Consultar un Autor:\n"
                +"C)Modifica o actualizar un Autor:\n"
                +"D)Eliminar un Autor:\n"
                +"E)Buscar un autor por su nombre:\n"
                +"F)Salir");
                char opcion1 = leer.next().toUpperCase().charAt(0);
                switch (opcion1) {
                    case 'A':
                        as.crearAutor();
                        break;
                    case 'B':
                        as.consultarAutor();
                        break;
                    case 'C':
                        as.actualizarAutor();
                        break;
                    case 'D':
                        as.eliminarAutor();
                        break;
                    case 'E':
                        as.buscarAutorPorNom();
                        break;
                    case 'F':
                        break;
                    default:
                        System.out.println("Opcion incorrecta, intente nuevamente.");
                }
                if(opcion1=='F'){
                        break;
               
                }
                break;
            case 'c':
                System.out.println("__________EDITORIAL__________");
                System.out.println("Indique que operacion desea realizar:\n"
                +"A)Crear una Editorial a la Base de Datos\n"
                +"B)Consultar una Editorial:\n"
                +"C)Modifica o actualizar una Editorial:\n"
                +"D)Eliminar una Editorial:\n"
                +"E)Salir");
                char opcion2 = leer.next().toUpperCase().charAt(0);
                switch (opcion2) {
                    case 'A':
                        es.crearEditorial();
                        break;
                    case 'B':
                        es.consultarEditorial();
                        break;
                    case 'C':
                        es.actualizarEditorial();
                        break;
                    case 'D':
                        es.eliminarEditorial();
                        break;
                    case 'E':
                        break;
                    default:
                        System.out.println("Opcion incorrecta, intente nuevamente.");
                         if(opcion2=='E'){
                         break;
                         }
                }
            default:
                System.out.println("Opcion incorrecta, intente nuevamente.");
           
        }
    }
}
