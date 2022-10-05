package FunctionalInterfaces.day2;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerFunctionalInterface {

    public static void main(String[] args) {
        BiConsumer<String,Integer> printMultipleTimes = (s, n) -> {
            for (Integer i = 0; i < n; i++) {
                System.out.println(s);
            }
        };
        printMultipleTimes.accept("Cybertek", 5);

        System.out.println("------------------------");

        //employee name & hireDate
        Map<String, LocalDate> map = new LinkedHashMap<>();
        map.put("John", LocalDate.of(2020,10,25));
        map.put("Jimmy", LocalDate.of(2019,10,25));
        map.put("Aaron", LocalDate.of(2018,10,25));
        map.put("Shay", LocalDate.of(2017,10,25));

        map.forEach((s,d) -> {
            if(d.getYear()<2019){
                System.out.println(s);
            }
        });
        System.out.println(LocalDate.now());
    }
}
