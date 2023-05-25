package interfaces;

public interface InterfaceVeiculo {
    public double gastoComCombustivel(
        double distancia, double valorCombustivel
        );
        
    public String getNome();
    public void setNome(String nome);
    public double getCombustivel();
    public void setCombustivel(double combustivel);
    public double getConsumo();
    public void setConsumo(double consumo);
    public String getPlaca();
    public void setPlaca(String placa);
}

