package entidades;

public class Viagem {
    protected String cidadeDestino;
    protected String cidadeOrigem;
    protected double distancia;
    protected Veiculo veiculo;
    protected Condutor condutor;

  public Viagem(String cidadeOrigem, 
        String cidadeDestino,
        double distancia,
        Veiculo veiculo,
        Condutor condutor) 
        {
        
        this.cidadeDestino = cidadeDestino;
        this.cidadeOrigem = cidadeOrigem;
        this.distancia = distancia;
        this.veiculo = veiculo;
        this.condutor = condutor;
    }

    public double custo(int diarias) {
        return this.veiculo.getCombustivel() * (this.condutor.getSalario() / 30);
    }
}
