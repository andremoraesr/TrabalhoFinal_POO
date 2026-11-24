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

    public Equipamento consultarEquip(int ID)
    {
        for (Equipamento e : this.equipamento)
            if (e.getCodID() == ID)
                return e;


        return null;
    }

    public void equipDisponivel()
    {
        System.out.println("EQUIPAMENTOS DISPONÍVEIS PARA ALOCAÇÃO");
        System.out.println("======================================================");
        for (Equipamento e : this.equipamento)
            if (e.isDisponivel())
                System.out.println(e);
        System.out.println("======================================================");
    }




}


