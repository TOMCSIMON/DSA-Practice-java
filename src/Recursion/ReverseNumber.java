package Recursion;

public class ReverseNumber {

    public static void main(String[] args) {

        int num = 23809;

        reverse(num);
    }

    public static void reverse(int num) {

        if(num < 10) {
            System.out.print(num);
        }else {
            System.out.print(num % 10);
            reverse(num / 10);
        }
    }
}
