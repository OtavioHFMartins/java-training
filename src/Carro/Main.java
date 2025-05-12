package Carro;

    public class Main {

        public static void main(String[] args) {
            Carro primeiroCarro = new Carro("Chevrolet","Onix",2005);
            primeiroCarro.exibirInformacoes();
            System.out.println();
            Carro segundoCarro = new Carro("Ferrari","Puro-Sangue",2025);
            segundoCarro.exibirInformacoes();
        }


    }
