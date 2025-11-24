// Autor: Pedro Corsini
// GitHub Repository: github.com/pedrocorsini/one-piece-world

package br.eng.corsini;

import br.eng.corsini.onepiece_en.*;

public class MainEn {
    public static void main(String[] args) {
        
        // Islands Creation:
        Island dawn = new Island("Dawn Islad", SeaEnum.EASTBLUE, false);
        dawn.getVillages().add("Foosha Village");
        dawn.getVillages().add("Goa Kingdom");
        Island polestar = new Island("Polestar Island", SeaEnum.EASTBLUE, false);
        polestar.getVillages().add("Loguetown");
        Island zoroisland = new Island("Zoro Island", SeaEnum.EASTBLUE, true);
        zoroisland.getVillages().add("Shimotsuki Village");
        Island fishmanisland = new Island("Fishman Island", SeaEnum.GRANDLINE, true);
        fishmanisland.getVillages().add("Ryugu Kingdom");
        Island baterilla = new Island("Battery Island", SeaEnum.NEWWORLD, false);
        Island wano = new Island("Wano Country", SeaEnum.NEWWORLD, true);
        wano.getVillages().add("Kuri");
        wano.getVillages().add("Kibi");
        wano.getVillages().add("Flower Capital");
        wano.getVillages().add("Ringo");
        wano.getVillages().add("Udon");
        wano.getVillages().add("Hakumai"); 
        wano.getVillages().add("Onigashima");
        Island sabaody = new Island("Sabaody Archipelago", SeaEnum.NEWWORLD, false);

        // Ships Creation:
        Ship sunny = new Ship("Thousand Sunny", "Vessel", "Adam's Wood", "Straw Hat Skull", false);
        Ship orojackson = new Ship("Oro Jackson", "Vessel", "Adam's Wood", "Roger's Skull", true);
        Ship garpship = new Ship("Garp's Ship", "Warship", "Oak Wood", "Marine Emblem", false);
        Ship mobydick = new Ship("Moby Dick", "Vessel", "Pine Wood", "Whitebeard's Flag", true);

        // Pirate Crews Creation:
        PirateCrew strawhat = new PirateCrew("Straw Hat Pirates", false);
        PirateCrew rogerpirates = new PirateCrew("Roger Pirates", true);
        PirateCrew whitebeardpirates = new PirateCrew("Whitebeard Pirates", true);

        // Devil Fruits Creation:
        DevilFruit gomugomu = new DevilFruit("Human-Human Fruit Model Nika", "Sun God Nika", "Mythical Zoan");
        DevilFruit light = new DevilFruit("Light-Light Fruit", "Light", "Logia");
        DevilFruit zushi = new DevilFruit("Zushi Zushi Fruit", "Gravity", "Paramecia");
        DevilFruit meramera = new DevilFruit("Flame-Flame Fruit", "Fire", "Logia");
        DevilFruit pinkdragon = new DevilFruit("Dragon-Dragon Fruit Model Pink Dragon", "Dragon", "Mythical Zoan");
        DevilFruit magma = new DevilFruit("Magma-Magma Fruit", "Magma", "Logia");
        // Pirate Creation:

        // Luffy:
        Pirate luffy = new Pirate("Monkey D. Luffy", 19, true, 1.74f, dawn, sunny, "Yonkou", strawhat, "Captain");
        luffy.setBounty(3000000000d);
        strawhat.getCrew().add(luffy);
        sunny.getPirates().add(luffy);
        luffy.getHakis().add(HakiEnum.ARMAMENT);
        luffy.getHakis().add(HakiEnum.OBSERVATION);
        luffy.getHakis().add(HakiEnum.CONQUEROR);
        luffy.setFruit(gomugomu);

        // Gol D. Roger:
        Pirate roger = new Pirate("Gol D. Roger", 53, false, 1.93f, polestar, orojackson, "Pirate King", rogerpirates, "Captain");
        roger.setBounty(5564800000d);
        orojackson.getPirates().add(roger);
        rogerpirates.getCrew().add(roger);
        roger.getHakis().add(HakiEnum.ARMAMENT);
        roger.getHakis().add(HakiEnum.OBSERVATION);
        roger.getHakis().add(HakiEnum.CONQUEROR);

        // Zoro
        Pirate zoro = new Pirate("Roronoa Zoro", 21, true, 1.81f, zoroisland, sunny, "Pirate Hunter", strawhat, "Swordsman");
        zoro.setBounty(1111000000d);
        sunny.getPirates().add(zoro);
        strawhat.getCrew().add(zoro);
        zoro.getHakis().add(HakiEnum.ARMAMENT);
        zoro.getHakis().add(HakiEnum.OBSERVATION);

        // Ace
        Pirate ace = new Pirate("Portgas D. Ace", 20, false, 1.85f, baterilla, mobydick, "Fire Fist", whitebeardpirates, "2nd Division Commander");
        ace.setBounty(550000000d);
        mobydick.getPirates().add(ace);
        whitebeardpirates.getCrew().add(ace);
        ace.setFruit(meramera);
        roger.getChildren().add(ace);

        // Momonosuke
        Pirate momo = new Pirate("Momonosuke", 8, true, 1.32f, wano, null, "Wano's Country Shogun", null, "Shogun");
        momo.setFruit(pinkdragon);
        wano.setGovernor(momo);

        // Rayleigh
        Pirate rayleigh = new Pirate("Silvers Rayleigh", 78, false, 1.88f, sabaody, orojackson, "Dark King", rogerpirates, "First Mate");
        rayleigh.setBounty(223233232d);
        orojackson.getPirates().add(rayleigh);
        rogerpirates.getCrew().add(rayleigh);
        rayleigh.getHakis().add(HakiEnum.ARMAMENT);
        rayleigh.getHakis().add(HakiEnum.OBSERVATION);
        rayleigh.getHakis().add(HakiEnum.CONQUEROR);

        // Marines Creation:
        Marine garp = new Marine("Monkey D. Garp", 78, true, 2.87f, dawn, "Vice Admiral", 999999, "Galaxy Impact", garpship, "Garp the Fist");
        garp.getHakis().add(HakiEnum.ARMAMENT);
        garp.getHakis().add(HakiEnum.OBSERVATION);
        garp.getHakis().add(HakiEnum.CONQUEROR);
        garpship.getMarines().add(garp);

        // Kizaru
        Marine kizaru = new Marine("Borsalino Kizaru", 58, true, 2.02f, null, "Admiral", 999, "Light Speed", null, null);
        kizaru.setFruit(light);
        kizaru.getHakis().add(HakiEnum.ARMAMENT);

        // Fujitora
        Marine fujitora = new Marine("Fujitora Issho", 54, true, 2.70f, null, "Admiral", 999, "Fencing", null, null);
        fujitora.setFruit(zushi);
        fujitora.getHakis().add(HakiEnum.ARMAMENT);
        fujitora.getHakis().add(HakiEnum.OBSERVATION);

        Marine akainu = new Marine("Sakazuki Akainu", 55, true, 3.06f, null, "Fleet Admiral", 1, "Magma Fist", null, "Red Dog");
        akainu.setFruit(magma);


        //Fishman Creation:

        Fishman jinbe = new Fishman("Jinbe", 46, true, 3.01f, fishmanisland, "Whale Shark", 438);
        Fishman neptune = new Fishman("King Neptune", 70, true, 12.2f, fishmanisland, "Sereian", 200);
        
        // Mermaid Creation:
        Mermaid shirahoshi = new Mermaid("Shirahoshi", 16, true, 11.87f, fishmanisland, "Pink", true);
        neptune.getChildren().add(shirahoshi);

        // Revolutionaries Creation:
        Revolutionary dragon = new Revolutionary("Monkey D. Dragon", 55, true, 2.56f, dawn, "Global Threat", 
        "Knowledge about Lost Century", 1000000000d, "Leader of the Revolutionary Army");
        garp.getChildren().add(dragon);
        dragon.getChildren().add(luffy);

        // Sea Monster Creation:
        SeaMonster kraken = new SeaMonster("Kraken", 100, true, 200, null, "Giant Squid", "Blue", 1000);

        // Poneglyph Creation:
        Poneglyph poneglyph = new Poneglyph("Common Poneglyph", "800 years ago the world sank!", true, fishmanisland);
        Poneglyph rp1 = new Poneglyph("Road Poneglyph", "You didn't find the One Piece", false, polestar);
        Poneglyph rp2 = new Poneglyph("Road Poneglyph", "You have found the true coordinate of OnePiece!", false, null);

        // Marine Base Creation:
        MarineBase hq = new MarineBase("Marine Headquarters", SeaEnum.NEWWORLD, false, akainu);
        hq.getMarines().add(fujitora);
        hq.getMarines().add(kizaru);
        hq.getMarines().add(garp);

        /// Secret Treasure Creation:
        
        SecretTreasure enma = new SecretTreasure("Enma", "Katana", 1000000000d, SeaEnum.NEWWORLD, "Legendary");
        zoro.getTreasures().add(enma);
        SecretTreasure wadoIchimonji = new SecretTreasure("Wado Ichimonji", "Katana", 10000d, SeaEnum.EASTBLUE, "Legendary");
        zoro.getTreasures().add(wadoIchimonji);
        SecretTreasure sandai = new SecretTreasure("Sandai Kitetsu", "Katana", 100000000d, SeaEnum.NEWWORLD, "Legendary");
        zoro.getTreasures().add(sandai);

        // One Piece
        OnePiece.getInstance().setDescription("Pirate King Treasure");
        OnePiece.getInstance().setLocation("Unknown");
        OnePiece o1 = OnePiece.getInstance();
        OnePiece o2 = OnePiece.getInstance();

        // PRINTS

        System.out.println("\n======================");
        System.out.println("ONE PIECE WORLD");
        System.out.println("======================\n");

        System.out.println("========BEINGS========\n");

        luffy.print();
        zoro.print();
        garp.print();
        dragon.print();
        kizaru.print();
        neptune.print();
        shirahoshi.print();
        roger.print();
        ace.print();
        fujitora.print();
        kraken.print();
        momo.print();
        rayleigh.print();
        jinbe.print();

        System.out.println("=====DEVIL FRUITS=====\n");
        gomugomu.printFruit();
        meramera.printFruit();
        zushi.printFruit();
        light.printFruit();
        pinkdragon.printFruit();
        magma.printFruit();

        System.out.println("=========SHIPS========\n");
        orojackson.printShip();
        sunny.printShip();
        mobydick.printShip();
        garpship.printShip();

        System.out.println("=========CREWS========\n");
        strawhat.printCrew();
        whitebeardpirates.printCrew();
        rogerpirates.printCrew();


        System.out.println("========ISLANDS=======\n");
        dawn.printInfo();
        polestar.printInfo();
        zoroisland.printInfo();
        fishmanisland.printInfo();
        baterilla.printInfo();
        wano.printInfo();
        sabaody.printInfo();

        System.out.println("=======PONEGLYPHS=====\n");
        poneglyph.printPon();
        rp1.printPon();
        rp2.printPon();

        System.out.println("===LOCATE ONE PIECE===\n");
        
        System.out.println("Location o1: " + o1.getLocation());
        System.out.println("Location o2: " + o2.getLocation());

        System.out.println("\nCalling locate one piece method...\n");
        System.out.println("Common Poneglyph: ");
        poneglyph.locateOnePiece(poneglyph);
        System.out.print("Road Poneglyph 1: ");
        rp1.locateOnePiece(rp1);
        System.out.print("Road Poneglyph 2: ");
        rp2.locateOnePiece(rp2);

        System.out.println("\nLocation o1: " + o1.getLocation());
        System.out.println("Location o2: " + o2.getLocation());
        System.out.println("Object o1 == o2: " + (o1 == o2));

        System.out.println("");
        rp2.printPon();

        System.out.println("=====MARINE BASES=====\n");
        hq.printBase();

        System.out.println("===SECRET TREASURES===\n");
        enma.printTreasure();
        wadoIchimonji.printTreasure();
        sandai.printTreasure();

        System.out.println("=MULTIPLYING BOUNTIES=\n");
        luffy.multiplyBounty(2);
        System.out.println("Luffy's bounty multiplied by 2: " + String.format("$%.2f", luffy.getBounty()));
        zoro.multiplyBounty(3);
        System.out.println("Zoro's bounty multiplied by 3: " + String.format("$%.2f", zoro.getBounty()));
        System.out.println("");
        luffy.print();
        zoro.print();
    }
}
