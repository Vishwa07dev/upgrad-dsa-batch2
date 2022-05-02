package recursion;

import java.util.Arrays;

public class April26 {

    public static void main(String[] args) {
        /**
         * Arrays
         *
         *  <data type> [] <variable name>
         */
        /**
         * Declaring
         */
        int[] arr = new int[5];

        char[] arr1 = new char[5];

        String [] arr2 = new String[5];

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));


        /**
         * Declaring and initializing together
         */
        int[] arr4 = { 5,6,9,11,0} ;
        System.out.println(Arrays.toString(arr4));


        /**
         * Setting the values inside an array
         * based on the index
         */

        int[] arr5 = new int[3]; // it will have 3 elements
        // 0 to 3-1=2
        arr5[0]= 13 ;
        arr5[2]= 21 ;
        // not allowed arr5[3]= 29;
        arr5[0]=7;
        System.out.println(Arrays.toString(arr5));

        /**
         * Iterate over the array
         */
        //O(n)
        for(int i=0;i< arr5.length;i++){
            System.out.print(arr5[i] + " ");
        }
        System.out.println();

        /**
         * Declaring a two dimensional array
         */
        int[][] arr2D = new int[5][];

        /**
         * Declare and initialize a 2 D array
         *
         */
        int[][] arr2D1 = {
                            {1,2,3,4,6,7},
                            {4,5,6,7},
                            { 8}
                         };

        /**
         * Accessing any element
         *
         *      row, column   arr2D1[i][j]
         */



        System.out.println(Arrays.toString(arr2D1[0]));
        System.out.println(Arrays.toString(arr2D1[1]));
        System.out.println(Arrays.toString(arr2D1[2]));
        //Traversal of the 2D array
        for(int row =0 ;row<arr2D1.length;row++){
            for(int column =0 ;column<arr2D1[row].length;column++){
                System.out.print(arr2D1[row][column] + " ");
            }
            System.out.println();
        }


    }


    public static int[] reverse(int[] arr){

        int i =0 ;
        int j = arr.length-1;

        while(i < j){
            //swap element at i and j
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        return arr ;
    }
}
