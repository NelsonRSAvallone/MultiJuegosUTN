/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreradementes;

import javax.swing.JOptionPane;

/**
 *
 * @author Luciano Beemeequis
 */
public class Jugador {
        
    
    public static void mensajeBienvenida(){
       JOptionPane.showMessageDialog(null,"Divièrtete con carrera de mentes!");
   }
    
    public static void mensajeExplicaJuego(){
       JOptionPane.showMessageDialog(null,"El juego consiste en responder las preguntas correctmente\n"
               + "lo mas ràpido posible. Cuando respondas, si tu pregunta es correcta\n"
               + "el reloj se detendrà, y se sumarà ese valor en metros para llegar a la meta\n"
               + "Si no respondes o si respondes mal, no se sumarà ningun punto de avance\n"
               + "----------LET'S RACE!----------");
   }
}
