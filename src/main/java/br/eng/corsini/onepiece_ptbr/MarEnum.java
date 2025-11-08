package br.eng.corsini.onepiece_ptbr;

public enum MarEnum {
    NORTHBLUE( "North Blue"),
    WESTBLUE("West Blue"),
    EASTBLUE("East Blue"),
    SOUTHBLUE("South Blue"),
    GRANDLINE("Grand Line"),
    NOVOMUNDO("Novo Mundo");
    
    private final String nome;
    MarEnum(String nome){
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
}