/*
 * To change ventana license header, choose License Headers in Project Properties.
 * To change ventana template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreradementes;


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
    
    GameLoop rol;
    JFrame ventana;
    JPanel panel;
    JLabel fondo;
    JLabel cerebro1;
    JLabel cerebro2;
    JLabel cerebro3;
    JLabel nombre1;
    JLabel nombre2;
    JLabel nombre3;
    private int posicionY1=460;
    private int posicionY2=460;
    private int posicionY3=460;
    
    
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
        cerebro1.setLocation(50, posicionY1);
        cerebro1.setSize(161, 179);
        cerebro1.setIcon(new ImageIcon("images/cerebro.png"));
        cerebro1.setVisible(true);
        panel.add(cerebro1,0);
        
        cerebro2 = new JLabel();
        cerebro2.setLocation(197, posicionY2);
        cerebro2.setSize(161, 179);
        cerebro2.setIcon(new ImageIcon("images/cerebro.png"));
        cerebro2.setVisible(true);
        panel.add(cerebro2,0);

        cerebro3 = new JLabel();
        cerebro3.setLocation(344, posicionY3);
        cerebro3.setSize(161, 179);
        cerebro3.setIcon(new ImageIcon("images/cerebro.png"));
        cerebro3.setVisible(true);
        panel.add(cerebro3,0);
        
        
        
        ventana.add(panel);
        
        ventana.setVisible(true);
    }
    
 
            public void moverCerebro(int turno) throws InterruptedException{ //
                
                if(turno == 0){
                
                    for(int i=0; i<50;i++){
                        cerebro1.setLocation(50, posicionY1);
                        posicionY1--;
                        Thread.sleep(30);
                    }
                } else if(turno == 1){
                    for(int i=0; i<50;i++){
                        cerebro2.setLocation(197, posicionY2);
                        posicionY2--;
                        Thread.sleep(30);
                    }
                
                }else if(turno ==2){
                    for(int i=0; i<50;i++){
                        cerebro3.setLocation(344, posicionY3);
                        posicionY3--;
                        Thread.sleep(30);
                    }
                }
            }
     

}
    
    
    

