package br.eng.corsini.onepiece_ptbr;

public class TesouroSecreto {
    private String nome;
    private String tipo;
    private double valor;
    private MarEnum encontrado;
    private String raridade;

    // Construtor

    public TesouroSecreto(String nome, String tipo, double valor, MarEnum encontrado, String raridade) {
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;
        this.encontrado = encontrado;
        this.raridade = raridade;
    }

    public void printTesouro(){
        System.out.println("========TESOURO=======");
        System.out.println("Nome do Tesouro: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println("Valor: $" + String.format("%.2f", valor));
        System.out.println("Raridade: " + raridade);
        System.out.println("Encontrado: " + (encontrado != null ? encontrado.getNome() : "Nao encontrado"));
        System.out.println("======================\n");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public MarEnum getEncontrado() {
        return encontrado;
    }
    public void setEncontrado(MarEnum encontrado) {
        this.encontrado = encontrado;
    }
    public String getRaridade() {
        return raridade;
    }
    public void setRaridade(String raridade) {
        this.raridade = raridade;
    }
    
}
