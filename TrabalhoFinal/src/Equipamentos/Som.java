package Equipamentos;

public class Som
        extends Equipamento
        implements Locavel
{
    double potencia;
    int quantCanais;

    public Som(int I, String d, double day, double W, int c) {
        super(I, d, day);
        this.potencia = W;
        this.quantCanais = c;
    }


//MÉTODOS
    //getters
    public double getPotencia() { return this.potencia; }
    public double getCanais() { return this.quantCanais; }

    @Override
    public String toString() {
        return super.toString()
                + "\nCanais de áudio: " + quantCanais + " || Potência: " + potencia;
    }

    public double valorLocacao(int dia)
    {
        return (this.getDiaria() * dia);
    }
}
