package br.eng.corsini;

import br.eng.corsini.onepiece_ptbr.*;

public class PrintObj {
    public static void printPirata(Pirata p) {
        System.out.println("Nome: " + p.getNome());
        System.out.println("Idade: " + p.getIdade());
        System.out.println("Vivo: " + p.isVivo());
        System.out.println("Altura: " + p.getAltura());
        System.out.println("Recompensa: " + p.getRecompensa());
        System.out.println("Titulo: " + p.getTitulo());
        System.out.println("Haki: " + p.getHakis());
        System.out.println("Fruta do Diabo: " + (p.getFruta() != null ? p.getFruta().getNome() : "Nenhuma"));
        System.out.println("Embarcacao: " + (p.getEmbarcacao() != null ? p.getEmbarcacao().getNome() : "Nenhuma"));
        System.out.println("Ilha de Nascimento: " + (p.getNasceu() != null ? p.getNasceu().getNome() : "Desconhecida"));
        System.out.println("Tripulacao: " + (p.getTripulacao() != null ? p.getTripulacao().getNome() : "Nenhuma"));
        System.out.println("Tesouros: ");
        for (TesouroSecreto ts : p.getTesouros()) {
            System.out.println(" - " + ts.getNome());
        }
    }
    public static void printTesouroSecreto(TesouroSecreto ts) {
        System.out.println("Nome: " + ts.getNome());
        System.out.println("Tipo: " + ts.getTipo());
        System.out.println("Valor: " + ts.getValor());
        System.out.println("Encontrado em: " + ts.getEncontrado());
        System.out.println("Raridade: " + ts.getRaridade());
    }
    public static void printIlha(Ilha ilha) {
        System.out.println("Nome: " + ilha.getNome());
        System.out.println("Localizacao: " + ilha.getLocalizacao());
        System.out.println("Submersa: " + ilha.isSubmersa());
        System.out.println("Vilas: ");
        for (String vila : ilha.getVilas()) {
            System.out.println(" - " + vila);
        }
    }
    public static void printTripulacao(TripulacaoPirata tripulacao) {
        System.out.println("Nome: " + tripulacao.getNome());
        System.out.println("Destruida: " + tripulacao.isDestruida());
        System.out.println("Tripulantes: ");
        for (Pirata pirata : tripulacao.getTripulantes()) {
            System.out.println(" - " + pirata.getNome());
        }
    }
    public static void printFrutaDoDiabo(FrutaDoDiabo fruta) {
        System.out.println("Nome: " + fruta.getNome());
        System.out.println("Poder: " + fruta.getPoder());
        System.out.println("Tipo: " + fruta.getTipo());
    }
    public static void printEmbarcacao(Embarcacao embarcacao) {
        System.out.println("Nome: " + embarcacao.getNome());
        System.out.println("Tipo: " + embarcacao.getTipo());
        for(Pirata pirata : embarcacao.getPiratas()) {
            System.out.println(" - Pirata: " + pirata.getNome());
        }
        for(Marinheiro marinheiro : embarcacao.getMarinheiros()) {
            System.out.println(" - Marinheiro: " + marinheiro.getNome());
        }
    }
    public static void printPoneglyph(Poneglyph poneglyph) {
        System.out.println("Mensagem: " + poneglyph.getMensagem());
        System.out.println("Submerso: " + poneglyph.isSubmerso());
        System.out.println("Ilha: " + (poneglyph.getIlha() != null ? poneglyph.getIlha().getNome() : "Desconhecida"));
    }
}
