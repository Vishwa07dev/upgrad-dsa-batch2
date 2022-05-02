package recursion;

public class April23 {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4};

        print(arr, 0); // This function should print elements 1 ,2 ,3 ,4

        System.out.println("#######");
        printRev(arr,0);
    }

    private static void print(int[] arr, int i) {

        //Base Condition
        if(i>=arr.length){
            return ;
        }
        //Logic
        System.out.println(arr[i]);

        //Recursive call again
        print(arr, i+1);
    }


    private static void printRev(int[] arr, int i) {

        //Base condition
        if(i>= arr.length){
            return;
        }
        //Recursive call
        printRev(arr, i+1);

        System.out.println(arr[i]);;

    }


}
