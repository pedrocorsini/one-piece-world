package br.eng.corsini.onepiece_ptbr;

import java.util.ArrayList;
import java.util.List;

public class Ilha {
    private String nome;
    private MarEnum localizacao;
    private boolean submersa;
    private List<String> vilas = new ArrayList<String>();
    public boolean isSubmersa() {
        return submersa;
    }
    public void setSubmersa(boolean submersa) {
        this.submersa = submersa;
    }
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
