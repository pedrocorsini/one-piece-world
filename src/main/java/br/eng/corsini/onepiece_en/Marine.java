package br.eng.corsini.onepiece_en;

public class Marine extends Being {
    private String patent;
    private int defeatedPirates;
    private String specialAbility;
    private Ship ship;
    private String title;

    // Constructor
    
    public Marine(String name, int age, boolean alive, float height, Island birthplace, String patent, int defeatedPirates, String specialAbility,
                Ship ship, String title) {
        super(name, age, alive, height, birthplace);
        this.patent = patent;
        this.defeatedPirates = defeatedPirates;
        this.specialAbility = specialAbility;
        this.ship = ship;
        this.title = title;
    }
    
    @Override
    public void print(){
        System.out.println("========MARINE========");
        super.print();
        System.out.println("Patent: " + patent);
        System.out.println("Defeated Pirates: " + defeatedPirates);
        System.out.println("Special Ability: " + specialAbility);
        System.out.println("Ship: " + (ship != null ? ship.getName() : "None"));
        System.out.println("Title: " + title);
        System.out.println("======================\n");
    }

    public String getPatent() {
        return patent;
    }
    public void setPatent(String patent) {
        this.patent = patent;
    }
    public int getDefeatedPirates() {
        return defeatedPirates;
    }
    public void setDefeatedPirates(int defeatedPirates) {
        this.defeatedPirates = defeatedPirates;
    }
    public String getSpecialAbility() {
        return specialAbility;
    }
    public void setSpecialAbility(String specialAbility) {
        this.specialAbility = specialAbility;
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
    
}
