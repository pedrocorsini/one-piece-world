package br.eng.corsini.onepiece_ptbr;

public class Revolucionario extends Ser{
    private String nivelAmeaca;
    private String segredo;
    private double recompensa;
    private String cargo;

    // Construtor
    public Revolucionario(String nome, int idade, boolean vivo, float altura, Ilha nasceu, String nivelAmeaca,
            String segredo, double recompensa, String cargo) {
        super(nome, idade, vivo, altura, nasceu);
        this.nivelAmeaca = nivelAmeaca;
        this.segredo = segredo;
        this.recompensa = recompensa;
        this.cargo = cargo;
    }

    @Override
    public void print(){
        System.out.println("====REVOLUCIONARIO====");
        super.print();
        System.out.println("Nivel de Ameaca: " + nivelAmeaca);
        System.out.println("Segredo: " + segredo);
        System.out.println("Recompensa: $" + String.format("%.2f", recompensa));
        System.out.println("Cargo: " + cargo);
        System.out.println("======================\n");
    }

    public String getNivelAmeaca() {
        return nivelAmeaca;
    }
    public void setNivelAmeaca(String nivelAmeaca) {
        this.nivelAmeaca = nivelAmeaca;
    }
    public String getSegredo() {
        return segredo;
    }
    public void setSegredo(String segredo) {
        this.segredo = segredo;
    }
    public double getRecompensa() {
        return recompensa;
    }
    public void setRecompensa(double recompensa) {
        this.recompensa = recompensa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
}
