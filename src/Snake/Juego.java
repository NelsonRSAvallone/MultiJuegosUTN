/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author leand
 */
public class Juego {
    JFrame ventana;
    JPanel panelJuego;
    JLabel fondo;
    
    ArrayList<JLabel>serpiente;
    int x;
    int y;
    int desplazamiento=20;
    Timer tiempo;
    int bandera=0;
    public Juego(){
    //ventana
    ventana = new JFrame("Snake");
    ventana.setSize(600,600);
    ventana.setLocationRelativeTo(null);
    ventana.setLayout(null);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setResizable(false);//no permite modificar la ventana
    //panel
    panelJuego = new JPanel();
    panelJuego.setSize(ventana.getSize());
    panelJuego.setLayout(null);
    panelJuego.setVisible(true);
    panelJuego.setBackground(Color.red);
    //fondo
    fondo = new JLabel();
    fondo.setSize(panelJuego.getSize());
    fondo.setIcon(new ImageIcon("imagenes/fondo.png"));
    fondo.setVisible(true);
    panelJuego.add(fondo,0);
    
    //serpiente
    serpiente = new ArrayList<JLabel>();
    JLabel aux =new JLabel();
    aux.setLocation(290,290);
    aux.setSize(20,20);
    aux.setIcon(new ImageIcon("imagenes/2.png"));
    aux.setVisible(true);
    serpiente.add(aux);
    panelJuego.add(serpiente.get(0),0);
  
    
    ventana.add(panelJuego);
    
    ventana.setVisible(true);
    
    tiempo= new Timer(400,new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
         serpiente.get(0).setLocation(serpiente.get(0).getX()+x,serpiente.get(0).getX()+y);
         serpiente.get(0).repaint();
        }
    });
    
    ventana.addKeyListener(new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(e.getKeyCode()== KeyEvent.VK_UP){
            System.out.println("arriba");
            if( serpiente.get(0).getY()>0 ){
               y = -desplazamiento;
               x = 0;
               serpiente.get(0).setIcon(new ImageIcon("modificar"));//hacer sprites
            }
            if(bandera==0){
              tiempo.start();
              bandera=1;
              }
        }
        if(e.getKeyCode()== KeyEvent.VK_DOWN){
            System.out.println("abajo");
            if( serpiente.get(0).getY()<600 ){
               y = desplazamiento;
               x = 0;
               serpiente.get(0).setIcon(new ImageIcon("modificar"));//hacer sprites

            }
            if(bandera==0){
              tiempo.start();
              bandera=1;
              }
        }
        if(e.getKeyCode()== KeyEvent.VK_LEFT){
            System.out.println("izquierda");
              if( serpiente.get(0).getX()>0 ){
               y = 0;
               x = -desplazamiento;
               serpiente.get(0).setIcon(new ImageIcon("modificar"));//hacer sprites

              }
              if(bandera==0){
                tiempo.start();
                bandera=1;
              }
            
        }
        if(e.getKeyCode()== KeyEvent.VK_RIGHT){
            System.out.println("derecha");
              if( serpiente.get(0).getX()<600   ){
               y = 0;
               x = desplazamiento;
                serpiente.get(0).setIcon(new ImageIcon("modificar"));//hacer sprites

              }
              if(bandera==0){
              tiempo.start();
              bandera=1;
              }
        }
        }

        @Override
        public void keyPressed(KeyEvent ke) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void keyReleased(KeyEvent ke) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    });
    }
}
