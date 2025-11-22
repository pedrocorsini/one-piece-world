package br.eng.corsini.onepiece_en;

import java.util.ArrayList;
import java.util.List;

public class Island {
    private String name;
    private SeaEnum location;
    private boolean submerged;
    private List<String> villages = new ArrayList<String>();
    private Being governor;

    // Constructor

    public Island(String name, SeaEnum location, boolean submersed){
        this.name = name;
        this.location = location;
        this.submerged = submersed;
    }

    public void printInfo(){
        System.out.println("=========ISLAND=========");
        System.out.println("Island Name: " + name);
        System.out.println("Location: " + location.getName());
        System.out.println("Governor: " + (governor!=null ? governor.getName() : "None"));
        System.out.println("Submerged: " + (submerged ? "Yes" : "No")); 
        if(getVillages() == null || getVillages().isEmpty()){
            System.out.println("Villages/Cities/Kingdoms: None");
        }else{
            System.out.println("Villages/Cities/Kingdoms:");
            for(String village : getVillages()){
                System.out.println(" - " + village);
            }
        }
        System.out.println("=======================\n");
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
    public void setSubmerged(boolean submersed) {
        this.submerged = submersed;
    }
    public List<String> getVillages() {
        return villages;
    }
    public void setVillages(List<String> villages) {
        this.villages = villages;
    }

    public Being getGovernor() {
        return governor;
    }

    public void setGovernor(Being governor) {
        this.governor = governor;
    }
    
}
