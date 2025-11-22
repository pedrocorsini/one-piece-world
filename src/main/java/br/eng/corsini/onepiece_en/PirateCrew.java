package br.eng.corsini.onepiece_en;

import java.util.ArrayList;
import java.util.List;

public class PirateCrew {
    private String name;
    private boolean destroyed;
    private Pirate captain;
    private List<Pirate> crew = new ArrayList<>();

    // Constructor
    public PirateCrew(String name, boolean destroyed){
        this.name = name;
        this.destroyed = destroyed;
    }

    public void printCrew(){
        System.out.println("=========PIRATE CREW========");
        System.out.println("Name: " + name);
        System.out.println("Captain: " + (captain != null ? captain.getName() : "None"));
        System.out.println("Destroyed: " + destroyed);
        System.out.println("Crew:");
        for(Pirate p : crew){
            System.out.println( " - " + p.getName() );
        }
        double total = totalBounty();
        System.out.println("Total Bounty: $" + String.format("%.2f", total));
        System.out.println("============================\n");    
    }

    public double totalBounty(){
        double sum = 0;
        for(Pirate p : crew){
            sum+=p.getBounty();
        }
        return sum;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean isDestroyed() {
        return destroyed;
    }
    public void setDestroyed(boolean destroyed) {
        this.destroyed = destroyed;
    }
    public java.util.List<Pirate> getCrew() {
        return crew;
    }
    public void setCrew(java.util.List<Pirate> crew) {
        this.crew = crew;
    }

    public Pirate getCaptain() {
        return captain;
    }

    public void setCaptain(Pirate captain) {
        this.captain = captain;
    }
    
}
