package Alocacao;

import CadastraCliente.Cliente;
import Equipamentos.Equipamento;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import java.util.ArrayList;

public class AlocEquip
{
    private Equipamento equip;
    private int diasDeAloc;
    private LocalDate dataAloc;

    //CONTRUTOR
    public AlocEquip(Equipamento q, int d)
    {
        this.equip = q;
        this.diasDeAloc = d;
        this.dataAloc = LocalDate.now();
    }

    //MÉTODOS
    //getter
    Equipamento getEquip() { return this.equip; }
    int getDiasDeAloc() { return this.diasDeAloc; }
    LocalDate getDataAloc() { return this.dataAloc; }

    //setter
    void setDiasDeAloc(int d) { this.diasDeAloc = d; }

    //base
    long getDiasDecorridos()
    {
        return ChronoUnit.DAYS.between(this.dataAloc, LocalDate.now());
    }

    boolean estaAtrasado()
    {
        return getDiasDecorridos() > this.diasDeAloc;
    }

    long getDiasAtrasados()
    {
        return Math.max(0, getDiasDecorridos() - this.diasDeAloc);
    }


    @Override
    public String toString()
    {
        return this.equip.toString() + "DATA DE LOCAÇÃO: " + this.dataAloc +
                "\nDIAS RESERVADOS: " + this.diasDeAloc;
    }
}
