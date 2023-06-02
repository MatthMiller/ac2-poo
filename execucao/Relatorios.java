package execucao;

import java.util.Collections;
import java.util.List;

import entidades.*;

public class Relatorios {
    public static void imprimeCondutores(List<Condutor> condutoresList) {
        Collections.sort(condutoresList);
        for (Condutor c : condutoresList ) {
            System.out.println(c.getNome() + " -> CPF: " + c.getCpf());
        }
    }

    public static void imprimeVeiculos(List<Veiculo> veiculosList) {
        Collections.sort(veiculosList);
        for (Veiculo v : veiculosList) {
            System.out.println(v.getNome());
        }
    }

    public static void imprimeViagens(List<Viagem> viagemList) {
        Collections.sort(viagemList);
        for (Viagem vg : viagemList) {
            System.out.println(vg.getCondutor().getNome()+" Custo: "+vg.getCustoViagem());
        }
    }

}
