package com.mateuszszafarz;

public class Main {

    public static void main(String[] args) {
        int nSumFor10 = Series.nSum(10);
        System.out.println("nSum for 10: " + nSumFor10);

        int factorialFor10 = Series.factorial(10);
        System.out.println("factorial for 10: " + factorialFor10);

        int fibonacciFor10 = Series.fibonacci(10);
        System.out.println("fibonacci for 10: " + fibonacciFor10);
    }
}
