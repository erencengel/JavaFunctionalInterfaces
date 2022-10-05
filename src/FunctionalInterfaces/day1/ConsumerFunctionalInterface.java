package FunctionalInterfaces.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerFunctionalInterface {

    public static void main(String[] args) {

        Consumer<String> printThreeTimes = s -> System.out.println(s+s+s);
        printThreeTimes.accept("Aslıhan ");

        System.out.println("-----------------------");

        Consumer<List<String>> printEach = list -> {
            for (String s : list) {
                System.out.print(s + " ");
            }
            System.out.println();
        };
        printEach.accept(new ArrayList<>(Arrays.asList("Aslıhan", "Alperen")));

        System.out.println("-----------------------");
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        //my way
        Consumer<List<Integer>> numbersTimesTwo = s -> {
            List<Integer> newList = new ArrayList<>();
            for (Integer integer : s) {
                newList.add(integer*2);
            }
            System.out.println(newList);
        };
        numbersTimesTwo.accept(numbers);

        System.out.println("-----------------------");

        //Muhtar's way
        /*Consumer<List<Integer>>multiplyBy2 = list -> {

        };*/
        //I can assume that forEach providing us there is a loop already
        numbers.forEach(n -> System.out.println(n*2));

        System.out.println("-----------------------");

        List<String> elements = new ArrayList<>();
        elements.addAll(Arrays.asList("Java", "Java", "Cybertek", "Phyton", "Phyton"));
        List<String> duplicateElements = new ArrayList<>();
        Predicate<String> isDuplicated = p -> Collections.frequency(elements, p) > 1;
        elements.forEach(s -> {
            if (isDuplicated.test(s)){
                if (!duplicateElements.contains(s))  duplicateElements.add(s);
            }
        });
        System.out.println(duplicateElements);

        System.out.println("-----------------------");

        Consumer<int[]> printDescendingOrder = arr -> {
          Arrays.sort(arr);
            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.print(arr[i]+ " ");
            }
            System.out.println();
        };

        int[] array = {10,20,30,5,4,3,1,2,100,0};
        printDescendingOrder.accept(array);

    }
}
