package entidades;

import interfaces.InterfaceVeiculo;

public class Veiculo implements InterfaceVeiculo, Comparable<Veiculo> {
    protected String nome;
    protected double combustivel;
    protected double consumo;
    protected String placa;

    public Veiculo(String nome, double combustivel, double consumo, String placa) {
        this.nome = nome;
        this.combustivel = combustivel;
        this.consumo = consumo;
        this.placa = placa;
    }

    @Override
    public int compareTo(Veiculo outroVeiculo) {
        return this.nome.compareToIgnoreCase(outroVeiculo.getNome());
    }

    @Override
    public double getCombustivel() {
        return this.combustivel;
    }

    @Override
    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }

    @Override
    public double getConsumo() {
        return this.consumo;
    }

    @Override
    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    @Override
    public String getPlaca() {
        return this.placa;
    }

    @Override
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public double gastoComCombustivel(double distancia, double valorCombustivel) {
        return distancia * valorCombustivel;
    }
}
