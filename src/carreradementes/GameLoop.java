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
    public static Graficos rolGraficos;
    public static Reloj rolReloj;
    public static Jugador rolJugador = new Jugador();
    public static int  a;
    public static int  b;
    public static int  resultado;
    public static int respuesta;
    public int turno;
    private static boolean correccion;
    public static int contador=0; // este contador maneja la cantidad de segundos que se ejecuta 
    public static int tiempoEnSegundos; //esta variable se usa para convertir de mili a segundos el tiempo que entra por parametro al metodo moverCerebro()
        
    public GameLoop(){}
           
    public static int operacion(){          //GENERA OPERACION MATEMATICA
        a =  (int)  (Math.random()*100);
        b =  (int)  (Math.random()*100);
        resultado = a + b;
        return resultado;
    }
     
    public static void mensajeSuma(int turno){     // MENSAJE SUMA
        rolReloj = new Reloj();
        rolReloj.iniciarReloj();
        respuesta =Integer.parseInt(JOptionPane.showInputDialog(SetGame.nombres[turno] + ": Resuelve el siguiente càlculo:\n"
        + a + " + " + b + ":"));
        if(comparacion(resultado,respuesta)==true){
            SetGame.puntajes[turno] = rolReloj.contador;
        }
            rolReloj.detenerReloj(rolReloj.timer);
    }
    
    public static boolean comparacion (int resultado, int respuesta){    // COMPARACION ENTRE OPERACION Y RESPUESTA
        if(respuesta == resultado){
           correccion = true; 
        } else{correccion = false;}
        return correccion;
    }
    
    public void avanceTurno(){  // OBSERVA CORRECCION Y AVANZA TURNO O NO AVANZA
        if(correccion==false){
            if(turno==(SetGame.cantJugadores-1)){
                turno=0;
            }else{turno++;}
        }
    }
    
    public void loop(){
        while(true){
            mensajeSuma(turno);
            avanceTurno();
            operacion();
            
        }
    }

    
    
    
   
            
    
}


