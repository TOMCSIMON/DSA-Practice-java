package Sorting;

public class MergeSort {

    public static void main(String[] args) {

        int[] arr = {38, 27, 43, 3, 9, 82, 10};

        mergeSort(arr);

        for(int n : arr) {
            System.out.print(n + " ");
        }
    }

    public static void mergeSort(int[] arr) {

        int len = arr.length;

        if(len <= 1) return;

        int mid = len / 2;
        int[] leftArr = new int[mid];
        int[] rightArr = new int[len - mid];

        int i = 0, j = 0;

        for(; i < len; i++) {

            if(i < mid) {
                leftArr[i] = arr[i];
            }
            else {
                rightArr[j++] = arr[i];
            }
        }

        mergeSort(leftArr);
        mergeSort(rightArr);

        merge(leftArr, rightArr, arr);

    }

    private static void merge(int[] leftArr, int[] rightArr, int[] arr) {

        int leftLen = leftArr.length;
        int rightLen = rightArr.length;

        int i = 0, l = 0, r = 0;

        while(l < leftLen && r < rightLen) {

            if(leftArr[l] < rightArr[r]) {
                arr[i++] = leftArr[l++];
            }
            else {
                arr[i++] = rightArr[r++];
            }
        }

        while(l < leftLen) {
            arr[i++] = leftArr[l++];
        }
        while(r < rightLen) {
            arr[i++] = rightArr[r++];
        }
    }

}
