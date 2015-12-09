package me.ggikko;

import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;
import com.sun.xml.internal.fastinfoset.stax.factory.StAXOutputFactory;
import jdk.management.resource.ResourceId;

import java.lang.reflect.Array;
import java.nio.file.DirectoryStream;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * Created by Park Ji Hong, ggikko.
 */

public class MainTest {

    public static void main(String[] args) {

        //Test for Function
        final Function<Integer, String> toString = value -> String.valueOf(value);
        String temp = toString.apply(100);
//        System.out.println(temp);

        //Test for Consumer
//        final Consumer<String> print = value -> System.out.println("hello" + value);
//        print.accept("ggikko");

        //Test for Predicate
        Predicate<Integer> isPositive = tempInt -> tempInt > 0;
//        System.out.println(String.valueOf(isPositive.test(1)));

        List<Integer> number = Arrays.asList(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5);
        List<Integer> positiveNumbers = new ArrayList<>();
        for (Integer num : number) {
            if (isPositive.test(num)) {
                positiveNumbers.add(num);
            }
        }

        Supplier<String> helloSupplier = () -> "hello";
//        System.out.println("ggikko " + helloSupplier.get());

        List<Integer> randomIntList = Arrays.asList(1, 6, 2, 12, 44, 21, 212, 44, 11,
                12, 12, 22, 22, 34 , 22, 12, 22, 22,
                124,12,1,24,1,212,44,212,1224,442,4124,12414,1414,35434,52436,32637,234512,334234,214,1234123,42314,
                1234123,42134,1234,2314,12,41,24132,4132,5,123512,512,35213,5123,5213,5213,5231,5123,5);


//        long start2 = System.currentTimeMillis();
//        for(int value : randomIntList){
//            if(value > 10) System.out.printf("value : " + String.valueOf(value) + ", ");
//        }
//        long elapsed2 = System.currentTimeMillis() - start2;
//        System.out.printf(String.valueOf("\nTime2 : " + elapsed2));
//
//        long start = System.currentTimeMillis();
//        randomIntList
//                .parallelStream()
//                .filter(value -> value > 10)
//                .forEach(value -> System.out.printf("value : " + String.valueOf(value) + ", "));
//        long elapsed = System.currentTimeMillis() - start;
//        System.out.printf(String.valueOf("\nTime : " + elapsed));
//


//        randomIntList.stream()
//                .filter((weight1, weight2) -> weight1.compareTo(weight2) >0)
//        )

        Integer a =4;
        Integer b =5;
//        System.out.printf(String.valueOf(a.compareTo(b) <0));

        Comparator<Integer> integerComparator = (Integer a1, Integer a2) -> a1.compareTo(a2);
//        System.out.printf(String.valueOf("\n" +integerComparator.compare(3,2) + "\n" ));

        Predicate<List<Integer>> test = (List<Integer> es) -> !es.isEmpty();
//        System.out.printf(String.valueOf(test.test(randomIntList)));

        List<String> strings = Arrays.asList("감자에서먹", "궁극적인", "밥을먹었다", "캐맛", "로봇", "밥집");

        List<String> saa = strings.parallelStream()
                .filter(s -> !s.contains("에서"))
                .filter(s -> !s.contains("먹었"))
                .collect(toList());
        saa.sort(Haha::fifi);

        System.out.printf(saa.get(0));



//        System.out.printf("\nhaha : " + String.valueOf(integerStream));

    }

    public static class Haha{

        public boolean fifi(String args){
            return args.contains("궁극");
        }

        public static int fifi(String s, String s1) {
            return 0;
        }
    }


    //generic filter
    private static <T> List<T> filter(List<T> list, Predicate<T> filter) {
        List<T> result = new ArrayList<>();
        for (T input : list) {
            result.add(input);
        }
        return result;
    }


}
