/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2_electrodomesticos;

/**
 *
 * @author sofia
 */
public class Lavadora extends Electrodomesticos {
    
    protected double carga;

    public Lavadora() {
    }

    public Lavadora(double carga, double precio, String color, String consumo_electrico, double peso) {
        super(precio, color, consumo_electrico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
    
//Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
//padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
//el atributo propio de la lavadora.
    public void crearLavadora(){
        crearElectrodomestico();
        System.out.println("Indique la carga del electrodoméstico");
        double carga=leer.nextDouble();
        this.carga=carga;

    }

//Método precioFinal(): este método será heredado y se le sumará la siguiente
//funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
//carga es menor o igual, no se incrementará el precio. Este método debe llamar al
//método padre y añadir el código necesario. Recuerda que las condiciones que hemos
//visto en la clase Electrodoméstico también deben afectar al precio.

    @Override
    protected double precioFinal() {
        if(carga>30){
            precio+=500;   
            }
        return super.precioFinal(); 
            
    }
    
    
    
    
}




