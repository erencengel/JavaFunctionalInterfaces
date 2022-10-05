package FunctionalInterfaces.day2;

import java.util.*;
import java.util.function.BiFunction;

public class BiFunctionFunctionalInterface  {

    public static void main(String[] args) {
        BiFunction<int[], int[], List<Integer>> addArrays = (arr1, arr2) -> {
            List<Integer> list = new ArrayList<>();
            for (int i : arr1) list.add(i);
            for (int i : arr2) list.add(i);
            return list;
        };
        System.out.println(addArrays.apply(new int[]{1, 2}, new int[]{0, -20, 100}));
        System.out.println("---------------");

        BiFunction<List<Integer>, List<String>, Map<Integer,String>> sumOfMap = (a,b) -> {
            Map<Integer,String> map = new LinkedHashMap<>();
            for(int i = 0; i<a.size() && i<b.size(); i++){
                map.put(a.get(i), b.get(i));
            }
            return map;
        };
        List<Integer> l1 = new ArrayList<>(Arrays.asList(1,2,3,4));
        List<String> l2 = new ArrayList<>(Arrays.asList("Aslıhan Zeynep", "Alperen", "Şerife", "Eren"));
        sumOfMap.apply(l1,l2).forEach((m,n) -> System.out.println(m + " " + n));
        System.out.println(sumOfMap.apply(l1, l2));
    }

}
