package br.eng.corsini;

import br.eng.corsini.onepiece_ptbr.*;

public class Test {
    public static void main(String[] args) {
        RoadPoneglyph r1 = new RoadPoneglyph();
        r1.setCoordenadaMostrada("SEGREDO");
        System.out.println(r1.getCoordenadaMostrada());
        r1.setMensagem("Voce achou a verdadeira coordenada do OnePiece!");
        r1.localizarOnePiece(r1);
        System.out.println(r1.getCoordenadaMostrada());
    }
}
