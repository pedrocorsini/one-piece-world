package br.eng.corsini.onepiece_ptbr;

public class TesouroSecreto {
    private String nome;
    private String tipo;
    private double valor;
    private MarEnum encontrado;
    private String raridade;
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
