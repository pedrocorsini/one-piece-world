package br.eng.corsini;

import br.eng.corsini.onepiece_ptbr.*;

public class AppBr {
    public static void main(String[] args) {

        // Instanciando objetos:
        Pirata p1 = new Pirata();
        Pirata p2 = new Pirata();
        Ilha i1 = new Ilha();
        FrutaDoDiabo f1 = new FrutaDoDiabo();
        TripulacaoPirata t1 = new TripulacaoPirata();
        TesouroSecreto ts1 = new TesouroSecreto();
        Embarcacao e1 = new Embarcacao();
        TesouroSecreto ts2 = new TesouroSecreto();

        // Atribuições dos Objetos:

        // Pirata:
        p1.setNome("Luffy");
        p1.setIdade(19);
        p1.setVivo(true);
        p1.setFruta(f1);
        p1.setEmbarcacao(e1);
        p1.setTamanho(1.74f);
        p1.setNasceu(i1);
        p1.setRecompensa(3000000000d);
        p1.getTesouros().add(ts1); 
        p1.setTripulacao(t1);
        p1.setTitulo("Chapeu de Palha");
        p1.setHaki(HakiEnum.ARMAMENTO);

        p2.setNome("Nami");
        p2.setRecompensa(1000000000d);
        p2.setIdade(20);
        p2.setEmbarcacao(e1);
        p2.setTitulo("Gata Ladra");
        p2.setTripulacao(t1);


        // Ilha:
        i1.setNome("Ilha Dawn");
        i1.getVilas().add("Vila Foosha");
        i1.getVilas().add("Reino Goa");
        i1.setLocalizacao(MarEnum.EASTBLUE);
        i1.setSubmersa(false);

        // OnePiece - Objeto Unico:
        OnePiece.getInstancia().setDescricao("Tesouro do Gold Roger");
        OnePiece.getInstancia().setLocalizacao("Laugh Tale");
        OnePiece o1 = OnePiece.getInstancia();
        OnePiece o2 = OnePiece.getInstancia();
        
        // Fruta do Diabo:
        f1.setNome("Gomu Gomu no Mi");
        f1.setPoder("Borracha");
        f1.setTipo("Paramecia");

        // Tripulacao:
        t1.setNome("Chapeus de Palha");
        t1.setDestruida(false);
        t1.getTripulantes().add(p1);
        t1.getTripulantes().add(p2);

        // Tesouro Secreto:
        ts1.setNome("Amigos que fez pelo caminho");
        ts1.setTipo("Amigos");
        ts1.setValor(1d);
        ts1.setEncontrado(MarEnum.EASTBLUE);
        ts1.setRaridade("Extremo");

        ts2.setNome("Zeus");
        ts2.setTipo("Nuvem");
        ts2.setEncontrado(MarEnum.NOVOMUNDO);

        // Embarcacao:
        e1.setNome("Thousand Sunny");
        e1.setTipo("Grande Navio");
        e1.setMadeira("Madeira Adam");
        e1.setBandeira("Caveira com Chapeu de Palha");
        e1.setDestruida(false);

        // Prints no terminal:

        // Pirata:
        System.out.println("Pirata: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());
        System.out.println("Recompensa: " + p1.getRecompensa());
        System.out.println("Tamanho: " + p1.getTamanho());
        System.out.println("Titulo: " + p1.getTitulo());
        System.out.println("Nome do navio: " + p1.getEmbarcacao().getNome());
        System.out.println("Haki: " + p1.getHaki().getNome());
        System.out.println("Nasceu na ilha: " + p1.getNasceu().getNome());
        System.out.println("Na vila: " + p1.getNasceu().getVilas().get(0));
        System.out.printf("Nome tesouro: ");
        for(TesouroSecreto t : p1.getTesouros()){
            System.out.println(t.getNome());
        }
        System.out.println("Tripulacao: " + p1.getTripulacao().getNome());
        if(p1.isVivo()){
            System.out.println("Esta vivo? Sim");
        }

        System.out.println("\n");

        // Informacoes da Ilha:
        System.out.println("Ilha: " + p1.getNasceu().getNome());
        System.out.println("Localizacao: " + p1.getNasceu().getLocalizacao());
        System.out.println("Submersa: " + p1.getNasceu().isSubmersa());
        System.out.println("Vilas: ");
        for(String vila : p1.getNasceu().getVilas()){
            System.out.println(" - " + vila);
        }

        // One Piece:

        System.out.println("O1: " + o1.getDescricao());
        System.out.println("Localizacao: " + o1.getLocalizacao());
        System.out.println("O2: " + o2.getDescricao());
        System.out.println("Localizacao: " + o2.getLocalizacao());

        System.out.println("\n");

        // Informacoes das Tripulacoes:

        System.out.println("Tripulacao: " + t1.getNome());
        System.out.println("Destruida: " + t1.isDestruida());
        System.out.println("Tripulantes: ");
        for(Pirata t : t1.getTripulantes()){
            System.out.println(" - " + t.getNome());
        }

        System.out.println("\n");

        // Informacoes da Fruta:

        System.out.println("Nome: " + f1.getNome());
        System.out.println("Poder: " + f1.getPoder());
        System.out.println("Tipo: " + f1.getTipo());

        System.out.println("\n");

        // Informacoes do Tesouro Secreto:

        System.out.println("Nome: " + ts1.getNome());
        System.out.println("Tipo: " + ts1.getTipo());
        System.out.println("Valor: " + ts1.getValor());
        System.out.println("Encontrado: " + ts1.getEncontrado());
        System.out.println("Raridade: " + ts1.getRaridade());

        System.out.println("\n");

        // Informacoes da Embarcacao:
        System.out.println("Nome: " + e1.getNome());
        System.out.println("Tipo: " + e1.getTipo());
        System.out.println("Madeira: " + e1.getMadeira());
        System.out.println("Bandeira: " + e1.getBandeira());
        System.out.println("Destruida: " + e1.isDestruida());

    }
}