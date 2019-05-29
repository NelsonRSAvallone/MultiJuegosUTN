/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreradementes;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Luciano Beemeequis
 */
public class Panel extends JPanel{
    
    private Image fondo;
    
    public Panel(){
        preInit();
        initComponents();
    }

    private void preInit() {
    }

    private void initComponents() {
    }
    
    public void paint(Graphics g){
        g.drawImage(fondo,0,0,getWidth(),getHeight(),this);
        fondo = new ImageIcon(getClass().getResource("images/fondo.png")).getImage();
    }
    
}
