package br.eng.corsini.onepiece_ptbr;

import java.util.ArrayList;
import java.util.List;

public abstract class Ser {
    private String nome;
    private int idade;
    private boolean vivo;
    private float altura;
    private List<Ser> filhos = new ArrayList<Ser>();
    private Ilha nasceu;
    private FrutaDoDiabo fruta;
    private List<HakiEnum> hakis = new ArrayList<>();
    private List<TesouroSecreto> tesouros = new ArrayList<>();
    private boolean podeNadar;

    // Construtor

    public Ser(String nome, int idade, boolean vivo, float altura, Ilha nasceu){
        this.nome = nome;
        this.idade = idade;
        this.vivo = vivo;
        this.altura = altura;
        this.nasceu = nasceu;
    }

    public void podeNadar(){
        if(getFruta()==null){
            setPodeNadar(true);
        }else{
            setPodeNadar(false);
        }
    }

    public void print(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Esta vivo? " + (vivo ? "Sim" : "Nao")); 
        System.out.println("Altura: " + altura + "m");
        System.out.println("Ilha de nascimento: " + (nasceu != null ? nasceu.getNome() : "Desconhecida"));
        System.out.println("Fruta do diabo: " + (fruta != null ? fruta.getNome() : "Nenhuma"));
        podeNadar();
        System.out.println("Pode nadar: " + (podeNadar ? "Sim" : "Nao"));
        
        if(getHakis() == null || getHakis().isEmpty()){
            System.out.println("Hakis: Nenhum");
        }else{
            System.out.println("Hakis: ");
            for(HakiEnum h : getHakis()){
                if(h==null){
                    System.out.println(" - null");
                }else{
                    System.out.println(" - " + h.getNome());
                }               
            }
        }
        if(getFilhos() == null || getFilhos().isEmpty()){
            System.out.println("Filhos: Nenhum");
        }else{
            System.out.println("Filhos:");
            for(Ser filho : getFilhos()){
                if(filho==null){
                    System.out.println(" - null");
                }else{
                    System.out.println(" - " + filho.getNome());
                }
            }
        }
        if(getTesouros() == null || getTesouros().isEmpty()){
            System.out.println("Tesouros Secretos: Nenhum");
        }else{
            System.out.println("Tesouros Secretos: ");
            for(TesouroSecreto t : getTesouros()){
                if(t==null){
                    System.out.println(" - null");
                }else{
                    System.out.println(" - " + t.getNome());
                }
            }
        }
    }



    public List<TesouroSecreto> getTesouros() {
        return tesouros;
    }
    public void setTesouros(List<TesouroSecreto> tesouros) {
        this.tesouros = tesouros;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public boolean isVivo() {
        return vivo;
    }
    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
    public List<Ser> getFilhos() {
        return filhos;
    }
    public void setFilhos(List<Ser> filhos) {
        this.filhos = filhos;
    }
    public Ilha getNasceu() {
        return nasceu;
    }
    public void setNasceu(Ilha nasceu) {
        this.nasceu = nasceu;
    }
    public FrutaDoDiabo getFruta() {
        return fruta;
    }
    public void setFruta(FrutaDoDiabo fruta) {
        this.fruta = fruta;
    }

    public List<HakiEnum> getHakis() {
        return hakis;
    }

    public void setHakis(List<HakiEnum> hakis) {
        this.hakis = hakis;
    }

    public boolean isPodeNadar() {
        return podeNadar;
    }

    public void setPodeNadar(boolean podeNadar) {
        this.podeNadar = podeNadar;
    }
}
