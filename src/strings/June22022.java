package strings;

public class June22022 {

    public static void printPermutations(String str, int lIndex, int rIndex){
        /**
         * Base condition
         */
        if(lIndex == rIndex){
            System.out.println(str);
        }else{
            /**
             * We need to swap the ith element to all the right side elements
             * one after the another
             */
            for(int i=lIndex;i<=rIndex;i++){
                str = swap(str,lIndex,i);
                printPermutations(str, lIndex+1,rIndex);
                //Reset the string again
                str = swap(str,lIndex,i);
            }
        }

    }



    public static void patternSearch(char[][] matrix , String word){

        /**
         * Scan the complete 2 D array for the first character
         */

        for(int row =0 ; row< matrix.length;row++){
            for(int col =0 ;col < matrix[0].length;col++){


                if(matrix[row][col] == word.charAt(0)){
                    //I found the first character of the word
                    if(foundTheWordInNeighbourhood(matrix, row, col, word)){
                        System.out.println("Word was found at index"
                                + row + " : "+ col);
                        break;
                    }
                }
            }
        }

    }

    private static boolean foundTheWordInNeighbourhood(char[][] matrix, int row,
                                                       int col, String word) {

        /**
         * Utility to find the next possible coordinates
         */
        int[] x = {-1,-1,-1,0,0,1,1,1};
        int[] y = {-1,0,1,-1,1,-1,0,1};

        int R = matrix.length;
        int C = matrix[0].length;

        if(matrix[row][col]!=word.charAt(0)){
            return false;
        }

        /**
         * Write the logic to find the alphabets/characters in the neighbours
         */
        for(int dir =0 ;dir<8;dir++){
            int rN = row + x[dir];
            int cN = col + y[dir];
            int k =1;
            for(k=1;k<word.length();k++){
                /**
                 * Check if the rN and cN are valid
                 */
                if(rN>=R || rN<0 || cN >=C ||cN <0){
                    //It's invalid
                    break; //as this is not right index
                }

                if(matrix[rN][cN]!=word.charAt(k)){
                    break;
                }
                /**
                 * If matches move to the next row and col
                 */
                rN = rN + x[dir];
                cN = cN + y[dir];
            }

            if(k == word.length()){
                return true;
            }
        }

        return false ;


    }

    private static String swap(String str, int l, int r) {
        char[] arr = str.toCharArray();
        char temp = arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        return String.valueOf(arr);
    }

    public static void main(String[] args) {
        printPermutations("ABCD",0,3);
    }
}
