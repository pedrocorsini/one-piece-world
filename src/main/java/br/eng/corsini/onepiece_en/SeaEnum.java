package br.eng.corsini.onepiece_en;

public enum SeaEnum {
    NORTHBLUE( "North Blue"),
    WESTBLUE("West Blue"),
    EASTBLUE("East Blue"),
    SOUTHBLUE("South Blue"),
    GRANDLINE("Grand Line"),
    NEWWORLD("New World");
    
    private final String name;
    SeaEnum(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
