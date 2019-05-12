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
   private int x;
   private int y;
   private  int dx=1;
   private  int dy=1;
   
   private final int ANCHO=15, ALTO=15;
   public Pelota (int x, int y){
       this.x=x;
       this.y=y;
    }
   public Rectangle2D getPelota(){
   return new Rectangle2D.Double(x,y,ANCHO,ALTO);
   }
   
   //metodo para mover la pelota y que rebote
   public void mover(Rectangle limites){
    x=x+dx;
    y=y+dy;
    if(x>limites.getMaxX()){
    dx=-dx;
    }//fin if dx
    if (y>limites.getMaxY()){
    dy=-dy;
    }//fin if dy
    if (x<0){
   dx=-dx;
   }
    if (y<0){
   dy=-dy;
   }//fin IF y
   }
}
