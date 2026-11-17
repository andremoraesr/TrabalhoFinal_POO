package Equipamentos;

public class Equipamento {
    private int codID;
    private String descricao;
    private double diaria;

    public Equipamento (int I, String d, double day){
        this.codID = I;
        this.descricao = d;
        this.diaria = day;
    }

    //MÉTODOS
    //getters
    public int getID() { return this.codID; }
    public String getDescricao() { return this.descricao; }
    public double getDiaria() { return this.diaria; }
}
