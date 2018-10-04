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
        int contRelogio=0;
        int contUltimoAtaque=0;
    
        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
            //System.out.println("keyPressed="+KeyEvent.getKeyText(e.getKeyCode()));

            if (e.getKeyCode() == KeyEvent.VK_LEFT)
               pp.setX(pp.getX()-10);
               
            if (e.getKeyCode() == KeyEvent.VK_RIGHT)
               pp.setX(pp.getX()+10);
               
            if (e.getKeyCode() == KeyEvent.VK_UP)
            pp.setY(pp.getY()-10);
            
            if (e.getKeyCode() == KeyEvent.VK_DOWN)
               pp.setY(pp.getY()+10);    
               
            if (e.getKeyCode() == KeyEvent.VK_SPACE)  
            {
                if(contRelogio-contUltimoAtaque > 250)
                {
                    this.contUltimoAtaque=this.contRelogio;
                    pp.notifyObservers("ataque");
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