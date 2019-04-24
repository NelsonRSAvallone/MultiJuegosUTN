/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cerebrorace;

/**
 *
 * @author luciano
 */
public class CicloJuego {
    
    public static boolean correccion;
       
    public static int turnoJuego=1;
    
    public static int resultado;
    
    public static void cicloJuego(){
        
        while(true){

           MensajesJuego.mensajeSuma();     // jugador n, responde este calculo
           resultado = OperacionAleatoria.Operacion();  // se hace la operacion para tener el resultado correcto
           correccion = OperacionAleatoria.comparacion(resultado, (MensajesJuego.mensajeSuma()) ); // compara respuesta con resultado

           MensajesJuego.mensajeResultado(correccion);
           
           if(turnoJuego < Jugador.cantJugadores){
           turnoJuego++;
           }else{
               turnoJuego=0;
           }
       }
    }
}
