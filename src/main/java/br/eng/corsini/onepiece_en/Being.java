package br.eng.corsini.onepiece_en;

import java.util.ArrayList;
import java.util.List;

public abstract class Being {
    private String name;
    private int age;
    private boolean alive;
    private float height;
    private List<Being> children = new ArrayList<Being>();
    private Island birthplace;
    private DevilFruit fruit;
    private HakiEnum haki;
    private List<SecretTreasure> treasures = new ArrayList<SecretTreasure>();
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public boolean isAlive() {
        return alive;
    }
    public void setAlive(boolean alive) {
        this.alive = alive;
    }
    public float getHeight() {
        return height;
    }
    public void setHeight(float height) {
        this.height = height;
    }
    public List<Being> getChildren() {
        return children;
    }
    public void setChildren(List<Being> children) {
        this.children = children;
    }
    public Island getBirthplace() {
        return birthplace;
    }
    public void setBirthplace(Island birthplace) {
        this.birthplace = birthplace;
    }
    public DevilFruit getFruit() {
        return fruit;
    }
    public void setFruit(DevilFruit fruit) {
        this.fruit = fruit;
    }
    public HakiEnum getHaki() {
        return haki;
    }
    public void setHaki(HakiEnum haki) {
        this.haki = haki;
    }
    public List<SecretTreasure> getTreasures() {
        return treasures;
    }
    public void setTreasures(List<SecretTreasure> treasures) {
        this.treasures = treasures;
    }    
}
