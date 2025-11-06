package br.eng.corsini.onepiece_ptbr;

public class App {
    public static void main(String[] args) {
        Pirata p = new Pirata();
        Ilha ilha = new Ilha();
        FrutaDoDiabo fruta = new FrutaDoDiabo();
        OnePiece onepiece = OnePiece.getInstancia();

        p.setNome("Luffy");
        p.setIdade(19);
        p.setNavio("Thousand Sunny");
        p.setRecompensa(3000000000L);
        p.setHaki(HakiEnum.ARMAMENTO);
        fruta.setNome("Hito Hito no Mi");
        fruta.setPoder("Poderes de Borracha");
        fruta.setTipo("Zoan Mitica modo Nika");
        p.setFruta(fruta);
        ilha.setNome("Reino Goa");
        p.setNasceu(ilha);
        ilha.setLocalizacao(MarEnum.EASTBLUE);


        System.out.println("Nome do Pirata: " + p.getNome());
        System.out.println("Recompensa: " + p.getRecompensa());
        System.out.println("Navio: " + p.getNavio());
        System.out.println("Idade: " + p.getIdade());
        System.out.println("Haki: " + p.getHaki());
        System.out.println(p.getFruta().getNome());

        System.out.println(ilha.getLocalizacao().getNome());
        System.out.println(p.getNasceu().getNome());
        System.out.println(p.getEstado());
        OnePiece.getInstancia().setDescricao("Tesouro do Rei dos Piratas escondido em algum lugar dos 4 mares!");
        System.out.println(onepiece.getDescricao());
    }
}