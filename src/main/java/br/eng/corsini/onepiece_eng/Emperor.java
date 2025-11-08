package br.eng.corsini.onepiece_eng;


public class Emperor implements State {
    @Override
    public void transition(Pirate p) {
        if(p.getBounty() <= 1000000000){
            p.setState(new Common());
        }   
    }

}
