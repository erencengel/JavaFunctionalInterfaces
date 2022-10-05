package FunctionalInterfaces.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiPredicate;

public class BiPredicateFunctionalInterface {

    public static void main(String[] args) {

        BiPredicate<int[], Integer> contains = (arr, e) -> {
            for (int i : arr) {
                if(i == e) return true;
            }
            return false;
        };
        System.out.println(contains.test(new int[]{0, 1, 2}, 5));

        System.out.println("---------------------");

        BiPredicate<String, String> anagram = (s1,s2) -> {
            char[] c1 = s1.toLowerCase().toCharArray();
            Arrays.sort(c1);
            char[] c2 = s2.toLowerCase().toCharArray();
            Arrays.sort(c2);
            if(Arrays.equals(c1,c2)) return true;
            return false;
        };
        System.out.println(anagram.test("Aslıhan", "NAHılsa"));

        System.out.println("---------------------");

        BiPredicate<List<Integer>, Integer> isDuplicated = (l, e) -> Collections.frequency(l,e) > 1;

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,1,1,2,3,3,4,5,5,6));
        for (Integer integer : list) {
            if(!isDuplicated.test(list,integer)) System.out.print(integer + " ");
        }
        System.out.println("");
        System.out.println("---------------------");

        list.forEach( n -> {
            if(!isDuplicated.test(list,n)) System.out.print(n + " ");
        });

    }
}
