package br.eng.corsini.onepiece_ptbr;

public class Pirata extends Ser{
    private double recompensa;
    private Embarcacao embarcacao;
    private String titulo;
    private TripulacaoPirata tripulacao;
    private String funcao;
    private Estado estado = new Comum();

    public Pirata(String nome, int idade, boolean vivo, float altura, Ilha nasceu, double recompensa, 
        Embarcacao embarcacao, String titulo, TripulacaoPirata tripulacao, String funcao) {
        super(nome, idade, vivo, altura, nasceu);
        this.recompensa = recompensa;
        this.embarcacao = embarcacao;
        this.titulo = titulo;
        this.tripulacao = tripulacao;
        this.funcao = funcao;
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
