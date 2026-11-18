package CadastraEquipamentos;

import Equipamentos.*;
import java.util.ArrayList;

public class ControleEquipamento {
    private ArrayList<Equipamento> equipamentos = new ArrayList<>();

    public ArrayList<Equipamento> getEquipamentos() { return equipamentos; }

    public void addEquipamento(Equipamento x) { equipamentos.add(x); }

    public String encontraEquipamento(int cod) {
        for(Equipamento eq:equipamentos) {
            if(eq.getCodID() == cod) {
                return eq.toString();
            }
        }
        return null;
    }
}
