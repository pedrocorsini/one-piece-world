package br.eng.corsini.onepiece_ptbr;

import java.util.ArrayList;
import java.util.List;

public class Ilha {
    private String nome;
    private MarEnum localizacao;
    private boolean afundada;
    public boolean isAfundada() {
        return afundada;
    }
    public void setAfundada(boolean afundada) {
        this.afundada = afundada;
    }
    private List<String> vilas = new ArrayList<String>();
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public MarEnum getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(MarEnum localizacao) {
        this.localizacao = localizacao;
    }
    public List<String> getVilas() {
        return vilas;
    }
    public void setVilas(List<String> vilas) {
        this.vilas = vilas;
    }
    
}
