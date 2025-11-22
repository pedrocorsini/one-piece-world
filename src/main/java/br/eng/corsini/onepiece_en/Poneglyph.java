package br.eng.corsini.onepiece_en;

public class Poneglyph {
    private String message;
    private boolean submerged;
    private Island island;
    private String displayedCoordinate;

    // Constructor
    public Poneglyph(String message, boolean submerged, Island island) {
        this.message = message;
        this.submerged = submerged;
        this.island = island;
    }

    public void locateOnePiece(Poneglyph pon){
        if(pon.getMessage() == "You have found the true coordinate of OnePiece!"){
            pon.setDisplayedCoordinate("1999 N, 1997 E");
            OnePiece.getInstance().setLocation(displayedCoordinate);
            System.out.println("Go get the One Piece!");
        }else{
            System.out.println("Keep searching!");
        }
    }

    public void printPon(){
        System.out.println("=======PONEGLYPH======");
        System.out.println("Message: " + message);
        System.out.println("Submerged: " + (submerged ? "Yes" : "No"));
        System.out.println("Island: " + (island != null ? island.getName() : "Unknown"));
        System.out.println("Coordinate: " + (displayedCoordinate != null ? displayedCoordinate : "None"));
        System.out.println("======================\n");
    }

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

    public String getDisplayedCoordinate() {
        return displayedCoordinate;
    }

    public void setDisplayedCoordinate(String displayedCoordinate) {
        this.displayedCoordinate = displayedCoordinate;
    }
}
