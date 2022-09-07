/*


 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pais;

import java.util.Comparator;

/**
 *
 * @author sofia
 */
// Con esto comparo clases con "implements Comparable<Pais>", en este caso dos paises. 
public class Pais implements Comparable<Pais>{
    String nombreP;

    public Pais() {
    }

    public Pais(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }
    
    @Override
    public String toString(){
        return "País : " + nombreP ;
    }
// es como el otro "compare" compara un pais con otro, le paso por parametro un pais.
    @Override
    public int compareTo(Pais p) {
        return nombreP.compareTo(p.getNombreP());
    }
    
    
    
}
