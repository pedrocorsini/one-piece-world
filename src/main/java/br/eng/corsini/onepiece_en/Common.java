package br.eng.corsini.onepiece_en;

public class Common implements State {
    private static int trickery = 100;
    @Override
    public void transition(Pirate p) {
        if(p.getBounty() > 2999999999d){
            p.setState(new Emperor());
        }        
    }
    public static int getTrickery() {
        return trickery;
    }
}
