package Recursion;

public class Factorial {

    public static void main(String[] args) {

        int n = 5;

        int result = factorial(n);

        System.out.println(result);
    }

    public static int factorial(int num) {

        int fact;

        if(num == 1) {
            return num;
        }
        else {
            fact = num * factorial(num - 1);
            return fact;
        }
    }
}
