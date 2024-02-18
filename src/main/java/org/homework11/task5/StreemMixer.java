package org.homework11.task5;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreemMixer {
    public static void main(String[] args) {
        Stream<String> first = Stream.of("a","b","c","d");
        Stream<String> second = Stream.of("a","b","c");
        Stream<String> result123 = zip(first,second);
        result123.forEach(System.out::println);
    }
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> iterator1 = first.iterator();
        Iterator<T> iterator2 = second.iterator();
        List<T> result = new ArrayList<>();

        while (iterator1.hasNext() && iterator2.hasNext()){
            result.add(iterator1.next());
            result.add(iterator2.next());
        }
        return result.stream();
    }
}
