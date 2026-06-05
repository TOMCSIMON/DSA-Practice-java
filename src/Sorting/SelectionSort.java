package Sorting;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {3,5,1,9,0,2};
        int len = arr.length;

        for(int i = 0; i < len - 1; i++) {

            int minIndex = i;

            for(int j = i + 1; j < len; j++) {

                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        for (int n : arr) {
            System.out.print(n + " ");
        }
    }

}
