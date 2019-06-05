/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreradementes;

import static carreradementes.GameLoop.contador;
import static carreradementes.GameLoop.tiempoEnSegundos;
import java.util.TimerTask;
import java.util.Timer;

/**
 *
 * @author Luciano Beemeequis
 */
public class Reloj extends Thread {
    int contador = 10, tiempoEnSegundos=10;
    Timer timer;
    TimerTask tarea;
    
    public Reloj(){
                 timer = new Timer();
                    
                 tarea = new TimerTask() {  // INICIO DEL TIMERTASK ----------------------
                            
                     public void run() {
                        System.out.println("tiempo restante: " + (contador+1));
                        contador--;
                                    
                     }
                };                                    // FIN DEL TIMERTASK -----------------------------
        timer.schedule(tarea, 2000, 1000);
    
    }
    
    

    public void iniciarReloj(){
            start();
        }

    public void detenerReloj(Timer timer){
        timer.cancel();
        timer.purge();
    }

}

