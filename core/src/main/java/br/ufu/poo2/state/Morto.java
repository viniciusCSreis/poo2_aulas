package br.ufu.poo2.state;

import br.ufu.poo2.Personagens;

public class Morto extends PersonagemState {
    public Morto(Personagens personagens) {
        super(personagens);
    }

    @Override
    public void setLimite() {
        setLimiteInferior(0);
        setLimiteSuperior(0);
    }

    @Override
    public void verificarAlteracaoEstado() {

    }
}
