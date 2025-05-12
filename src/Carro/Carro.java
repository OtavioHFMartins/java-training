package Carro;

public class Carro {
        private String marca;
        private String modelo;
        private int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }


    public int getData() {
        return ano;
    }

    public void setData(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void exibirInformacoes(){
        System.out.println("MARCA:" + marca);
        System.out.println("MODELO:" + modelo);
        System.out.println("ANO:" + ano);
    }
}
