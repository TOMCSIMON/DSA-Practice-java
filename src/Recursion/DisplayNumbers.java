package Recursion;

public class DisplayNumbers {

    public static void main(String[] args) {

        int n = 5;
        display(n);
    }

    public static void display(int num) {

        if(num == 1){
            System.out.println(num);
        }else {

            display(num - 1);
            System.out.println(num);
        }
    }
}
