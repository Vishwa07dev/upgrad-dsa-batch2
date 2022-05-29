package searching;

import java.util.Arrays;

public class May292022 {

    /**
     * All the elements are in the ranges of [1, arr.length]
     *
     */
     public static void findFrequency(int[] arr){
         //Bring all the elements in the range of [0, arr.length-1]

         for(int i=0;i<arr.length;i++){
             arr[i]=arr[i]-1;
         }

         /**
          * Transformation of the array
          */
         for(int i=0;i<arr.length;i++){
             arr[arr[i]%arr.length] = arr[arr[i]%arr.length]+arr.length;
         }

         /**
          * I need to find the frequency array
          */
         for(int i=0;i<arr.length;i++){
             arr[i]=arr[i]/arr.length;
         }

         System.out.println(Arrays.toString(arr));

         for (int i=0 ;i<arr.length;i++){
             System.out.println((i+1) +" -> "+arr[i]);
         }

     }


    public static void main(String[] args) {
        int [] arr = {2,3,3,2,5};

        System.out.println(Arrays.toString(arr));

        findFrequency(arr);
    }


}
