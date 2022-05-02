package arrays;

import java.util.Arrays;

public class April29 {

    public static void spiralPrint(int[][] arr){

        int sR = 0;  // starting row
        int eR = arr.length-1;  // end row index

        int sC =0 ;  // start column index
        int eC = arr[0].length-1; // end column index

        while(sR < eR && sC < eC){

            // Print first row
            for(int i=sC;i<=eC;i++){
                System.out.print(arr[sR][i] + " ");
            }
            sR++;
            /**
             * move from that row, as all the first row elements are already printed
             */

            // Print the last column
            for(int i = sR;i<=sR;i++){
                System.out.print(arr[i][eC]+" ");
            }
            eC--;// last column is fully printed

            // Print the last row
            for(int i = eC ;i>=sC;i--){
                System.out.print(arr[eR][i] + " ");
            }
            eR-- ;// LAST row is fully printed

            // Print the first column
            for(int i=eR;i>=sR;i--){
                System.out.print(arr[i][sC] + " ");
            }
            sC++; //First column is fully printed

        }
    }







    public static void main(String[] args) {

        int[][] arr2D = {
                        { 0 , 1 ,1, 1 },
                        { 0 , 0, 1, 1 },
                        { 1 , 1, 1, 1 },
                        { 0 , 0, 0, 0 }
                      };

        System.out.println(findRowWithMaxOne(arr2D));






        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));

        //Need to arrange
        arrangeArray(arr);

        System.out.println(Arrays.toString(arr));// Even and odd should be arranged

    }

    private static int findRowWithMaxOne(int[][] arr) {

        int i=0;
        int j= arr[0].length-1;

        int row =0 ;
        int max = 0;

        while(i<arr.length && j>=0){
            int count =max ;
            while(arr[i][j]==1){
                count ++ ;
                j--;
            }
            if(count >max){
                row = i;
                max = count;
            }
            i++;

        }
        return row;
    }

    private static void arrangeArray(int[] arr) {

        int i =0 ; // represent even side
        int j= arr.length-1 ; //represent odd side

        while(i < j){

            //Move i to the right till I find even numbers
            while(arr[i]%2==0){
                i++;
            }

            // i will represent odd number

            //Move j to the left till I find an Odd number
            while(arr[j]%2!=0){
                j--;
            }

            //j is represnting even number

            //swap i and j
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
    }


}
