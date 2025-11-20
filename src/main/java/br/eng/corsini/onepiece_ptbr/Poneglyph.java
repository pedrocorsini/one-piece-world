package br.eng.corsini.onepiece_ptbr;

public class Poneglyph {
    private String mensagem;
    private boolean submerso;
    private Ilha ilha;

    // Construtor

    public Poneglyph(String mensagem, boolean submerso, Ilha ilha) {
        this.mensagem = mensagem;
        this.submerso = submerso;
        this.ilha = ilha;
    }

    public String getMensagem() {
        return mensagem;
    }
    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    public boolean isSubmerso() {
        return submerso;
    }
    public void setSubmerso(boolean submerso) {
        this.submerso = submerso;
    }
    public Ilha getIlha() {
        return ilha;
    }
    public void setIlha(Ilha ilha) {
        this.ilha = ilha;
    }
}
