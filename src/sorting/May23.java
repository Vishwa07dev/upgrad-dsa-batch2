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

        /**
         * Now elements till pth index is smaller than pivot
         *
         * Elements from p+1th index is more then pivot
         *
         * So pivot element correct index will be p+1
         */
        p++;
        swap(arr,p,end);

        return p;
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
