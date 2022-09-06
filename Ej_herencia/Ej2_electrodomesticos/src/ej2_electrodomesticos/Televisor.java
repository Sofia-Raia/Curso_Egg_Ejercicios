/*Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2_electrodomesticos;

/**
 *
 * @author sofia
 */
public class Televisor extends Electrodomesticos {
    protected double pulgadas;
    protected  boolean tdt;

    public Televisor() {
    }

    public Televisor(double pulgadas, boolean tdt, double precio, String color, String consumo_electrico, double peso) {
        super(precio, color, consumo_electrico, peso);
        this.pulgadas = pulgadas;
        this.tdt = tdt;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }
    
//Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
//padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
//los atributos del televisor.
    public void crearTelevisor(){
        crearElectrodomestico();
        System.out.println("Indique las pulgadas del televisor");
        double pulgadas=leer.nextDouble();
        leer.nextLine();
        this.pulgadas=pulgadas;
        System.out.println("Indique si tiene sintonizador TDT: SI /NO ");
        String resp="";
        while (!resp.equalsIgnoreCase("si") && !resp.equalsIgnoreCase("no")) {
            resp=leer.nextLine();
            if(resp.equalsIgnoreCase("si")){
                 this.tdt=true;
            }else if(resp.equalsIgnoreCase("no")){
                this.tdt=false;
            }else{
                System.out.println("La respuesta no es valida, ingrese si o no.");
            }   
        }
    }
//Método precioFinal(): este método será heredado y se le sumará la siguiente
//funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
//incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
//$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
//también deben afectar al precio.

    @Override
    protected double precioFinal() {
         if(pulgadas>40){
            precio*=1.3;
        }
        if(tdt){
            precio+=500;
        }
        return super.precioFinal(); 
    }

   
   
    

       
    
}
