package POO2.factory;

import POO2.decorator.concreteComponent.Espada;
import POO2.observer.observers.Inimigo1;
import POO2.observer.observers.Inimigo2;
import POO2.observer.observers.Inimigo3;
import POO2.observer.observers.Inimigos;

public class InimigosAdvancedFactory extends InimigoFactory{

    private static InimigosAdvancedFactory instace = new InimigosAdvancedFactory();
    private static int inimigosCriados = 0;

    private InimigosAdvancedFactory(){}

    public static InimigosAdvancedFactory getInstace(){
        return  instace;
    }

    public Inimigos getInimigo(){

        int i = inimigosCriados++;
        int[] p = posicoes.get( i % posicoes.size() );
        int x = p[0];
        int y = p[1];

        Inimigos inimigo=null;
        if((i%3)+1==1)inimigo=new Inimigo1(x,y, new Espada());
        if((i%3)+1==2)inimigo=new Inimigo2(x,y, new Espada());
        if((i%3)+1==3)inimigo=new Inimigo3(x,y, new Espada());

        return inimigo;

    }

}
