package FunctionalInterfaces.day1;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierFunctionalInterface {

    public static void main(String[] args) {

        Supplier<String> returnCyberTek = () -> "Cybertek";      //means {return "Cybertek";};
        System.out.println(returnCyberTek.get());

        System.out.println("--------------------");
        Supplier<int[]> returnIntArray = () -> {
            int[] array = new int[5];
            for (int i = 0; i < array.length; i++) {
                array[i] = new Random().nextInt();
            }
            return array;
        };
        int[] arr = returnIntArray.get();
        System.out.println(Arrays.toString(arr));

        System.out.println("--------------------");

        Supplier<Double> returnDecimal = () -> new Random().nextDouble();
        System.out.println(returnDecimal.get());

    }
}
