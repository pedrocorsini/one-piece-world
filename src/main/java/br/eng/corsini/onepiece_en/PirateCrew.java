package br.eng.corsini.onepiece_en;

public class PirateCrew {
    private String name;
    private boolean destroyed;
    private java.util.List<Pirate> members = new java.util.ArrayList<Pirate>();
    public double totalBounty(double sum){
        sum = 0;
        for(Pirate p : members){
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
    public java.util.List<Pirate> getMembers() {
        return members;
    }
    public void setMembers(java.util.List<Pirate> members) {
        this.members = members;
    }
}
