package GerenciaCliente;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class JanelaListarClientes {
    JFrame janela = new JFrame("Clientes");
    JPanel painel = new JPanel();
    JButton botaoVoltar = new JButton("Voltar");

    public JanelaListarClientes(JFrame telaAnterior, ControleCliente controller) {
        janela.setSize(1000, 800);
        janela.setLayout(new BorderLayout());
        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));
        ArrayList<Cliente> clientes = controller.exporta();

        if(clientes.isEmpty()) {
            painel.add(new JLabel("Nenhum cliente cadastrado."));
        }
        else {
            for(Cliente c: clientes) {
                JLabel infoCliente = new JLabel(c.printarCliente());
                infoCliente.setBorder(BorderFactory.createCompoundBorder(
                        BorderFactory.createMatteBorder(0, 0, 1, 0, Color.LIGHT_GRAY),
                        BorderFactory.createEmptyBorder(10, 10, 10, 10)
                ));                      //borda entre cada cliente para dar espaçamento

                painel.add(infoCliente);
            }
        }

        janela.getContentPane().add(painel);

        botaoVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                telaAnterior.setVisible(true);
                janela.dispose();
            }
        });

        painel.add(botaoVoltar);
        janela.setVisible(true);
    }
}


