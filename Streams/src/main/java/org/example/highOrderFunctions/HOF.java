package org.example.highOrderFunctions;

import java.util.function.IntBinaryOperator;

public class HOF {
    public static void main(String[] args) {
        IntBinaryOperator add = (a, b) -> a + b;
        IntBinaryOperator multiply = (a, b) -> a * b;

        calculateAndDisplay(2, 5, add);
        calculateAndDisplay(2, 8, multiply);
    }

    public static void calculateAndDisplay(int a, int b, IntBinaryOperator operator) {
        int result = operator.applyAsInt(a, b);
        System.out.println("Result: " +  result);
    }
}
