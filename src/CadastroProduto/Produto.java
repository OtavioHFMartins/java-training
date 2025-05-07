package CadastroProduto;

    public class Produto {

    private String nome;
    private int quantidade;
    private Double preco;

    public Produto(String nome, int quantidade, Double preco){

        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

        public Double getPreco() {
            return preco;
        }

        public void setPreco(Double preco) {
            this.preco = preco;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void exibirInformacoes(){
            System.out.println("nome:" + nome);
            System.out.println("quantidade:" + quantidade);
            System.out.println("preço:" + preco);
        }





    }
