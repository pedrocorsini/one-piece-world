package br.eng.corsini.onepiece_ptbr;

public class Sereia extends Ser{
    private String corCauda;
    private boolean falarMonstroMar;

    // Construtor

    public Sereia(String nome, int idade, boolean vivo, float altura, Ilha nasceu, String corCauda, boolean falarMonstroMar) {
        super(nome, idade, vivo, altura, nasceu);
        this.corCauda = corCauda;
        this.falarMonstroMar = falarMonstroMar;
    }

    @Override
    public void print(){
        System.out.println("========SEREIA========");
        super.print();
        System.out.println("Cor da cauda: " + corCauda);
        System.out.println("Fala com monstros do mar? " + (falarMonstroMar ? "Sim" : "Nao"));
        System.out.println("======================\n");
    }

    public String getCorCauda() {
        return corCauda;
    }
    public void setCorCauda(String corCauda) {
        this.corCauda = corCauda;
    }
    public boolean isFalarMonstroMar() {
        return falarMonstroMar;
    }
    public void setFalarMonstroMar(boolean falarMonstroMar) {
        this.falarMonstroMar = falarMonstroMar;
    }
    
}
