/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO2;

/**
 *
 * @author vinicius
 */
import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.lang.reflect.Array;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Game extends JPanel{
    
    public ArrayList<IObserver> observers;

      
    public void paint(Graphics g) {
        super.paint(g); //The call to "super.paint(g)", cleans the screen 
        Graphics2D g2d = (Graphics2D) g;
        //The instruction; "g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON)" makes the borders of the figures smoother

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        
        for(int i=0;i<observers.size();i++)
        {
            Personagens j = (Personagens)observers.get(i);
             // Some parameters.
                String text = String.valueOf(j.getLife());
                int centerX = j.getX(), centerY = j.getY();
                int ovalWidth = 20, ovalHeight = 20;
                
                // Draw oval
                if(i == 0)g2d.setColor(Color.BLACK);
                else if(j.getAtacarType()=="Agua")g2d.setColor(Color.BLUE);
                else if(j.getAtacarType()=="Fogo")g2d.setColor(Color.RED);
                else if(j.getAtacarType()=="Terra")g2d.setColor(Color.ORANGE);
                else if(j.getAtacarType()=="Ar")g2d.setColor(Color.GRAY);
                if(!j.isAlife())
                    g2d.setColor(Color.WHITE);
                g2d.fillOval(centerX-ovalWidth/2, centerY-ovalHeight/2,
                           ovalWidth, ovalHeight);

                // Draw centered text
                FontMetrics fm = g.getFontMetrics();
                double textWidth = fm.getStringBounds(text, g).getWidth();
                g.setColor(Color.WHITE);
                g.drawString(text, (int) (centerX - textWidth/2),
                                   (int) (centerY + fm.getMaxAscent() / 2));
        } 
        
    }

    

}

