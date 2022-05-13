package sorting;

import java.util.Arrays;

public class May13 {


    public static void bubbleSort(int[] arr) {
        //Setting the target
        for (int i = arr.length - 1; i >= 0; i--) {  // i is the target index

            //Logic to move largest element to the ith index
            boolean isSorted = true;
            for (int j = 0; j < i; j++) {
                //start comparing j and j+1 element
                if (arr[j] > arr[j + 1]) {
                    //swap j and j+1
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted = false;
                }
            }
            if (isSorted) {
                break; // It means array is already sorted. Stop iterating
            }
        }
    }


    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            //Now need to find the smallest element i->end and swap it with ith index
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            //min represent the index where there is smallest element

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};

        System.out.println(Arrays.toString(arr));

        selectionSort(arr);

        System.out.println(Arrays.toString(arr)); // Sorted array
    }

}
