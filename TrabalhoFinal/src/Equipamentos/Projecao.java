package Equipamentos;

public class Projecao extends Equipamento{
    private String resolucao;
    private double lumens;

    public Projecao(int I, String d, double day, String r, double l) {
        super(I, d, day);
        this.resolucao = r;
        this.lumens = l;
    }

//MÉTODOS
    //getters
    public String getResolucao() { return this.resolucao; }
    public double getLumens() { return this.lumens; }
}
