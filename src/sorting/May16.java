package sorting;

import java.util.Arrays;

public class May16 {

    public static void main(String[] args) {



        int[] arr = { 4,1,9,2,3,-1,5};

        System.out.println(Arrays.toString(arr));

        transformArray(arr);

        System.out.println(Arrays.toString(transformArray(arr)));
    }


    public static int[] transformArray(int[] arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int [] nextArr = new int[arr.length];

        int i=0 , j = arr.length-1;
        int temp = 0;
        while(i<j){
            arr[temp++] =arr[i];
            arr[temp++] =arr[j];
            i++;
            j--;
        }

        return nextArr;
        //System.out.println(Arrays.toString(nextArr));

    }

    private static void insertionSort(int[] arr) {

        for(int i=1;i<arr.length;i++){
            int v = arr[i];
            int j=i;

            while(j-1>=0 && arr[j-1]>v){
                arr[j] = arr[j-1]; //move element to the right
                j--;
            }
            //j is the correct index where v should be added
            arr[j] =v;
        }
    }

    public static void insertionSort(int[] arr , int i){
        if(i >=arr.length){
            return ;
        }

        // I need to insert ith element at the right index

        int v = arr[i];
        int j = i;
        while(j-1>=0 && arr[j-1]>v){
            arr[j] = arr[j-1];
            j--;
        }
        arr[j]=v;

        insertionSort(arr, i+1);
    }

}
