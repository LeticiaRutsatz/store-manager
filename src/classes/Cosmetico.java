package classes;

public class Cosmetico extends Loja {
    private double taxaComercializacao;

    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data data, double taxaComercializacao) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, data);
        this.taxaComercializacao = taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxa) {
        this.taxaComercializacao = taxa;
    }

    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Taxa de comercialização: " + taxaComercializacao;
    }
}
