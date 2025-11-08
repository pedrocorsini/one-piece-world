package br.eng.corsini.onepiece_en;

public enum HakiEnum {
    ARMAMENT("Armament"),
    OBSERVATION("Observation"),
    CONQUEROR("Conqueror");

    private final String name;
    HakiEnum(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
