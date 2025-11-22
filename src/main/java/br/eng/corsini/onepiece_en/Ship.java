package br.eng.corsini.onepiece_en;

import java.util.ArrayList;
import java.util.List;

public class Ship {
    private String name;
    private String type;
    private String wood;
    private String flag;
    private List<Pirate> pirates = new ArrayList<Pirate>();
    private List<Marine> marines = new ArrayList<Marine>();
    private boolean destroyed;

    // Constructor
    public Ship(String name, String type, String wood, String flag, boolean destroyed) {
        this.name = name;
        this.type = type;
        this.wood = wood;
        this.flag = flag;
        this.destroyed = destroyed;
    }

    // Print
    public void printShip(){
        System.out.println("======SHIP======");
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Wood: " + wood);
        System.out.println("Flag: " + flag);
        System.out.println("Destroyed: " + (destroyed ? "Yes" : "No"));

        if(getPirates() == null || getPirates().isEmpty()){
            System.out.println("Marines: ");
            for(Marine m : getMarines()){
                System.out.println(" - " + m.getName());
            }
        }else{
            System.out.println("Pirates: ");
            for(Pirate p : getPirates()){
                System.out.println(" - " + p.getName());
            }
        }
        System.out.println("================\n");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getWood() {
        return wood;
    }
    public void setWood(String wood) {
        this.wood = wood;
    }
    public String getFlag() {
        return flag;
    }
    public void setFlag(String flag) {
        this.flag = flag;
    }
    public List<Pirate> getPirates() {
        return pirates;
    }
    public void setPirates(List<Pirate> pirates) {
        this.pirates = pirates;
    }
    public List<Marine> getMarines() {
        return marines;
    }
    public void setMarines(List<Marine> marines) {
        this.marines = marines;
    }
    public boolean isDestroyed() {
        return destroyed;
    }
    public void setDestroyed(boolean destroyed) {
        this.destroyed = destroyed;
    }
    
}
