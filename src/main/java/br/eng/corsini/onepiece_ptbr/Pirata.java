package br.eng.corsini.onepiece_ptbr;

public class Pirata extends Ser{
    private double recompensa;
    private Estado estado = new Comum();
    public void avaliar(){
        estado.transicao(this);
    }
    public double getRecompensa() {
        return recompensa;
    }
    public void setRecompensa(float recompensa) {
        this.recompensa = recompensa;
        avaliar();
    }
    public Estado getEstado() {
        return estado;
    }
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
