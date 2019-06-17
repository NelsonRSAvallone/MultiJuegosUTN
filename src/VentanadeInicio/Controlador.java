
package VentanadeInicio;

import Pong.VentanaPong;
import java.awt.event.ActionListener;
import javafx.event.ActionEvent;
import javax.swing.JFrame;

/**
 *
 * @author Nelson
 */
public class Controlador implements ActionListener {
    public VentanaPrincipal view;
    public Modelo model;
    public  VentanaPong pong;//AGREGANDO el Objeto del Pong
    
    public Controlador(){}
    //Constructor, necesito los objetos ventna principal y model para darle funcionalidad
    public Controlador (VentanaPrincipal view, Modelo model){
    this.view=view;
    this.model=model;
    
    this.view.pongButton.addActionListener(this);//Agregando 
  //  this.view.MemoryButton.addActionListener(this);//Agregando 
   // this.view.MentesButton.addActionListener(this);//Agregando 
    //this.view.SnakeButton.addActionListener(this);//Agregando 
    
    }
    
    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
       pong= new VentanaPong();
        
        
    }
    
    //Titulo y ubicacion de la ventana
    public void iniciar(){
    view.setTitle("MultiJuegos");
    view.setLocationRelativeTo(null);
    view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Para que se cierre la aplicacion cuando cierro la ventana
    }

    
}
