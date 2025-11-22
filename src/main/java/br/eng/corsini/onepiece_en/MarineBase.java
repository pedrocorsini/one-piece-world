package br.eng.corsini.onepiece_en;

import java.util.ArrayList;
import java.util.List;

public class MarineBase {
    private String name;
    private SeaEnum location;
    private boolean submerged;
    private List<Marine> marines = new ArrayList<>();
    private Marine captain;

    // Constructor

    public MarineBase(String name, SeaEnum location, boolean submerged, Marine captain){
        this.name = name;
        this.location = location;
        this.submerged = submerged;
        this.captain = captain;
    }

    public void printBase(){
        System.out.println("=========MARINE BASE=========");
        System.out.println("Base: " + name);
        System.out.println("Location: " + location.getName());
        System.out.println("Captain: " + captain.getName());
        System.out.println("Submerged: " + (submerged ? "Yes" : "No"));
        System.out.println("Marines: ");
        for(Marine m : marines){
            System.out.println(" - " + m.getName());
        }
        System.out.println("=============================\n");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SeaEnum getLocation() {
        return location;
    }

    public void setLocation(SeaEnum location) {
        this.location = location;
    }

    public boolean isSubmerged() {
        return submerged;
    }

    public void setSubmerged(boolean submerged) {
        this.submerged = submerged;
    }

    public List<Marine> getMarines() {
        return marines;
    }

    public void setMarines(List<Marine> marines) {
        this.marines = marines;
    }

    public Marine getCaptain() {
        return captain;
    }

    public void setCaptain(Marine captain) {
        this.captain = captain;
    }

    
    
}
