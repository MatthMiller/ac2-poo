package entidades;

public class Caminhao extends Veiculo {
    private int quantidadeDeEixos;

    public Caminhao(String nome, double combustivel, double consumo, String placa, int quantidadeDeEixos) {
        super(nome, combustivel, consumo, placa);
        this.quantidadeDeEixos = quantidadeDeEixos;
    }

    public int getQuantidadeDeEixos() {
        return quantidadeDeEixos;
    }

    public void setQuantidadeDeEixos(int quantidade) {
        this.quantidadeDeEixos = quantidade;
    }
}
