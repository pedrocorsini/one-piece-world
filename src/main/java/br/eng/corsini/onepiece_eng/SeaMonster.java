package br.eng.corsini.onepiece_eng;

public class SeaMonster extends Being{
    private String type;
    private String color;
    private int teethNumber;
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getNumberOfTeeth() {
        return teethNumber;
    }
    public void setNumberOfTeeth(int numberOfTeeth) {
        this.teethNumber = numberOfTeeth;
    }

}
