package org.homework11.task4;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RandomNumbers {
    public static void main(String[] args) {
        List<Long> outer = random().limit(30).collect(Collectors.toList());
        System.out.println(outer);
    }

    public static Stream<Long> random() {
        long a = 25214903917L;
        long c = 11L;
        long m = (long) Math.pow(2,48);
        Stream<Long> result = Stream.iterate(1L, x1 -> (a * x1 + c) % m);
        return result;

    }
}
