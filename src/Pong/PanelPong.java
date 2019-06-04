/*

 */
package Pong;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author NelsonSosa
 */
public class PanelPong extends JPanel {
Pelota pelota = new Pelota();
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
    Line2D.Double linea = new Line2D.Double(getBounds().getCenterX(), 0, getBounds().getCenterX(), getBounds().getMaxY());
    g.draw(linea);
    g.fill(pelota.getPelota());//este metodo nos retorna un rectangulo tipo 2d
    g.fill(r1.getRaqueta());
    g.fill(r2.getRaqueta());
    g.fill(pelota.getPelota());
        actualizar();
    
    }
    
    public void actualizar(){
    pelota.mover(getBounds(),colision(r1.getRaqueta()),colision(r2.getRaqueta()));//le mandamos como parametro la colision de las 2 raquetas
    r1.moverR1(getBounds());
    r2.moverR2(getBounds());
    }

    //Colision de la pelota con la raqueta
    private boolean colision (Rectangle2D r){
    return pelota.getPelota().intersects(r);// cuando usamos este metodo intersects, detectamos si la pelota se va a cruzar con la raqueta, en el API de java dice que si dos objetos tipo rectangulo se intersectan nos devuelve un true o un false
    }
     private void dibujarPuntaje(Graphics2D g) {
        Graphics2D g1 = g, g2 = g;
        Font score = new Font("Arial", Font.BOLD, 30);
        g.setFont(score);

        g1.drawString(Integer.toString(pelota.getScore1()), (float) getBounds().getCenterX() - 50, 30);
        g2.drawString(Integer.toString(pelota.getScore2()), (float) getBounds().getCenterX() + 25, 30);
        if (pelota.getScore1() == 5) {
            g.drawString("GANÓ El JUGADOR 1", (float) getBounds().getCenterX() - 180, (float) getBounds().getCenterY() - 100);
            Pelota.finJuego = true;
        }
        if (pelota.getScore2() == 5) {
            g.drawString("GANÓ EL JUGADOR 2", (float) getBounds().getCenterX() - 180, (float) getBounds().getCenterY() - 100);
            Pelota.finJuego = true;
        }
    }
    
}