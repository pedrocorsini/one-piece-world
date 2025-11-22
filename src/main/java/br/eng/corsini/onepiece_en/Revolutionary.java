package br.eng.corsini.onepiece_en;

public class Revolutionary extends Being{
    private String threatLevel;
    private String secret;
    private double bounty;
    private String role;

    // Constructor
    public Revolutionary(String name, int age, boolean alive, float height, Island birthplace, String threatLevel,
            String secret, double bounty, String role) {
        super(name, age, alive, height, birthplace);
        this.threatLevel = threatLevel;
        this.secret = secret;
        this.bounty = bounty;
        this.role = role;
    }

    @Override
    public void print(){
        System.out.println("=====REVOLUTIONARY=====");
        super.print();
        System.out.println("Threat Level: " + threatLevel);
        System.out.println("Secret: " + secret);
        System.out.println("Bounty: $" + String.format("%.2f", bounty));
        System.out.println("Role: " + role);
        System.out.println("======================\n");
    }

    public String getThreatLevel() {
        return threatLevel;
    }

    public void setThreatLevel(String threatLevel) {
        this.threatLevel = threatLevel;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public double getBounty() {
        return bounty;
    }

    public void setBounty(double bounty) {
        this.bounty = bounty;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    
}
