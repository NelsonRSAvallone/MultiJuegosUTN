/*

 */
package Pong;

import javax.swing.JFrame;

/**
 *
 * @author NelsonSosa
 */
public class VentanaPong extends JFrame {

    private final int ANCHO = 800, ALTO = 500;
    private PanelPong lamina;
   private Hilo hilo;
   
    public VentanaPong() {
        setTitle("Pong");
        setSize(ANCHO, ALTO);
        setLocationRelativeTo(null);//Con esto unbicamos la ventana en el centro de la pantalla
        setResizable(false);//impide que el usuario modifique el tamaño de la ventana
        lamina = new PanelPong();
        add(lamina);
        hilo=new Hilo(lamina);
        hilo.start();
    }
}
