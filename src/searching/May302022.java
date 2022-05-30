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
}
