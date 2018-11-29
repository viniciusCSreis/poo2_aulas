package br.ufu.poo2.state;

import br.ufu.poo2.Personagens;

public class Forte extends PersonagemState {
    public Forte(Personagens personagens) {
        super(personagens);
    }

    @Override
    public void setLimite() {
        setLimiteInferior(70);
        setLimiteSuperior(70);
    }

    @Override
    public void verificarAlteracaoEstado() {

        if(this.getPersonagens().getLife() <= this.getLimiteInferior()){
            this.getPersonagens().setPersonagemState(new Normal(this.getPersonagens()));
            this.getPersonagens().getPersonagemState().verificarAlteracaoEstado();
        }


    }
}
