package br.eng.corsini.onepiece_en;

public class SeaMonster extends Being{
    private String type;
    private String color;
    private int teethNumber;

    // Constructor

    public SeaMonster(String name, int age, boolean alive, float height, Island birthplace, String type, String color,
            int teethNumber) {
        super(name, age, alive, height, birthplace);
        this.type = type;
        this.color = color;
        this.teethNumber = teethNumber;
    }

    @Override
    public void print(){
        System.out.println("====SEA MONSTER====");
        super.print();
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Number of teeth: " + teethNumber);
        System.out.println("===================\n");
    }

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
