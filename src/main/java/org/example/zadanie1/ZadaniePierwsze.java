package org.example.zadanie1;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class ZadaniePierwsze {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(45, 39, 17, 25, 10, 4);

        OptionalDouble average = numbers.stream()
                .filter(n -> {
                    int lastDigit = n % 10;
                    return lastDigit != 9 && lastDigit != 7;
                })
                .mapToInt(Integer::intValue)
                .average();

        if (average.isPresent()) {
            System.out.println("Średnia wynosi: " + average.getAsDouble());
        } else {
            System.out.println("Brak elementów po filtracji.");
        }
    }
}