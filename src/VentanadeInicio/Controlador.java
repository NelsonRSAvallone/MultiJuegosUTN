
package VentanadeInicio;

import Pong.VentanaPong;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import snake.Juego;
import java.awt.event.ActionEvent;
/**
 *
 * @author Nelson
 */
public class Controlador implements ActionListener {
    public VentanaPrincipal view;
    public Modelo model;
    public  VentanaPong pong;//AGREGANDO el Objeto del Pong
    public Juego snake;
    public Controlador(){}
    //Constructor, necesito los objetos ventna principal y model para darle funcionalidad
    public Controlador (VentanaPrincipal view, Modelo model){
    this.view=view;
    this.model=model;
    
    this.view.pongButton.addActionListener(this);//Agregando key listener
    this.view.MemoryButton.addActionListener(this);//Agregando key listener
    this.view.MentesButton.addActionListener(this);//Agregando key listener
    this.view.SnakeButton.addActionListener(this);//Agregando key listener
    
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==view.pongButton){
        pong= new VentanaPong();
       }
        if(e.getSource()==view.SnakeButton){
          snake= new Juego(); 
        
        }
        
    }
    
    //Titulo y ubicacion de la ventana
    public void iniciar(){
    view.setTitle("MultiJuegos");
    view.setLocationRelativeTo(null);
    view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Para que se cierre la aplicacion cuando cierro la ventana
    }

    
}
