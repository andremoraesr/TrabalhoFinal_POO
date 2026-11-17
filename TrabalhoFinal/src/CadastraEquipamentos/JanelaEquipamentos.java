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
    }
}
