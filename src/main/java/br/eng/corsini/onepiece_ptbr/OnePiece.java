package br.eng.corsini.onepiece_ptbr;

public class OnePiece {
    private String descricao;
    private String localizacao;
    public String getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
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
