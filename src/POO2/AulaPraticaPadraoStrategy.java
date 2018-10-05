/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author vinic
 */
public class AulaPraticaPadraoStrategy {
    public static void main(String[] args) throws InterruptedException {
        JFrame frame=new JFrame("Game POO2");
        BemVindo b = new BemVindo();            
        frame.add(b);
        frame.setSize(700, 700);      
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        b.loop();
        frame.dispose();
        while(true)
        {
            init();
        }
    }  
    public static JPanel init()
    {
        JFrame frame=new JFrame("Game POO2");
        InitGame initgame = new InitGame();
        initgame.init(frame);
        JPanel game= null;
        try {
            game =  initgame.start();
        } catch (InterruptedException ex) {
            Logger.getLogger(BemVindo.class.getName()).log(Level.SEVERE, null, ex);
        }
        frame.dispose();
        return game;
    }

}
