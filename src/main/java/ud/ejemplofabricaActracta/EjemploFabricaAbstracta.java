/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ud.ejemplofabricaActracta;

/**
 *
 * @author Sebastian
 */
public class EjemploFabricaAbstracta {

    public static void main(String[] args) {
        CompradorMuebles sebastian;
        //sebastian=new CompradorMuebles(new FabricaMueblesVictorianos());
        sebastian=new CompradorMuebles(new FabricaMueblesModernos());
        sebastian.comprarMuebles();
    }
}
