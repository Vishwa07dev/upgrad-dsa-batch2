package sorting;

import java.util.Arrays;

public class May21 {


    public static void main(String[] args) {
        int[] arr1 = { 1,3,5,0 ,0 };
        int[] arr2 = {2,4};
        System.out.println(Arrays.toString(arr1));
        //1,3,5

        merge(arr1, 3, arr2, 2);

        System.out.println(Arrays.toString(arr1));

        // 1,2,3,4,5
    }


    /**
     * countInversions(arr, 0, arr.length-1)  --> count of inversions between 0, arr.length-1
     *
     *
     * countInversion(arr, 1, 5 ) -> count of inversions between index 1 and 5
     */
    public static int countInversions(int[] arr , int start, int end){

        //Base condition
        if(start>=end){
            return 0;
        }

        int mid = start + (end-start)/2 ;

        int inversionCountLeftHalf = countInversions(arr,0,mid);
        int inversionCountRightHalf = countInversions(arr, mid+1, end);

        /**
         * Inversion count between elements who lie in left and right
         */
        int inversionCountMerge = inversionCountDuringMerge(arr, start, mid,end);

        return inversionCountMerge+inversionCountLeftHalf+inversionCountRightHalf;
    }

    private static int inversionCountDuringMerge(int[] arr, int start, int mid, int end) {

        int[] temp = new int[arr.length];
        int tIndex = start;
        int leftI = start;
        int rightI = mid+1;
        int count = 0 ;
        while(leftI <=mid && rightI <=end ){


            if(arr[leftI] <arr[rightI]){
                temp[tIndex++] = arr[leftI++];
            }else{
                //This is the case of inversion
                count = count + mid-leftI+1;
                temp[tIndex++] = arr[rightI++];
            }
        }

        while(leftI<=mid){
            temp[tIndex++]=arr[leftI++];
        }
        while(rightI<=end){
            temp[tIndex++]=arr[rightI++];
        }


        for(int i=start;i<=end;i++){
            arr[i]=temp[i];
        }

        return count ;


    }

    private static void merge(int[] big, int m, int[] small, int n) {

        int i = m-1;  // track element from right big arr
        int j = n-1; // track element from right small arr
        int temp = m+n-1; // track element from right last big Arr

        while(i>=0 && j>=0){
            if(big[i]>small[j]){
                big[temp] = big[i];
                temp--;
                i--;
            }else{
                big[temp] = small[j];
                temp--;
                j--;
            }
        }

        while(i>=0){
            big[temp] = big[i];
            i--;
            temp--;
        }

        while(j>=0){
            big[temp]=small[j];
            j--;
            temp--;

        }
    }
}
