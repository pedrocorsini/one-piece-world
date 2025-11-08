package br.eng.corsini.onepiece_eng;

import java.util.ArrayList;
import java.util.List;

public class Ship {
    private String noae;
    private String type;
    private String wood;
    private String flag;
    private List<Pirate> pirates = new ArrayList<Pirate>();
    private List<Marine> marines = new ArrayList<Marine>();
    private boolean destroyed;
    public String getNoae() {
        return noae;
    }
    public void setNoae(String noae) {
        this.noae = noae;
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
