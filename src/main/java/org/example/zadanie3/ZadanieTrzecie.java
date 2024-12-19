package org.example.zadanie3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ZadanieTrzecie {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("aa", "cy", "b", "yycd", "c");

        List<String> result = input.stream()
                .map(s -> s + "y")
                .filter(str -> !str.contains("yy"))
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
