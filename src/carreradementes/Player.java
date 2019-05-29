/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreradementes;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Luciano Beemeequis
 */
public class Player extends JFrame{
    Image player1;
    public Player(){       
                
    }
    
    public void paint(Graphics g){
        g.drawImage(player1,0,0,getWidth(),getHeight(),this);
        player1 = new ImageIcon(getClass().getResource("images/player.png")).getImage();
    }
    
}
