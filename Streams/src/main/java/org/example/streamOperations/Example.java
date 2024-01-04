package org.example.streamOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
        // filter
        List<Integer> numbers = Arrays.asList(1, 2, 4, 5, 6, 7, 7, 8);
        Stream<Integer> evenNumbersStream = numbers.stream().filter(number -> number % 2 == 0);
        List<Integer> evenNumbers = evenNumbersStream.collect(Collectors.toList());

        // map
        Stream<Integer> squaredNumbersStream = numbers.stream().map(number -> number * number);
        squaredNumbersStream.forEach(System.out::println);

        ArrayList<Masina> listaMasini = new ArrayList<>();

        listaMasini.add(new Masina("Audi", "A3"));
        listaMasini.add(new Masina("BMW", "X5"));
        listaMasini.add(new Masina("Mercedes", "C-Class"));
        listaMasini.add(new Masina("Toyota", "Corolla"));
        listaMasini.add(new Masina("Honda", "Accord"));
        listaMasini.add(new Masina("Ford", "Mustang"));
        listaMasini.add(new Masina("Chevrolet", "Camaro"));
        listaMasini.add(new Masina("Nissan", "Altima"));
        listaMasini.add(new Masina("Volkswagen", "Golf"));
        listaMasini.add(new Masina("Tesla", "Model 3"));
        listaMasini.add(new Masina("Hyundai", "Elantra"));
        listaMasini.add(new Masina("Mazda", "CX-5"));
        listaMasini.add(new Masina("Subaru", "Outback"));
        listaMasini.add(new Masina("Kia", "Sorento"));
        listaMasini.add(new Masina("Volvo", "XC60"));
        listaMasini.add(new Masina("Jaguar", "F-Pace"));
        listaMasini.add(new Masina("Lexus", "RX"));
        listaMasini.add(new Masina("Porsche", "911"));
        listaMasini.add(new Masina("Ferrari", "488"));
        listaMasini.add(new Masina("Lamborghini", "Huracan"));

        listaMasini.stream().map(masina -> masina.brand + " " + masina.model).forEach(System.out::println);

        // distinct
        List<Integer> distinctNumbers = numbers.stream().distinct().collect(Collectors.toList());
        distinctNumbers.forEach(number -> System.out.print(number + " -> "));

        // sorted
        List<Masina> sortedByBrandCars = listaMasini.stream().sorted().collect(Collectors.toList());
        sortedByBrandCars.forEach(System.out::println);

        // limit
        numbers.stream().sorted().limit(2).forEach(System.out::println);

        // skip
        numbers.stream().skip(3).forEach(System.out::println);

        // reduce
        int sum = Stream.iterate(2, n -> n + 2).limit(100).reduce(0, (subtotal, number) -> subtotal + number);

        System.out.println("Sum = " + sum);
        System.out.println(sumOfEvenNumbers(2,100));

        System.out.println(factorial(6));

        // count
        System.out.println(listaMasini.stream().filter(masina -> masina.model.startsWith("C")).count());

    }

    public static int sumOfEvenNumbers(int start, int howMany) {
        return Stream.iterate(start, n -> n + 2).limit(howMany).reduce(0, (subtotal, number) -> subtotal + number);
    }

    public static int factorial(int n) {
        return Stream.iterate(1, no -> no + 1).limit(n).reduce(1, (fact, no) -> fact * no);
    }
    // fact =  1
    // for i to n
    // fact = fact * i
}

class Masina implements Comparable {
    public String brand;
    public String model;

    public Masina(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return brand + " " + model;
    }

    @Override
    public int compareTo(Object o) {
        return this.brand.compareTo(((Masina)o).brand);
    }
}
