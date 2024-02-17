package org.homework11.task3;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class GetAllNumber {
    public static void main(String[] args) {
        String[] stringsArray = new String[]{"1, 2, 0", "4, 5"};
        List<String> result = Arrays.stream(stringsArray)
                .map(s -> s.split(","))
                .flatMap(Arrays::stream)
                .map(s -> s.trim())
                .sorted()
                .collect(Collectors.toList());
        System.out.println(result);


    }
}
