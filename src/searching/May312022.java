package searching;

public class May312022 {

    public int findMax(int[] arr , int start , int end){
        /**
         * If there is only 1 element
         */
        if(start ==end){
            return arr[start];
        }


        /**
         * If there are only 2 elements
         */
        if(start+1 ==end){

          return arr[start]>arr[end] ? arr[start] : arr[end];
        }

        int mid = start + (end-start)/2 ;

        if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
            return arr[mid];
        }if(arr[mid]>arr[mid+1] && arr[mid]<arr[mid-1]){
            // I am in decreasing zone , which is the right half
            return findMax(arr, start, mid-1);
        }else{
            return findMax(arr,mid+1, end);
        }
    }



}
