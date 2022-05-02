package recursion;

public class April24 {

    /**
     *
     *    Another category of types of recursion based on space optimizations
     *
     *    1. Tail recursion
     *
     *    2. Non tail recursion
     */

    /**
     * Tail recursion :
     *      -- Recursive step is always the last step in the recursive function
     */

    public static void printNum(int[] arr , int sI){
        if(sI >=arr.length){
            return;
        }
        System.out.println(arr[sI]);
        printNum(arr, sI+1); // last step -- tail recursion
    }

    /**
     * Non tail recursion
     */
    public static void printNum1(int[] arr , int sI){
        if(sI >=arr.length){
            return;
        }
        printNum1(arr, sI+1); // Recursion is not the last step

        System.out.println(arr[sI]);

    }

    /**
     * Significance of tail and non-tail recursion
     *
     *
     * Tail Recursion - Space optimized ( less space )
     */




    /**
     * Direct recursion
     *  1. Will contain only 1 function
     */
    public static void  printNumbers (int num) {
        //Base condition
        if(num<=0){
            return ;
        }

        //Logic
        System.out.println(num);

        //Recursive
        printNumbers(num-1);
    }


    /**
     * Indirect recursion
     *
     *    - It will involve more than 1 functions
     *
     *    f -> g ->h ->f ->g -> h -> f..... ---- repeat
     */

    public static void f(){
        g();
    }

    public static void g(){
        h();
    }

    public static void h(){
        f();
    }

    /**
     * Solve a problem based on Indirect recursion
     *
     * Print the first 10 integers using indirect recursion
     *
     *
     * 1 ,2 ,3 ,4 .....10
     *
     * Indirect recursion
     */

    /**
     * Direct recursion
     *    just 1 function
     */
    public static void print(int start, int max){
        //Base condition
        if(start>max){
            return ;
        }

        System.out.print(start + "  ");

        print(start+1, max);
    }

    /**
     * Indirect recursion
     *     - More than one function
     */
    // Print1 -> print2 -> print1 -> print2 ..... base condition
    public static void print1(int start, int max){
        //Base condition
        if(start>max){
            return;
        }
        System.out.println(start);
        print2(start+1, max);

    }

    public static void print2(int start, int max){

        //Base condition
        if(start>max){
            return;
        }
        System.out.println(start);
        print1(start+1,max);

    }

    public static void main(String[] args) {
        print(1,10);
        System.out.println();
    }



}
