package br.eng.corsini.onepiece_ptbr;


public class App {
    public static void main(String[] args) {

        // Instanciando objetos:
        Pirata p1 = new Pirata();
        Ilha i1 = new Ilha();
        FrutaDoDiabo f1 = new FrutaDoDiabo();
        TripulacaoPirata t1 = new TripulacaoPirata();
        TesouroSecreto ts1 = new TesouroSecreto();
        Embarcacao e1 = new Embarcacao();

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

        // Ilha:
        i1.setNome("Ilha Dawn");
        i1.getVilas().add("Vila Foosha");
        i1.getVilas().add("Reino Goa");
        i1.setLocalizacao(MarEnum.EASTBLUE);
        i1.setAfundada(false);

        // OnePiece - Objeto Unico:
        OnePiece.getInstancia().setDescricao("Tesouro do Gold Roger");
        OnePiece.getInstancia().setLocalizacao("Laugh Tale");
        //OnePiece o1 = OnePiece.getInstancia();
        //OnePiece o2 = OnePiece.getInstancia();
        //System.out.println(o1.getDescricao());
        //System.out.println(o1.getLocalizacao());
        //System.out.println(o2.getDescricao());
        //System.out.println(o2.getLocalizacao());
        
        // Fruta do Diabo:
        f1.setNome("Gomu Gomu no Mi");
        f1.setPoder("Borracha");
        f1.setTipo("Paramecia");

        // Tripulacao:
        t1.setNome("Chapeus de Palha");
        t1.setDestruida(false);
        t1.getTripulantes().add(p1);

        // Tesouro Secreto:
        ts1.setNome("Amigos que fez pelo caminho");
        ts1.setTipo("Amigos");
        ts1.setValor(1d);
        ts1.setEncontrado(MarEnum.EASTBLUE);
        ts1.setRaridade("Extremo");

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
        System.out.println("Haki: " + p1.getHaki());
        System.out.println("Nasceu na ilha: " + p1.getNasceu().getNome());
        System.out.printf("Tesouro: - ");
        for(TesouroSecreto t : p1.getTesouros()){
            System.out.println("Nome: " + t.getNome());
        }
    }
}