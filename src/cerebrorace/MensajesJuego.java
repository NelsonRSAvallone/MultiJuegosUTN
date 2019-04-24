/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cerebrorace;

import javax.swing.JOptionPane;

/**
 *
 * @author luciano
 */
public class MensajesJuego {
    
    
    
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
      Jugador.cantJugadores = Integer.parseInt(JOptionPane.showInputDialog("Elige la cantidad de jugadores con un numero entero, entre 2 y 5"));
   }
   
   public static void mensajePedirDatosJugador(int numeroJugadores, Jugador[]jugadores){ // va creando objetos jugador seteando su atributo nombre
       
       for(int i=0; i<numeroJugadores; i++){
        Jugador.nombre= JOptionPane.showInputDialog("Ingrese el nombre del jugador nº " + (i+1));  
        
       jugadores[i] = new Jugador(Jugador.nombre);
       }
   }
   
   public static int mensajeSuma(){
       int respuesta;
        respuesta =Integer.parseInt(JOptionPane.showInputDialog( Jugador.vector[CicloJuego.turnoJuego].nombre + ": Resuelve el siguiente càlculo:\n"
        + OperacionAleatoria.a + " + " + OperacionAleatoria.b + ":"));
       return respuesta;
   }
   
   public static void mensajeResultado(boolean correccion){
       if ( correccion==true){
           JOptionPane.showMessageDialog(null,"Correcto!");
       }else{
             JOptionPane.showMessageDialog(null,"Respuesta equivocada");

       }
   }


}
