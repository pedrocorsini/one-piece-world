package br.eng.corsini.onepiece_ptbr;

public class MonstroMar extends Ser{
    private String tipo;
    private String cor;
    private int numeroDentes;
    
    // Construtor

    public MonstroMar(String nome, int idade, boolean vivo, float altura, Ilha nasceu, String tipo, String cor,
            int numeroDentes) {
        super(nome, idade, vivo, altura, nasceu);
        this.tipo = tipo;
        this.cor = cor;
        this.numeroDentes = numeroDentes;
    }

    public void print(){
        System.out.println("====MONSTRO DO MAR====");
        super.print();
        System.out.println("Tipo: " + tipo);
        System.out.println("Cor: " + cor);
        System.out.println("Numero de dentes: " + numeroDentes);
        System.out.println("======================\n");
    }
    
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getNumeroDentes() {
        return numeroDentes;
    }
    public void setNumeroDentes(int numeroDentes) {
        this.numeroDentes = numeroDentes;
    }

}
