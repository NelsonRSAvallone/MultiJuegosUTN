
package Pong;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 *
 * @author NelsonSosa
 */
public class EventoTeclado extends KeyAdapter {
static boolean w, s, up, down;
    
@Override
    public void keyPressed (KeyEvent e){//Para que se active el evento cuando precionamos la tecla
    //todo este metodo contiene informacion de que tecla estamos presionando
        int id = e.getKeyCode();
        
        if (id == KeyEvent.VK_W){ //VK_W corresponde a la letra w del teclado, cada letra en el teclado tiene un VK, la api de java nos lo muestra
        w = true;
        }
        if(id == KeyEvent.VK_S){
        s=true;
        }
        if (id == KeyEvent.VK_UP) {
            up = true;
        }
        if (id == KeyEvent.VK_DOWN) {
            down = true;
        }
    } 
    @Override
    public void keyReleased(KeyEvent e) {//Para que ocurra otro evento cuando soltamos la tecla

        int id = e.getKeyCode();
        
        if (id == KeyEvent.VK_W) {
            w = false;
        }
        if (id == KeyEvent.VK_S) {
            s = false;
        }
        if (id == KeyEvent.VK_UP) {
            up = false;
        }
        if (id == KeyEvent.VK_DOWN) {
            down = false;
        }
    }
}
