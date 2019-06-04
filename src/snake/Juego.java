/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake;

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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

    //serpiente
    ArrayList<JLabel> serpiente;
    int x;
    int y;
    int desplazamiento = 20;

    Timer tiempo;
    int bandera = 0;
    Rectangle serp;

    int perdio = 0;
    //comida
    JLabel comida;
    int cx = 0;//posicion de comida en x
    int cy = 0;//posicion de comida en y
    Rectangle comi;

    //Puntuacion
    JLabel puntuacion;
    int contador = 0;

    public Juego() {//constructor
        //ventana
        ventana = new JFrame("Snake");
        ventana.setSize(600, 600);
        ventana.setLocationRelativeTo(null);
        ventana.setLayout(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);//no permite modificar la ventana
        //panel
        panelJuego = new JPanel();
        panelJuego.setSize(ventana.getSize());
        panelJuego.setLayout(null);
        panelJuego.setVisible(true);
        //panelJuego.setBackground(Color.white);
        //fondo
        fondo = new JLabel();
        fondo.setSize(panelJuego.getSize());
        fondo.setIcon(new ImageIcon("sprite/fondo.jpg"));
        fondo.setVisible(true);
        panelJuego.add(fondo, 0);

        //serpiente
        serpiente = new ArrayList<JLabel>();
        JLabel aux = new JLabel();
        aux.setLocation(290, 290);
        aux.setSize(20, 20);
        aux.setIcon(new ImageIcon("sprite/1.png"));
        aux.setVisible(true);
        serpiente.add(aux);
        panelJuego.add(serpiente.get(0), 0);

        ventana.add(panelJuego);
        //Label comida
        comida = new JLabel();
        comida.setSize(20, 20);
        comida.setIcon(new ImageIcon("sprite/comida.png"));
        Random aleatorio = new Random();
        cx = aleatorio.nextInt(580);
        cy = aleatorio.nextInt(580);
        comida.setLocation(cx, cy);
        comida.setVisible(true);
        panelJuego.add(comida, 0);

        serp = new Rectangle(serpiente.get(0).getBounds());
        comi = new Rectangle(comida.getBounds());

        ventana.setVisible(true);

        puntuacion = new JLabel("Score" + contador);
        puntuacion.setBounds(10, 20, 100, 20);
        puntuacion.setVisible(true);
        puntuacion.setForeground(Color.red);
        panelJuego.add(puntuacion, 0);

        tiempo = new Timer(200, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {//establece los ciclos de repeticion
                comi.setBounds(comida.getBounds());
                serp.setBounds(serpiente.get(0).getBounds());
                //colision con la misma serpiente 
                for (int i = 1; i < serpiente.size(); i++) {
                    if ((serpiente.get(0).getX() == serpiente.get(i).getX()) && (serpiente.get(0).getY() == serpiente.get(i).getY()) && (serpiente.size() > 2)) {
                        perdio = 1;
                        tiempo.stop();
                        JOptionPane.showMessageDialog(null, "game over" + "\n Score: " + contador);
                    }
                }
                if (serpiente.get(0).getX() > 600) {//logro que al llegar a un muro aparezca por el opuesto
                    for (int i = serpiente.size() - 1; i > 0; i--) {
                        serpiente.get(i).setLocation(serpiente.get(i - 1).getLocation());
                        serpiente.get(i).repaint();
                    }
                    serpiente.get(0).setLocation(0, serpiente.get(0).getY() + y);
                }
                if (serpiente.get(0).getX() < 0) {
                    for (int i = serpiente.size() - 1; i > 0; i--) {
                        serpiente.get(i).setLocation(serpiente.get(i - 1).getLocation());
                        serpiente.get(i).repaint();
                    }
                    serpiente.get(0).setLocation(590, serpiente.get(0).getY() + y);
                }
                if (serpiente.get(0).getY() > 510) {
                    // perdio=1;
                }
                if (serpiente.get(0).getY() < 30) {
                    //perdio=1;
                }
                if (perdio == 1) {

                    tiempo.stop();
                }
                if (comi.intersects(serp)) {
                    cx = aleatorio.nextInt(580);
                    cy = aleatorio.nextInt(580);
                    comida.setLocation(cx, cy);
                    comida.repaint();
                    JLabel aux = new JLabel();
                    aux.setLocation(200, 200);
                    aux.setSize(20, 20);
                    aux.setIcon(new ImageIcon("sprite/cuerpo.png"));
                    aux.setVisible(true);

                    serpiente.add(aux);
                    panelJuego.add(serpiente.get(serpiente.size() - 1), 0);

                }

                for (int i = serpiente.size() - 1; i > 0; i--) {
                    serpiente.get(i).setLocation(serpiente.get(i - 1).getLocation());
                    serpiente.get(i).repaint();
                }
                serpiente.get(0).setLocation(serpiente.get(0).getX() + x, serpiente.get(0).getY() + y);

            }
        });

        ventana.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

            }

            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    System.out.println("arriba");
                    if (serpiente.get(0).getY() > 0) {
                        y = -desplazamiento;
                        x = 0;
                        serpiente.get(0).setIcon(new ImageIcon("sprite/2.png"));
                    }
                    if (bandera == 0) {
                        tiempo.start();
                        bandera = 1;
                    }
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    System.out.println("abajo");
                    if (serpiente.get(0).getY() < 600) {
                        y = desplazamiento;
                        x = 0;
                        serpiente.get(0).setIcon(new ImageIcon("sprite/4.png"));

                    }
                    if (bandera == 0) {
                        tiempo.start();
                        bandera = 1;
                    }
                }
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    System.out.println("izquierda");
                    if (serpiente.get(0).getX() > 0) {
                        y = 0;
                        x = -desplazamiento;
                        serpiente.get(0).setIcon(new ImageIcon("sprite/3.png"));

                    }
                    if (bandera == 0) {
                        tiempo.start();
                        bandera = 1;
                    }

                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    System.out.println("derecha");
                    if (serpiente.get(0).getX() < 600) {
                        y = 0;
                        x = desplazamiento;
                        serpiente.get(0).setIcon(new ImageIcon("sprite/1.png"));

                    }
                    if (bandera == 0) {
                        tiempo.start();
                        bandera = 1;
                    }
                }
                if (e.getKeyCode() == KeyEvent.VK_P) {
                    tiempo.stop();

                    JOptionPane.showMessageDialog(null, "PAUSA");

                    if (bandera == 1) {
                        tiempo.start();

                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent ke) {
                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
}
