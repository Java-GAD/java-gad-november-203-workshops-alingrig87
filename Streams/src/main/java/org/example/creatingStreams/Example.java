package org.example.creatingStreams;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
        // from collection

        // List
        List<String> list = Arrays.asList("A", "B", "C");
        Stream<String> stream = list.stream();

        // Set
        Set<Integer> set = new HashSet<>(Arrays.asList(1, 4, 5, 6));
        Stream<Integer> stream1 = set.stream();

        // Map
        Map<String, Integer> map =  new HashMap<>();
        Stream<String> keys = map.keySet().stream();
        Stream<Integer> values = map.values().stream();
        Stream<Map.Entry<String,Integer>> pairs = map.entrySet().stream();

        // Arrays
        int[] numbers = {1, 45, 5, 5, 3};
        IntStream intStream = Arrays.stream(numbers);

        // stream of
        Stream<String> stream3 = Stream.of("A", "B", "C");

        // generate
        Stream<String> generatedStream = Stream.generate(() -> "A");

        // interate
        Stream<Integer> evenNumbersStream = Stream.iterate(2, n -> n + 2);

        // concat
        Stream<String> s1 = Stream.of("A", "B", "C");
        Stream<String> s2 = Stream.of("D", "E", "F");
        Stream<String> concatenated = Stream.concat(s1, s2);
        concatenated.forEach(System.out::println);
    }
}
