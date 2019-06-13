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
 * @author leandrosorolla
 */
public class Juego {

    JFrame ventana;
    JPanel panelJuego;
    JLabel fondo;

    //serpiente
    ArrayList<JLabel> serpiente;//ArrayList para la serpiente
    int x;
    int y;
    int desplazamiento = 20;
    //timer es el hilo que controla el juego
    Timer tiempo;
    int bandera = 0;
    Rectangle serp;

    int perdio = 0;
    //comida
    JLabel comida;
    Random aleatorio = new Random();//RANDOM PARA LA APARICION DE LA COMIDA

    int cx = aleatorio.nextInt(500);//posicion de comida en x
    int cy = aleatorio.nextInt(530);//posicion de comida en y

    Rectangle comi;
    //dificultad
    int dif = 200;
    //Puntuacion
    JLabel puntuacion;
    int contador = 0;

    public Juego() {//constructor
        //ventana
        ventana = new JFrame("Snake");//le doy memoria a la ventana
        ventana.setSize(600, 600);//tamaño de la ventana
        ventana.setLocationRelativeTo(null);//se coloca la ventana en el centro
        ventana.setLayout(null);//permite colocar los botones donde queramos
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//comando para cerrar la ventana con la cruz
        ventana.setResizable(false);//no permite modificar la ventana
        //panel
        panelJuego = new JPanel();//asignamos memoria al panel
        panelJuego.setSize(ventana.getSize());//asignamos tamaño del panel
        panelJuego.setLayout(null);
        panelJuego.setVisible(true);
        //fondo
        fondo = new JLabel();//asignamos memoria
        fondo.setSize(panelJuego.getSize());//asignamos el tamaño
        fondo.setIcon(new ImageIcon("sprite/fondo.jpg"));//asignamos la imagen
        fondo.setVisible(true);
        panelJuego.add(fondo, 0);

        //serpiente
        serpiente = new ArrayList<JLabel>();//asignamos memoria al array
        JLabel aux = new JLabel();//auxiliar para agregar la cabeza de la serpiente
        aux.setLocation(290, 290);//ubicamos la cabeza en el centro
        aux.setSize(20, 20);//tamaño dellabel igual al tamaño de la imagen
        aux.setIcon(new ImageIcon("sprite/1.png"));
        aux.setVisible(true);
        serpiente.add(aux);//añadimos aux al array
        panelJuego.add(serpiente.get(0), 0);//añadimos el array en  la posicion especificada al panel

        ventana.add(panelJuego);//añadimos el panel a la ventana
        //Label comida
        comida = new JLabel();
        comida.setSize(20, 20);
        comida.setIcon(new ImageIcon("sprite/comida.png"));

        comida.setLocation(cx, cy);
        comida.setVisible(true);
        panelJuego.add(comida, 0);

        serp = new Rectangle(serpiente.get(0).getBounds());
        comi = new Rectangle(comida.getBounds());

        ventana.setVisible(true);
        //label de la puntuacion
        puntuacion = new JLabel("Score" + contador);
        puntuacion.setBounds(10, 20, 100, 20);
        puntuacion.setVisible(true);
        puntuacion.setForeground(Color.red);
        panelJuego.add(puntuacion, 0);

        tiempo = new Timer(dif, new ActionListener() {
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
                //colisones con muros y repintado en lado opuesto
                if (serpiente.get(0).getX() > 600) {
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
                if (serpiente.get(0).getY() > 560) {
                    for (int i = serpiente.size() - 1; i > 0; i--) {
                        serpiente.get(i).setLocation(serpiente.get(i - 1).getLocation());
                        serpiente.get(i).repaint();
                    }
                    serpiente.get(0).setLocation(serpiente.get(0).getX() + x, 1);
                }
                if (serpiente.get(0).getY() < 0) {
                    for (int i = serpiente.size() - 1; i > 0; i--) {
                        serpiente.get(i).setLocation(serpiente.get(i - 1).getLocation());
                        serpiente.get(i).repaint();
                    }
                    serpiente.get(0).setLocation(serpiente.get(0).getX() + x, 550);
                }
                //fin colisiones
                if (perdio == 1) {//condicional en caso de game over

                    tiempo.stop();
                }
                //interseccion fruta con serpiente
                if (comi.intersects(serp)) {
                    cx = aleatorio.nextInt(580);
                    cy = aleatorio.nextInt(580);
                    comida.setLocation(cx, cy);
                    comida.repaint();
                    //auxiliar cuerpo de la serpiente
                    JLabel aux = new JLabel();
                    aux.setLocation(200, 200);
                    aux.setSize(20, 20);
                    aux.setIcon(new ImageIcon("sprite/cuerpo.png"));
                    aux.setVisible(true);

                    serpiente.add(aux);//se añade al array el cuerpo
                    panelJuego.add(serpiente.get(serpiente.size() - 1), 0);
                    //puntaje   
                    contador += 100;
                    puntuacion.setText("Score" + contador);
                    puntuacion.repaint();
                    //dificultad
                    if (contador % 500 == 0) {
                        tiempo.setDelay(dif -= 20);
                    }
                }
                //repintado de cabeza y cuerpo
                for (int i = serpiente.size() - 1; i > 0; i--) {
                    serpiente.get(i).setLocation(serpiente.get(i - 1).getLocation());
                    serpiente.get(i).repaint();
                }
                serpiente.get(0).setLocation(serpiente.get(0).getX() + x, serpiente.get(0).getY() + y);

            }
        });

        ventana.addKeyListener(new KeyListener() {//añadimos eventos de teclado

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
