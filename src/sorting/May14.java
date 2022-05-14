package sorting;

public class May14 {



    public static void bubbleRec(int[] arr , int n){
        /**
         * Base condition
         */
        if(n<=1){
            return ;
        }
        //** bubble the largest element to the right
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] =temp ;
            }
        }
        bubbleRec(arr, n-1);
    }


    public static void waveSort(int[] arr){
        for(int i=1;i<arr.length;i=i+2){

            if(arr[i-1]<arr[i]){
                int temp = arr[i-1];
                arr[i-1]=arr[i];
                arr[i]=temp;
            }
            if(i+1<arr.length && arr[i+1]<arr[i]){
                int temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
    }


    public static void printUnsortedIndexes(int[] arr){

        int start =0, end = arr.length-1;


        for(start=0;start<arr.length-1;start++){
            if(arr[start]>arr[start+1]){
                break;
            }
        }
        if(start == arr.length-1){
            System.out.println("Array is already sorted");
            return;
        }

        for(end = arr.length-1 ;end>0;end--){
            if(arr[end]<arr[end-1]){
                break;
            }
        }

        /**
         * Need to find the max and min value between start and end index
         */
        int max = arr[start];
        int min = arr[start];

        for(int i=start;i<=end;i++){
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }
        }

        /**
         * Check in the left part of the array
         */
        for(int i=0;i<start;i++){
            if(arr[i]>min){
                start=i;
                break;
            }
        }

        for(int i=arr.length-1;i>end;i--){
            if(arr[i]<max){
                end = i;
            }
        }

        System.out.println("Array should be sorted between indexes "+ start + " and "+end );

    }


    public static void main(String[] args) {

        int[] arr = {10,12,20,30,25,40,32,31,35,50,60};

        printUnsortedIndexes(arr);

    }

}
