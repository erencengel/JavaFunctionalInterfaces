package FunctionalInterfaces.day1;

import java.util.Arrays;

public class CustomFunctionalInterface {

    public static void main(String[] args) {

        StringFunctions longestString = (s1, s2) -> {
            if(s1.length()>s2.length()) return s1; return s2;
        };
        System.out.println(longestString.function("Java", "C++"));

        System.out.println("------------------");

         DataFunction<String> reverse = s -> {
             return new StringBuilder(s).reverse().toString();
         };

        System.out.println(reverse.function("Aslıhan"));

        System.out.println("-----------------");

        DataFunction<Integer> cube = n -> n*n*n;
        System.out.println(cube.function(10));

        DataFunction<int[]> sum = n -> {
            int[] array1 = new int[n.length];
            for (int i = 0; i < n.length; i++) {
                array1[i] = n[i]*2;
            }
            return array1;
        };
        System.out.println(Arrays.toString(sum.function(new int[]{1,2,3})));
    }
}
