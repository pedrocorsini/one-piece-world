package br.eng.corsini.onepiece_eng;

public class Poneglyph {
    private String message;
    private boolean submerged;
    private Island island;
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public boolean isSubmerged() {
        return submerged;
    }
    public void setSubmerged(boolean submerged) {
        this.submerged = submerged;
    }
    public Island getIsland() {
        return island;
    }
    public void setIsland(Island island) {
        this.island = island;
    }
}
