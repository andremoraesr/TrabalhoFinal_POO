package CadastraEquipamentos;

import javax.swing.JOptionPane;

public class Pop_upConsultar {
    public void consultar(ControleEquipamento controller) {
        String codigoDigitado = JOptionPane.showInputDialog(
            null, "Digite o código do equipamento: ",
            "Consulta de equipamento", JOptionPane.QUESTION_MESSAGE
        );

        if(codigoDigitado == null || codigoDigitado.trim().isEmpty()) {     //verifica se clicou em cancelar ou no X
            return;
        }

        int cod = Integer.parseInt(codigoDigitado.trim());          //passa para inteiro

        String resultado = controller.encontraEquipamento(cod);

        if(resultado == null) {
            JOptionPane.showMessageDialog(
                    null, "Erro: equipamento com o código " + cod + " não encontrado.",
                    "Equipamento não encontrado", JOptionPane.ERROR_MESSAGE
            );
        }
            else{
                JOptionPane.showMessageDialog(
                        null, "Equipamento encontrado: " + resultado,
                        "Equipamento encontrado", JOptionPane.INFORMATION_MESSAGE
                );
        }
    }
}
