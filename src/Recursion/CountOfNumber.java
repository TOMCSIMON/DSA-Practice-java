package Recursion;

public class CountOfNumber {

    public static void main(String[] args) {

        int num = 9382;
        System.out.println(numberOfDigits(num));
    }

    public static int numberOfDigits(int num) {

        if(num < 10) {

            return 1;
        }else {
            return   1 + numberOfDigits(num / 10);
        }


    }
}
