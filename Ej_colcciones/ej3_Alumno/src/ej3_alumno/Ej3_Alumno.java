/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3_alumno;

import Alumno.Alumno;
import Servicio_Alumnos.ServicioAlumnos;

/**
 *
 * @author sofia
 */
public class Ej3_Alumno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicioAlumnos sr = new ServicioAlumnos();
        sr.crearAlumnos();
        sr.calcularNotaF();
    }
    
}
