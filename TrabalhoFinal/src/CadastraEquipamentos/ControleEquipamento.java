package CadastraEquipamentos;

import Equipamentos.*;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;

public class ControleEquipamento {
    private ArrayList<Equipamento> equipamento;

    //CONSTRUTORES
    public ControleEquipamento (ArrayList<Equipamento> q)
    {
        if (q != null)
            this.equipamento = q;
        else
            this.equipamento = new ArrayList<Equipamento>();
    }

    public ControleEquipamento() { this(null); }

//MÉTODOS
    //getters
    public ArrayList<Equipamento> getEquipamento() {
        return this.equipamento;
    }

    //base
    public void addEquipamento(Equipamento q) {
        this.equipamento.add(q);
    }

    public void listarEquipamentos()
    {
        System.out.println("EQUIPAMENTOS PARA ALOCAÇÃO");
        System.out.println("======================================================");
        for (Equipamento e : this.equipamento)
            System.out.println(e);
        System.out.println("======================================================");
    }

    public void equipDisponivel() {
        System.out.println("EQUIPAMENTOS DISPONÍVEIS PARA ALOCAÇÃO");
        System.out.println("======================================================");
        for (Equipamento e : this.equipamento)
            if (e.isDisponivel())
                System.out.println(e);
        System.out.println("======================================================");
    }

    public String encontraEquipamento(int cod) {
        for(Equipamento eq:equipamento) {
            if(eq.getCodID() == cod) {
                return eq.toString();
            }
        }
        return null;
    }
}


