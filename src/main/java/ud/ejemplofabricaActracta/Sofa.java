/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud.ejemplofabricaActracta;

/**
 *
 * @author Sebastian
 */
public abstract class Sofa {
    private int puestos;
    
    public abstract void desplegar();

    public int getPuestos() {
        return puestos;
    }

    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }
    
}
