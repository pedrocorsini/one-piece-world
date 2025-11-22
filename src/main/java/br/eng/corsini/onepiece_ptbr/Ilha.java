package br.eng.corsini.onepiece_ptbr;

import java.util.ArrayList;
import java.util.List;

public class Ilha {
    private String nome;
    private MarEnum localizacao;
    private boolean submersa;
    private List<String> vilas = new ArrayList<>();
    private Ser governante;

    // Construtor
    
    public Ilha(String nome, MarEnum localizacao, boolean submersa){
        this.nome = nome;
        this.localizacao = localizacao;
        this.submersa = submersa;
    }

    public void printInfo(){
        System.out.println("=========ILHA=========");
        System.out.println("Nome da Ilha: " + nome);
        System.out.println("Localizacao: " + localizacao.getNome());
        System.out.println("Governante: " + (governante!=null ? governante.getNome() : "Nenhum"));
        System.out.println("Submersa: " + (submersa ? "Sim" : "Nao")); 
        if(getVilas() == null || getVilas().isEmpty()){
            System.out.println("Vilas/Cidades/Reinos: Nenhum");
        }else{
            System.out.println("Vilas/Cidades/Reinos:");
            for(String vilas : getVilas()){
                System.out.println(" - " + vilas);
            }
        }
        System.out.println("======================\n");
    }

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

    public Ser getGovernante() {
        return governante;
    }

    public void setGovernante(Ser governante) {
        this.governante = governante;
    }
    
}
