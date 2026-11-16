package CadastraCliente;

public class Cliente {
    String cpf, telefone, nome, email;

    public Cliente(String c, String t, String n, String e) {
        this.cpf = c;
        this.telefone = t;
        this.nome = n;
        this.email = e;
    }

    public String printarCliente() {
        return this.nome + "  ||  " +  this.cpf + "  ||  " + this.telefone + "  ||  " + this.email + "\n";
        //"<html><b>Nome:</b> " + nome + " | <b>CPF:</b> " + cpf +
        //"<br><b>Telefone:</b> " + telefone + " | <b>Email:</b> " + email + "</html>";
        //dessa forma garante que haverá quebra de linha ao listar clientes, mas vou testar sem as tags quando estiver pronto
    }
}
