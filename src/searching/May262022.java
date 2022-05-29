package searching;

public class May262022 {


    public static boolean binarySearch(int[] arr , int num){

        int start =0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid] == num){
                // I have found the number
                return true;
            }else if (arr[mid]>num){
                //number should be in the left part
                end = mid-1; // We restrict the end to the left of middle
            }else{
                //arr[mid] < num
                start = mid+1; // We restrict the start to the right of the middle
            }
        }
        return false;
    }


    public static boolean binarySearchRec(int[] arr, int start, int end, int data){
        //Base condition
        if(start>end){
            return false ;
        }
        int mid = start + (end-start)/2 ;
        if(arr[mid]==data){
            return true;
        }
        return arr[mid]>data ? binarySearchRec(arr, start, mid-1, data)
                : binarySearchRec(arr, mid+1, end, data);

    }

    public static boolean binarySearchRecA(int[] arr, int start, int end, int num) {

        if (end >= start) {
            int mid = start + (end - start) / 2;

            if (num == arr[mid])
                return true;

            else if (num < arr[mid])
                return binarySearchRecA(arr, start, mid - 1, num);

            else
                return binarySearchRecA(arr, mid + 1, end, num);
        }
        return false;
    }



    public static void main(String[] args) {
        int[] arr = { 12,3,9,17,5,14,2,11,21};

       // System.out.println(isPresentRec(arr,11,0));
        //System.out.println(isPresentRec(arr,101,0));


        int[] arr1 = { 1, 4, 5, 7, 8, 14, 15, 21};

        System.out.println(binarySearchRecA(arr1, 0, arr1.length-1, 25));
    }

    /**
     * TC  : o(n)
     *
     */
    private static boolean isPresent(int[] arr, int num) {

        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                return true;
            }
        }

        return false ;

    }

    /**
     * Do a linear search in an array using recursion
     *
     * isPresentRec({2,3,7,9,1,4} , 3 ,0 ) -> true
     *
     * isPresentRec({2,3,7,9,1,4} , 3 ,1 ) -> true
     *
     * isPresentRec({2,3,7,9,1,4} , 3 ,3 ) ->  false
     */
    public static boolean isPresentRec(int[] arr, int num , int sI){
        //Base condition
        if(sI >=arr.length || sI<0){
            return false ;
        }

        //return arr[sI] == num || isPresentRec(arr,num, sI+1);
        return arr[sI] == num || isPresentRec(arr,num, ++sI);
    }



}
