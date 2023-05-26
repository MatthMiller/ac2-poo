package execucao;

import java.util.Collections;
import java.util.List;

import entidades.Condutor;
import entidades.Veiculo;

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
}
