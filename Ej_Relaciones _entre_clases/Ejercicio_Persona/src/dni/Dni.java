/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dni;

/**
 *
 * @author sofia
 */
public class Dni {
    char serie;
    int n_doc;
    

    public char getSerie() {
        return serie;
    }

    public int getN_doc() {
        return n_doc;
    }

    public void setSerie(char serie) {
        this.serie = serie;
    }

    public void setN_doc(int n_doc) {
        this.n_doc = n_doc;
    }

    public Dni(char serie, int n_doc) {
        this.serie = serie;
        this.n_doc = n_doc;
    }

    public Dni() {
    }
    
    
}
