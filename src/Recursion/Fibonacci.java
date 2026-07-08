package Recursion;

public class Fibonacci {

    public static void main(String[] args) {

        int n = 6;
        //Fibonacci series = 0 1 1 2 3 5 8 13 ....
        // * find nth Fibonacci number
        System.out.println(n + " th Fibonacci number: " + fib(n));// 6 th Fibonacci number: 8
    }

    static int fib(int n) {

        // 0 indexed
        // base condition based on 0th Fibonacci number is 0 first Fibonacci number is 1
        if(n <= 1) return n;
        // recursion is based on the nth number from Fibonacci series is n = n -1 + n - 2
        // For instance  3 = 1 + 2
        return fib(n - 1) + fib(n - 2);
    }
}
