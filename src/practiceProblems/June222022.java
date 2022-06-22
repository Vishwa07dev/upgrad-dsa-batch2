package practiceProblems;

import java.util.Arrays;


public class June222022 {

    public static void main(String[] args) {

        int[] arr = { 1,9,8,0,5,8,1,3,0,4};

        sort(arr);

        System.out.println(Arrays.toString(arr)); // It should print in sorted order
    }

    private static void sort(int[] arr) {

        /**
         * 1. Find the largest element in the array
         */
        int largest = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }

        /**
         * 2. We need to create a new array of size largest+1
         */
        int[] count = new int[largest+1];

        /**
         * 3. Iterate the arr, and put all the elements into count array
         */
        for(int i=0;i<arr.length;i++){
            //count[arr[i]] = count[arr[i]]+1;
            ++count[arr[i]];
        }

        /**
         * 4. We try to find the right position of each element
         */
        for(int i=1;i<count.length;i++){
            //count[i] = count[i]+count[i-1];
            count[i] +=count[i-1];
        }
        /**
         * count[i] would represent the correction position of i for
         * the sorted arrangement
         */

        /**
         * 5. Using the count array, we need to sort the array
         */
        int[] temp = new int[arr.length]; // same size as the original array

        for(int i= arr.length-1;i>=0;i--){
            temp[count[arr[i]]-1] = arr[i];
            //count[arr[i]] = count[arr[i]] -1 ;
            --count[arr[i]];
        }

        /**
         * 6.I need to sort the original array
         * Copy the elements from temp to the array
         */
        for(int i=0;i<arr.length;i++){
            arr[i]=temp[i];
        }


    }
}
