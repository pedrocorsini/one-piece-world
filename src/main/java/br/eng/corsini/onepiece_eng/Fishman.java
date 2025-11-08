package br.eng.corsini.onepiece_eng;

public class Fishman extends Being {
    private String type;
    private float waterSpeed;

    public float doubleSpeed(Fishman fishman) {
        if (fishman.getHeight() > 2.0f)
            return waterSpeed * 2.0f;
        return waterSpeed;
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
