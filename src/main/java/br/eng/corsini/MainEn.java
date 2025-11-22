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







        // PRINTS

        System.out.println("\n======================");
        System.out.println("ONE PIECE WORLD");
        System.out.println("======================\n");

        System.out.println("========BEINGS========\n");
        luffy.print();
        zoro.print();
        ace.print();
        roger.print();
    }
}
