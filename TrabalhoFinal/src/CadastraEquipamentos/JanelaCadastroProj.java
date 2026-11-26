package CadastraEquipamentos;

import Equipamentos.Projecao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaCadastroProj {
    JFrame janela = new JFrame("Cadastro de equipamento de projeção");
    JPanel painel = new JPanel();
    JButton botaoCadastrar= new JButton("Cadastrar");
    JButton botaoVoltar = new JButton("Voltar");
    JSpinner codigoID = new JSpinner();
    JTextField descricao = new JTextField();
    JSpinner diaria = new JSpinner();
    JSpinner lumens = new JSpinner();
    JTextField resolucao = new JTextField();

    public JanelaCadastroProj(JFrame telaAnterior, ControleEquipamento controller) {
        janela.setSize(500, 450);
        painel.setLayout(new GridLayout(7, 1 , 10, 10));
        painel.setBorder(BorderFactory.createEmptyBorder(20, 40, 20 ,40));

        painel.add(new JLabel("Código do produto: "));                  painel.add(codigoID);
        painel.add(new JLabel("Descrição: "));                          painel.add(descricao);
        painel.add(new JLabel("Valor da diária: "));                    painel.add(diaria);
        painel.add(new JLabel("Lúmens: "));                           painel.add(lumens);
        painel.add(new JLabel("Nível de resolução: "));      painel.add(resolucao);
        painel.add(botaoCadastrar);
        painel.add(botaoVoltar);
        janela.getContentPane().add(painel);

        botaoCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int c = (int)codigoID.getValue();
                String d = descricao.getText();
                double v = (double)diaria.getValue();
                double l = (double)lumens.getValue();
                String r = resolucao.getText();
                Projecao p = new Projecao(c, d, v, r, l);
                controller.addEquipamento(p);
                codigoID.setValue(0);  descricao.setText("");   diaria.setValue(0);   lumens.setValue(0);   resolucao.setText("");
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
