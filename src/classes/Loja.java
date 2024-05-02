package classes;
public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data data) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = data;
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data data) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1; 
        this.endereco = endereco;
        this.dataFundacao = data;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setDataFundacao(Data data) {
        this.dataFundacao = data;
    }

    public Data getDataFundacao() {
        return dataFundacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setSalarioBaseFuncionario(double salarioBase) {
        this.salarioBaseFuncionario = salarioBase;
    }

    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public double gastosComSalario() {
        return salarioBaseFuncionario == -1 ? -1 : salarioBaseFuncionario * quantidadeFuncionarios;
    }

    public char tamanhoDaLoja() {
        if (quantidadeFuncionarios < 10) {
            return 'P'; 
        } else if (quantidadeFuncionarios >= 10 && quantidadeFuncionarios <= 30) {
            return 'M'; 
        } else {
            return 'G'; 
        }
    }

    @Override
    public String toString() {
        return "Nome da loja: " + nome + "\n" +
               "Quantidade de funcionários: " + quantidadeFuncionarios + "\n" +
               "Salário base dos funcionários: " + salarioBaseFuncionario + "\n" +
               "Endereço da loja: " + endereco + "\n" +
               "Data de fundação da loja: " + dataFundacao;
    }
}
