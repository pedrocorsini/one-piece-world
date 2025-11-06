package br.eng.corsini.onepiece_ptbr;

import java.util.ArrayList;
import java.util.List;

public class Embarcacao {
    private String nome;
    private String tipo;
    private String madeira;
    private String bandeira;
    private List<Pirata> piratas = new ArrayList<Pirata>();
    private List<Marinheiro> marinheiros = new ArrayList<Marinheiro>();
    private boolean destruida;
    public boolean isDestruida() {
        return destruida;
    }
    public void setDestruida(boolean destruida) {
        this.destruida = destruida;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getMadeira() {
        return madeira;
    }
    public void setMadeira(String madeira) {
        this.madeira = madeira;
    }
    public String getBandeira() {
        return bandeira;
    }
    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }
    public List<Pirata> getPiratas() {
        return piratas;
    }
    public void setPiratas(List<Pirata> piratas) {
        this.piratas = piratas;
    }
    public List<Marinheiro> getMarinheiros() {
        return marinheiros;
    }
    public void setMarinheiros(List<Marinheiro> marinheiros) {
        this.marinheiros = marinheiros;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
