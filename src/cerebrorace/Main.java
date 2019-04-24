/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cerebrorace;


import static cerebrorace.CicloJuego.*;
import static cerebrorace.MensajesJuego.*;
import javax.swing.JOptionPane;

/**
 *
 * @author luciano
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        mensajeBienvenida();
        mensajeExplicaJuego();
        mensajeCantidadJugadores();
        mensajePedirDatosJugador(Jugador.cantJugadores, Jugador.vector);
        
        for (int i = 0; i < Jugador.vector.length; i++) {
            System.out.println("Jugador " + i + ": " + Jugador.vector[i]);
        }
        
        cicloJuego();
        
               
       
    }
    
}
