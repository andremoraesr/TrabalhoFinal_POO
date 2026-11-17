package Equipamentos;

public class Equipamento {

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
    @Override
    public String toString() {
        return "Produto: " + this.descricao + " || Código: " + this.codID
                + "\nValor da diária:" + this.diaria + " || Disponível: " + this.disponivel;

    }

}
