package FunctionalInterfaces.day1;

import java.util.Arrays;
import java.util.function.Function;

public class FunctionFunctionalInterface {

    public static void main(String[] args) {

        Function<String, String> reverse = (s) -> {
            String result="";
            for (int i = s.length()-1; i >= 0; i--) {
                result+= s.charAt(i);
            }
            return  result;
        };

        String str1 = reverse.apply("Cybertek");
        System.out.println(str1);

        System.out.println("--------------------");

        Function<int[], int[]> reverseIntArray = n -> {
            int[] arr = new int[n.length];
            int j=0;
            for (int i = n.length - 1; i >= 0; i--) {
                arr[j] = n[i];
                j++;
            }
            return arr;
        };
        int[] apply = reverseIntArray.apply(new int[]{1, 5, 2, -10});
        System.out.println(Arrays.toString(apply));

        System.out.println("--------------------");

        Function<String, Boolean> isPalindrome = (s) -> reverse.apply(s).equals(s);
        Boolean r = isPalindrome.apply("Cybertek");
        System.out.println(r);
    }
}
