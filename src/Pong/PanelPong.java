/*

 */
package Pong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

/**
 *
 * @author NelsonSosa
 */
public class PanelPong extends JPanel {
Pelota pelota = new Pelota(0,0);
    public PanelPong() {
        setBackground(Color.BLACK);
        
    }
    //Dibujas en el frame
    @Override
    public void paintComponent(Graphics g){ //Este objeto nos permite dibujar cualquier figura
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D) g;
    g2.setColor(Color.WHITE);//Elegimos el color de la pelota
    dibujar(g2);
    actualizar ();
    }
    
    public void dibujar(Graphics2D g){
    g.fill(pelota.getPelota());//este metodo nos retorna un rectangulo tipo 2d
    
    }
    
    public void actualizar(){
    pelota.mover(getBounds());
    }
    
}
