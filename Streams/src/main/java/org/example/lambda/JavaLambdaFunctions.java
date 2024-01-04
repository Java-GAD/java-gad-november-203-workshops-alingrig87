package org.example.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaLambdaFunctions {
    public static void main(String[] args) {
        // Function<T,R>
        Function <String, Integer> wordLength = s -> s.length();
        List<String> countries = Arrays.asList("Romania", "Germany", "France", "Italy");
        List<Integer> noOfCharsPerCountry = countries
                                                .stream()
                                                .map(country -> wordLength.apply(country))
                                                .collect(Collectors.toList());

        noOfCharsPerCountry.forEach(n -> System.out.println(n));

        // Predicate<T>
        Predicate<Person> canDrive = p -> p.age > 18;
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Costel", 12));
        persons.add(new Person("Daniel", 22));
        persons.add(new Person("Ionela", 55));
        persons.add(new Person("Mirela", 3));
        persons.add(new Person("Carmen", 32));

        persons.forEach(System.out::println);

        System.out.println("Can drive persons:");
        persons.stream().filter(canDrive).forEach(System.out::println);

        // Consumer<T>
        Consumer<Person> printSpecialMessage = p -> System.out.println("I am " + p.name + " and " + " I " + (p.age > 18 ? "can " : "cannot ") + "drive");
        persons.forEach(printSpecialMessage);
        persons.stream().filter(canDrive).forEach(printSpecialMessage);

        // Supplier<T>
        Supplier<Double> randomNumber = () -> Math.random();
        Stream.generate(randomNumber).limit(10).forEach(System.out::println);

        Supplier<Integer> dice = () -> (int)(Math.random() * 6) + 1;
        Stream.generate(dice).limit(2).forEach(System.out::println);
        Stream.generate(dice).limit(2).forEach(System.out::println);
        Stream.generate(dice).limit(2).forEach(System.out::println);
        Stream.generate(dice).limit(2).forEach(System.out::println);
        Stream.generate(dice).limit(2).forEach(System.out::println);

        // Comparator
        Comparator<Person> comparePersons = (person1, person2) -> person1.age - person2.age;
        persons.sort(comparePersons);
        persons.forEach(System.out::println);
    }
}

class Person {
    int age;
    String name;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Name: " + name + " age: " + age;
    }
}