package br.eng.corsini.onepiece_ptbr;

import java.util.ArrayList;
import java.util.List;

public class TripulacaoPirata {
    private String nome;
    private boolean destruida;
    private List<Pirata> tripulantes = new ArrayList<>();

    // Construtor

    public TripulacaoPirata(String nome, boolean destruida) {
        this.nome = nome;
        this.destruida = destruida;
    }
    
    public double recompensaTotal(double soma){
        soma = 0;
        for(Pirata t : tripulantes){
            soma+=t.getRecompensa();
        }
        return soma;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public boolean isDestruida() {
        return destruida;
    }
    public void setDestruida(boolean destruida) {
        this.destruida = destruida;
    }
    public List<Pirata> getTripulantes() {
        return tripulantes;
    }
    public void setTripulantes(List<Pirata> tripulantes) {
        this.tripulantes = tripulantes;
    }
    
}
