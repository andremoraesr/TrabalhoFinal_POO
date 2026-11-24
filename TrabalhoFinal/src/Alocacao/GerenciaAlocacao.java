package Alocacao;

import CadastraEquipamentos.ControleEquipamento;
import CadastraCliente.*;
import Equipamentos.Equipamento;
import java.time.LocalDate;

import java.util.ArrayList;


public class GerenciaAlocacao {
    private ArrayList<Alocacao> listAlocacoes;
    private ControleEquipamento cadEquip;


    //CONSTRUTOR
    public GerenciaAlocacao(ControleEquipamento cadastro) {
        this.listAlocacoes = new ArrayList<Alocacao>();
        this.cadEquip = cadastro;
    }

    //MÉTODOS
    public void cadastroCliente(Cliente c) {
        //Colocar excessão caso coloque um nome já cadastrado
        Alocacao rent = new Alocacao(c);

        this.listAlocacoes.add(rent);
    }

    public void alocarEquip(String nome, int dias, int id) {
        Alocacao rent = this.buscaCliente(nome);
        Equipamento gear = this.cadEquip.consultarEquip(id);
        AlocEquip equip = rent.buscaAlocEquip(id);


        if (rent != null)
            //colocar uma exceção caso o cliente não foi cadastrado
            if (gear != null && gear.isDisponivel())
                //exceção caso o equip não foi cadastrado ou não está disponivel
                if (equip == null) {
                    //exceção caso o equip já foi alocado pelo cliente
                    equip = new AlocEquip(gear, dias);
                    gear.setDisponivel(false);
                    rent.getEquipAlocated().add(equip);
                }

        rent.addHistorico(equip.getDataAloc() + "      ALOCAÇÃO EQUIPAMENTO ID: " + equip.getEquip().getCodID() + "\n");
    }

    public Alocacao buscaCliente(String nome) {
        for (Alocacao l : listAlocacoes)
            if (l.getClient().getNome().equals(nome))
                return l;

        return null;
    }

    public double valorEquip(String nome, int ID) {
        Alocacao rent = this.buscaCliente(nome);

        if (rent != null) {
            //retorna exceção caso cliente não seja encontrado ou não esteja cadastrado
            AlocEquip equip = rent.buscaAlocEquip(ID);

            if (equip != null)
                //retorna exceção caso equipamento não foi encontrado/alocado
                return equip.getEquip().valorLocacao(equip.getDiasDeAloc());

        }

        //provisório para não dar erro na hora do teste, tirar na implementação de exceções
        return 0;
    }

    public void mostraTotal(String nome)
    {
        Alocacao rent = this.buscaCliente(nome);
        double total = valorTotal(nome);
        double subtototal = total;

        System.out.println("CLIENTE:\n" + rent.getClient());

        System.out.println("EQUIPAMENTOS ALOCODOS:\n");


        if (rent.getEquipAlocated().isEmpty()) {
            System.out.println("** VAZIO **\n");
        } else {
            for (AlocEquip l : rent.getEquipAlocated()) {
                //joga as mesmas exceções do método valorEquip
                double valor = this.valorEquip(nome, l.getEquip().getCodID());
                System.out.println(l);
                System.out.printf("VALOR: R$%.2f\n", valor);

                if (l.estaAtrasado()) {
                    double multa = this.multa(nome, l.getEquip().getCodID());
                    System.out.printf("MULTA: R$%.2f\n", multa);
                    valor += multa;
                    total += multa;
                    System.out.printf("VALOR + MULTA: R$%.2f\n", valor);
                }
            }

            System.out.printf("SUBTOTAL: R$%.2f\n", subtototal);
            System.out.printf("TOTAL: R$%.2f\n", total);

        }
    }

    public double valorTotal(String nome) {
        Alocacao rent = this.buscaCliente(nome);
        double total = 0;

        if (rent.getEquipAlocated().isEmpty()) {
            //Colocar uma exceção caso a lista seja vazia
            return -1;
        } else {
            for (AlocEquip l : rent.getEquipAlocated()) {
                //joga as mesmas exceções do método valorEquip
                double valor = this.valorEquip(nome, l.getEquip().getCodID());
                total += valor;

            }

        }


        return total;
    }

    public double multa(String nome, int ID) {
        Alocacao rent = this.buscaCliente(nome);
        AlocEquip equip = rent.buscaAlocEquip(ID);
        double multaEquip = 0;

        if (rent != null)
            if (equip != null)
            {
                if (equip.estaAtrasado())
                {
                    //Multa = (Dias Atrasados * 0.005)*Preço a ser pago pela alocação
                    multaEquip = (0.005 * equip.getDiasAtrasados()) * this.valorEquip(nome, ID);
                }
            }

        return multaEquip;

    }

    public void devolucao(String nome, int ID) {
        Alocacao rent = this.buscaCliente(nome);

        //se id < 0, devolução de tudo que foi alocado pelo cliente
        if (ID < 0) {
            //joga as mesmas exceções do método valorTotal
            double total = this.valorTotal(nome);

            for (AlocEquip l : rent.getEquipAlocated()) {
                this.cadEquip.consultarEquip(l.getEquip().getCodID()).setDisponivel(true);
                if (l.estaAtrasado())
                    System.out.println("ID: " + l.getEquip().getCodID() + ". Item devolvido com atraso." +
                            " Multa acrecesntada ao pagamento");

                rent.addHistorico(l.getDataAloc() + "      DEVOLUÇÃO EQUIPAMENTO ID: " + l.getEquip().getCodID() + "\n");
            }
            rent.getEquipAlocated().clear();
        }
        else {
            AlocEquip equip = rent.buscaAlocEquip(ID);

            this.cadEquip.consultarEquip(equip.getEquip().getCodID()).setDisponivel(true);

            if(equip.estaAtrasado())
                System.out.println("ID: " + equip.getEquip().getCodID() + ". Item devolvido com atraso." +
                        " Multa acrecesntada ao pagamento");

            rent.addHistorico(equip.getDataAloc() + "      DEVOLUÇÃO EQUIPAMENTO ID: " + equip.getEquip().getCodID() + "\n");

            rent.getEquipAlocated().remove(equip);
        }

        System.out.println("Itens devolvidos com sucesso!!");

    }

    public void historicoCliente(String nome)
    {
        Alocacao rent = this.buscaCliente(nome);

        System.out.println("HISTÓRICO\nCLIENTE: " + rent.getClient().getNome() + "\n");
        System.out.println(rent.getHistorico());

    }

    public void locacoesAtivas()
    {
        for (Alocacao al : listAlocacoes)
            if(!al.getEquipAlocated().isEmpty())
                System.out.println(al);

    }


}



