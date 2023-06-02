package execucao;

import java.util.ArrayList;
import java.util.List;

import entidades.*;

public class Main {
    public static void main(String[] args) {
        Moto harley = new Moto("Harley Davidson", 50, 20, "424-KSD", 4);
        Carro hyundai = new Carro("Hyundai i30", 30, 50, "343-EPF", 4);
        Caminhao freightliner = new Caminhao("Freightliner Optimus Prime", 50, 20, "930-EIX", 10);
        Condutor c1 = new Condutor("Carlos", 21321320 , "25/03/1995", 5000.0);
        Condutor c2 = new Condutor("Carlinhos", 21321323 , "25/03/1995", 5000.0);
        Condutor c3 = new Condutor("Carlonhas", 21321327 , "25/03/1995", 5000.0);
        
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

        Viagem zerada = new Viagem("null", "null", 100, freightliner, c1);
        Viagem v2 = new Viagem("SP", "Sorobaca", 400, hyundai, c2);
        Viagem v3 = new Viagem("Manguezal", "Cerejais", 200, freightliner, c3);
        Viagem v4 = new Viagem("Manguezal", "Cerejais", 600, freightliner, c1);
        Viagem v5 = new Viagem("Manguezal", "Cerejais", 700, freightliner, c2);
        Viagem v6 = new Viagem("Manguezal", "Cerejais", 800, freightliner, c3);

        System.out.println("\nimprimeViagens():");
        List<Viagem> viagemList = new ArrayList<>();
        viagemList.add(zerada);
        viagemList.add(v2);
        viagemList.add(v3);
        viagemList.add(v4);
        viagemList.add(v5);
        viagemList.add(v6);
        Relatorios.imprimeViagens(viagemList);
        System.out.println();
        FolhaDePagamento.imprimir(viagemList);
        System.out.println();
        FolhaDePagamento.totalAPagar(v6);
    }
}
