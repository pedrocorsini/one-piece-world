package br.eng.corsini.onepiece_ptbr;

public class Imperador implements Estado {
    @Override
    public void transicao(Pirata p) {
        if(p.getRecompensa() <= 2999999999d){
            p.setEstado(new Comum());
        }   
    }
}
