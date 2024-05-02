package classes;

public class Produto {
    private String nome;
    private double preco;
    private Data dataDeValidade;

    public Produto(String nome, double preco, Data dataDeValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataDeValidade = dataDeValidade;
    }

    public void setDataValidade(Data dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }

    public Data getDataValidade() {
        return dataDeValidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

     public boolean estaVencido(Data dataAtual) {
        return dataDeValidade.getAno() < dataAtual.getAno() ||
               (dataDeValidade.getAno() == dataAtual.getAno() && dataDeValidade.getMes() < dataAtual.getMes()) ||
               (dataDeValidade.getAno() == dataAtual.getAno() && dataDeValidade.getMes() == dataAtual.getMes() && dataDeValidade.getDia() < dataAtual.getDia());
    }

    @Override
    public String toString() {
        return "Produto{" +
               "nome='" + nome + '\'' +
               ", preco=" + preco +
               ", dataDeValidade=" + dataDeValidade +
               '}';
    }
}
