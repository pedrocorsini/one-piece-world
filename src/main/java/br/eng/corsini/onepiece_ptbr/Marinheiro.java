package br.eng.corsini.onepiece_ptbr;

public class Marinheiro extends Ser{
    private String patente;
    private int piratasDerrotados;
    private String habilidadeEspecial;
    private Embarcacao embarcacao;
    private String titulo;

    // Construtor

    public Marinheiro(String nome, int idade, boolean vivo, float altura, Ilha nasceu, String patente,
            int piratasDerrotados, String habilidadeEspecial, Embarcacao embarcacao, String titulo) {
        super(nome, idade, vivo, altura, nasceu);
        this.patente = patente;
        this.piratasDerrotados = piratasDerrotados;
        this.habilidadeEspecial = habilidadeEspecial;
        this.embarcacao = embarcacao;
        this.titulo = titulo;
    }

    public Embarcacao getEmbarcacao() {
        return embarcacao;
    }
    public void setEmbarcacao(Embarcacao embarcacao) {
        this.embarcacao = embarcacao;
    }
    public String getPatente() {
        return patente;
    }
    public void setPatente(String patente) {
        this.patente = patente;
    }
    public int getPiratasDerrotados() {
        return piratasDerrotados;
    }
    public void setPiratasDerrotados(int piratasDerrotados) {
        this.piratasDerrotados = piratasDerrotados;
    }
    public String getHabilidadeEspecial() {
        return habilidadeEspecial;
    }
    public void setHabilidadeEspecial(String habilidadeEspecial) {
        this.habilidadeEspecial = habilidadeEspecial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
