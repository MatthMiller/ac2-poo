package execucao;

import java.util.ArrayList;
import java.util.List;

import entidades.Caminhao;
import entidades.Carro;
import entidades.Condutor;
import entidades.Moto;
import entidades.Veiculo;

public class Main {
    public static void main(String[] args) {
        Moto harley = new Moto("Harley Davidson", 50, 20, "424-KSD", 4);
        Carro hyundai = new Carro("Hyundai i30", 30, 50, "343-EPF", 4);
        Caminhao freightliner = new Caminhao("Freightliner Optimus Prime", 50, 20, "930-EIX", 10);
        
        System.out.println("\nNome: " + harley.getNome() + "\nCilindradas: " + harley.getCilindradas());
        System.out.println("\nNome: " + hyundai.getNome() + "\nPortas: " + hyundai.getQuantidadeDePortas());
        System.out.println("\nNome: " + freightliner.getNome() + "\nEixos: " + freightliner.getQuantidadeDeEixos());
    
        System.out.println("\nimprimeCondutores():");
        List<Condutor> condutoresList = new ArrayList<>();
        condutoresList.add(new Condutor("Cleysson", 21321321, "25/03/1995", 5000.0));
        condutoresList.add(new Condutor("Críton", 93402430, "25/03/1995", 5000.0));
        condutoresList.add(new Condutor("André", 33402430, "25/03/1995", 5000.0));
        condutoresList.add(new Condutor("Marco", 13402430, "25/03/1995", 5000.0));
        Relatorios.imprimeCondutores(condutoresList);

        System.out.println("\nimprimeVeiculos():");
        List<Veiculo> veiculosList = new ArrayList<>();
        veiculosList.add(harley);
        veiculosList.add(hyundai);
        veiculosList.add(freightliner);
        veiculosList.add(new Veiculo("Ômicron TX", 250, 20, "PXS-342"));
        Relatorios.imprimeVeiculos(veiculosList);
    }
}