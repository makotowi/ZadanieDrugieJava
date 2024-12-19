package org.example.zadanie2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ZadanieDrugie{
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 10, 9, 4);

        List<Integer> result = numbers.stream()
                .map(n -> n * n + 9)
                .filter(num -> !String.valueOf(num).contains("9"))
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
