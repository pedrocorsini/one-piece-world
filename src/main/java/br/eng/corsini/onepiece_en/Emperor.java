package br.eng.corsini.onepiece_en;

public class Emperor implements State {
    private static int fame = 100;
    @Override
    public void transition(Pirate p) {
        if(p.getBounty() <= 2999999999d){
            p.setState(new Common());
        }   
    }
    public static int getFame() {
        return fame;
    }
}
