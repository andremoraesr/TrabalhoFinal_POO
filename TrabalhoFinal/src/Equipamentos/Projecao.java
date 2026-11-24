package Equipamentos;

public class Projecao
        extends Equipamento
        implements Locacao
{
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

    @Override
    public String toString() {
        return super.toString()
                + "\nResolução: " + resolucao + " || Lúmens: " + lumens;
    }

    public double valorLocacao(int dia)
    {
        if (dia >= 5)
            return (this.getDiaria() * dia * 0.9);

        return (this.getDiaria() * dia);
    }

}
