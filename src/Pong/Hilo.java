/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pong;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NelsonSosa
 */
public class Hilo extends Thread {
    private final PanelPong lamina;
    
    public Hilo(PanelPong lamina){
    this.lamina=lamina;
    }
    
    @Override
    public void run() {
        while (!Pelota.finJuego) {
            lamina.repaint();
            try {
                Thread.sleep(6);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
            }
            
          
        }
    }
}
