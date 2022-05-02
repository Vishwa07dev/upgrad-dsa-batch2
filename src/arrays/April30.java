package arrays;

import java.util.Arrays;

public class April30 {

    /**
     * Heap's algorithm for finding the possible permutations
     * @param arr
     * @param size
     */
    public static void arrayPermutation(int[] arr , int size){
        if(size == 0 || size == 1) {
            System.out.println(Arrays.toString(arr));
            return;
        }for(int i=0;i<size;i++){
            arrayPermutation(arr, size-1);
            if(size%2==1){
                int temp = arr[0];
                arr[0]=arr[size-1];
                arr[size-1] = temp;
            }else{
                int temp = arr[i];
                arr[i] = arr[size-1];
                arr[size-1]=temp;
            }
        }




    }







    public static void main(String[] args) {
        int[] arr = { 1,1,3,2,3,4,5,2,5};

        System.out.println(findOddNumber(arr));

        int[] arr1 = {5,1,3,4,3};
        findMissingAndRepeat(arr1);


        int[] arr3 = {1,2,3};
        arrayPermutation(arr3 , arr3.length);
    }

    private static int findOddNumber(int[] arr) {

        int result = arr[0];

        for (int i=1;i<arr.length;i++){
            result = result ^ arr[i];
        }

        return result;
    }


    public static void findMissingAndRepeat(int[] arr){
        int[] temp = new int[arr.length+1];

        for(int i=0;i<arr.length;i++){
            temp[arr[i]] = temp[arr[i]]+1;
        }

        for(int i=1;i<arr.length;i++){
            if(temp[i]==0) {
                System.out.println(i + " : is the missing num");
            }
            if(temp[i]>1){
                System.out.println(i + " : is the repeating number");
            }
        }
    }

}
