package Equipamentos;

public class Som extends Equipamento{
    double potencia;
    int quantCanais;

    public Som(int I, String d, double day, double W, int c) {
        super(I, d, day);
        this.potencia = W;
        this.quantCanais = c;
    }

    @Override
    public String toString() {
        return "Categoria: Som" + " || Produto: " + descricao + " || Código: " + codID + " || Valor da diária:" + diaria + " || Disponível: " + disponivel
                + " || Canais de áudio: " + quantCanais + " || Potência: " + potencia;
    }
}
