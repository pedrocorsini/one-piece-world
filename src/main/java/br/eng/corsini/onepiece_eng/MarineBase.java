package br.eng.corsini.onepiece_eng;

import java.util.ArrayList;
import java.util.List;

public class MarineBase {
    private String name;
    private SeaEnum location;
    private boolean submersa;
    private List<Marine> marines = new ArrayList<Marine>();
    private Marine capitao;
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
    public boolean isSubmersa() {
        return submersa;
    }
    public void setSubmersa(boolean submersa) {
        this.submersa = submersa;
    }
    public List<Marine> getMarines() {
        return marines;
    }
    public void setMarines(List<Marine> marines) {
        this.marines = marines;
    }
    public Marine getCapitao() {
        return capitao;
    }
    public void setCapitao(Marine capitao) {
        this.capitao = capitao;
    }
    
}
