package Equipamentos;

public class Iluminacao
        extends Equipamento
        implements Locavel
{
    private String tipoIlumina;
    private double potencia;

    public Iluminacao(int I, String d, double day, String t, double W) {
        super(I, d, day);
        this.tipoIlumina = t;
        this.potencia = W;
    }

//MÉTODOS

    //getter
    public String getIluminacao() { return this.tipoIlumina; }
    public double getPotencia() { return this.potencia; }

    @Override
    public String toString() {
        return super.toString()
                + "\nTipo de iluminação: " + tipoIlumina + " || Potência: " + potencia;
    }

    public double valorLocacao(int dia)
    {
        return (this.getDiaria() * dia * 1.1);
    }

}
