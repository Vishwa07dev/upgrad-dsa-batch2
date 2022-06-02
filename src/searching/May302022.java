package searching;

public class May302022 {


    public static void main(String[] args) {

        System.out.println(noOfWays(5)); // 3
        System.out.println(noOfWays(3));  //2
        System.out.println(noOfWays(4));  //2
        System.out.println(noOfWays(7));
        System.out.println(noOfWays(6 ));
    }

    public static int noOfWays(int target){
        return noOfWaysUtils(target,1);
    }

    private static int noOfWaysUtils(int target, int num) {

        if(target == num){
            return 1 ;
        }

        if(num > target ){
            return 0;
        }

        /**
         * Either a choose the number of I don't
         */
        return noOfWaysUtils(target-num, num+1) + // Choose the num
                noOfWaysUtils(target, num+1); // ignore the num
    }


    public int findEquilibriumIndex(int[] arr){
       int left  =0 ;
       int right = arr.length-1;
       int mid = left + (right-left)/2;
       int sumLeft = arr[0];
        for(int i=1;i<mid;i++){
            sumLeft = sumLeft+arr[i];
        }
        int sumRight = arr[mid+1];
        for(int i= mid+2;i<arr.length;i++){
            sumRight = sumRight + arr[i];
        }

        if(sumRight > sumLeft){
            while(sumRight>sumLeft && mid<arr.length-1){
                sumLeft = sumLeft+ arr[mid];
                sumRight = sumRight - arr[mid+1];
                mid = mid+1;
            }
        }else if(sumRight<sumLeft){
            while(sumLeft>sumRight && mid>0){
                sumRight = sumRight +arr[mid];
                sumLeft = sumLeft - arr[mid-1];
                mid = mid-1;
            }
        }
        if(sumLeft == sumRight){
            return mid;
        }
        return -1;
    }
}
