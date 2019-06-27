/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreradementes;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Luciano Beemeequis
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       // SetGame.mensajeBienvenida();
       // SetGame.mensajeExplicaJuego();
        SetGame.mensajeCantidadJugadores();
        SetGame.pedirNombreJugadores();
        GameLoop.rolGraficos = new Graficos();
        
        
        GameLoop control = new GameLoop();
        control.loop();
        
    }
    
}
