package CadastraEquipamentos;

import Equipamentos.*;
import java.util.ArrayList;

public class ControleEquipamento {
    private ArrayList<Som> equipaSom = new ArrayList<>();
    private ArrayList<Iluminacao> equipaIlumina = new ArrayList<>();
    private ArrayList<Projecao> equipaProjecao = new ArrayList<>();

    public ArrayList<Som> getEquipaSom() {
        return equipaSom;
    }

    public ArrayList<Iluminacao> getEquipaIlumina() {
        return equipaIlumina;
    }

    public ArrayList<Projecao> getEquipaProjecao() {
        return equipaProjecao;
    }

    public void addSom(Som s) {
        equipaSom.add(s);
    }

    public void addIlumina(Iluminacao i) {
        equipaIlumina.add(i);
    }

    public void addProjecao(Projecao p) {
        equipaProjecao.add(p);
    }
}


