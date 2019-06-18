package VentanadeInicio;

import Pong.VentanaPong;

/**
 *
 * @author Nelson
 */
public class MainMenu {

    public static void main(String[] args) {

        VentanaPrincipal v1 = new VentanaPrincipal();

        
        Controlador c1 = new Controlador(v1);

        c1.iniciar();
        v1.setVisible(true);
    }
}
