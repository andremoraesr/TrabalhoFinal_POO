package CadastraCliente;

import java.util.ArrayList;

public class ControleCliente {
    private ArrayList<Cliente> clientes = new ArrayList<>();

    //CONSTRUTOR
    public ControleCliente(ArrayList<Cliente> cli)
    {
        if (cli != null)
            this.clientes = cli;
        else
            this.clientes = new ArrayList<Cliente>();
    }

    public ControleCliente() { this(null); }


//MÉTODOS
    //getter
    public ArrayList<Cliente> getClientes() { return clientes; }

    //base
    public void cadastrar(Cliente c) {
        clientes.add(c);
    }

    public Cliente buscaCliente(String nome) {
        if (clientes.isEmpty())
            return null;

        for (Cliente c : clientes)
            if (c.getNome().equals(nome))
                return c;

        return null;
    }


    public boolean vazia() {
        if(clientes.isEmpty()) {
            return true;
        }
        return false;
    }

}
