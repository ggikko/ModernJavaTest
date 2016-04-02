package me.ggikko.stream;

import java.util.stream.IntStream;

/**
 * Created by Park Ji Hong, ggikko.
 */
public class StreamTest {

    public static void main(String[] args) {
        IntStream.iterate(1, i -> i+1).forEach(i -> System.out.printf(""+ i));

    }
}
