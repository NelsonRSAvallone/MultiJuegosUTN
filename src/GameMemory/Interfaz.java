package GameMemory;

import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;

public class Interfaz extends JFrame {
  private JLabel label1;
  private JButton boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8;
 ImageIcon imagen;
 Icon icono;
  public Interfaz(){
    setLayout(null); 
    
  label1 = new JLabel("GAME MEMORY");
  label1.setBounds(150,20,300,30);
  add(label1);
  
  
JButton boton1 = new JButton();
boton1.setBounds(10,100,80,100);
imagen = new ImageIcon("pinguino.png");
icono = new ImageIcon (imagen.getImage().getScaledInstance(boton1.getWidth(),boton1.getHeight(),Image.SCALE_DEFAULT));
boton1.setIcon(icono);
add (boton1);
        
boton2 = new JButton();
boton2.setBounds(110,100,80,100);
imagen = new ImageIcon("windows.png");
icono = new ImageIcon (imagen.getImage().getScaledInstance(boton2.getWidth(),boton2.getHeight(),Image.SCALE_DEFAULT));
boton2.setIcon(icono);
add (boton2);

boton3 = new JButton();
boton3.setBounds(210,100,80,100);
imagen = new ImageIcon("notebook.png");
icono = new ImageIcon (imagen.getImage().getScaledInstance(boton3.getWidth(),boton3.getHeight(),Image.SCALE_DEFAULT));
boton3.setIcon(icono);
add (boton3);

boton4 = new JButton();
boton4.setBounds(310,100,80,100);
imagen = new ImageIcon("apple.png");
icono = new ImageIcon (imagen.getImage().getScaledInstance(boton4.getWidth(),boton4.getHeight(),Image.SCALE_DEFAULT));
boton4.setIcon(icono);
add (boton4);

boton5 = new JButton();
boton5.setBounds(10,300,80,100);
imagen = new ImageIcon("pinguino.png");
icono = new ImageIcon (imagen.getImage().getScaledInstance(boton5.getWidth(),boton5.getHeight(),Image.SCALE_DEFAULT));
boton5.setIcon(icono);
add (boton5);

boton6 = new JButton();
boton6.setBounds(110,300,80,100);
imagen = new ImageIcon("pinguino.png");
icono = new ImageIcon (imagen.getImage().getScaledInstance(boton6.getWidth(),boton6.getHeight(),Image.SCALE_DEFAULT));
boton6.setIcon(icono);
add (boton6);

boton7 = new JButton();
boton7.setBounds(210,300,80,100);
imagen = new ImageIcon("pinguino.png");
icono = new ImageIcon (imagen.getImage().getScaledInstance(boton7.getWidth(),boton7.getHeight(),Image.SCALE_DEFAULT));
boton7.setIcon(icono);
add (boton7);

boton8 = new JButton();
boton8.setBounds(310,300,80,100);
imagen = new ImageIcon("pinguino.png");
icono = new ImageIcon (imagen.getImage().getScaledInstance(boton8.getWidth(),boton8.getHeight(),Image.SCALE_DEFAULT));
boton8.setIcon(icono);
add (boton8);
  } 

  
  public static void main (String [] args){
   Interfaz formulario1 = new Interfaz();
   formulario1.setBounds(300,300,420,600);
   formulario1.setVisible(true);
   formulario1.setLocationRelativeTo(null);
   formulario1.setResizable(false);  
  }

    
    }


