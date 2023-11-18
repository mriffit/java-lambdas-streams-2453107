package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class SteamsMain {

    public static void main(String[] args) {
        Integer[] scores = new Integer[]{80, 66, 73, 92, 43};

        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("coffee");
        shoppingList.add("bread");
        shoppingList.add("pineapple");
        shoppingList.add("milk");
        shoppingList.add("pasta");

        Stream<String> shoppingListStream = shoppingList.stream();

        shoppingListStream
                .sorted()
                .map(item -> item.toUpperCase())
                .filter(item -> item.startsWith("P"))
                .forEach(item -> System.out.println(item));

        Stream<String> lettersStream = Stream.of("a","b","c","d");

    }

}
