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
public class SetGame {
   public GameLoop control = new GameLoop();
   public static String[]nombres;
   public static int[]puntajes;
   public static int cantJugadores;
   
   
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
   
   public static void mensajeCantidadJugadores(){   // PIDE CANTIDAD DE JUGADORES Y LO ALOJA EN cantJugadores
      cantJugadores = Integer.parseInt(JOptionPane.showInputDialog("Elige la cantidad de jugadores con un numero entero, entre 2 y 5"));
      nombres = new String[cantJugadores];
      puntajes = new int[cantJugadores];
   }
   
   public static void pedirNombreJugadores(){ // va creando objetos jugador seteando su atributo nombre
    for(int i=0; i<(nombres.length); i++){
        nombres[i]= JOptionPane.showInputDialog("Ingrese el nombre del jugador nº " + (i+1));  
        }
   }
    
}
