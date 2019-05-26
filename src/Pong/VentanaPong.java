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
        //instanciamos para que funcione las teclas
        addKeyListener(new EventoTeclado());
        setVisible(true);//Para que la ventana se vea
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Para que se cierre la aplicacion cuando cierro la ventana
        
        hilo=new Hilo(lamina);
        hilo.start();
      //  lamina.iterarJuego();//Nuestra lamina se va a estar repintando cada 6 milisegundos
    }
}
