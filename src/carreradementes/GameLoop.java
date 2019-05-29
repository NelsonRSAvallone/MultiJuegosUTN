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
public class GameLoop {
    public static Jugador rol = new Jugador();
    public static int  a;
    public static int  b;
    public static int  resultado;
    public static int respuesta;
    public int turno;
    private boolean correccion;
    
    public GameLoop(){
        
    }
           
    public static int operacion(){
        a =  (int)  Math.random()*100;
        b =  (int)  Math.random()*100;
        resultado = a + b;
        return resultado;
    }
    
    public static void mensajeSuma(int turno){
        respuesta =Integer.parseInt(JOptionPane.showInputDialog(SetGame.nombres[turno] + ": Resuelve el siguiente càlculo:\n"
        + a + " + " + b + ":"));
    }
    
    public boolean comparacion (int resultado, int respuesta){
       
        if(respuesta == resultado){
           correccion = true; 
        } else{correccion = false;}
     return correccion;
    }
    
    public void avanceTurno(boolean correccion, int[] puntajes, int puntaje){
        if(correccion==false){
            if(turno==(SetGame.cantJugadores-1)){
                turno=0;
            }else{turno++;}
            
        }else{
            puntajes[turno]++;
            operacion();
            mensajeSuma(turno);
        }
        
    }
    
    public void loop(){
        
        while(SetGame.puntajes[turno]<5){
        avanceTurno(correccion,SetGame.puntajes,turno);
        //operacion();
        comparacion(resultado,respuesta);
        }
    }
    
}
