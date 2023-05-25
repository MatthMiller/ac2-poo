package entidades;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String nome, double combustivel, double consumo, String placa, int cilindradas) {
        super(nome, combustivel, consumo, placa);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
}
