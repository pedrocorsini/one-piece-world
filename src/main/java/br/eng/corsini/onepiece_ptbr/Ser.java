package br.eng.corsini.onepiece_ptbr;

import java.util.ArrayList;
import java.util.List;

public abstract class Ser {
    private String nome;
    private int idade;
    private boolean vivo;
    private float tamanho;
    public float getTamanho() {
        return tamanho;
    }
    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }
    private List<Ser> filhos = new ArrayList<>();
    private Ilha nasceu;
    private FrutaDoDiabo fruta;
    private HakiEnum haki;
    private List<TesouroSecreto> tesouros = new ArrayList<>();
    public List<TesouroSecreto> getTesouros() {
        return tesouros;
    }
    public void setTesouros(List<TesouroSecreto> tesouros) {
        this.tesouros = tesouros;
    }
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
