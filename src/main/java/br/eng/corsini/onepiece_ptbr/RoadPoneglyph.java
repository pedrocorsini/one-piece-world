package br.eng.corsini.onepiece_ptbr;

public class RoadPoneglyph extends Poneglyph{
    private String coordenadaMostrada;

    // Construtor

    public RoadPoneglyph(String mensagem, boolean submerso, Ilha ilha, String coordenadaMostrada) {
        super(mensagem, submerso, ilha);
        this.coordenadaMostrada = coordenadaMostrada;
    }

    public void localizarOnePiece(RoadPoneglyph r){
        if(r.getMensagem() == "Voce achou a verdadeira coordenada do OnePiece!"){
            r.setCoordenadaMostrada("1999 N, 1997 L");
        }
    }
    
    public String getCoordenadaMostrada() {
        return coordenadaMostrada;
    }
    public void setCoordenadaMostrada(String coordenadaMostrada) {
        this.coordenadaMostrada = coordenadaMostrada;
    }

}
