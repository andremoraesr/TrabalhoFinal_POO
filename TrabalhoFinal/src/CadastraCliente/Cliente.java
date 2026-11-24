package CadastraCliente;

public class Cliente {
    private String cpf, telefone, nome, email;

    public Cliente(String c, String t, String n, String e) {
        this.cpf = c;
        this.telefone = t;
        this.nome = n;
        this.email = e;
    }

    public String toString() {
        return "NOME: " + this.nome + "\nCPF: " +  this.cpf + "\nFONE: "
                + this.telefone + "\nE-MAIL: " + this.email + "\n";
        //"<html><b>Nome:</b> " + nome + " | <b>CPF:</b> " + cpf +
        //"<br><b>Telefone:</b> " + telefone + " | <b>Email:</b> " + email + "</html>";
        //dessa forma garante que haverá quebra de linha ao listar clientes, mas vou testar sem as tags quando estiver pronto
    }

//MÉTODOS
    //getter
    public String getCpf() { return this.cpf; };
    public String getTelefone() { return this.telefone; };
    public String getNome() { return this.nome; };
    public String getEmail() { return this.email; };
}
