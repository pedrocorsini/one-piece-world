package br.eng.corsini.onepiece_ptbr;

public enum HakiEnum {
    ARMAMENTO("Armamento"),
    OBSERVACAO("Observacao"),
    CONQUISTADOR("Conquistador");

    private final String nome;
    HakiEnum(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }  
}
