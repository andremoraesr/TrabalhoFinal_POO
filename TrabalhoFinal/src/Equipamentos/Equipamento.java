package Equipamentos;

public class Equipamento {
    int codID;
    String descricao;
    double diaria;
    boolean disponivel;

    public Equipamento (int I, String d, double day){
        this.codID = I;
        this.descricao = d;
        this.diaria = day;
        this.disponivel = true;
    }

    public int getCodID() {
        return codID;
    }
    public boolean isDisponivel() {
        return disponivel;
    }
    public void setDisponivel(boolean b) {
        this.disponivel = b;
    }

}
