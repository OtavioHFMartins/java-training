package Array;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ArrayList {

    public static void main(String[] args) {

       int[] numbers = {1,2,3,4,5,6};

        System.out.println("Numeros do array");
       for (int number : numbers ) {
           System.out.println(number);
       }
        System.out.println("Extraindo numeros pares do array com filter");
        Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
        System.out.println("dobrando os valores com map");
        Arrays.stream(numbers)
                .map(n -> n * 2)
                .forEach(System.out::println);



    }


}
