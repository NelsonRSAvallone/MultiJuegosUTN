
package Pong;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 *
 * @author Nelson
 */
public class EventoTeclado extends KeyAdapter {
static boolean w, s, up, down;
    
    public void keyPressed (KeyEvent e){
    
        int id = e.getKeyCode();
        
        if (id == KeyEvent.VK_W){
        w = true;
        }
        if(id == KeyEvent.VK_S){
        s=true;
        }
        
    } 
}
