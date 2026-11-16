package CadastraCliente;

import java.util.ArrayList;

public class ControleCliente {
    private ArrayList<Cliente> clientes = new ArrayList<>();

    public ArrayList<Cliente> exporta() {return clientes;}

    public void cadastrar(Cliente c) {
        clientes.add(c);
    }

}
