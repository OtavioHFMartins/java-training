package CalculadorDeArea;

import javax.print.DocFlavor;

public class CalculadoraArea {
      private Double base;
      private Double raio;
      private Double altura;
      private int lado;


        //  quadrado
      public int calcularArea (int lado){
          return lado * lado;
      }
         // retangulo
      public Double calcularArea (Double base, Double altura){
          return base * altura;
      }
        // circulo
      public Double calcularArea (Double raio) {
          return Math.PI * raio * raio;
      }




  }


