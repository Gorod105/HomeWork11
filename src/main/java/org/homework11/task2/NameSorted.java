package org.homework11.task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NameSorted {
    public static void main(String[] args) {
        List<String> namesList = List.of(new String[]{"John", "Bill", "Max", "Alex", "John1", "Bill2", "Max3", "Alex4", "John5", "Bill6", "Zak", "Alex8"});
        Stream<String> names = namesList.stream()
                .map(name -> name.toUpperCase())
                .sorted(Comparator.reverseOrder());
        List<String> filteredNames = names.collect(Collectors.toList());
        System.out.println(filteredNames);
    }
}
