package classes;
public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12 || dia < 1 || dia > diasNoMes(mes, ano)) {
            System.out.println("Data inválida. Definindo para 1/1/2000.");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        } else {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
    }

    private int diasNoMes(int mes, int ano) {
        boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
        
        if (mes == 2 && bissexto) {
            return 29;
        }

        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return diasPorMes[mes - 1];
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // Método toString para retornar uma representação em string da data
    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
}
