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

/**
 *
 * @author vinicius
 */
public class MyKeyListener implements KeyListener, IObserver{
    
        public PersonagemPrincipal pp;
        public Game game;
        int contRelogio=0;
        int contUltimoAtaque=0;
    
        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
            
            if (e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_A)  
            {
                pp.setX(pp.getX()-10);
                if(pp.getX()>700)
                    pp.setX(700);
                if(pp.getX()<0)
                    pp.setX(0);
            }
               
            if (e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyCode() == KeyEvent.VK_D)
            {
                pp.setX(pp.getX()+10);
                if(pp.getX()>700)
                    pp.setX(700);
                if(pp.getX()<0)
                    pp.setX(0);
            }
               
            if (e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_W)
            {
                pp.setY(pp.getY()-10);
                if(pp.getY()>700)
                    pp.setY(700);
                if(pp.getY()<0)
                    pp.setY(0);
            }
            
            if (e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() == KeyEvent.VK_S)
            {
                pp.setY(pp.getY()+10);
                if(pp.getY()>700)
                    pp.setY(700);
                if(pp.getY()<0)
                    pp.setY(0);
            }
               
            if (e.getKeyCode() == KeyEvent.VK_SPACE)  
            {
                if(contRelogio-contUltimoAtaque > 250)
                {
                    this.contUltimoAtaque=this.contRelogio;
                    pp.notifyObservers("ataque");
                    game.estamina=0;
                }
            }          
               
        }

        @Override
        public void keyReleased(KeyEvent e) {
            //System.out.println("keyReleased="+KeyEvent.getKeyText(e.getKeyCode()));
        }
        public void setPP(PersonagemPrincipal pp)
        {
            this.pp=pp;
        }

    @Override
    public void update(ISubject p, String Tipo) {
        this.contRelogio= Integer.valueOf(Tipo);    
    }
}