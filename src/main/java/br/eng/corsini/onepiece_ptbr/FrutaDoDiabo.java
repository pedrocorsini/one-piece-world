package br.eng.corsini.onepiece_ptbr;

public class FrutaDoDiabo {
    private String nome;
    private String poder;
    private String tipo;

    // Construtor
    
    public FrutaDoDiabo(String nome, String poder, String tipo){
        this.nome = nome;
        this.poder = poder;
        this.tipo = tipo;
    }

    public void printFruta(){
        System.out.println("=========FRUTA========");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println("Poder: " + poder);
        System.out.println("======================\n");
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getPoder() {
        return poder;
    }
    public void setPoder(String poder) {
        this.poder = poder;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }   
}