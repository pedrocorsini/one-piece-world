package br.eng.corsini.onepiece_ptbr;

public class Pirata extends Ser{
    private double recompensa;
    private Embarcacao embarcacao;
    private String titulo;
    private TripulacaoPirata tripulacao;
    private String funcao;
    private Estado estado = new Comum();

    public Pirata(String nome, int idade, boolean vivo, float altura, Ilha nasceu, 
        Embarcacao embarcacao, String titulo, TripulacaoPirata tripulacao, String funcao) {
        super(nome, idade, vivo, altura, nasceu);
        this.embarcacao = embarcacao;
        this.titulo = titulo;
        this.tripulacao = tripulacao;
        this.funcao = funcao;
    }

    @Override
    public void print(){
        System.out.println("========PIRATA========");
        super.print();
        System.out.println("Recompensa: $" + String.format("%.2f", getRecompensa()));
        System.out.println("Embarcacao: " + (embarcacao != null ? embarcacao.getNome() : "Nao possui"));
        System.out.println("Titulo: " + titulo);
        System.out.println("Tripulacao Pirata: " + (tripulacao!=null ? tripulacao.getNome() : "Nenhuma"));
        System.out.println("Funcao: " + funcao);
        if(getEstado() instanceof Imperador){
            System.out.println("Estado: IMPERADOR");
        }else{
            System.out.println("Estado: COMUM");
        }
        if(getEstado() instanceof Imperador){
            System.out.println("Fama: " + Imperador.getFama());
        }else if(getEstado() instanceof Comum){
            System.out.println("Malandragem: " + Comum.getMalandragem());
        }
        System.out.println("======================\n");
    }

    public double multiplicarRecompensa(Pirata p, double v){
        return p.getRecompensa()*v;
    }
    public void avaliar(){
        estado.transicao(this);
    }
    public TripulacaoPirata getTripulacao() {
        return tripulacao;
    }
    public void setTripulacao(TripulacaoPirata tripulacao) {
        this.tripulacao = tripulacao;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public double getRecompensa() {
        return recompensa;
    }
    public void setRecompensa(double recompensa) {
        this.recompensa = recompensa;
        avaliar();
    }
    public Embarcacao getEmbarcacao() {
        return embarcacao;
    }
    public void setEmbarcacao(Embarcacao embarcacao) {
        this.embarcacao = embarcacao;
    }
    public Estado getEstado() {
        return estado;
    }
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    public String getFuncao() {
        return funcao;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
