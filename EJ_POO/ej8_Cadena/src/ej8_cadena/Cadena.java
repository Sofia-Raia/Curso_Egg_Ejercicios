/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej8_cadena;

import java.util.Scanner;

/**
 *
 * @author sofia
 */
public class Cadena {
    Scanner read =new Scanner (System.in);
    String frase;
    int longitud;

    public Cadena() {
    }

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public String getFrase() {
        return frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    //Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
    //ingresada.
    public int mostrarVocales(){
        int contar_vocales=0;
        for (int i=0;i<longitud; i++){
           char letra= frase.charAt(i);
           if(letra== 'a'|| letra=='e'|| letra=='i'|| letra=='o'|| letra =='u'){
                contar_vocales ++;
           }
        }
        System.out.println("la cantidad de vocales es : "+ contar_vocales);
      return contar_vocales;  
    }
    //    Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
    //ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    public String invertirFrase(){
        String frase_invertida="";
        
        for(int i=longitud -1; i>=0; i--){
            char letras= frase.charAt(i);
            frase_invertida= frase_invertida + letras;
        }
        System.out.println("la frase invertida es : "+ frase_invertida);
        return frase_invertida;
        
    }
    //    Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
    //contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
    //Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
    public int vecesRepetido(String letra){
        int letras_repetidas=0;
        
        for (int i=0; i< longitud; i++){
            char contar= frase.charAt(i);
            if (letra.equals(contar+"")){
                letras_repetidas++;
            } 
        }
        System.out.println("la cantidad de veces que se repite la letra.."+ letra +"..es.."+letras_repetidas);
        return letras_repetidas;
    }
    //    Método compararLongitud(String frase), deberá comparar la longitud de la frase que
    //compone la clase con otra nueva frase ingresada por el usuario.
    public void compararLongitud(String frase){
        
        int lonN =frase.length();
        if (lonN== longitud){
            System.out.println("Ambas frases tienen la misma longitud");
           
        }else{
            System.out.println("la frases tienen distinta longitud");
        }
    }
    //    Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
    //una nueva frase ingresada por el usuario y mostrar la frase resultante.
    public String unirFrases(String frase){
        String unir_frase = this.frase+frase ;
        System.out.println("la frase nos queda.."+ unir_frase );
        return unir_frase;  
    }
   //    Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
   //encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
   //frase resultante.
    public String reemplazar(String letra){
        String reemplazar;
        
        // esta funcion lo que hace es en un string cambiar un sting viejo por uno nuevo
       
        reemplazar = frase.replace("a",letra);
        System.out.println("la nueva frase es : "+ reemplazar);
        return reemplazar;   
    }
    // Método contiene(String letra), deberá comprobar si la frase contiene una letra que
    //ingresa el usuario y devuelve verdadero si la contiene y falso si no.
    public boolean contiene(String letra){
        //contains devuelve v o f , no dice si contiene un string dentro de otro o no.
        boolean contiene= frase.contains(letra);
        System.out.println("la frase contiene esa letra? : "+ contiene);
        return contiene;
        
    }
  
}
