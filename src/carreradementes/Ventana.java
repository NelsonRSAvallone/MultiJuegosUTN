/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreradementes;

import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Luciano Beemeequis
 */
public class Ventana extends JFrame{
    
    Panel p;
    
    public Ventana(){
        this.setBounds(0,0,562,700);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        Container contentpane = getContentPane();
        p = new Panel();
        contentpane.add(p);
        
        JLabel cerebro = new JLabel();
        cerebro.setIcon(new ImageIcon("images/cerebro.png"));
        cerebro.setVisible(true);
        contentpane.add(cerebro);
    }
}
