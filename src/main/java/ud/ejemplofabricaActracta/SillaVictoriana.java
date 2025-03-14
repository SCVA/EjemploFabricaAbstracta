/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud.ejemplofabricaActracta;

/**
 *
 * @author Sebastian
 */
public class SillaVictoriana extends Silla{

    @Override
    public void hasLegs() {
        /**No esta correcto colocar impresiones, mirar 
         * una fabrica de interfaces"
         * */
        System.out.println("Tiene patas Victorianas");
    }

    @Override
    public void sitOn() {
        System.out.println("Se sienta estilo Victoriano");
    }
    
}
