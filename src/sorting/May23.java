package sorting;

import java.util.Arrays;

public class May23 {


    public static int pivotIndex(int[] arr , int start, int end){

        int pivot = arr[end]; // last element has been choosen as the pivot
        int p = start-1; //initial value of pivot index

        for(int i=start;i<end;i++){
            if(arr[i]<pivot){
                p++;
                swap(arr,p,i);
            }
        }
        p++;
        swap(arr,p,end);

        return p;
    }

    /**
     *
     * quickSort(arr, 0, 5) -> sort the elements from 0 to 5 index
     *
     *
     * quickSort(arr, 3, 5) ->sort the elements from 3 to 5 index
     */
    public void quickSort(int[] arr, int start , int end){

       //Base condition
        if(start >= end){
            return ;
        }

        int pi = pivotIndex(arr,start, end);

        /**
         * everything to the left of pi will be smaller
         * and everything to the right of pi will be bigger
         */
        quickSort(arr,start,pi-1);
        quickSort(arr,pi+1,end);
    }

    private static void swap(int[] arr, int p, int i) {

        int temp = arr[p];
        arr[p]=arr[i];
        arr[i]=temp;
    }


    public static void main(String[] args) {
        int[] arr = {3,5,2,1,9,4};
        System.out.println(Arrays.toString(arr));
        System.out.println(pivotIndex(arr,0, arr.length-1));
        System.out.println(Arrays.toString(arr));


    }
}
