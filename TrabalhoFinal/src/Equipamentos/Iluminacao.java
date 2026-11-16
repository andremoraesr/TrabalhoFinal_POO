package Equipamentos;

public class Iluminacao extends Equipamento{
    String tipoIlumina;
    double potencia;

    public Iluminacao(int I, String d, double day, String t, double W) {
        super(I, d, day);
        this.tipoIlumina = t;
        this.potencia = W;
    }

    @Override
    public String toString() {
        return "Produto: " + descricao + " || Código: " + codID + " || Valor da diária:" + diaria + " || Disponível: " + disponivel
                + " || Tipo de iluminação: " + tipoIlumina + " || Potência: " + potencia;
    }
}
