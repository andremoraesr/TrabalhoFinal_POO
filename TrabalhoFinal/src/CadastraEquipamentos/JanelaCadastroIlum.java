package CadastraEquipamentos;

import Equipamentos.Iluminacao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaCadastroIlum {
    JFrame janela = new JFrame("Cadastro de equipamento de iluminação");
    JPanel painel = new JPanel();
    JButton botaoCadastrar= new JButton("Cadastrar");
    JButton botaoVoltar = new JButton("Voltar");
    JSpinner codigoID = new JSpinner();
    JTextField descricao = new JTextField();
    JSpinner diaria = new JSpinner();
    JSpinner potencia = new JSpinner();
    JTextField tipo = new JTextField();

    public JanelaCadastroIlum(JFrame telaAnterior, ControleEquipamento controller) {
        janela.setSize(500, 450);
        painel.setLayout(new GridLayout(0, 2 , 10, 10));
        painel.setBorder(BorderFactory.createEmptyBorder(20, 40, 20 ,40));

        painel.add(new JLabel("Código do produto: "));                  painel.add(codigoID);
        painel.add(new JLabel("Descrição: "));                          painel.add(descricao);
        painel.add(new JLabel("Valor da diária: "));                    painel.add(diaria);
        painel.add(new JLabel("Potência: "));                           painel.add(potencia);
        painel.add(new JLabel("Tipo de iluminação: "));                 painel.add(tipo);
        painel.add(botaoCadastrar);
        painel.add(botaoVoltar);
        janela.getContentPane().add(painel);

        botaoCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int c = (int)codigoID.getValue();
                String d = descricao.getText();
                double v = (double)diaria.getValue();
                double p = (double)potencia.getValue();
                String t = tipo.getText();
                Iluminacao i = new Iluminacao(c, d, v, t, p);
                controller.addEquipamento(i);
                codigoID.setValue(0);  descricao.setText("");   diaria.setValue(0);   potencia.setValue(0);   tipo.setText("");
                codigoID.requestFocus();
            }
        });

        botaoVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                telaAnterior.setVisible(true);
                janela.dispose();
            }
        });

        janela.setVisible(true);
    }
}

