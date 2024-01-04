package org.example.lambda;

public class Lambda {

    public static void main(String[] args) {
        Operator add = (a,b) -> a + b;
//        Operator add1 = (int a, int b) -> a + b;
//        Operator add2 = (int a, int b) -> { return a + b; };
        Operator multiply = (a, b) -> a * b;

        System.out.println(add.calculate(2,4));
        System.out.println(multiply.calculate(3,12));

        Operator add1 = new Add();
        add1.calculate(2, 5);
    }
}

interface Operator {
    public abstract int calculate(int a, int b);
}

class Add implements Operator {
    public int calculate(int a, int b) {
        return a + b;
    }
}