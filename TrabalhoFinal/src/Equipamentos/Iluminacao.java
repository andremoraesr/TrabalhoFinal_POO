package Equipamentos;

public class Iluminacao extends Equipamento{
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
}
