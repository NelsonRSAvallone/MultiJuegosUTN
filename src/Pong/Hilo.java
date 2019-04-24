/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pong;

/**
 *
 * @author NelsonSosa
 */
public class Hilo extends Thread {
    PanelPong lamina;
    public Hilo(PanelPong lamina){
    this.lamina=lamina;
    }
    
    @Override
    public void run(){
    while(true){//Mientras sea verdadero, nuestr lamina se vuelve a dibujar
    lamina.repaint();//Se vuelve a dibujar
    }
   }
}
