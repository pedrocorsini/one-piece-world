package br.eng.corsini.onepiece_en;

public class SecretTreasure {
    private String name;
    private String typo;
    private double value;
    private SeaEnum whereFound;
    private String rarity;

    // Constructor

    public SecretTreasure(String name, String typo, double value, SeaEnum whereFound, String rarity) {
        this.name = name;
        this.typo = typo;
        this.value = value;
        this.whereFound = whereFound;
        this.rarity = rarity;
    }

    public void printTreasure(){
        System.out.println("========TREASURE=======");
        System.out.println("Treasure Name: " + name);
        System.out.println("Type: " + typo);
        System.out.println("Value: $" + String.format("%.2f", value));
        System.out.println("Rarity: " + rarity);
        System.out.println("Where Found: " + (whereFound != null ? whereFound.getName() : "Not found"));
        System.out.println("======================\n");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTypo() {
        return typo;
    }
    public void setTypo(String typo) {
        this.typo = typo;
    }
    public double getValue() {
        return value;
    }
    public void setValue(double value) {
        this.value = value;
    }
    public SeaEnum getWhereFound() {
        return whereFound;
    }
    public void setWhereFound(SeaEnum whereFound) {
        this.whereFound = whereFound;
    }
    public String getRarity() {
        return rarity;
    }
    public void setRarity(String rarity) {
        this.rarity = rarity;
    }
    
}
