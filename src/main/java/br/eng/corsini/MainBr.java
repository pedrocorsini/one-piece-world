package br.eng.corsini;

import br.eng.corsini.onepiece_ptbr.*;

public class MainBr {
    public static void main(String[] args) {
    
        // Criacao de Ilhas:
        Ilha dawn = new Ilha("Ilha Dawn", MarEnum.EASTBLUE, false);
        dawn.getVilas().add("Vilha Foosha");
        dawn.getVilas().add("Reino Goa");
        Ilha polestar = new Ilha("Ilha Polestar", MarEnum.EASTBLUE, false);
        polestar.getVilas().add("Loguetown");
        Ilha zoroilha = new Ilha("Ilha Zoro", MarEnum.EASTBLUE, false);
        zoroilha.getVilas().add("Vila Shimotsuki");
        Ilha ilhapeixe = new Ilha("Ilha dos Homem-Peixe", MarEnum.NOVOMUNDO, true);
        ilhapeixe.getVilas().add("Reino Ryugu");
        Ilha baterilla = new Ilha("Ilha Baterilla", MarEnum.EASTBLUE, false);
        Ilha wano = new Ilha("Pais de Wano", MarEnum.NOVOMUNDO, false);
        wano.getVilas().add("Kuri");
        wano.getVilas().add("Kibi");
        wano.getVilas().add("Capital das Flores");
        wano.getVilas().add("Ringo");
        wano.getVilas().add("Udon");
        wano.getVilas().add("Hakumai");
        wano.getVilas().add("Onigashima ");
        Ilha sabaody = new Ilha("Arquipelago Sabaody", MarEnum.NOVOMUNDO, false);

        // Criacao de Embarcacoes:
        Embarcacao sunny = new Embarcacao("Thousand Sunny", "Navio", "Madeira de Adao", "Caveira com Chapeu de Palha", false);
        Embarcacao orojackson = new Embarcacao("Oro Jackson", "Navio", "Madeira de Adao", "Caveira Roger", true);
        Embarcacao naviogarp = new Embarcacao("Navio Monkey D. Garp", "Navio de Guerra", "Carvalho", "Marinha", false);
        Embarcacao mobydick = new Embarcacao("Moby Dick", "Navio", "Pinheiro", "Bandeira Barba Branca", true);

        // Criacao de Tripulacoes Piratas:
        TripulacaoPirata mugiwara = new TripulacaoPirata("Chapeus de Palha", false);
        TripulacaoPirata piratasroger = new TripulacaoPirata("Piratas do Roger", true);
        TripulacaoPirata piratasbarbabranca = new TripulacaoPirata("Piratas do Barba Branca", true);

        //Criacao de Frutas do Diabo:
        FrutaDoDiabo gomugomu = new FrutaDoDiabo("Fruta do Humano Modelo Nika", "Deus do Sol Nika", "Zoan Mitica");
        FrutaDoDiabo luz = new FrutaDoDiabo("Fruta da Luz", "Luz", "Logia");
        FrutaDoDiabo zushi = new FrutaDoDiabo("Zushi Zushi no Mi", "Gravidade", "Paramecia");
        FrutaDoDiabo meramera = new FrutaDoDiabo("Fruta do Fogo", "Fogo", "Logia");
        FrutaDoDiabo dragaorosa = new FrutaDoDiabo("Fruta do Dragao Rosa", "Dragao", "Zoan Mitica");
        FrutaDoDiabo magma = new FrutaDoDiabo("Fruta do Magma", "Magma", "Logia");

        // Criacao de Piratas:

        // Luffy:
        Pirata luffy = new Pirata("Monkey D. Luffy", 19, true, 1.74f, dawn, sunny, "Yonkou", mugiwara, "Capitao");
        luffy.setRecompensa(3000000000d);
        mugiwara.getTripulantes().add(luffy);
        sunny.getPiratas().add(luffy);
        luffy.getHakis().add(HakiEnum.ARMAMENTO);
        luffy.getHakis().add(HakiEnum.CONQUISTADOR);
        luffy.getHakis().add(HakiEnum.OBSERVACAO);
        luffy.setFruta(gomugomu);

        // Gol D. Roger:
        Pirata roger = new Pirata("Gol D. Roger", 53, false, 2.74f, polestar, orojackson, "Rei dos Piratas", 
        piratasroger, "Capitao");
        roger.setRecompensa(5564800000d);
        orojackson.getPiratas().add(roger);
        piratasroger.getTripulantes().add(roger);
        roger.getHakis().add(HakiEnum.ARMAMENTO);
        roger.getHakis().add(HakiEnum.CONQUISTADOR);
        roger.getHakis().add(HakiEnum.OBSERVACAO);

        // Zoro
        Pirata zoro = new Pirata("Roronoa Zoro", 21, true, 1.81f, zoroilha, sunny, "Cacador de Piratas", 
        mugiwara, "Espadachim");
        zoro.setRecompensa(1111000000d);
        sunny.getPiratas().add(zoro);
        mugiwara.getTripulantes().add(zoro);
        zoro.getHakis().add(HakiEnum.ARMAMENTO);
        zoro.getHakis().add(HakiEnum.OBSERVACAO);

        // Ace
        Pirata ace = new Pirata("Portgas D. Ace", 20, false, 1.85f, baterilla, mobydick, "Ace Punhos de Fogo", piratasbarbabranca,
            "Capitao da Segunda Divisao");
        ace.setRecompensa(550000000d);
        mobydick.getPiratas().add(ace);
        piratasbarbabranca.getTripulantes().add(ace);
        ace.setFruta(meramera);
        roger.getFilhos().add(ace);

        // Momonosuke
        Pirata momo = new Pirata("Kozuki Momonosuke", 8, true, 2.0f, wano, null, "Shogun do Pais de Wano", null, "Shogun");
        momo.setFruta(dragaorosa);
        wano.setGovernante(momo);

        // Rayleigh
        Pirata rayleigh = new Pirata("Silvers Rayleigh", 78, true, 1.88f, sabaody, orojackson, "Rei das Trevas", piratasroger,
            "Primeiro Imediato");
        rayleigh.setRecompensa(223233232d);
        orojackson.getPiratas().add(rayleigh);
        piratasroger.getTripulantes().add(rayleigh);
        rayleigh.getHakis().add(HakiEnum.ARMAMENTO);
        rayleigh.getHakis().add(HakiEnum.OBSERVACAO);
        rayleigh.getHakis().add(HakiEnum.CONQUISTADOR);

        // Criacao de Marinheiros:

        // Garp
        Marinheiro garp = new Marinheiro("Monkey D. Garp", 78, true, 2.87f, dawn, "Vice-Almirante", 999999, 
        "Galaxy Impact", naviogarp, "Garp o Punho");
        garp.getHakis().add(HakiEnum.ARMAMENTO);
        garp.getHakis().add(HakiEnum.OBSERVACAO);
        garp.getHakis().add(HakiEnum.CONQUISTADOR);
        naviogarp.getMarinheiros().add(garp);

        // Kizaru
        Marinheiro kizaru = new Marinheiro("Borsalino Kizaru", 58, true, 3.02f, null, "Almirante", 999,
        "Velocidade da Luz", null, null);
        kizaru.setFruta(luz);
        kizaru.getHakis().add(HakiEnum.ARMAMENTO);

        // Fujitora        
        Marinheiro fujitora = new Marinheiro("Fujitora Issho", 54, true, 2.70f, null, "Almirante", 1000, "Esgrima", null, null);
        fujitora.setFruta(zushi);
        fujitora.getHakis().add(HakiEnum.ARMAMENTO);
        fujitora.getHakis().add(HakiEnum.OBSERVACAO);

        // Akainu
        Marinheiro akainu = new Marinheiro("Sakazuki Akainu", 55, true, 3.06f, null, "Almirante da Frota", 1, 
        "Soco de Magma", null, "Cachorro Vermelho");
        akainu.setFruta(magma);

        // Criacao de Homem Peixe:
        
        HomemPeixe jinbe = new HomemPeixe("Jinbe", 46, true, 3.01f, ilhapeixe, "Tubarão-Baleia", 438);
        HomemPeixe netuno = new HomemPeixe("Rei Netuno", 70, true, 12.2f, ilhapeixe, "Sereiano", 200);

        // Criacao de Sereia
        
        Sereia shirahoshi = new Sereia("Princesa Shirahosi", 16, true, 11.87f, ilhapeixe, "Rosa", true);
        netuno.getFilhos().add(shirahoshi);

        // Criacao de Revolucionario

        Revolucionario dragon = new Revolucionario("Monkey D. Dragon", 55, true, 2.56f, dawn, "Ameaca Mundial", 
        "Conhecimento do Seculo Perdido", 1000000000d, "Lider do Exercito Revolucionario");
        garp.getFilhos().add(dragon);
        dragon.getFilhos().add(luffy);

        // Criacao de Monstro do Mar
        MonstroMar kraken = new MonstroMar("Kraken", 100, true, 200, null, "Polvo Gigante", "Azul", 1000);

        // Criacao de Poneglyphs e RoadPoneglyphs

        Poneglyph poneglyph = new Poneglyph(" Poneglyph Comum","Ha 800 anos atras o mundo afundou!", true, ilhapeixe);
        Poneglyph rp1 = new Poneglyph("Road Poneglyph", "Voce nao achou o One Piece", false, polestar);
        Poneglyph rp2 = new Poneglyph("Road Poneglyph","Voce achou a verdadeira coordenada do OnePiece!", false, null);

        // Criacao de Base Marinha

        BaseMarinha qg = new BaseMarinha("QG da Marinha", MarEnum.NOVOMUNDO, false, akainu);
        qg.getMarinheiros().add(fujitora);
        qg.getMarinheiros().add(kizaru);
        qg.getMarinheiros().add(garp);

        // Criacao de Tesouro Secreto

        TesouroSecreto enma = new TesouroSecreto("Enma", "Katana", 100000d, MarEnum.NOVOMUNDO, "Lendaria");
        zoro.getTesouros().add(enma);
        TesouroSecreto wadoIchimonji = new TesouroSecreto("Wado Ichimonji", "Katana", 100000d, MarEnum.EASTBLUE, "Lendaria");
        zoro.getTesouros().add(wadoIchimonji);
        TesouroSecreto sandai = new TesouroSecreto("Sandai Kitetsu", "Katana", 1000000000d, MarEnum.NOVOMUNDO, "Lendaria");
        zoro.getTesouros().add(sandai);

        // One Piece
        OnePiece.getInstancia().setDescricao("Tesouro do Rei dos Piratas");
        OnePiece.getInstancia().setLocalizacao("Desconhecida");
        OnePiece o1 = OnePiece.getInstancia();
        OnePiece o2 = OnePiece.getInstancia();
        // PRINTS

        System.out.println("\n======================");
        System.out.println("  Mundo de One Piece  ");
        System.out.println("======================\n");

        System.out.println("========SERES========\n");

        luffy.print();
        zoro.print();
        garp.print();
        dragon.print();
        kizaru.print();
        netuno.print();
        shirahoshi.print();
        roger.print();
        ace.print();
        fujitora.print();
        kraken.print();
        momo.print();
        rayleigh.print();
        jinbe.print();

        System.out.println("====FRUTAS DO DIABO===\n");
        gomugomu.printFruta();
        meramera.printFruta();
        zushi.printFruta();
        luz.printFruta();
        dragaorosa.printFruta();
        magma.printFruta();
    
        System.out.println("======EMBARCACOES=====\n");
        orojackson.printEmbarcacao();
        sunny.printEmbarcacao();
        mobydick.printEmbarcacao();
        naviogarp.printEmbarcacao();

        System.out.println("=====TRIPULACOES======\n");
        mugiwara.printTripulacao();
        piratasbarbabranca.printTripulacao();
        piratasroger.printTripulacao();

        System.out.println("=======ILHAS==========\n");
        dawn.printInfo();
        polestar.printInfo();
        zoroilha.printInfo();
        ilhapeixe.printInfo();
        baterilla.printInfo();
        wano.printInfo();
        sabaody.printInfo();

        System.out.println("======PONEGLYPHS======\n");
        poneglyph.printPon();
        rp1.printPon();
        rp2.printPon();

        System.out.println("=LOCALIZAR ONE PIECE=\n");

        System.out.println("Localizacao o1: " + o1.getLocalizacao());
        System.out.println("Localizacao o2: " + o2.getLocalizacao());
        System.out.println("Objeto o1 == o2: " + (o1 == o2));

        System.out.println("\nChamando metodo de localizar o one piece...\n");
        System.out.print("Poneglyh Comum: ");
        poneglyph.localizarOnePiece(poneglyph);
        System.out.print("Road Poneglyh 1: ");
        rp1.localizarOnePiece(rp1);
        System.out.print("Road Poneglyh 2: ");
        rp2.localizarOnePiece(rp2);

        System.out.println("\nLocalizacao o1: " + o1.getLocalizacao());
        System.out.println("Localizacao o2: " + o2.getLocalizacao());
        System.out.println("Objeto o1 == o2: " + (o1 == o2));

        System.out.println("");
        rp2.printPon();

        System.out.println("===BASES DA MARINHA===\n");
        qg.printBase();

        System.out.println("==TESOUROS SECRETOS===\n");
        enma.printTesouro();
        wadoIchimonji.printTesouro();
        sandai.printTesouro();

        System.out.println("MULTIPLICANDO RECOMPENSAS");
        luffy.multiplicarRecompensa(2);
        System.out.println("Luffy nova recompensa: $" + String.format("%.2f", luffy.getRecompensa()));
        zoro.multiplicarRecompensa(3);
        System.out.println("Zoro nova recompensa: $" + String.format("%.2f", zoro.getRecompensa()));
        System.out.println("");
        luffy.print();
        zoro.print();

    }
}
