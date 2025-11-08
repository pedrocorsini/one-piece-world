package br.eng.corsini.onepiece_en;

public class Pirate extends Being{
    private double bounty;
    private Ship ship;
    private String title;
    private PirateCrew crew;
    private State state = new Common();
    public double multiplyBounty(Pirate p, double v){
        return p.getBounty()*v;
    }
    public void evaluate(){
        state.transition(this);
    }
    public double getBounty() {
        return bounty;
    }
    public void setBounty(double bounty) {
        this.bounty = bounty;
        evaluate();
    }
    public Ship getShip() {
        return ship;
    }
    public void setShip(Ship ship) {
        this.ship = ship;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public PirateCrew getCrew() {
        return crew;
    }
    public void setCrew(PirateCrew crew) {
        this.crew = crew;
    }
    public State getState() {
        return state;
    }
    public void setState(State state) {
        this.state = state;
    }

}
