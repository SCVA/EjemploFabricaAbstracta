/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud.ejemplofabricaActracta;

/**
 *
 * @author Sebastian
 */
public class CompradorMuebles {
    private FabricaMuebles fabrica;
    private Silla sillaCreada;
    private Sofa sofaCreado;

    public CompradorMuebles(FabricaMuebles fabrica) {
        this.fabrica = fabrica;
    }
    
    public void comprarMuebles(){
        sillaCreada = fabrica.crearSilla();
        sofaCreado= fabrica.crearSofa();
        sillaCreada.hasLegs();
        sofaCreado.desplegar();
    }
    
    public FabricaMuebles getFabrica() {
        return fabrica;
    }

    public void setFabrica(FabricaMuebles fabrica) {
        this.fabrica = fabrica;
    }
    
    
}
