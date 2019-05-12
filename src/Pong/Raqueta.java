
package Pong;

import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author Computer
 */
public class Raqueta {
    private int x,y;
    private final int ANCHO=10, ALTO=25;
    
    
    public Raqueta (int x, int y){
        this.x=x;
        this.y=y;
    } 
    
    public Rectangle2D getRaqueta(){
    return new Rectangle2D.Double (x, y, ANCHO,ALTO);
    
    }
}
