
package Pong;

import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author NelsonSosa
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
     
     public void moverR1(Rectangle limites){ // metodo para la raqueta 1, necesitamos pasarle como parametro los limites de la pantalla
     if (EventoTeclado.w && y>limites.getMinY()){//Si la w es true, entonces el valor en y de la raqueta debe diminuir
      y--;
      }
      if (EventoTeclado.s && y < limites.getMaxY()-ALTO){//Si la s es true, entonces el valor en y de la raqueta debe aumentar
      y++;
      }
     }
     void moverR2(Rectangle limites){ // metodo para la raqueta 2
      if (EventoTeclado.up&& y>limites.getMinY()){//Si la up es true, entonces el valor en y de la raqueta debe diminuir
      y--;
      }
      if (EventoTeclado.down && y < limites.getMaxY()-ALTO){//Si la down es true, entonces el valor en y de la raqueta debe aumentar
      y++;
      }
     }
     
}
