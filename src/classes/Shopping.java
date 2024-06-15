package classes;

public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int maxLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[maxLojas]; 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    public boolean insereLoja(Loja loja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = loja;
                return true;
            }
        }
        return false;
    }

    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equals(nomeLoja)) {
                lojas[i] = null;
                return true;
            }
        }
        return false; 
    }

    public int quantidadeLojasPorTipo(String tipoLoja) {
        int quantidade = 0;

        switch (tipoLoja.toLowerCase()) {
            case "cosmético":
                for (Loja loja : lojas) {
                    if (loja instanceof Cosmetico) {
                        quantidade++;
                    }
                }
                break;

            case "vestuário":
                for (Loja loja : lojas) {
                    if (loja instanceof Vestuario) {
                        quantidade++;
                    }
                }
                break;

            case "bijuteria":
                for (Loja loja : lojas) {
                    if (loja instanceof Bijuteria) {
                        quantidade++;
                    }
                }
                break;

            case "alimentação":
                for (Loja loja : lojas) {
                    if (loja instanceof Alimentacao) {
                        quantidade++;
                    }
                }
                break;

            case "informática":
                for (Loja loja : lojas) {
                    if (loja instanceof Informatica) {
                        quantidade++;
                    }
                }
                break;

            default:
                return -1; // Tipo de loja inválido
        }

        return quantidade;
    }

    public Informatica lojaSeguroMaisCaro() {
        Informatica maisCaro = null;
        double maiorSeguro = 0;

        for (Loja loja : lojas) {
            if (loja instanceof Informatica) {
                Informatica informatica = (Informatica) loja;
                double seguro = informatica.getSeguroEletronicos();
                if (seguro > maiorSeguro) {
                    maiorSeguro = seguro;
                    maisCaro = informatica;
                }
            }
        }

        return maisCaro;
    }

    @Override
    public String toString() {
        StringBuilder lojasStr = new StringBuilder();
        for (Loja loja : lojas) {
            if (loja != null) {
                lojasStr.append(loja.toString()).append("\n");
            }
        }

        return "Nome do shopping: " + nome + "\n" +
               "Endereço do shopping: " + endereco + "\n" +
               "Lojas no shopping:\n" + lojasStr.toString();
    }
}
