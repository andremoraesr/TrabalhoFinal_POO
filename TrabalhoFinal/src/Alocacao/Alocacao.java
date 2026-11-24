package Alocacao;

import CadastraEquipamentos.ControleEquipamento;
import Equipamentos.*;
import CadastraCliente.*;
import java.util.List;

import java.util.ArrayList;

public class Alocacao {
    private Cliente client;
    private ArrayList<AlocEquip> equipAlocated;
    private String historico;

    //CONSTRUTOR
    public Alocacao(Cliente c)
    {
        this.client = c;
        this.equipAlocated = new ArrayList<AlocEquip>();
        this.historico = "";
    }

    //MÉTODOS
    //getter
    ArrayList<AlocEquip> getEquipAlocated() { return this.equipAlocated; }
    Cliente getClient() { return this.client; }
    String getHistorico() { return this.historico; }

    //base
    AlocEquip buscaAlocEquip(int id)
    {
        for (AlocEquip a : this.equipAlocated)
            if (a.getEquip().getCodID() == id)
                return a;

        return null;
    }

    void addHistorico(String s) { this.historico += s; }

    @Override
    public String toString()
    {
        String m = new String();

        if (this.equipAlocated.isEmpty())
            m += "VAZIO\n";
        else
            for (AlocEquip e : this.equipAlocated)
                m += e.toString();

        return "CLIENTE:\n" + this.client +
                "\nAPARELHOS ALOCADOS\n" + m;

    }

}
