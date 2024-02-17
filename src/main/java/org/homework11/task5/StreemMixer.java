package org.homework11.task5;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreemMixer {
    public static void main(String[] args) {
        Stream<String> first = Stream.of("a","b","c","d");
        Stream<String> second = Stream.of("a","b","c");
        Stream<String> result = zip(first,second);
        result.forEach(System.out::println);
    }
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        ArrayList<T> tempArray= new ArrayList<>();
        List<T> temp1 = first.toList();
        List<T> temp2 = second.toList();
        int size1 = temp1.size();
        int size2 = temp2.size();
        int i = 0;
        while (size1 != 0  && size2 != 0){
            tempArray.add(temp1.get(i));
            tempArray.add(temp2.get(i));
            size1--;
            size2--;
            i++;
            System.out.println(tempArray);
        }
        return tempArray.stream();
    }
}
