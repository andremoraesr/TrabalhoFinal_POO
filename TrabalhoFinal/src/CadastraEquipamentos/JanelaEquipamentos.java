package CadastraEquipamentos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaEquipamentos {
    JFrame janela = new JFrame("Equipamentos: consultas e cadastros");
    JPanel painel = new JPanel();
    JButton botaoAddSom = new JButton("Cadastrar equipamento de som");
    JButton botaoAddIluminacao = new JButton("Cadastrar equipamento de iluminação");
    JButton botaoAddProjecao = new JButton("Cadastrar equipamento de projeção");
    JButton botaoListarCadastrados = new JButton("Listar os equipamentos cadastrados");
    JButton botaoListarDisponiveis = new JButton("Listar os equipamentos disponíveis para locação");
    JButton botaoConsultar = new JButton("Consultar equipamento pelo código");
    JButton botaoVoltar = new JButton("Voltar");

    public JanelaEquipamentos(JFrame telaAnterior, ControleEquipamento controller) {
        janela.setSize(500, 450);
        painel.setLayout(new GridLayout(7, 1 , 10, 10));
        painel.setBorder(BorderFactory.createEmptyBorder(20, 40, 20 ,40));

        painel.add(botaoAddSom);
        painel.add(botaoAddIluminacao);
        painel.add(botaoAddProjecao);
        painel.add(botaoListarCadastrados);
        painel.add(botaoListarDisponiveis);
        painel.add(botaoConsultar);
        painel.add(botaoVoltar);

        janela.add(painel);

        botaoAddSom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                janela.setVisible(false);
            }
        });

        botaoAddIluminacao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                janela.setVisible(false);
            }
        });

        botaoAddProjecao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                janela.setVisible(false);
            }
        });

        botaoListarCadastrados.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                janela.setVisible(false);
            }
        });

        botaoListarDisponiveis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                janela.setVisible(false);
            }
        });

        botaoConsultar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


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
