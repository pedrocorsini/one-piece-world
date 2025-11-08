package br.eng.corsini.onepiece_eng;

public class OnePiece {
    private String description;
    private String location;
    private OnePiece(){} // private constructor
    private static OnePiece instance = new OnePiece();// reflective static attribute
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    } 
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public static OnePiece getInstance() {
        return instance;
    }// unique access by static method
}
