/*
 * To change ventana license header, choose License Headers in Project Properties.
 * To change ventana template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreradementes;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Luciano Beemeequis
 */
public class Graficos extends Thread{
    
    GameLoop rol;
    JFrame ventana;
    JPanel panel;
    JLabel fondo;
    JLabel cerebro1;
    JLabel cerebro2;
    JLabel cerebro3;
    static int contador=0; // este contador maneja la cantidad de segundos que se ejecuta 
    static int tiempoEnSegundos; //esta variable se usa para convertir de mili a segundos el tiempo que entra por parametro al metodo moverCerebro()
    public int tiempoObtenido;
    public int posicionY=460;
    public Reloj reloj;
    
    
    public Graficos(){
    
        ventana = new JFrame("Carrera De Mentes");
        ventana.setSize(562,700);
        ventana.setLocationRelativeTo(null);
        ventana.setLayout(null);
        ventana.setResizable(false);
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        panel = new JPanel();
        panel.setSize(ventana.getSize());
        panel.setLayout(null);
        panel.setVisible(true);
        panel.setFocusable(true);
        
        fondo = new JLabel();
        fondo.setSize(panel.getSize());
        fondo.setIcon(new ImageIcon("images/fondo.png"));
        fondo.setVisible(true);
        panel.add(fondo,0);
        
        cerebro1 = new JLabel();
        cerebro1.setLocation(50, posicionY);
        cerebro1.setSize(161, 179);
        cerebro1.setIcon(new ImageIcon("images/cerebro.png"));
        cerebro1.setVisible(true);
        panel.add(cerebro1,0);
        
        cerebro2 = new JLabel();
        cerebro2.setLocation(197, posicionY);
        cerebro2.setSize(161, 179);
        cerebro2.setIcon(new ImageIcon("images/cerebro.png"));
        cerebro2.setVisible(true);
        panel.add(cerebro2,0);

        cerebro3 = new JLabel();
        cerebro3.setLocation(344, posicionY);
        cerebro3.setSize(161, 179);
        cerebro3.setIcon(new ImageIcon("images/cerebro.png"));
        cerebro3.setVisible(true);
        panel.add(cerebro3,0);
        
        ventana.add(panel);
        
        ventana.setVisible(true);
    }
    
 
            public void moverCerebro(){ // este metodo mueve el cerebro durante un instante de tiempo que se le ingresa como parametro
                    reloj = new Reloj();
                    reloj.iniciarReloj();
                    while(reloj.contador <= tiempoObtenido){
                        posicionY--;
                        cerebro1.setLocation(50, posicionY);
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Graficos.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    tiempoObtenido =0;
            }
     public void run(){
         moverCerebro();
    }

}
    
    
    

