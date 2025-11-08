package br.eng.corsini.onepiece_en;

public class SecretTreasure {
    private String name;
    private String typo;
    private double value;
    private SeaEnum whereFound;
    private String rarity;
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
