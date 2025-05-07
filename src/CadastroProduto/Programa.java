package CadastroProduto;

    public class Programa {

        public static void main(String[] args) {


         Produto produto1 = new Produto("notebook",5, 3000.00);
         Produto produto2 = new Produto("celular",11, 1500.00);
            produto1.exibirInformacoes();
            System.out.println("-----------------");
            produto2.exibirInformacoes();

        }



}
