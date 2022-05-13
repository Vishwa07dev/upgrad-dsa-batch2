package sorting;

import java.util.Arrays;

public class May13 {


    public static void bubbleSort(int[] arr){
        //Setting the target
        for(int i = arr.length-1;i>=0;i--){  // i is the target index

            //Logic to move largest element to the ith index
            boolean isSorted = true ;
            for(int j=0;j<i;j++){
                //start comparing j and j+1 element
                if(arr[j]>arr[j+1]){
                    //swap j and j+1
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                    isSorted= false ;
                }
            }
            if(isSorted){
                break; // It means array is already sorted. Stop iterating
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};

        System.out.println(Arrays.toString(arr));

        bubbleSort(arr);

        System.out.println(Arrays.toString(arr)); // Sorted array
    }

}
