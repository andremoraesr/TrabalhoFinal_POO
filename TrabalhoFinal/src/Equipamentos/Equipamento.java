package Equipamentos;

public class Equipamento implements Locavel {

    private int codID;
    private String descricao;
    private double diaria;
    private boolean disponivel;


    public Equipamento (int I, String d, double day){
        this.codID = I;
        this.descricao = d;
        this.diaria = day;
        this.disponivel = true;
    }


//MÉTODOS
    //getters
    public String getDescricao() { return this.descricao; }
    public double getDiaria() { return this.diaria; }
    public int getCodID() { return this.codID; }
    public boolean isDisponivel() { return this.disponivel; }

    //setters
    public void setDisponivel(boolean b) { this.disponivel = b; }

    //base
    public double valorLocacao(int dia)
    {
        return this.diaria * dia;
    }

    @Override
    public String toString() {
        return "\nProduto: " + this.descricao + " || Código: " + this.codID
                + "\nValor da diária: R$" + this.diaria + " || Disponível: " + this.disponivel;

    }

}
