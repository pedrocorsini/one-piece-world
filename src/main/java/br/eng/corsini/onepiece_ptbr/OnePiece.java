package br.eng.corsini.onepiece_ptbr;

public class OnePiece {
    private String descricao;
    private OnePiece(){} //construtor privado
    private static OnePiece instancia = new OnePiece();//atributo reflexivo estatico 
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public static OnePiece getInstancia() {
        return instancia;
    }//acesso univo por metodo estatico
}
