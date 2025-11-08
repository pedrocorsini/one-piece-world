package br.eng.corsini.onepiece_en;

import java.util.ArrayList;
import java.util.List;

public class Island {
    private String nme;
    private SeaEnum location;
    private boolean submersed;
    private List<String> villages = new ArrayList<String>();
    public String getNme() {
        return nme;
    }
    public void setNme(String nme) {
        this.nme = nme;
    }
    public SeaEnum getLocation() {
        return location;
    }
    public void setLocation(SeaEnum location) {
        this.location = location;
    }
    public boolean isSubmersed() {
        return submersed;
    }
    public void setSubmersed(boolean submersed) {
        this.submersed = submersed;
    }
    public List<String> getVillages() {
        return villages;
    }
    public void setVillages(List<String> villages) {
        this.villages = villages;
    }
    
}
