package br.eng.corsini.onepiece_en;

public class Mermaid extends Being{
    private String tailColor;
    private boolean talkToSeaMonster;

    // Constructor

    public Mermaid(String name, int age, boolean alive, float height, Island birthplace, String tailColor, boolean talkToSeaMonster) {
        super(name, age, alive, height, birthplace);
        this.tailColor = tailColor;
        this.talkToSeaMonster = talkToSeaMonster;
    }

    @Override
    public void print(){
        System.out.println("=======MERMAID=======");
        super.print();
        System.out.println("Tail Color: " + tailColor);
        System.out.println("Can talk to Sea Monsters? " + (talkToSeaMonster ? "Yes" : "No"));
        System.out.println("=====================\n");
    }

    public String getTailColor() {
        return tailColor;
    }
    public void setTailColor(String tailColor) {
        this.tailColor = tailColor;
    }
    public boolean isTalkToSeaMonster() {
        return talkToSeaMonster;
    }
    public void setTalkToSeaMonster(boolean talkToSeaMonster) {
        this.talkToSeaMonster = talkToSeaMonster;
    }

}
