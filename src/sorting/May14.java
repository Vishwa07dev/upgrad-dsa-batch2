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


    public static void printUnsortedIdexes(int[] arr){

    }


    public static void main(String[] args) {

    }

}
