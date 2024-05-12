package classes;

public class Alimentacao extends Loja{
    private Data dataAlvara;

    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data data, Data dataAlvara) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, data);
        this.dataAlvara = dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) { 
        this.dataAlvara = dataAlvara;
    }

    public Data getDataAlvara() {
        return dataAlvara;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
               "Data Alvara: " + dataAlvara;
    }
}
