package classes;

public class Informatica extends Loja {
    private double seguroEletronicos;

    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data data, double seguroEletronicos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, data);
        this.seguroEletronicos = seguroEletronicos;
    }

    public void setSeguroEletronicos(double taxa) {
        this.seguroEletronicos = taxa;
    }

    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Seguro Eletrônicos: " + seguroEletronicos;
    }
}
