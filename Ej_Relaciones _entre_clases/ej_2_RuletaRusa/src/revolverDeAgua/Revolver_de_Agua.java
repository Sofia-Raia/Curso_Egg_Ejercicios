/*Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revolverDeAgua;

/**
 *
 * @author sofia
 */
public class Revolver_de_Agua {
    int posicion_actual;
    int posicion_agua;

    public Revolver_de_Agua() {
    }

    public Revolver_de_Agua(int posicion_actual, int posicion_agua) {
        this.posicion_actual = posicion_actual;
        this.posicion_agua = posicion_agua;
    }

    public int getPosicion_actual() {
        return posicion_actual;
    }

    public int getPosicion_agua() {
        return posicion_agua;
    }

    public void setPosicion_actual(int posicion_actual) {
        this.posicion_actual = posicion_actual;
    }

    public void setPosicion_agua(int posicion_agua) {
        this.posicion_agua = posicion_agua;
    }
    
    public void llenarRevolver(){
        posicion_actual=(int)(Math. random()*6+1);
        posicion_agua=(int)(Math. random()*6+1);
    }
    public boolean mojar(){
        boolean mojar=true;
        
        if(posicion_actual==posicion_agua){
             System.out.println("Perdio!! :P");
        }else{
            mojar=false;
            System.out.println("En esta ronda tuvo suerte! :D");
          
        }
        return mojar;
        
    }
    public void siguienteChorro(){
        if (posicion_actual==6){
            posicion_actual=1;
        } else {
         posicion_actual+=1;   
        }
    }

    @Override
    public String toString() {
        return "Revolver de Agua: " + "La posicion actual esta en:" + posicion_actual + ", y la posicion del agua es: " + posicion_agua;
    }
    
    
    
    
  
    
}

