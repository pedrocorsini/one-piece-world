package br.eng.corsini;

import br.eng.corsini.onepiece_ptbr.*;

public class MainBr {
    public static void main(String[] args) {
        System.out.println("==================");
        System.out.println("Mundo de One Piece");
        System.out.println("==================");

        // Criacao de Ilhas:
        Ilha dawn = new Ilha("Ilha Dawn", MarEnum.EASTBLUE, false);
        dawn.getVilas().add("Vilha Fusha");
        dawn.getVilas().add("Reino Goa");
        Ilha polestar = new Ilha("Ilha Polestar", MarEnum.EASTBLUE, false);
        polestar.getVilas().add("Loguetown");
        Ilha zoroilha = new Ilha("Ilha Zoro", MarEnum.EASTBLUE, false);
        zoroilha.getVilas().add("Vila Shimotsuki");
        Ilha ilhapeixe = new Ilha("Ilha dos Homem-Peixe", MarEnum.NOVOMUNDO, true);
        ilhapeixe.getVilas().add("Reino Ryugu");

        // Criacao de Embarcacoes:
        Embarcacao sunny = new Embarcacao("Thousand Sunny", "Navio", "Madeira de Adao", "Caveira com Chapeu de Palha", false);
        Embarcacao orojackson = new Embarcacao("Oro Jackson", "Navio", "Madeira de Adao", "Caveira Roger", true);
        Embarcacao naviogarp = new Embarcacao("Navio Monkey D. Garp", "Navio", "Carvalho", "Marinha", false);

        // Criacao de Tripulacoes Piratas:
        TripulacaoPirata mugiwara = new TripulacaoPirata("Chapeus de Palha", false);
        TripulacaoPirata piratasroger = new TripulacaoPirata("Piratas do Roger", true);

        //Criacao de Frutas do Diabo:
        FrutaDoDiabo gomugomu = new FrutaDoDiabo("Fruta do Humano modelo Nika", "Deus do Sol Nika", "Zoan Mitica");
        FrutaDoDiabo luz = new FrutaDoDiabo("Fruta da Luz", "Luz", "Logia");
        FrutaDoDiabo zushi = new FrutaDoDiabo("Zushi Zushi no Mi", "Gravidade", "Paramecia");

        // Criacao de Piratas:

        // Luffy:
        Pirata luffy = new Pirata("Monkey D. Luffy", 19, true, 1.74f, dawn, 3000000000d, sunny, "Yonkou", mugiwara, "Capitao");
        mugiwara.getTripulantes().add(luffy);
        sunny.getPiratas().add(luffy);
        luffy.getHakis().add(HakiEnum.ARMAMENTO);
        luffy.getHakis().add(HakiEnum.CONQUISTADOR);
        luffy.getHakis().add(HakiEnum.OBSERVACAO);
        luffy.setFruta(gomugomu);

        // Gol D. Roger:
        Pirata roger = new Pirata("Gol D. Roger", 53, false, 2.74f, polestar, 5564800000d, orojackson, "Reu dos Piratas", 
        piratasroger, "Capitao");
        orojackson.getPiratas().add(roger);
        piratasroger.getTripulantes().add(roger);
        roger.getHakis().add(HakiEnum.ARMAMENTO);
        roger.getHakis().add(HakiEnum.CONQUISTADOR);
        roger.getHakis().add(HakiEnum.OBSERVACAO);

        // Zoro
        Pirata zoro = new Pirata("Roronoa Zoro", 21, true, 1.81f, zoroilha, 1111000000d, sunny, "Cacador de Piratas", 
        mugiwara, "Espadachim");
        sunny.getPiratas().add(zoro);
        mugiwara.getTripulantes().add(zoro);
        zoro.getHakis().add(HakiEnum.ARMAMENTO);
        zoro.getHakis().add(HakiEnum.OBSERVACAO);

        
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
        Marinheiro fujitora = new Marinheiro("Fujitora Issho", 54, true, 2.7f, null, "Almirante", 1000, "Esgrima", null, null);
        fujitora.setFruta(zushi);
        fujitora.getHakis().add(HakiEnum.ARMAMENTO);
        fujitora.getHakis().add(HakiEnum.OBSERVACAO);

        // Criacao de Homem Peixe:

        HomemPeixe netuno = new HomemPeixe("Rei Netuno", 70, true, 12.2f, ilhapeixe, "Sereiano", 200);

        // Criacao de Sereia
        
        Sereia shirahoshi = new Sereia("Princesa Shirahosi", 16, true, 11.87f, ilhapeixe, "Rosa", true);
        netuno.getFilhos().add(shirahoshi);

        // Criacao de Revolucionario

        Revolucionario dragon = new Revolucionario("Monkey D. Dragon", 55, true, 2.56f, dawn, "Ameaca Mundial", 
        "Conhecimento do Seculo Perdido", 1000000000d, "Lider do Exercito Revolucionario");
        garp.getFilhos().add(dragon);
        dragon.getFilhos().add(luffy);

        // Criacao de Poneglyphs e RoadPoneglyphs

        Poneglyph poneglyph = new Poneglyph("Ha 800 anos atras o mundo afundou!", true, ilhapeixe);
        RoadPoneglyph rp = new RoadPoneglyph("Voce nao achou o One Piece", false, polestar, "0000");
        RoadPoneglyph rp2 = new RoadPoneglyph("Voce achou a verdadeira coordenada do OnePiece!", false, null, "1999 N, 1997 L");
        rp2.localizarOnePiece(rp2);
        rp.localizarOnePiece(rp);

        
    }
}
