package entidades;

public class Carro extends Veiculo {
    private int quantidadeDePortas;

    public Carro(String nome, double combustivel, double consumo, String placa, int quantidadeDePortas) {
        super(nome, combustivel, consumo, placa);
        this.quantidadeDePortas = quantidadeDePortas;
    }

    public int getQuantidadeDePortas() {
        return quantidadeDePortas;
    }

    public void setQuantidadeDePortas(int quantidade) {
        this.quantidadeDePortas = quantidade;
    }
}
