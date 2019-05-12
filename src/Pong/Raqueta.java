
package Pong;

import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author Computer
 */
public class Raqueta {
    private int x,y;
    static final int ANCHO=10, ALTO=40; //Static para que podamos invocarlas desde otras clases
    
    
    public Raqueta (int x, int y){
        this.x=x;
        this.y=y;
    } 
    
    public Rectangle2D getRaqueta() {
        return new Rectangle2D.Double(x, y, ANCHO, ALTO);
    }
}
