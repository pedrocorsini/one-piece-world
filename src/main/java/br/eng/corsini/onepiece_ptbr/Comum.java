package br.eng.corsini.onepiece_ptbr;

public class Comum implements Estado {
    private static int malandragem = 100;
    @Override
    public void transicao(Pirata p) {
        if(p.getRecompensa() > 2999999999d){
            p.setEstado(new Imperador());
        }        
    }
    public static int getMalandragem() {
        return malandragem;
    }
}