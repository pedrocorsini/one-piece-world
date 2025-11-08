package br.eng.corsini.onepiece_en;

public class Common implements State {
    @Override
    public void transition(Pirate p) {
        if(p.getBounty() > 1000000000){
            p.setState(new Emperor());
        }        
    }

}
