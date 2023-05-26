package entidades;

public class Condutor implements Comparable<Condutor> {
    private String nome;
    private int cpf;
    private String dataNascimento;
    private double salario;

    public Condutor(String nome, int cpf, String dataNascimento, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }

    @Override
    public int compareTo(Condutor outroCondutor) {
        if (this.cpf < outroCondutor.getCpf()) {
            return -1;
        } else if (this.cpf > outroCondutor.getCpf()) {
            return 1;
        } else {
            return 0;
        }
    }

    public String getNome() {
        return this.nome;
    }

    public int getCpf() {
        return this.cpf;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
