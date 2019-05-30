/*
 * To change ventana license header, choose License Headers in Project Properties.
 * To change ventana template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreradementes;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Luciano Beemeequis
 */
public class Graficos {
    JFrame ventana;
    JPanel panel;
    JLabel fondo;
    JLabel cerebro1;
   // JLabel cerebro2;
    //JLabel cerebro3;
        
    public int posicionY=460;
    
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
        
        
        
        //variables para cerebro1
        
        cerebro1 = new JLabel();
        cerebro1.setLocation(50, posicionY);
        cerebro1.setSize(161, 179);
        cerebro1.setIcon(new ImageIcon("images/cerebro.png"));
        cerebro1.setVisible(true);
        panel.add(cerebro1,0);

        ventana.add(panel);
        
        ventana.setVisible(true);
    }
    
    public void moverCerebro(){
        
        while(posicionY>0){
            posicionY--;
            cerebro1.setLocation(50, posicionY);
            try {
                Thread.sleep(60);
            } catch (InterruptedException ex) {
                Logger.getLogger(Graficos.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
    
    
    
    
}
