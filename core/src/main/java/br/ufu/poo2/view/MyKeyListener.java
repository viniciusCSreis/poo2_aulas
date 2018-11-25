/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufu.poo2.view;

import br.ufu.poo2.command.*;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author vinicius
 */
public class MyKeyListener implements KeyListener {

    Controle controle;

    public void setControle(Controle controle) {
        this.controle = controle;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_A || e.getKeyCode() == KeyEvent.VK_NUMPAD4)
        {
            controle.pressionar(0);
        }

        if (e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyCode() == KeyEvent.VK_D || e.getKeyCode() == KeyEvent.VK_NUMPAD6)
        {
            controle.pressionar(1);
        }

        if (e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_W || e.getKeyCode() == KeyEvent.VK_NUMPAD8)
        {
            controle.pressionar(2);
        }

        if (e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() == KeyEvent.VK_S || e.getKeyCode() == KeyEvent.VK_NUMPAD2)
        {
            controle.pressionar(3);
        }

        if (e.getKeyCode() == KeyEvent.VK_SPACE || e.getKeyCode() == KeyEvent.VK_NUMPAD5 )
        {
            controle.pressionar(4);
        }

        if (e.getKeyCode() == KeyEvent.VK_NUMPAD7)
        {
            controle.pressionar(5);
        }
        if (e.getKeyCode() == KeyEvent.VK_NUMPAD9)
        {
            controle.pressionar(6);
        }
        if (e.getKeyCode() == KeyEvent.VK_NUMPAD1)
        {
            controle.pressionar(7);
        }
        if (e.getKeyCode() == KeyEvent.VK_NUMPAD3)
        {
            controle.pressionar(8);
        }

    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }


}