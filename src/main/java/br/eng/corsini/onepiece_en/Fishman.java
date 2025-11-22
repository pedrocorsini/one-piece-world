package br.eng.corsini.onepiece_en;

public class Fishman extends Being {
    private String type;
    private float waterSpeed;

    // Constructor

    public Fishman(String name, int age, boolean alive, float height, Island birthplace, String type, float waterSpeed) {
        super(name, age, alive, height, birthplace);
        this.type = type;
        this.waterSpeed = waterSpeed;
    }

    @Override
    public void print(){
        System.out.println("========FISHMAN========");
        super.print();
        System.out.println("Type: " + type);
        System.out.println("Water Speed: " + waterSpeed + "m/s");
        System.out.println("======================\n");
    }

    public void doubleSpeed(Fishman fishman) {
        if (fishman.getHeight() > 2.0f)
            fishman.setWaterSpeed(fishman.getWaterSpeed() * 2);
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public float getWaterSpeed() {
        return waterSpeed;
    }
    public void setWaterSpeed(float waterSpeed) {
        this.waterSpeed = waterSpeed;
    }
}
