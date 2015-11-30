package me.ggikko;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Created by Park Ji Hong, ggikko.
 */
public class MainTest {

    public static void main(String[] args) {

        //Test for Function
        final Function<Integer, String> toString = value -> String.valueOf(value);
        String temp = toString.apply(100);
        System.out.println(temp);

        //Test for Consumer
        final Consumer<String> print = value -> System.out.println("hello" + value);
        print.accept("ggikko");

        //Test for Predicate
        Predicate<Integer> isPositive = tempInt -> tempInt>0;
        System.out.println(String.valueOf(isPositive.test(1)));

        List<Integer> number = Arrays.asList(-5,-4,-3,-2,-1,0,1,2,3,4,5);
        List<Integer> positiveNumbers = new ArrayList<>();
        for(Integer num : number){
            if(isPositive.test(num)){
                positiveNumbers.add(num);
            }
        }
        System.out.println("positiveNumbers = " + positiveNumbers);

        Supplier<String> helloSupplier = () -> "hello";
        System.out.println("ggikko " + helloSupplier.get());

    }

    //generic filter
    private static <T> List<T> filter(List<T>list, Predicate<T> filter){
        List<T> result = new ArrayList<>();
        for(T input : list){
            result.add(input);
        }
        return result;
    }

}
