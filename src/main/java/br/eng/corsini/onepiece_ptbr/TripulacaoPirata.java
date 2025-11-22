package br.eng.corsini.onepiece_ptbr;

import java.util.ArrayList;
import java.util.List;

public class TripulacaoPirata {
    private String nome;
    private boolean destruida;
    private Pirata capitao;
    private List<Pirata> tripulantes = new ArrayList<>();

    // Construtor

    public TripulacaoPirata(String nome, boolean destruida) {
        this.nome = nome;
        this.destruida = destruida;
    }
    
    public void printTripulacao(){
        System.out.println("======TRIPULACAO======");
        System.out.println("Nome da Tripulacao: " + nome);
        System.out.println("Capitao: " + (capitao != null ? capitao.getNome() : "Nenhum"));
        System.out.println("Destruida: " + (destruida ? "Sim" : "Nao"));
        System.out.println("Tripulantes: ");
        for(Pirata p: tripulantes){
            System.out.println(" - " + p.getNome());
        }
        double total = recompensaTotal();
        System.out.println("Recompensa Total: $" + String.format("%.2f", total));
        System.out.println("======================\n");
    }
    public double recompensaTotal(){
        double soma = 0;
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

    public Pirata getCapitao() {
        return capitao;
    }

    public void setCapitao(Pirata capitao) {
        this.capitao = capitao;
    }
}
