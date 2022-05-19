package sorting;

public class May19 {


    /**
     *  mergeSort(arr, start, end ) -> sort array from start to end
     *
     *  mergeSort(arr, start, mid ) -> sort array from start to mid
     *
     *  mergeSort(arr, mid+1, end ) -> sort array from mid+1 to end
     */

    public void mergeSort(int[] arr, int start , int end){

        if(start>=end){
            return ;
        }

        int mid =  start + (end-start)/2 ; //   (start+end)/2 ;
        mergeSort(arr,start, mid);  // sort the first half
        mergeSort(arr, mid+1, end);  // sort the second half

        merge(arr, start,mid,end);
    }

    /**
     * Array is sorted between start and mid
     * Array is also sorted between mid+1 and end
     *
     *
     * We need to sort the elements from start to end
     */
    private void merge(int[] arr, int start, int mid, int end) {

        int[] temp = new int[arr.length];
        int tIndex = start;

        int leftS = start;
        int rightS = mid+1;

        while(leftS<=mid && rightS<=end){
            if(arr[leftS]<arr[rightS]){
                temp[tIndex] = arr[leftS];
                leftS++;
                tIndex++;
            }else{
                temp[tIndex]= arr[rightS];
                rightS++;
                tIndex++;
            }
        }
        //If the elements in the left part is still left
        while(leftS<=mid){
            temp[tIndex++]= arr[leftS++];
        }
        //If the element in the right part is still available
        while(rightS<=end){
            temp[tIndex++] =arr[rightS++];
        }

        /**
         * Copy the content from the temp sorted array to the original array
         */

        for(int i = start;i<=end;i++){
            arr[i]=temp[i];
        }
    }
}
