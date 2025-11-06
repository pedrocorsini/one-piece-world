package br.eng.corsini.onepiece_ptbr;

import java.util.ArrayList;
import java.util.List;

public abstract class Ser {
    private String nome;
    private int idade;
    private boolean vivo;
    private List<Ser> filhos = new ArrayList<Ser>();
    private Ilha nasceu;
    private FrutaDoDiabo fruta;
    private HakiEnum haki;
    public HakiEnum getHaki() {
        return haki;
    }
    public void setHaki(HakiEnum haki) {
        this.haki = haki;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public boolean isVivo() {
        return vivo;
    }
    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
    public List<Ser> getFilhos() {
        return filhos;
    }
    public void setFilhos(List<Ser> filhos) {
        this.filhos = filhos;
    }
    public Ilha getNasceu() {
        return nasceu;
    }
    public void setNasceu(Ilha nasceu) {
        this.nasceu = nasceu;
    }
    public FrutaDoDiabo getFruta() {
        return fruta;
    }
    public void setFruta(FrutaDoDiabo fruta) {
        this.fruta = fruta;
    }
}
