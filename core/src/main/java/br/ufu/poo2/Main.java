/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufu.poo2;

import br.ufu.poo2.view.BemVindo;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author vinic
 */
public class  Main {
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
