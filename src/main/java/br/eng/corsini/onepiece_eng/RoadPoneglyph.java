package br.eng.corsini.onepiece_eng;

public class RoadPoneglyph extends Poneglyph{
    private String displayedCoordinate;
    public void locateOnePiece(RoadPoneglyph r){
        if(r.getMessage() == "You found the true coordinate of OnePiece!"){
            r.setDisplayedCoordinate("1999 N, 1997 W");
        }
    }
    public String getDisplayedCoordinate() {
        return displayedCoordinate;
    }
    public void setDisplayedCoordinate(String displayedCoordinate) {
        this.displayedCoordinate = displayedCoordinate;
    }
}
