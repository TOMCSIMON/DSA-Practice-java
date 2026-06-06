package Sorting;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {2,4,9,2,0,1,8};

        int len = arr.length;

        for(int i = 0; i < len; i++) {

            for(int j = 0; j < len - i - 1; j++) {

                if(arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}
