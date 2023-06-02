package entidades;

public class Viagem implements Comparable<Viagem>{
    protected String cidadeDestino;
    protected String cidadeOrigem;
    protected double distancia;
    protected Veiculo veiculo;
    protected Condutor condutor;
    protected double custoViagem;
    protected double consumo = 0.16;
    protected double precoGasosa= 5.46;

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

    public int compareTo(Viagem viage) {
        this.custo();
        viage.custo();
        if (this.custoViagem < viage.custoViagem) {
            return -1;
        } else if (this.custoViagem > viage.custoViagem) {
            return 1;
        } else {
            return 0;
        }
    }

    public double custo() {
        if(this.distancia<=700){
            custoViagem = this.distancia*consumo*precoGasosa + this.condutor.getSalario();
            
        }else{
            System.out.println("O condutor percorreu mais que 700km no dia, o valor será contado como o limite");
            custoViagem = 700*consumo*precoGasosa + this.condutor.getSalario();
        }
        return custoViagem;
    }

    public double getCustoViagem() {
        this.custo();
        return this.custoViagem;
    }
    public Condutor getCondutor(){
        return this.condutor;
    }
}
