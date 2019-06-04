/*

 */
package Pong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author NelsonSosa
 */
public class PanelPong extends JPanel {
Pelota pelota = new Pelota(0,0);
Raqueta r1 = new Raqueta (10,200); //Raqueta izquierda
Raqueta r2 = new Raqueta (794-10-Raqueta.ANCHO,200);  //Raqueta derecha pero hay que poner la posicion correspondiente a la anchura maxima - la distancia que pretendemos  


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
    g.fill(r1.getRaqueta());
    g.fill(r2.getRaqueta());
    
    }
    
    public void actualizar(){
    pelota.mover(getBounds());
    r1.moverR1(getBounds());
    r2.moverR2(getBounds());
    }
//    public void iterarJuego() {
//        while (true) {
//            try {
//                repaint();
//                Thread.sleep(6);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(PanelPong.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//    }
    //Colision de la pelota con la raqueta
    private boolean colision (Rectangle2D r){
    return pelota.getPelota().intersects(r);// cuando usamos este metodo intersects, detectamos si la pelota se va a cruzar con la raqueta, en el API de java dice que si dos objetos tipo rectangulo se intersectan nos devuelve un true o un false
    }
    
    
}