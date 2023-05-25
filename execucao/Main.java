package execucao;

import entidades.Caminhao;
import entidades.Carro;
import entidades.Moto;

public class Main {
    public static void main(String[] args) {
        Moto harley = new Moto("Harley Davidson", 50, 20, "424-KSD", 4);
        Carro hyundai = new Carro("Hyundai i30", 30, 50, "343-EPF", 4);
        Caminhao freightliner = new Caminhao("Freightliner Optimus Prime", 50, 20, "930-EIX", 10);
        
        System.out.println("Nome: " + harley.getNome() + "\nCilindradas: " + harley.getCilindradas());
        System.out.println("Nome: " + hyundai.getNome() + "\nPortas: " + hyundai.getQuantidadeDePortas());
        System.out.println("Nome: " + freightliner.getNome() + "\nEixos: " + freightliner.getQuantidadeDeEixos());
    }
}