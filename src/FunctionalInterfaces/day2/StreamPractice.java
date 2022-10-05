package FunctionalInterfaces.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {

    public static void main(String[] args) {
        //MAP
        //void - affect any of them based on given condition
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list = list.stream().map( e -> e*3).collect(Collectors.toList());
        System.out.println(list);
        //add 5 to every single add numbers in the list
        list = list.stream().map( e-> {
            if(e%2!=0)
                return e+5;
            return e;
        }).collect(Collectors.toList());
        System.out.println(list);

        System.out.println("-----------------");

        //FİLTER
        //Get a new collection based on filtering condition
        List<Integer> numbers = list.stream().filter(p -> p%3 == 0).map(n -> n*2).collect(Collectors.toList());
        System.out.println(numbers);

        System.out.println("-----------------");

        //SKIP
        //Ignore till a certain point
        List<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("John","Jimmy","James","Breanna", "Shay","Josh"));
        students.stream().skip(3).forEach(n -> System.out.println(n));
        students.stream().skip(3).map(s -> s.toUpperCase()).forEach(n -> System.out.println(n));
        students.stream().skip(3).map(s -> s.charAt(0) + "" + s.charAt(s.length()-1)).forEach(n -> System.out.println(n));

        System.out.println("-----------------");

        //DISTINCT
        //Avoids to duplicate

        Integer[] array = {1,1,1,1,2,2,2,2,2,2,2,2,3,3,3,3,3,4,4,4,4,4,5,5,5,5,6,6,6,6};
        System.out.println(Arrays.asList(array).stream().distinct().collect(Collectors.toList()));
        array = Arrays.asList(array).stream().distinct().collect(Collectors.toList()).toArray(new Integer[0]);
        System.out.println(Arrays.toString(array));

        System.out.println("-----------------");

        //LIMIT
        //Reverse of Skip
        List<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,0,10));
        System.out.println(nums.stream().limit(5).collect(Collectors.toList()));

        System.out.println("-----------------");

        //REDUCE
        //It just returns one single value based on the given conditions
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4));
        int result = list2.stream().filter(p -> p % 2 != 0).reduce(0, (x, y) -> x + y);
        System.out.println(result);

        List<String> words = new ArrayList<>(Arrays.asList("Java", "Java", "Anna", "Level", "Kayak", "Phyton", "Bob"));
        String palindromes = words.stream().filter(n -> new StringBuilder(n.toLowerCase()).reverse().toString().equals(n.toLowerCase())).reduce("", (x, y) -> x + " " + y);
        System.out.println(palindromes);

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java", "Cybertek", "School","James", "Anna", "Phyton", "Cava"));
        String reduce = names.stream().filter(p -> p.contains("a") || p.contains("A")).reduce("", (x,y) -> x + " " + y);
        System.out.println(reduce);


        System.out.println("-----------------");

        //ALLMATCH
        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        boolean allEven = list3.stream().allMatch(p -> p%2 == 0);
        System.out.println(allEven);
        boolean lessThanEleven = list3.stream().allMatch(p -> p<11);
        System.out.println(lessThanEleven);
        boolean eitherOddOrEven = list3.stream().allMatch(p -> p%2 == 0 || p%2 != 0);
        System.out.println(eitherOddOrEven);

        System.out.println("-----------------");

        //ANYMATCH
        List<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        boolean b = list4.stream().anyMatch(p -> p > 5 && p < 9);
        System.out.println(b);


    }
}
