/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufu.poo2;

import br.ufu.poo2.ChainOfResponsibility.Escudos;
import br.ufu.poo2.ChainOfResponsibility.concreteEscudos.Escudo_de_Agua;
import br.ufu.poo2.ChainOfResponsibility.concreteEscudos.Escudo_de_Ar;
import br.ufu.poo2.ChainOfResponsibility.concreteEscudos.Escudo_de_Fogo;
import br.ufu.poo2.ChainOfResponsibility.concreteEscudos.Escudo_de_Terra;
import br.ufu.poo2.decorator.Armas;
import br.ufu.poo2.decorator.concreteComponent.Arco;
import br.ufu.poo2.decorator.concreteComponent.Espada;
import br.ufu.poo2.decorator.decorator.concreteDecorator.bonusDeAtaque.BonusDeAtaque2x;
import br.ufu.poo2.decorator.decorator.concreteDecorator.bonusDeAtaque.BonusDeAtaque3x;
import br.ufu.poo2.decorator.decorator.concreteDecorator.gemas.GemaDoDano;
import br.ufu.poo2.decorator.decorator.concreteDecorator.gemas.GemaDoPoder;
import br.ufu.poo2.decorator.decorator.concreteDecorator.gemas.GemaRara;
import br.ufu.poo2.factory.InimigosAdvancedFactory;
import br.ufu.poo2.observer.IObserver;
import br.ufu.poo2.observer.ISubject;
import br.ufu.poo2.observer.observers.Inimigos;
import br.ufu.poo2.observer.subjects.ContadorDoRelogio;
import br.ufu.poo2.observer.subjects.PersonagemPrincipal;
import br.ufu.poo2.strategies.Atacar;
import br.ufu.poo2.strategies.concreteStrategies.atacar.AtaqueDeAgua;
import br.ufu.poo2.strategies.concreteStrategies.atacar.AtaqueDeAr;
import br.ufu.poo2.strategies.concreteStrategies.atacar.AtaqueDeFogo;
import br.ufu.poo2.strategies.concreteStrategies.atacar.AtaqueDeTerra;
import br.ufu.poo2.view.Game;
import br.ufu.poo2.view.MyKeyListener;

import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author vinicius
 */
public class InitGame implements IObserver {
    
    private ArrayList<Armas> armas = new ArrayList<>();
    private ArrayList<Atacar> ataques = new ArrayList<>();
    private ArrayList<Escudos> escudos = new ArrayList<>();
    private PersonagemPrincipal pp;
    private Game game;
    private MyKeyListener myListener=null;
    private int inimigosCriados=0;
    public void update(ISubject p, String Tipo)
    {
       int cont = Integer.valueOf(Tipo);
       if(pp.isAlife())
        {
            if(cont%1000==0)
                create_inimigos(pp,1);
            if(cont%15000==0)
            {
                Escudos escudoPP = null;
                boolean adicionarEscudo=false;
                for(Escudos e : this.escudos)
                {
                    if(Math.random()>=0.5)
                    {
                        if(!adicionarEscudo)
                            escudoPP=e;
                        else
                            escudoPP.setSucessor(e);
                        adicionarEscudo=true;
                        
                    }
                    
                }                 
                if(adicionarEscudo)pp.setEscudo(escudoPP);
            }
            game.observers=pp.getObservers();
            game.cont=cont;
            game.repaint();
            
        }
       else
       {
           ContadorDoRelogio relogio = (ContadorDoRelogio)p;
           relogio.setAtivo(false);
           
       }
    }

    
    
   
    public Armas init_armas()
    {
         Armas espadaLv1 = new Espada();
        System.out.println("espadaLv1 Dano:"+espadaLv1.getDano());
        System.out.println("espadaLv1 Poder:"+espadaLv1.getPoder());
        
        Armas espadaLv2 = new GemaDoDano(espadaLv1);
        System.out.println("espadaLv2 Dano:"+espadaLv2.getDano());
        System.out.println("espadaLv2 Poder:"+espadaLv2.getPoder());
        
        Armas espadaLv3 = new GemaDoPoder(espadaLv2);
        System.out.println("espadaLv3 Dano:"+espadaLv3.getDano());
        System.out.println("espadaLv3 Poder:"+espadaLv3.getPoder());
        
        Armas espadaLv4 = new GemaRara(espadaLv3);
        System.out.println("espadaLv4 Dano:"+espadaLv4.getDano());
        System.out.println("espadaLv4 Poder:"+espadaLv4.getPoder());
                
        Armas arcoLv1 = new Arco();
        System.out.println("arcoLv1 Dano:"+arcoLv1.getDano());
        System.out.println("arcoLv1 Poder:"+arcoLv1.getPoder());
        
        Armas arcoLv2 = new GemaDoDano(arcoLv1);
        System.out.println("arcoLv2 Dano:"+arcoLv2.getDano());
        System.out.println("arcoLv2 Poder:"+arcoLv2.getPoder());
        
        Armas arcoLv3 = new GemaDoPoder(arcoLv2);
        System.out.println("arcoLv3 Dano:"+arcoLv3.getDano());
        System.out.println("arcoLv3 Poder:"+arcoLv3.getPoder());
        
        Armas arcoLv4 = new GemaRara(arcoLv3);
        System.out.println("arcoLv4 Dano:"+arcoLv3.getDano());
        System.out.println("arcoLv4 Poder:"+arcoLv3.getPoder());       
        
        armas.add(espadaLv1);
        armas.add(espadaLv2);
        armas.add(espadaLv3);
        armas.add(espadaLv4);
        armas.add(arcoLv1);
        armas.add(arcoLv2);
        armas.add(arcoLv3);
        armas.add(arcoLv4);
        
        return espadaLv2;
    }
    public Atacar init_ataques()
    {
        Atacar ataqueFogo = new AtaqueDeFogo();
        Atacar ataqueAr = new AtaqueDeAr();
        Atacar ataqueAgua = new AtaqueDeAgua();
        Atacar ataqueTerra= new AtaqueDeTerra();
        ataques.add(ataqueFogo);
        ataques.add(ataqueAr);
        ataques.add(ataqueAgua);
        ataques.add(ataqueTerra);
        
        Atacar ataqueEspecialDeFogo = new AtaqueDeFogo();
        ataqueEspecialDeFogo = new BonusDeAtaque2x(ataqueEspecialDeFogo);
        
        Atacar ataqueEspecialDeAr = new AtaqueDeAr();
        ataqueEspecialDeAr = new BonusDeAtaque3x(ataqueEspecialDeAr);
        ataques.add(ataqueEspecialDeAr);
        ataques.add(ataqueEspecialDeFogo);
        
        return ataqueFogo;
    }
    public void init_personagemPrincipal(Armas armaPersonagemPrincipal,Atacar ataquePersonagemPrincipal)
    {
        PersonagemPrincipal pp = new PersonagemPrincipal(250,250,armaPersonagemPrincipal);
        pp.setAtacar(ataquePersonagemPrincipal);
        this.pp = pp;
    }
    public void init_escudos()
    {
        Escudos escudoFogo = new Escudo_de_Fogo();
        Escudos escudoAgua = new Escudo_de_Agua();
        Escudos escudoTerra = new Escudo_de_Terra();
        Escudos escudoAr = new Escudo_de_Ar();

        this.escudos.add(escudoFogo);
        this.escudos.add(escudoAgua);
        this.escudos.add(escudoTerra);
        this.escudos.add(escudoAr);

    }
    public void create_inimigos(PersonagemPrincipal pp, int n)
    {
               
        for(int j=0;j<n;j++)
        {
            int i = inimigosCriados++;

            Inimigos inimigo = InimigosAdvancedFactory.getInstace().getInimigo();

            inimigo.setAtacar(ataques.get(i % ataques.size() ));
            
            pp.registerObserver(inimigo);
             
        }
        
        
    }
    public void init( JFrame frame )
    {
        Armas armaPersonagemPrincipal=init_armas();
        Atacar ataquePersonagemPrincipal= init_ataques();
        init_escudos();
        init_personagemPrincipal(armaPersonagemPrincipal,ataquePersonagemPrincipal);
        create_inimigos(pp,8);
          
        game = new Game();
        game.observers=pp.getObservers();
        myListener = new MyKeyListener();
        myListener.pp=pp;
        myListener.game=game;
        KeyListener listener = myListener;
        game.addKeyListener(listener);
        game.setFocusable(true);
        this.game = game;
        
        frame.add(game);           
        frame.setSize(700, 700);      
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
  

        
       
        
              
        
        
    }
    public JPanel start() throws InterruptedException
    {
        ContadorDoRelogio relogio = new ContadorDoRelogio();
        relogio.registerObserver(this);
        relogio.registerObserver(myListener);
        relogio.registerObserver(pp);
        
        relogio.relogioLoop();
        
        return this.game;
        
        
        
        
    }
    
}
