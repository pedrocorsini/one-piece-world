package br.eng.corsini.onepiece_ptbr;

import java.util.ArrayList;
import java.util.List;

public class BaseMarinha {
    private String nome;
    private MarEnum localizacao;
    private boolean submersa;
    private List<Marinheiro> marinheiros = new ArrayList<>();
    private Marinheiro capitao;

    // Construtor

    public BaseMarinha(String nome, MarEnum localizacao, boolean submersa, Marinheiro capitao){
        this.nome = nome;
        this.localizacao = localizacao;
        this.submersa = submersa;
        this.capitao = capitao;
    }

    public void printBase(){
        System.out.println("======================");
        System.out.println("Base: " + nome);
        System.out.println("Localizacao: " + localizacao.getNome());
        System.out.println("Capitao: " + capitao.getNome());
        System.out.println("Submersa: " + (submersa ? "Sim" : "Nao"));
        System.out.println("Marinheiros: ");
        for(Marinheiro m : marinheiros){
            System.out.println(" - " + m.getNome());
        }
        System.out.println("======================\n");
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
    public boolean isSubmersa() {
        return submersa;
    }
    public void setSubmersa(boolean submersa) {
        this.submersa = submersa;
    }
    public List<Marinheiro> getMarinheiros() {
        return marinheiros;
    }
    public void setMarinheiros(List<Marinheiro> marinheiros) {
        this.marinheiros = marinheiros;
    }
    public Marinheiro getCapitao() {
        return capitao;
    }
    public void setCapitao(Marinheiro capitao) {
        this.capitao = capitao;
    }
    
}
