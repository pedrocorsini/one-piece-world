package br.eng.corsini.onepiece_ptbr;

public class HomemPeixe extends Ser{
    private String tipo;
    private float velocidadeAgua;
    public float dobrarVelocidade(HomemPeixe peixe){
        if(peixe.getTamanho() > 2.0f)
            return velocidadeAgua * 2.0f;
        return velocidadeAgua;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public float getVelocidadeAgua() {
        return velocidadeAgua;
    }
    public void setVelocidadeAgua(float velocidadeAgua) {
        this.velocidadeAgua = velocidadeAgua;
    }
    
}
