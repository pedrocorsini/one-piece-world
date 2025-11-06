package br.eng.corsini.onepiece_ptbr;

public class Imperador implements Estado {
    @Override
    public void transicao(Pirata p) {
        if(p.getRecompensa() <= 1000000000){
            p.setEstado(new Comum());
        }   
    }
}
