package br.ufu.poo2.state;

import br.ufu.poo2.Personagens;

public abstract class PersonagemState {

    private Personagens personagens;
    private int limiteInferior;
    private int limiteSuperior;


    public PersonagemState(Personagens personagens){
        this.personagens = personagens;
        setLimite();
    }

    public abstract void setLimite();

    public abstract void verificarAlteracaoEstado();


    public Personagens getPersonagens() {
        return personagens;
    }

    public void setPersonagens(Personagens personagens) {
        this.personagens = personagens;
    }

    public int getLimiteInferior() {
        return limiteInferior;
    }

    public void setLimiteInferior(int limiteInferior) {
        this.limiteInferior = limiteInferior;
    }

    public int getLimiteSuperior() {
        return limiteSuperior;
    }

    public void setLimiteSuperior(int limiteSuperior) {
        this.limiteSuperior = limiteSuperior;
    }
}
