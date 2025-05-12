package DiaDaSemana;

import java.lang.runtime.SwitchBootstraps;

    public class DiaSemana {


        public static void main(String[] args) {

            DiaDaSemana dia = DiaDaSemana.SABADO;

            switch (dia) {
                case SEGUNDA:
                    System.out.println("Hoje é segunda-feira, bom inicio de semana a todos.");
                    break;
                case TERCA:
                    System.out.println("Hoje é terça-feira.");
                    break;
                case QUARTA:
                    System.out.println("Hoje é quarta-feira.");
                    break;
                case QUINTA:
                    System.out.println("Hoje é quinta-feira.");
                    break;
                case SEXTA:
                    System.out.println("SEXTOUUUU!!");
                    break;
                case SABADO:
                    System.out.println("Hoje é sabado, bom fim de semana.");
                    break;
                case DOMINGO:
                    System.out.println("Hoje é domingo.");
                    break;
                default:
                    System.out.println("Dia invalido");

            }
        }
    }
