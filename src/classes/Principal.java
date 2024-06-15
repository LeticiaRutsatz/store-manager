package classes;
import java.util.Scanner;

public class Principal {

    private static Scanner scanner = new Scanner(System.in); 

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("(1) criar uma loja");
            System.out.println("(2) criar um produto");
            System.out.println("(3) sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    Loja novaLoja = criarLoja(); 
                    System.out.print(novaLoja.toString());
                    break;
                case 2:
                    Produto novoProduto = criarProduto(); 
                    Data dataValidade = new Data(20, 10, 2023);
                    Boolean estaVencido = novoProduto.estaVencido(dataValidade);

                    String mensagem = estaVencido ? "PRODUTO VENCIDO" : "PRODUTO NÃO VENCIDO";
                    System.out.println(mensagem);

                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (opcao != 3);

        scanner.close();
    }

    public static Loja criarLoja() {
        System.out.println("Criando uma loja...");

        System.out.print("Digite o nome da loja: ");
        String nomeLoja = scanner.next(); 

        System.out.print("Digite a quantidade de funcionários da loja: ");
        int quantidadeFuncionarios = scanner.nextInt(); 

        System.out.print("Digite o salário base do funcionário da loja: ");
        double salarioBaseFuncionario = scanner.nextDouble(); 

        System.out.print("Digite a quantidade de estoque da loja: ");
        int estoqueProdutos = scanner.nextInt();

        System.out.println("Digite os detalhes do endereço da loja:");
        System.out.print("Nome da rua: ");
        String nomeRua = scanner.next();

        System.out.print("Cidade: ");
        String cidade = scanner.next();

        System.out.print("Estado: ");
        String estado = scanner.next();

        System.out.print("País: ");
        String pais = scanner.next();

        System.out.print("CEP: ");
        String cep = scanner.next();

        System.out.print("Número: ");
        String numero = scanner.next();

        System.out.print("Complemento: ");
        String complemento = scanner.next();

        Endereco enderecoLoja = new Endereco(nomeRua, cidade, estado, pais, cep, numero, complemento);

        System.out.println("Digite os detalhes da data de fundação da loja:");
        System.out.print("Dia: ");
        int dia = scanner.nextInt();

        System.out.print("Mês: ");
        int mes = scanner.nextInt();

        System.out.print("Ano: ");
        int ano = scanner.nextInt();

        Data dataFundacao = new Data(dia, mes, ano);

        System.out.println("Dados da loja criada!!");

        Loja loja = new Loja(nomeLoja, quantidadeFuncionarios, salarioBaseFuncionario, enderecoLoja, dataFundacao, estoqueProdutos);
        return loja;
    }

    public static Produto criarProduto() {
        System.out.println("Criando um produto...");

        System.out.print("Digite o nome do produto: ");
        String nomeProduto = scanner.next(); 

        System.out.print("Digite o preço do produto: ");
        double precoProduto = scanner.nextDouble(); 

        System.out.println("Digite os detalhes da data de validade do produto:");
        System.out.print("Dia: ");
        int dia = scanner.nextInt();

        System.out.print("Mês: ");
        int mes = scanner.nextInt();

        System.out.print("Ano: ");
        int ano = scanner.nextInt();

        Data dataValidade = new Data(dia, mes, ano);

        Produto produto = new Produto(nomeProduto, precoProduto, dataValidade);
        return produto;
    }
}
