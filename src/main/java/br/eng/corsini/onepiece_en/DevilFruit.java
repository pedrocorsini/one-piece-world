package br.eng.corsini.onepiece_en;

public class DevilFruit {
    private String name;
    private String power;
    private String type;

    // Constructor

    public DevilFruit(String name, String power, String type){
        this.name = name;
        this.power = power;
        this.type = type;
    }

    public void printFruit(){
        System.out.println("=========DEVIL FRUIT========");
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Power: " + power);
        System.out.println("============================\n");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPower() {
        return power;
    }
    public void setPower(String power) {
        this.power = power;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

}