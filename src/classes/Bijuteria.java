package classes;

public class Bijuteria extends Loja{
    private double metaVendas;

    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data data, double metaVendas) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, data);
        this.metaVendas = metaVendas;
    }

    public void setMetaVendas(double metaVendas) { 
        this.metaVendas = metaVendas;
    }

    public double getMetaVendas() {
        return metaVendas;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Meta vendas: " + metaVendas;
    }
}
