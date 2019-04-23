/*
Este es el Main, donde vamos a mandar a llamar a todas las Clases
 */
package Pong;

import javax.swing.JFrame;

/**
 *
 * @author NelsonSosa
 */
public class MainPong {
    public static void main(String[] args) {
        VentanaPong ventana = new VentanaPong();
        
        ventana.setVisible(true);//Para que la ventana se vea
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Para que se cierre la aplicacion cuando cierro la ventana
    }
}
