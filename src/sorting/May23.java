package sorting;

import java.util.Arrays;

public class May23 {


    /**
     * kthSmallestElement(arr, 1, 7, 4) -> return the 4th smallest element present between
     * index 1 and 7 in the given array
     *
     */

    public static int kthSmallestElement(int[] arr, int left , int right, int k){


        if(k>0 && k<=right-left+1){  // right-left+1  = size of the array
            /**
             * Write the logic to find the kth element
             */
            int pi = pivotIndex(arr, left,right);

            if(pi-left+1 ==k){
                //pi index is the index of kth smallest element
                return arr[pi];
            }else if( pi-left+1 >k){
                return kthSmallestElement(arr, left,pi-1,k);
            }else{
                return kthSmallestElement(arr, pi+1,right,k);
            }

        }else{
            return Integer.MAX_VALUE;
        }
    }





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

        quickSort(arr,start,pi-1);
        quickSort(arr,pi+1,end);
    }


    public static void permutations(int n){

        System.out.println(n);


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
