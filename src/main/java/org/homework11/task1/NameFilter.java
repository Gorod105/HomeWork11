package org.homework11.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NameFilter {
    public static void main(String[] args) {
        List<String> namesList = List.of(new String[]{"John", "Bill", "Max", "Alex", "John1", "Bill2", "Max3", "Alex4", "John5", "Bill6", "Max7", "Alex8"});
        Stream<String> names = namesList.stream()
                .map(name -> (namesList.indexOf(name) + 1) + ". " + name)
                .filter(name -> (Integer.parseInt(name.split("\\.")[0]) % 2) == 1);

        List<String> filteredNames = names.collect(Collectors.toList());
        System.out.println(filteredNames);
    }
}
