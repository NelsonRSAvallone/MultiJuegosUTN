/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pong;

import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author NelsonSosa
 */
public class Pelota {
    private static final int TAMX = 15;
    private static final int TAMY = 15;
   private double x;
   private static double y ;
   private  int dx=1;
   private  int dy=1;
   //private final int ANCHO=15, ALTO=15;
   private Integer score1 = 0, score2 = 0;
   public static boolean finJuego = false;
   
   
   public Rectangle2D getPelota() {
        return new Rectangle2D.Double(x, y, TAMX, TAMY);
    }
   
   //metodo para mover la pelota y que rebote
   public void mover(Rectangle limites, boolean colisionR1, boolean colisionR2 ){
    x += dx;
    y += dy;
    //Validamos colision de pelota con raqueta
    if(colisionR1){//si es true
    dx=-dx;
    x=20;
    }
    
    if(colisionR2){
    dx=-dx;
    x=755;
    }
    
    if (x < limites.getMinX()) {
            score2++; //el puntaje del jugador2 aumenta en uno
           
            x = limites.getCenterX();
            y = limites.getCenterY();
            dx = -dx;
           
        }
    if (x + TAMX >= limites.getMaxX()) {
            score1++; //el puntaje del jugador1 aumenta en uno
            
            x = limites.getCenterX();
            y = limites.getCenterY();
            dx = -dx;
           
        }
        
     if (y < limites.getMinY()) {

            y = limites.getMinY();

            dy = -dy;
            
        }

        if (y + TAMY >= limites.getMaxY()) {

            y = limites.getMaxY() - TAMY;

            dy = -dy;
            
        }
   }
   public int getScore1() {
        return score1;
    }

    public int getScore2() {
        return score2;
    }
}
