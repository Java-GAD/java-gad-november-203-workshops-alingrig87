package org.example.pureFunctions;

public class Example {
    private static int globalSum = 0;
    public static int add(int a, int b) {
        return a + b;
    }

    public static int  addAndUpdate(int a, int b) {
        globalSum += a + b;
        return globalSum;
    }

    public static void main(String[] args) {
        int result = add(2, 5);
        System.out.println("Result = " + result);

        int result1 = addAndUpdate(2, 8);
        int result2 = addAndUpdate(2, 8);
        int result3 = addAndUpdate(2, 8);
        System.out.println(result1 + " " + result2 + " " + result3);
    }
}
