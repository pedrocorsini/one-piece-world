package br.eng.corsini.onepiece_en;

public class Pirate extends Being{
    private double bounty;
    private Ship ship;
    private String title;
    private PirateCrew crew;
    private String function;
    private State state = new Common();

    public Pirate(String name, int age, boolean alive, float height, Island birthplace, 
        Ship ship, String title, PirateCrew crew, String function) {
        super(name, age, alive, height, birthplace);
        this.ship = ship;
        this.title = title;
        this.crew = crew;
        this.function = function;
    }

    @Override
    public void print(){
        System.out.println("========PIRATE========");
        super.print();
        System.out.println("Bounty: $" + String.format("%.2f", getBounty()));
        System.out.println("Ship: " + (ship != null ? ship.getName() : "Does not have"));
        System.out.println("Title: " + title);
        System.out.println("Pirate Crew: " + (crew!=null ? crew.getName() : "None"));
        System.out.println("Function: " + function);
        if(getState() instanceof Emperor){
            System.out.println("State: EMPEROR");
        }else{
            System.out.println("State: COMMON");
        }
        if(getState() instanceof Emperor){
            System.out.println("Fame: " + Emperor.getFame());
        }else if(getState() instanceof Common){
            System.out.println("Cunning: " + Common.getTrickery());
        }
        System.out.println("======================\n");
    }


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
    public String getFunction() {
        return function;
    }
    public void setFunction(String function) {
        this.function = function;
    }

}
