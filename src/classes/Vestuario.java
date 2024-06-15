package classes;

public class Vestuario extends Loja {
    private boolean produtosImportados;

    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data data, boolean produtosImportados, int maxProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, data, maxProdutos);
        this.produtosImportados = produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados) { 
        this.produtosImportados = produtosImportados;
    }

    public boolean getProdutosImportados() {
        return produtosImportados;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Produtos Importados: " + produtosImportados;
    }
}
