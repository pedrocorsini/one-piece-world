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
    private List<HakiEnum> hakis = new ArrayList<>();
    private List<SecretTreasure> treasures = new ArrayList<SecretTreasure>();
    private boolean canSwim;

    // Constructor

    public Being(String name, int age, boolean alive, float height, Island birthplace){
        this.name = name;
        this.age = age;
        this.alive = alive;
        this.height = height;
        this.birthplace = birthplace;
    }

    public void canSwim(){
        if(getFruit()==null){
            setCanSwim(true);
        }else{
            setCanSwim(false);
        }
    }

    public void print(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Is alive? " + (alive ? "Yes" : "No")); 
        System.out.println("Height: " + height + "m");
        System.out.println("Birthplace: " + (birthplace != null ? birthplace.getName() : "Unknown"));
        System.out.println("Devil Fruit: " + (fruit != null ? fruit.getName() : "None"));
        canSwim();
        System.out.println("Can swim: " + (canSwim ? "Yes" : "No"));
        
        if(getHakis() == null || getHakis().isEmpty()){
            System.out.println("Hakis: None");
        }else{
            System.out.println("Hakis: ");
            for(HakiEnum h : getHakis()){
                if(h==null){
                    System.out.println(" - null");
                }else{
                    System.out.println(" - " + h.getName());
                }               
            }
        }
        if(getChildren() == null || getChildren().isEmpty()){
            System.out.println("Children: None");
        }else{
            System.out.println("Children: ");
            for(Being c : getChildren()){
                if(c==null){
                    System.out.println(" - null");
                }else{
                    System.out.println(" - " + c.getName());
                }               
            }
        }
        if (getTreasures() == null || getTreasures().isEmpty()){
            System.out.println("Secret Treasures: None");
        }else{
            System.out.println("Secret Treasures: ");
            for(SecretTreasure t : getTreasures()){
                if(t==null){
                    System.out.println(" - null");
                }else{
                    System.out.println(" - " + t.getName());
                }               
            }
        }
    }

    public List<HakiEnum> getHakis() {
        return hakis;
    }
    public void setHakis(List<HakiEnum> hakis) {
        this.hakis = hakis;
    }
    public boolean isCanSwim() {
        return canSwim;
    }
    public void setCanSwim(boolean canSwim) {
        this.canSwim = canSwim;
    }
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
    public List<SecretTreasure> getTreasures() {
        return treasures;
    }
    public void setTreasures(List<SecretTreasure> treasures) {
        this.treasures = treasures;
    }    
}
