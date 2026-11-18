package CadastraEquipamentos;

import Equipamentos.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class JanelaListarDisponiveis {
    JFrame janela = new JFrame("Equipamentos");
    JPanel painel = new JPanel();
    JButton botaoVoltar = new JButton("Voltar");

    public JanelaListarDisponiveis(JFrame telaAnterior, ControleEquipamento controller) {
        janela.setSize(1000, 800);
        janela.setLayout(new BorderLayout());
        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));

        ArrayList<Equipamento> equipamentos = controller.getEquipamentos();

        if(equipamentos.isEmpty()) {
            painel.add(new JLabel("Nenhum equipamento cadastrado."));
        }
        else {
            for(Equipamento e:equipamentos) {
                if(e.isDisponivel()) {
                    JLabel infoEquip = new JLabel(e.toString());
                    painel.add(infoEquip);   //"printa" o equipamento
                    infoEquip.setBorder(BorderFactory.createCompoundBorder(
                            BorderFactory.createMatteBorder(0, 0, 1, 0, Color.LIGHT_GRAY),
                            BorderFactory.createEmptyBorder(10, 10, 10, 10)
                    ));                     //borda entre cada equipamento
                }
            }
        }

        botaoVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                telaAnterior.setVisible(true);
                janela.dispose();
            }
        });

        janela.getContentPane().add(painel);
        janela.setVisible(true);
    }
}
