package br.eng.corsini.onepiece_ptbr;

public class Poneglyph {
    private String tipo;
    private String mensagem;
    private boolean submerso;
    private Ilha ilha;
    private String coordenadaMostrada;

    // Construtor

    public Poneglyph(String tipo, String mensagem, boolean submerso, Ilha ilha) {
        this.tipo = tipo;
        this.mensagem = mensagem;
        this.submerso = submerso;
        this.ilha = ilha;
    }

    public void localizarOnePiece(Poneglyph pon){
        if(pon.getMensagem() == "Voce achou a verdadeira coordenada do OnePiece!"){
            pon.setCoordenadaMostrada("1999 N, 1997 L - Laugh Tale");
            OnePiece.getInstancia().setLocalizacao(coordenadaMostrada);
            System.out.println("Va buscar o One Piece!");
        }else{
            System.out.println("Procure mais!");
        }
    }

    public void printPon(){
        System.out.println("=======PONEGLYPH======");
        System.out.println("Tipo: " + tipo);
        System.out.println("Mensagem: " + mensagem);
        System.out.println("Submerso: " + (submerso ? "Sim" : "Nao"));
        System.out.println("Ilha: " + (ilha != null ? ilha.getNome() : "Desconhecida"));
        System.out.println("Coordenada: " + (coordenadaMostrada != null ? coordenadaMostrada : "Nenhuma"));
        System.out.println("======================\n");
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
    public String getCoordenadaMostrada() {
        return coordenadaMostrada;
    }

    public void setCoordenadaMostrada(String coordenadaMostrada) {
        this.coordenadaMostrada = coordenadaMostrada;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
