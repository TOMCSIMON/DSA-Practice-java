package Recursion;

public class SumOfNum {

    public static void main(String[] args) {

        int n = 10;
        int result = totalSum(n);
        System.out.println(result);
    }

    public static int totalSum(int num) {

        if (num <= 1) {
            return num;
        } else {
            return num + totalSum(num - 1);
        }
    }
}
