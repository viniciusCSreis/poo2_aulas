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
    public int estamina = 200;
    public int cont;
      
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
                int escudos=0;
                int escudoSize=4;
                if(i==0)
                {
                    g2d.setColor(new Color(255, 0, 0, 50));
                     g2d.fillOval(centerX-40, centerY-40,80,80);
                        
                }
                if(i==0 && j.getEscudo() != null)
                {
                    if(j.getEscudo().defende("Fogo"))
                        {

                           g2d.setColor(Color.RED);
                           g2d.fillOval(centerX-(ovalWidth-escudoSize*escudos)/2, centerY-(ovalHeight-escudoSize*escudos)/2,ovalWidth-escudoSize*escudos,ovalHeight-escudoSize*escudos);
                           escudos++; 
                        }
                        if(j.getEscudo().defende("Ar"))
                        {

                           g2d.setColor(Color.GRAY);
                           g2d.fillOval(centerX-(ovalWidth-escudoSize*escudos)/2, centerY-(ovalHeight-escudoSize*escudos)/2,ovalWidth-escudoSize*escudos,ovalHeight-escudoSize*escudos);
                           escudos++; 
                        }
                        if(j.getEscudo().defende("Agua"))
                        {

                           g2d.setColor(Color.BLUE);
                           g2d.fillOval(centerX-(ovalWidth-escudoSize*escudos)/2, centerY-(ovalHeight-escudoSize*escudos)/2,ovalWidth-escudoSize*escudos,ovalHeight-escudoSize*escudos);
                           escudos++; 
                        }
                        if(j.getEscudo().defende("Terra"))
                        {

                           g2d.setColor(Color.ORANGE);
                           g2d.fillOval(centerX-(ovalWidth-escudoSize*escudos)/2, centerY-(ovalHeight-escudoSize*escudos)/2,ovalWidth-escudoSize*escudos,ovalHeight-escudoSize*escudos);
                           escudos++; 
                        }
                }
                // Draw oval
                if(i == 0)g2d.setColor(Color.BLACK);
                else if(j.getAtacarType()=="Agua")g2d.setColor(Color.BLUE);
                else if(j.getAtacarType()=="Fogo")g2d.setColor(Color.RED);
                else if(j.getAtacarType()=="Terra")g2d.setColor(Color.ORANGE);
                else if(j.getAtacarType()=="Ar")g2d.setColor(Color.GRAY);
                if(!j.isAlife())
                    g2d.setColor(Color.WHITE);
                
                g2d.fillOval(
                        centerX - ( ovalWidth - escudoSize * escudos ) / 2,
                        centerY - ( ovalHeight - escudoSize * escudos ) / 2,
                        ovalWidth - escudoSize * escudos,
                        ovalHeight - escudoSize * escudos
                );
                         
                // Vida dos personagem
                FontMetrics fm = g.getFontMetrics();
                double textWidth = fm.getStringBounds(text, g).getWidth();
                g.setColor(Color.WHITE);
                g.drawString(text, (int) (centerX - textWidth/2),
                                   (int) (centerY + fm.getMaxAscent() / 2));

                
                
                
              
                
                
        }
        String text="Estâmina:";
        
        FontMetrics fm = g.getFontMetrics();
        Double textWidth = fm.getStringBounds(text, g).getWidth();
                
        int xEstamina=0+textWidth.intValue()+1,yEstamina=0,wEstamina=estamina,hEstamina=40;
        g2d.setColor(Color.yellow);
        g2d.fillRect(xEstamina,yEstamina,wEstamina,hEstamina);
        g.setColor(Color.BLACK);
                g.drawString(text, (int) (xEstamina - textWidth),
                                   (int) (yEstamina + fm.getMaxAscent()/2 + hEstamina/2 ));
        if(estamina<200)
            estamina+=40;
        if(estamina>200)
            estamina=200;
        
         // Mortes
        text="Inimigos Mortos:"+String.valueOf(((PersonagemPrincipal)observers.get(0)).getMortes());
        fm = g.getFontMetrics();
        textWidth = fm.getStringBounds(text, g).getWidth();
        Double textHeightMortes = fm.getStringBounds(text, g).getHeight();
        g.setColor(Color.BLACK);
        g.drawString(text, (int) (700 - textWidth),
                           (int) (0 + fm.getMaxAscent()));
        
        // Troca de escudo dos personagem
        text="Troca de Escudo:"+(15-this.cont%15000/1000);
        fm = g.getFontMetrics();
        textWidth = fm.getStringBounds(text, g).getWidth();
        Double textHeightEscudo=fm.getStringBounds(text, g).getHeight();
        g.setColor(Color.BLACK);
        g.drawString(text, (int) (700 - textWidth),
                           (int) (0 + fm.getMaxAscent() + textHeightMortes + 2));
        
        
        // Vida dos personagem
        text="Tempo:"+(this.cont/1000);
        fm = g.getFontMetrics();
        textWidth = fm.getStringBounds(text, g).getWidth();
        g.setColor(Color.BLACK);
        g.drawString(text, (int) (700 - textWidth),
                           (int) (0 + fm.getMaxAscent() + textHeightEscudo + textHeightMortes + 2));
    
        
        
    }
    

    

}

