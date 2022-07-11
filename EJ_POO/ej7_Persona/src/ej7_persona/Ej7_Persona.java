/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej7_persona;

/**
 *
 * @author sofia
 */
public class Ej7_Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ServicioPersona sp= new ServicioPersona();
        // Instancie 4 objetos persona.
        // llamo a las funciones para cada uno y luego guardo sus resultados en subindice de los vectores.
        double[] imcs = new double[4];
       boolean[] edades = new boolean[4];
       
       Persona p1 =  sp.crearPersona();
       imcs[0] = p1.calcularIMC();
       edades[0]= p1.esMayorDeEdad();
       
       Persona p2 =  sp.crearPersona();
       imcs[1] = p2.calcularIMC();
       edades[1] = p2.esMayorDeEdad();
      
       Persona p3 =  sp.crearPersona();
       imcs[2] = p3.calcularIMC();
       edades[2]= p3.esMayorDeEdad();
       
       Persona p4 =  sp.crearPersona();
       imcs[3] = p4.calcularIMC();
       edades[3]= p4.esMayorDeEdad();
       
//       Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
//distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
//cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
//también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
        int cant_pers_sobrepeso = 0;
        int cant_pers_normal = 0;
        int cant_pers_bajoPeso = 0;
        int cant_pers_menor = 0;
        int cant_pers_mayor = 0;
       for (int i=0; i<4;i++){
           double imc = imcs[i];
           boolean es_mayor = edades[i];
           if (imc == 1) {
               cant_pers_sobrepeso++;
           } else if (imc == 0) {
               cant_pers_normal++;
           } else {
               cant_pers_bajoPeso++;
           }
           if (es_mayor) {
               cant_pers_mayor++;
           } else {
               cant_pers_menor++;
           }
       }
       double porcentaje_bajoPeso = ((double) cant_pers_bajoPeso)/4*100;
       double porcentaje_pesoNormal = ((double)cant_pers_normal)/4*100;
       double porcentaje_sobrepeso = ((double) cant_pers_sobrepeso)/4*100;
       double porcentaje_mayor = ((double)cant_pers_mayor)/4*100;
       double porcentaje_menor = ((double)cant_pers_menor)/4*100;
       
        System.out.println("El porcentaje de personas con peso bajo es: "+porcentaje_bajoPeso+"%");
        System.out.println("El porcentaje de personas con peso normal es: "+porcentaje_pesoNormal+"%");
        System.out.println("El porcentaje de personas con sobrepeso es: "+porcentaje_sobrepeso+"%");
        System.out.println("El porcentaje de personas mayores de edad es: "+porcentaje_mayor+"%");
        System.out.println("El porcentaje de personas menores de edad: "+porcentaje_menor+"%");
        
    }
    
}
