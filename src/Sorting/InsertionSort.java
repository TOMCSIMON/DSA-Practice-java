package Sorting;

public class InsertionSort {

    public static void main(String[] args) {

        int[] arr = {5,4,9,1,0,8};
        int len = arr.length;

        for(int i = 1; i < len; i++) {

            int temp = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j--];
            }
            arr[j + 1] = temp;
        }

        for(int n : arr) {
            System.out.print(n + " ");
        }
    }
}
