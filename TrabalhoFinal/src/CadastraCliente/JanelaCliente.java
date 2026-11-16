package CadastraCliente;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaCliente {
    JFrame janela = new JFrame("Cadastrar clientes");
    JButton botaoCadastrar = new JButton("Cadastrar");
    JButton botaoConsultar = new JButton("Consultar clientes cadastrados");
    JButton botaoVoltar = new JButton("Voltar");
    JTextField nome = new JTextField(20);
    JTextField telefone = new JTextField(20);
    JTextField cpf = new JTextField(20);
    JTextField email = new JTextField(20);
    JPanel painel = new JPanel();

    public JanelaCliente(JFrame telaAnterior, ControleCliente controller) {
        janela.setSize(1000, 800);
        painel.setLayout(new GridLayout(0, 2, 5, 10));
        painel.add(new JLabel("Nome: "));
        painel.add(nome);
        painel.add(new JLabel("Telefone: "));
        painel.add(telefone);
        painel.add(new JLabel("CPF: "));
        painel.add(cpf);
        painel.add(new JLabel("Email: "));
        painel.add(email);
        painel.add(botaoCadastrar);
        painel.add(botaoConsultar);
        painel.add(botaoVoltar);
        janela.getContentPane().add(painel);

        botaoCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n = nome.getText();
                String em = email.getText();
                String c = cpf.getText();
                String t = telefone.getText();
                if(!n.isEmpty() && !em.isEmpty() && !c.isEmpty() && !t.isEmpty()) {
                        controller.cadastrar(new Cliente(c, t, n, em));
                }
            }
        });

        botaoConsultar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new JanelaListarClientes(janela, controller);
                janela.setVisible(false);
            }
        });

        botaoVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                telaAnterior.setVisible(true);
                janela.dispose();
            }
        });
    }
}
