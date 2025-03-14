/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud.ejemplofabricaActracta;

/**
 *
 * @author Sebastian
 */
public abstract class Silla {
    private String color;
    
    public abstract void hasLegs();
    public abstract void sitOn();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}
