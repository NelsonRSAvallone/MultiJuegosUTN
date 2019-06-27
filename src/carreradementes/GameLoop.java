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
public class GameLoop {
    public static Graficos rolGraficos;
    public static int  a;
    public static int  b;
    public static int  resultado;
    public static int respuesta;
    public int turno;
    private static boolean correccion = false;
    public static int contador=0; // este contador maneja la cantidad de segundos que se ejecuta 
    public static int tiempoEnSegundos; //esta variable se usa para convertir de mili a segundos el tiempo que entra por parametro al metodo moverCerebro()
        
    public GameLoop(){}
           
    public static void operacion(){          //GENERA OPERACION MATEMATICA
        a =  (int)  (Math.random()*10);
        b =  (int)  (Math.random()*10);
        resultado = a + b;
    }
     
    public static void mensajeSuma(int turno){     // MENSAJE SUMA
        
        respuesta =Integer.parseInt(JOptionPane.showInputDialog(SetGame.nombres[turno] + " ,resuelve el siguiente càlculo:\n"
        + a + " + " + b + ":"));
    }
    
    public void comparacion (){    // COMPARACION ENTRE OPERACION Y RESPUESTA
        if(respuesta == resultado){
           correccion = true; 
            try {
                rolGraficos.moverCerebro(turno);
            } catch (InterruptedException ex) {
                Logger.getLogger(GameLoop.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else{correccion = false;}
       
    }
    
    public void avanceTurno(){  // OBSERVA CORRECCION Y AVANZA TURNO O NO AVANZA
        if(correccion == false){
            if(turno == (SetGame.cantJugadores-1)){
                turno=0;
            }else{turno++;}
        }
    }
    
    public void loop(){
        while(true){
            operacion();
            mensajeSuma(turno);
            comparacion();
            avanceTurno();
        }
    }

    
    
    
   
            
    
}


