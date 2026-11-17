package CadastraEquipamentos;

import Equipamentos.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaCadastroSom {
    JFrame janela = new JFrame("Cadastro de equipamento de som");
    JPanel painel = new JPanel();
    JButton botaoCadastrar= new JButton("Cadastrar");
    JButton botaoVoltar = new JButton("Voltar");
    JSpinner codigoID = new JSpinner();
    JTextField descricao = new JTextField();
    JSpinner diaria = new JSpinner();
    JSpinner potencia = new JSpinner();
    JSpinner canais = new JSpinner();

    public JanelaCadastroSom(JFrame telaAnterior, ControleEquipamento controller) {
        janela.setSize(500, 450);
        painel.setLayout(new GridLayout(7, 1 , 10, 10));
        painel.setBorder(BorderFactory.createEmptyBorder(20, 40, 20 ,40));

        painel.add(new JLabel("Código do produto: "));                  painel.add(codigoID);
        painel.add(new JLabel("Descrição: "));                          painel.add(descricao);
        painel.add(new JLabel("Valor da diária: "));                    painel.add(diaria);
        painel.add(new JLabel("Potência: "));                           painel.add(potencia);
        painel.add(new JLabel("Quantidade de canais de áudio: "));      painel.add(canais);
        painel.add(botaoCadastrar);
        painel.add(botaoVoltar);
        janela.add(painel);

        botaoCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int c = (int)codigoID.getValue();
                String d = descricao.getText();
                double v = (double)diaria.getValue();
                double p = (double)potencia.getValue();
                int q = (int)canais.getValue();
                Som s = new Som(c, d, v, p, q);
                controller.addEquipamento(s);
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
