package CalculadorDeArea;

import java.util.ArrayList;

public class Main {

        public static void main(String[] args) {
            CalculadoraArea calculadora = new CalculadoraArea();

            Double areaRetangulo = calculadora.calcularArea(5.0,5.0);
            Double areaCirculo = calculadora.calcularArea(5.0);
            int areaQuadrado = calculadora.calcularArea(5);

            System.out.println("Forma: " + FormaGeometrica.CIRCULO +" "+ "Area:" + areaCirculo);
            System.out.println("Forma: " + FormaGeometrica.RETARGULO +" "+ "Area:" + areaRetangulo);
            System.out.println("Forma: " + FormaGeometrica.QUADRADO +" "+"Area:" + areaQuadrado);

        }


    }
